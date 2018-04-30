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
        <head>
        <th>User Id Email First Name Last Name and User Name</th>
        </head>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    ${user.getUserId()} ${user.email} ${user.firstName} ${user.lastName} ${user.userName}
                    <a href="updateEmail.jsp?id=${user.getUserId()}"  class="btn-large waves-effect waves-#01579b light-blue darken-4">Click here to update a user email!</a>
                    <a href="deleteUser?id=${user.getUserId()}"  class="btn-large waves-effect waves-#311b92 deep-purple darken-4">Click here to delete a user!</a><br/>
                </td>
            </tr>
        </c:forEach>
        </tr>
    </table>
    <a class="container #000000 black-text" href="admin.jsp">Admin Page</a>
</div>
</body>
</html>

