<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
        Author: harimahat
        Date: 18.10.2022
        Time: 11.21
        To change this template use File | Settings | File Templates.
        --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
<h3>Customer Form</h3>
<form:form action="processCustomerForm" modelAttribute="customer">
        First Name: <form:input path="firstName" />
        <form:errors path="firstName" cssClass="error" />
        <br><br>
        Last Name: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error" />
        <br><br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
