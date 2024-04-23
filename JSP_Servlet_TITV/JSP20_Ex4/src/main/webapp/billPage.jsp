<%--
  Created by IntelliJ IDEA.
  User: Bap
  Date: 3/12/2024
  Time: 10:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>

<%
    String processor = request.getParameter("processor");
    String[] ram = request.getParameterValues("ram");
    String monitor = request.getParameter("monitor");
    String[] accessories = request.getParameterValues("accessories");

    double total = 0;
    double proPrice = 0;
    double ramPrice = 0;
    double morPrice = 0;
    double accPrice = 0;

    if (processor != null) {
        if (processor.equals("corei9")) {
            proPrice = 1000;
            total += proPrice;
        }
        if (processor.equals("corei7")) {
            proPrice = 800;
            total += proPrice;
        }
        if (processor.equals("corei5")) {
            proPrice = 500;
            total += proPrice;
        }
    }
    if (ram != null) {
        for (String ramEle : ram) {
            if (ramEle.equals("ram8gb")) {
                ramPrice = 800;
                total += ramPrice;
            }
            if (ramEle.equals("ram16gb")) {
                ramPrice = 1000;
                total += ramPrice;
            }
        }
    }

    if (monitor != null) {
        morPrice = 1000;
        total += morPrice;
    }

    if (accessories != null) {
        for (String acc : accessories) {
            if (acc.equals("Camera")) {
                accPrice = 100;
                total += accPrice;
            }
            if (acc.equals("Printer")) {
                accPrice = 200;
                total += accPrice;
            }
            if (acc.equals("Scanner")) {
                accPrice = 300;
                total += accPrice;
            }
        }
    }
%>

<h1>Bill:</h1>
<table class="table table-bordered table-dark">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    <tr>
        <%
            if (processor != null) {
        %>
        <td><%=processor%>
        </td>
        <td><%=proPrice%>
        </td>
        <%
            }
        %>
    </tr>
    <tr>
            <%
            if (ram != null) {
                for(String ramEle : ram) {
        %>
            <%
            if(ramEle.equals("ram8gb")) {
        %>
    <tr>
        <td>Ram 8Gb
        </td>
        <td>800.0
        </td>
    </tr>
    <%
        }
    %>
    <%
        if (ramEle.equals("ram16gb")) {
    %>
    <tr>
        <td>Ram 16Gb
        </td>
        <td>1000.0
        </td>
    </tr>
    <tr>
        <%
                    }
                }
            }
        %>
        <%
            if (monitor != null) {
        %>
        <td><%=monitor%>
        </td>
        <td><%=morPrice%>
        </td>
        <%
            }
        %>
    </tr>
    <%
        if (accessories != null) {
            for (String acc : accessories) {
                if (acc.equals("Camera")) {
    %>
    <tr>
        <td><%=acc%>
        </td>
        <td>100.0
        </td>
    </tr>
    <%
        }
    %>

    <%
        if (acc.equals("Printer")) {
    %>
    <tr>
        <td><%=acc%>
        </td>
        <td>200.0
        </td>
    </tr>
    <%
        }
    %>

    <%
        if (acc.equals("Scanner")) {
    %>
    <tr>
        <td><%=acc%>
        </td>
        <td>300.0
        </td>
    </tr>
    <%
                }
            }
        }
    %>

    <tr>
        <td><h3>Total</h3></td>
        <td><%=total%>
        </td>
    </tr>

    </thead>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
