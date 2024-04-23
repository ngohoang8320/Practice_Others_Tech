<%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 3/11/2024
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Page</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String quantity = request.getParameter("quantity");
%>

<h1>Confirm <%=name%>'s order with <%=quantity%> of our product.</h1>
<p>You will receive information via email: <%=email%>
</p>
</body>
</html>
