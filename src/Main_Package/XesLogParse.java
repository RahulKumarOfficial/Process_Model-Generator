/*
 * This section involves parsing of the XES file and extracting useful information.
 */
package Main_Package;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import org.deckfour.xes.extension.std.XConceptExtension;
import org.deckfour.xes.extension.std.XLifecycleExtension;
import org.deckfour.xes.extension.std.XOrganizationalExtension;
import org.deckfour.xes.extension.std.XTimeExtension;
import org.deckfour.xes.model.XAttributeMap;
import org.deckfour.xes.model.XEvent;
import org.deckfour.xes.model.XLog;
import org.deckfour.xes.model.XTrace;

public class XesLogParse {
	
	/*
	 * Open the file ParsedResult.txt
	 * For all the activity in XES file,
	 * Extract Activity Name from each trace
	 * Write Activity Name to the file 
	 */ 
	public XesLogParse(XLog log) throws IOException{
		FileWriter fw = new FileWriter("./ParsedResult.txt");
		for(XTrace trace : log){
			// get trace name
			String traceName = XConceptExtension.instance().extractName(trace);
			
			// all other attributes/values can be obtained from the following hashmap
			XAttributeMap traceAttributeMap = trace.getAttributes();
			
			for(XEvent event : trace){
				String activityName = XConceptExtension.instance().extractName(event);
				fw.write(activityName+"\n");
				System.out.println(activityName+"\n");

			}
			fw.write("***Activity***"+"\n");
		}
		fw.close();
		System.out.println("Parsing Finished!");
	}
}
