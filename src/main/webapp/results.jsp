<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 3/4/18
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<body style="color:#fff;background:#80ced6">
<div class="container-fluid">
    <h2>Search Results: </h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <table id="users">
        <thead>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>User Name</th>
        <th>Bikes and Accessories</th>
        <th>Miles Ridden and Route</th>
        </thead>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.email}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td>
                    <c:forEach var="bike" items="${user.bikes}">
                        ${bike.modelYear} ${bike.bikeBrand} ${bike.bikeName} ${bike.accessories}<br/>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach var="bikeRides" items="${user.bikeRides}">
                        ${bikeRides.milesRidden} ${bikeRides.rideDescription}<br/>
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>
