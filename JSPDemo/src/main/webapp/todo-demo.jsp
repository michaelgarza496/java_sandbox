<html>

<body>

<!-- Step 1: Create HTML form -->
<form action="todo-demo.jsp">

	Add new item: <input type="text" name="theItem" />
	
	<input type="submit" value="Submit" />

</form>

<br/>
Item entered: <%= request.getParameter("theItem") %>

<!-- Step 2: Add new item to "To Do" list -->

<!-- Step 3: Display all "To Do" items from session -->

</body>

</html>