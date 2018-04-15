<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/8/18
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<body style="color:#000000;background:#80ced6">
<div class="container-fluid">
    <h2>Bike Ride Id Miles Ridden and Ride Description For Bike Rides</h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <table id="users">
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    <c:forEach var="bikeRides" items="${user.bikeRides}">
                        ${bikeRides.getId()} ${bikeRides.milesRidden} ${bikeRides.rideDescription}<br/>
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
        </tr>
    </table>
    <a lass="container #000000 black-text" href="home.jsp">Home Page</a>
</div>
</body>
</html>

