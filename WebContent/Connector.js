/**
 * 
 */
function handleStart(){
console.log("Started the process");
var Xes_filename = document.getElementById("FileLocation").value;
win = window.open("index.jsp?Xes_filename="+Xes_filename);
}

function log1Handler(){
	document.getElementById("FileLocation").value = "/home/jarvis/XES-SampleFolders/running-example.xes";
}
function log2Handler(){
	document.getElementById("FileLocation").value = "/home/jarvis/XES-SampleFolders/HospitalMediumLog.xes";
}
function log3Handler(){
	document.getElementById("FileLocation").value = "/home/jarvis/XES-SampleFolders/EventLog.xes";
}