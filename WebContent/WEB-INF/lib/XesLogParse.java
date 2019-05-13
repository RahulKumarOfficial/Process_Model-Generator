package org.processmining.plugins.logfiltering;

import java.util.Date;

import org.deckfour.xes.extension.std.XConceptExtension;
import org.deckfour.xes.extension.std.XLifecycleExtension;
import org.deckfour.xes.extension.std.XOrganizationalExtension;
import org.deckfour.xes.extension.std.XTimeExtension;
import org.deckfour.xes.model.XAttributeMap;
import org.deckfour.xes.model.XEvent;
import org.deckfour.xes.model.XLog;
import org.deckfour.xes.model.XTrace;

public class XesLogParse {
	public XesLogParse(XLog log){
		for(XTrace trace : log){
			//get trace name
			String traceName = XConceptExtension.instance().extractName(trace);
			
//			all other attributes/values can be obtained from the following hashmap
			XAttributeMap traceAttributeMap = trace.getAttributes();
			
			for(XEvent event : trace){
				//get the activity name of the event
				String activityName = XConceptExtension.instance().extractName(event);
				//get the timestamp of the event
				Date timestamp = XTimeExtension.instance().extractTimestamp(event);
				//get the resource who executed the event
				String resource = XOrganizationalExtension.instance().extractResource(event);
				//get the event type (start/complete) of the event
				String eventType = XLifecycleExtension.instance().extractTransition(event);
				
//				all other attributes/values can be obtained from the following hashmap
				XAttributeMap eventAttributeMap = event.getAttributes();
			}
		}
	}
}