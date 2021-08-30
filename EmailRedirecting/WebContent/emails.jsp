<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EmailRedirect" method="POST">
		<input type="radio" id="Gmail" name="mail" value="Gmail">
		<label for="Gmail">Gmail</label><br>
		<input type="radio" id="RediffMail" name="mail" value="Rediff">
		<label for="RediffMail">RediffMail</label><br>
		<input type="radio" id="YahooMail" name="mail" value="Yahoo">
		<label for="YahooMail">YahooMail</label><br>
		<input type="radio" id="HotMail" name="mail" value="HotMail">
		<label for="HotMail">HotMail</label><br>
		<input type="radio" id="Unknown" name="mail" value="Unknown">
		<label for="Unknown">Unknown</label><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>