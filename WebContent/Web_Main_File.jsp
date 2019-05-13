<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Main_Package.main"%>
<%@ page import="Main_Package.LongestCommonSubsequence"%>

<%@ page import="Main_Package.TokenAppend"%>
<%@ page import="Main_Package.TraceGenerator"%>
<!DOCTYPE html>
<html>
<head>
<script src="Connector.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet">

<meta charset="UTF-8">
<title>Process Logo</title>
</head>
<body style="background-color: #001f3f">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Process Logo</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Create Logo</a></li>
				<li><a href="/ProcessLogoGenerator/about.jsp">About</a></li>
				<li><a href="/ProcessLogoGenerator/applications.jsp">Applications</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<center>
		<h1
			style="display: block; font-size: 2em; margin-top: 0.67em; margin-bottom: 0.67em; margin-left: 0; margin-right: 0;">
			<font size="20" color="#fffa00" font-family: "Montserrat","Times NewRoman;">Welcome
				to the Process Mining: Process Logo Generator!</font>
		</h1>
	</center>

	<Center>
		<br>
		<div class="form-group">
			<label for="usr"><font color="#ffffff"> Please Enter
					the path of Event Log:</font></label><br>
			<br> <input type="text" id="FileLocation" class="w3-input"
				placeholder="/user/files/filename.xes"
				style="width: 500px; padding: 12px 20px; margin: 8px 0; box-sizing: border-box;">
		</div>
		<br>
		<br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"
			onclick="handleStart()" class="btn success"
			style="border: 2px solid black; background-color: white; color: black; padding: 14px 28px; font-size: 16px; cursor: pointer; border-color: #4CAF50; color: green;"
			value="Create Logo"></input>
	</Center>
	<br>
	<br>
	<h3
			style="display: block; font-size: 1em; margin-top: 0.67em; margin-bottom: 0.67em; margin-left: 2em; margin-right: 0;">
			<font size="5" color="#fffa00" font-family: "Montserrat","Times NewRoman;">Example Demo</font>
	</h3>
<p style="margin-left:2em;line-height:"2.5" text-align:"justify">
<font size="5" color="#ffffff" font-family: "Montserrat","Times NewRoman;">A Step-by-step instructions to use this tool: 
<ul>
<li>Select any Event Log of XES format and paste the Location in the Input Text Box above.</li>
<li>For Demo purpose, we have some of the event logs in XES format.
<ul>
<li><input type="button"
			onclick="log1Handler()" class="btn info"
			style="border: 2px solid black; background-color: white; color: black; padding: 14px 28px; font-size: 16px; cursor: pointer; border-color: red; color: black;"
			value="Event Log : Hospital Process"></input>&nbsp;&nbsp;&nbsp;<input type="button"
			onclick="log2Handler()" class="btn info"
			style="border: 2px solid black; background-color: white; color: black; padding: 14px 28px; font-size: 16px; cursor: pointer; border-color: aqua; color: black;"
			value="Event Log : Hospital Billing"></input>&nbsp;&nbsp;&nbsp;<input type="button"
			onclick="log3Handler()" class="btn info"
			style="border: 2px solid black; background-color: white; color: black; padding: 14px 28px; font-size: 16px; cursor: pointer; border-color: orange; color: black;"
			value="Event Log : Synthesized"></input></li>
			<li  style="margin-top:20">Click on any one of them and the Location of that particular file  will be provided.</li>
</ul>
</li>
<li>That's It! Click on Create Logo Button just below the Input of Location of file</li>
<li>Wait for some moment while it does the calculation...</li>
<li>Click on the Button Show Logo to render the Final Display of Logo</li>
</ul>

</font>

</p>

</body>
</html>