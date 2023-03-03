<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form:form action="submitForm" modelAttribute="employee">
        First Name : <form:input path="firstName" /> 
        <br> 
        Last Name : <form:input path="lastName" />
        <br>
        <input type="submit" />
    </form:form>

</body>
</html>