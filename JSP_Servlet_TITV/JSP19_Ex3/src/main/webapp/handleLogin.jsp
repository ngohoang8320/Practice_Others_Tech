<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 3/11/2024
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
%>

<%
    if (username.equalsIgnoreCase("test") && password.equals("123a")) {
        PrintWriter outputTest = response.getWriter();
%>
<h1>You are login successfully!</h1>
<%
} else {
%>
<h1>Do not found the account!</h1>
<%
    }
%>
</body>
</html>
