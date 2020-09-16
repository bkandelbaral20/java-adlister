<%--
  Created by IntelliJ IDEA.
  User: binjitakandelbaral
  Date: 9/15/20
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
<label for="uname"><b>Username</b></label>
<input type="text" placeholder="Enter Username" id= "uname" name="uname" required>

<label for="psw"><b>Password</b></label>
<input type="password" placeholder="Enter Password" id="psw" name="psw" required>

<button type="submit">Login</button>
</div>

<%--Inside of login.jsp write some code to check the submmitted values. If the username submitted is --%>
<%--"admin", and the password is "password", redirect the user to the profile page; otherwise, redirect
back to the login form.--%>
<%--<c:choose>--%>
<%--    <c:when test="${uname == "admin"}">--%>
<%--        <c:forEach items="${completeBurgerList}" var="burger">--%>
<%--            <li><strong>${burger.burgerName}</strong></li>--%>
<%--        </c:forEach>--%>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--        <p>We currently don't have any food.</p>--%>
<%--    </c:otherwise>--%>
<%--</c:choose>--%>
</body>
</html>
