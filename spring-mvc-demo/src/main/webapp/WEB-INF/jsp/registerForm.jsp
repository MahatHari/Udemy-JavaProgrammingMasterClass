<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Login Page </h2>
    <form:form action="processForm" modelAttribute="student">
       First Name:  <form:input path="firstName" />
        <br />
       Last Name:  <form:input path="lastName" />
        <br/>
        Country <form:select path="country" >
                <form:options items="${student.getCountryOptions()}" />
        </form:select>
    <br />

        <%-- Radio buttons can also be populated with items from Java Class, Create Linked list similar to country--%>
        <%--And populated data inside constructor --%>
        <%-- Add getter method for radio buttons items (linked list) --%>
        <%-- Reference data in fomr --%>
        <%-- <form:radiobuttons path="favoriteLanguage items="${student.favoriteLanguageOptions}" /> --%>
        <h3> Favorite Programming language</h3>
        <form:radiobutton path="favoriteLanguage"  value="Java" label="Java" />
        <form:radiobutton path="favoriteLanguage"  value="C#" label="C#" />
        <form:radiobutton path="favoriteLanguage"  value="PHP" label="PHP" />
        <form:radiobutton path="favoriteLanguage"  value="Ruby" label="Ruby" />
        <form:radiobutton path="favoriteLanguage"  value="Python" label="Python" />


        <br />
        <h3>Operating Systems</h3>
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac Os <form:checkbox path="operatingSystems" value="Mac Os"/>
        Windows  <form:checkbox path="operatingSystems" value="Windows"/>

        <input type="submit" value="Submit" >
    </form:form>


</body>
</html>