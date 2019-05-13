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
				<li><a href="/ProcessLogoGenerator/about.jsp">About</a></li>
				<li class="active"><a href="#">Applications</a></li>
			</ul>
		</div>
	</nav>
	<p style="text-align: center; line-height: 1.8;">
		<b>Algorithms used in this project</b>
	</p>
	<p style="margin-left: 20px; line-height: 1.8 text-align:justify">
		<font style="font-weight: bold; font-family: 'sans-serif';">Step
			1- Taking unique Sequences: </font><br> After parsing, the result is
		stored in a file. Then we take out each sequence and add them to a
		wordlist. Later this word list is transferred to a buffer. Therefore,
		as a result we obtain unique sequences that help us to determine the
		alphabets that can be assigned to each of those activity means.
	</p>
	<p style="margin-left: 20px; line-height: 1.8 text-align:justify">
		<font style="font-weight: bold; font-family: 'sans-serif';">Step
			2- Applying Dynamic Programming: </font><br> After the unique sequences
		are obtained, we assign each activity name by their respective
		letters. Then we apply LCS method (a paradigm of Dynamic Programming),
		to each of the elements and obtain a matrix and align each of them,
		starting from highest order of the component of the matrix. This also
		proves to be substitute of <i>Clustering technique</i>, and for a
		better logo, we need not cluster the data again. This is an effective
		method to cluster the data <i>(Similar Sequences)</i> simultaneously
		along with execution of the program.
	</p>
	<p style="margin-left: 20px; line-height: 1.8 text-align:justify">
		<font style="font-weight: bold; font-family: 'sans-serif';">Step
			3- Progressive method: </font><br> It obtains relationships between
		sequences (such as LCS) in the format of Similarity and alignments are
		grown sequentially to obtain Multiple Sequence Alignment.
	</p>
	<p style="text-align: center; line-height: 1.8;">
		<b>Applications of this project</b>
	</p>
	<p style="margin-left: 20px; line-height: 1.8 text-align:justify">
		<font style="font-weight: bold; font-family: 'sans-serif';">Process
			Aware Information Systems: </font><br> Any machine supported by
		computers are recording Machine's operational history in the form of
		event logs. These computers are known as <i><b>Process Aware
				Information Systems</b></i>. <br>
		<br> Example of PAISs are
	<ul>
		<li>Hospital Information Systems</li>
		<li>Classical workflow management systems</li>
		<li>Case Handling Systems</li>
		<li>Middlewares (IBM Websphere)</li>
		<li>and so on</li>
	</ul>
	</p>
</body>
</html>