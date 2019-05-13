<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="UTF-8">
<title>Process Logo</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Process Logo</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/ProcessLogoGenerator/Web_Main_File.jsp">Create
						Logo</a></li>
				<li class="active"><a href="/ProcessLogoGenerator/about.jsp">About</a></li>
				<li><a href="/ProcessLogoGenerator/applications.jsp">Applications</a></li>

			</ul>
		</div>
	</nav>
	<p style="text-align: center; line-height: 1.8;">
		We propose a method of summarizing control flow of an operational
		process by proposing the visualization method named <font color="blue">
			Process Logo</font>
	</p>
	<p style="margin-left: 20px; line-height: 1.8 text-align:justify">
		<font
			style="font-weight: bold; font-family: 'sans-serif'; font-size: 20px">1.
			What is a Process</font> <br> <font color="red">No! It's not
			just the Computer Processes.</font> Instead we are talking about the
		processes we deal with Daily life. The proposed Process logo is
		capable of visually representing number of activities, the relative
		significance of each activity, process structure, critical activity,
		and information score (depicted as a scale of height of Letters). <br>
	<center>
		<img src="image.png" style="width: 559px; height: 269px;" />
	</center>
	</p>

	<p style="margin-left: 20px; line-height: 1.8; text-align: justify">
		<font
			style="font-weight: bold; font-family: 'sans-serif'; font-size: 20px">2.
			What is a Process-mining</font> <br> The idea of process mining is to
		discover, monitor and improve real processes (i.e., not assumed
		processes) by extracting knowledge from event logs. Currently
		available process mining techniques are capable of,
	<ul>
		<li>Discovery uses event log to construct process model related
			to various perspectives.</li>
		<li>Conformance techniques are used to check if reality conforms
			to the model.</li>
		<li>Extension methods are used to extend the existing model with
			a new aspect or perspective.</li>
	</ul>
	<center>
		This concept can be desribed with the help of diagram given below.
		</p>
		<img src="process-mining.gif" />
	</center>
	<p style="margin-left: 20px; line-height: 1.8; text-align: justify">
		<font
			style="font-weight: bold; font-family: 'sans-serif'; font-size: 20px">3.
			What is a Process-Logo</font> <br> There is a lot of additional
		information that could be shown in conjunction with the results
		produced by currently existing techniques. The new method "Process
		Logo" described in this paper is capable of visualizing following in
		addition to the information that could be depicted using traditional
		control flow visualization methods.
	<ul>
		<li>Number of activities</li>
		<li>Order of occurrences of activities</li>
		<li>Information score</li>
		<li>Predominant activity</li>
		<li>Much simplified version of the Process Model (Compared to
			Node and Edge Graphs)</li>
	</ul>
	<center>
		<img src="process-logo.gif" style="width: 558px; height: 492px;" />
	</center>
	<Center>
		<img src="testdata.png" />
	</Center>
	</p>

</body>
</html>