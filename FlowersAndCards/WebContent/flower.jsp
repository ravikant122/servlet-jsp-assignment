<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddItem" method="post">
		<label for="flower">Choose a flower:</label>
		<select id="flower" name="flower" size="3">
		  <option value="100">flower1 - Rs 100</option>
		  <option value="200">flower2 - Rs 200</option>
		  <option value="300">flower3 - Rs 300</option>
		</select><br><br>
        <input type="submit">
	</form>
</body>
</html>