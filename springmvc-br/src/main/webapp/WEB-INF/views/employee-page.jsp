<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error{
color:red;
}
</style>
</head>
<body>
     <form:form action="submitForm" modelAttribute="employee">
        First Name : <form:input path="firstName" /> 
        <br> 
        Last Name : <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />
        <br>
        <input type="submit" />
    </form:form>
    

</body>
</html>