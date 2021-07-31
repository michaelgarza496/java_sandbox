<html>

<body>

<%!
	String makeItLower(String data) {
	return data.toLowerCase();
	}
	
%>

<p>Lower case "Hello World: <%= makeItLower("Hello World") %></p>
</body>

</html>