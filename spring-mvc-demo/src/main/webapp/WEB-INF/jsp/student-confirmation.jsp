<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

    <head>
        <title>
            Student confirmation
        </title>
    </head>
<body>

    <h2>Thank you for registration ${student.firstName} ${student.lastName}</h2>
<br />
    Country: ${student.country}
    <br />

    Favorite Language : ${student.favoriteLanguage}
    <br/>

    Operating System:
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>

        </ul>
</body>
</html>