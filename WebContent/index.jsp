<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Main_Package.main"%>
<%@ page import="Main_Package.LongestCommonSubsequence"%>

<%@ page import="Main_Package.TokenAppend"%>
<%@ page import="Main_Package.TraceGenerator"%>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<!DOCTYPE html>
<html>
<head>

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
				<li class="active"><a href="#">Output</a></li>
				<li><a href="/ProcessLogoGenerator/Web_Main_File.jsp">Go
						Back to Main Page</a></li>
			</ul>
		</div>
	</nav>
	<%
	String fileout = request.getParameter("Xes_filename");
	main m = new main();
	m.main(fileout);
	%>
	<center>
<form method="GET" action="DisplayOutput">
<input type="submit"
			onclick="handleStart()" class="btn success"
			style="border: 2px solid black; background-color: white; color: black; padding: 14px 28px; font-size: 16px; cursor: pointer; border-color: #4CAF50; color: green;"
			value="Show the Logo !"></input>
			</center>
</form>
</body>
</html>