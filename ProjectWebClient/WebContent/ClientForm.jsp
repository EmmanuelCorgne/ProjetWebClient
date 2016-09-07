<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire de création d'un client</title>
</head>
<body>
<form action="CreerClient" method="POST">
Nom: <input type="text" name="nom" value="${bean.nom}"><br>
Prénom: <input type="text" name="prenom" value="${bean.prenom}"><br>
Téléphone: <input type="text" name="telephone" value="${bean.telephone}"><br>
Email: <input type="text" name="email"value="${bean.email}"><br>
Mot de passe :<input type="password" name="mdp"><br>
<input type="submit" value="envoyer" name="type"/><br>
</form>
</body>
</html>