<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire Identification</title>
</head>
<body>
<form method=post action="CreerClient">
<table align=center width="50%">
<tr>
<td>
	login : <input name="login" type="input" size=20 value="${bean.email}">&nbsp;password : <input name="mdp" type="password" size=20 value="${bean.mdp}"><p>
	${bean.err}
	<input name="bouton" type="submit" value="valider">
	
</td>
</tr>
</table>
</form>
</body>
</html>