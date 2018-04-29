<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/28/18
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<body style="color:#000000;background:#b3ffff">
<div class="container-fluid">
    <h2>User Information</h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <table id="users">
        <thead>
        <th>User Id</th>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>User Name</th>
        </thead>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.getUserId()}</td>
                <td>${user.email}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
            </tr>
        </c:forEach>
        </tr>
    </table>
    <a class="container #000000 black-text" href="admin.jsp">Admin Page</a>
</div>
</body>
</html>

