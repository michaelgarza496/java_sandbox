<html>

<head>
<title>Student Confirmation Title</title>
</head>

<body>

<p>The student is confirmed: ${param.firstName} ${param.lastName}</p>

<br/>
<!-- display list of "favoriteLanguage -->
The student's favorite programming languages:
<ul>
	<%
		String[] langs = request.getParameterValues("favoriteLanguage");
		
		for (String lang : langs) {
			out.println("<li>" + lang + "</li>");
		}
	%>
</ul>

</body>

</html>