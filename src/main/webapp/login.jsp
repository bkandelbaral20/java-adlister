<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container">
    <form name="login" method="POST" action="/login">
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" id="uname" name="uname" required>
        <br>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" id="psw" name="psw" required>

        <br>
        <button type="submit">Login</button>
    </form>

    <%--Inside of login.jsp write some code to check the submmitted values. If the username submitted is --%>
    <%--"admin", and the password is "password", redirect the user to the profile page; otherwise, redirect
    back to the login form.--%>

    <% if (request.getParameter("uname") == null || request.getParameter("psw") == null) {
    } else if (request.getParameter("uname").equalsIgnoreCase("admin") && request.getParameter("psw").equalsIgnoreCase("password")) {
        response.sendRedirect("/profile.jsp");
    } else {
        response.getWriter().println("<h1>Incorrect page </h1>");
    } %>

</div>

