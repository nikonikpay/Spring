<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: nikon
  Date: 2/3/2022
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation</title>

</head>
<body>
The customer is confirmed : ${customer.firstName}  ${customer.lastName}
<br><br>


Free Passes : ${customer.freePasses}

</body>
</html>
