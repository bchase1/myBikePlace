<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/8/18
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace</title>
</head>
<body class="container #18ffff #bdbdbd grey lighten-1">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace</h1>
    <div class="row center"></div>
</div>
<form action="searchUserBike" method="GET">
    <input type="TEXT" name="searchUserName" value="" /> Enter You User Name To See Your Bikes <br />
    <br />
    <input type="SUBMIT" name="" value="Submit" />
</form>
<form action="searchUserBikeRide" method="GET">
    <input type="TEXT" name="searchUserName" value="" /> Enter You User Name To See Your Bike Rides <br />
    <br />
    <input type="SUBMIT" name="" value="Submit" />
</form>
<form action="searchUserName" method="GET">
    <input type="TEXT" name="searchUserName" value="" /> Enter You User Name To See Your User Information <br />
    <br />
    <input type="SUBMIT" name="" value="Submit" />
</form>

<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>
</body>
</html>

