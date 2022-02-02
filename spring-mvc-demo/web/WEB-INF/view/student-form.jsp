<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nikon
  Date: 2/2/2022
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>




<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>
    <br><br>

    Country :
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>

    </form:select>
    <br><br>

    <h3>Favorite Language</h3>

    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    RUBY <form:radiobutton path="favoriteLanguage" value="Ruby"/>

    <br><br>


    <h3>Operating Systems:</h3>
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    MS Windows <form:checkbox path="operatingSystems" value="Windows"/>

    <br><br>

    <input type="submit" value="Submit"/>


</form:form>


</body>
</html>
