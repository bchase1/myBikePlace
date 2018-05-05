<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 5/4/18
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<body style="color:#000000;background:#b3ffff">
<div class="container-fluid">
    <h2>Madison Weather</h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c: out value="${theWeather}"/>

    <a class="container #000000 black-text" href="home.jsp">Home Page</a>
</div>
</body>
</html>

