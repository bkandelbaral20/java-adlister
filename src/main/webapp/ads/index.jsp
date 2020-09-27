<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--This file will show a listing of all the ads on your site.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ads/index</title>
</head>
<body>
<h1>Here are all the ads</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>Ads : ${a}</h2>
    </div>
</c:forEach>
</body>
</html>
