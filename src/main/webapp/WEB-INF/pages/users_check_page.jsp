<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gsp</title>
</head>
<body>
<spring:form modelAttribute="userFromServer" method="post" action="/user-system/users/check">

    <spring:input path="name"></spring:input>
    <spring:input path="password"></spring:input>
    <spring:button> check user</spring:button>
</spring:form>
</body>
</html>
