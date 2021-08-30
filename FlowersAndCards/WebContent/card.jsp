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
		<label for="card">Choose a card:</label>
		<select id="card" name="card" size="3">
		  <option value="100">card1 - Rs 100</option>
		  <option value="200">card2 - Rs 200</option>
		  <option value="300">card3 - Rs 300</option>
		</select><br><br>
        <input type="submit">
	</form>
</body>
</html>