<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%--
  Created by IntelliJ IDEA.
  User: nikon
  Date: 2/2/2022
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

<h1> The Student is confirmed : ${student.firstName} ${student.lastName}</h1>
<br><br>

<h2>Country : ${student.country}</h2>

<br><br>
<h2>Favorite language : ${student.favoriteLanguage}</h2>

<br><br>
<h2>Operation Systems</h2>
<ul>
    <c:forEach var ="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>
</html>
