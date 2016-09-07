<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultat Tableau</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <style>
table,th,td
{
border:1px solid black;
}
</style>
</head>
<body>
<table>
<tbody>
<tr><th>Nom</th><th>Prenom</th><th>email</th></tr>
<c:forEach items="${clients}" var="cl">
<tr><td><c:out value="${cl.nom}"></c:out></td>
<td><c:out value="${cl.prenom}"></c:out></td>
<td><c:out value="${cl.email}"></c:out></td></tr>
</c:forEach>
</tbody>
</table>


</body>
</html>