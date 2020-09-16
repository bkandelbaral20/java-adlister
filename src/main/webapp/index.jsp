<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<div class="container">
    <form name="login" method="get">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" id= "uname" name="uname" required>
        <br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id="psw" name="psw" required>

    <button type="submit">Login</button>
</form>
    <%@ include file="partials/navbar.jsp" %>

<%--    <p><strong>username</strong> <%= request.getParameter("binjita") %></p>--%>

    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
<%--</div>--%>
</body>
</html>
