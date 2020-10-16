<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notre application web</title>
</head>
<body>
	<h1>J2E C'est génial !!!</h1>
	<br>
	<h2>Voici mon prénom : ${prenom}</h2>
	<br>
	
	<form action="/web-application/accueil" method="POST">
		<p><font color="red">${erreur_login}</font></p>
		Prénom : <input name="prenom" type="text" />
		Mot de passe : <input name="password" type="password" />
		<input type="submit" />
	</form>
</body>
</html>