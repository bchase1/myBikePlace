<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/8/18
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<body style="color:#fff;background:#80ced6">
<div class="container-fluid">
    <h2>Bikes</h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <table id="users">
        <thead>
        <th>Bikes and Accessories</th>
        </thead>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    <c:forEach var="bike" items="${user.bikes}">
                        ${bike.modelYear} ${bike.bikeBrand} ${bike.bikeName} ${bike.accessories}<br/>
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>

