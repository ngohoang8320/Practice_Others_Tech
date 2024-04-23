<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <title>Exercise 1</title>
</head>
<body>
<%
    double a = 3;
    double b = 2;
    double sum = a + b;
%>


<%
    sum = Math.sqrt(24);
%>

Three plus two = <%= sum%>


</body>
</html>