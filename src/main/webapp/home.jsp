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
<div class="row center">
    <a href="searchUserBike" id="userBike-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to see your bikes!</a>
</div>
<br><br>
<div class="row center">
<a href="searchUserBikeRide" id="userBikeRide-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to see your bike rides!</a>
</div>
<br><br>
<div class="row center">
<a href="searchUserName" id="userName-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to see your user information!</a>
</div>
<br><br>
<div class="row center">
    <a href="addBike.jsp" id="bike-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to add a bike!</a>
</div>
<br><br>
<div class="row center">
    <a href="addBikeRide.jsp" id="bikeRide-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to add a bike ride!</a>
</div>
<br><br>
<div class="row center">
    <a href="updateBike.jsp" id="updateBike-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to update bike accessories!</a>
</div>
<br><br>
<div class="row center">
    <a href="updateBikeRide.jsp" id="updateBikeRide-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to update a bike ride description!</a>
</div>
<br><br>
<div class="row center">
    <a href="logout.jsp" id="logout-button" class="btn-large waves-effect waves-light teal lighten-1">Click here to Logout!</a>
</div>
<div class="row center" id="openweathermap-widget-5"></div>
<script>window.myWidgetParam ? window.myWidgetParam : window.myWidgetParam = [];  window.myWidgetParam.push({id: 5,cityid: '5261457',appid: '6a6c46d4dc5113d20b1e6cf5a286573b',units: 'imperial',containerid: 'openweathermap-widget-5',  });  (function() {var script = document.createElement('script');script.async = true;script.charset = "utf-8";script.src = "//openweathermap.org/themes/openweathermap/assets/vendor/owm/js/weather-widget-generator.js";var s = document.getElementsByTagName('script')[0];s.parentNode.insertBefore(script, s);  })();</script>
<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>
</body>
</html>

