<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/14/18
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace - Add Bike Ride</title>
</head>
<body class="container #18ffff #ffab91 deep-orange lighten-3">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace</h1>
    <div class="row center"></div>
</div>
<div id="content">
    <form action="/addUserBikeRide" method="POST">
        Miles Ridden: <input type = "text" name = "milesRidden"
        data-error="Please enter the miles ridden." required>
        <br />
        Ride Description: <input type = "text" name = "rideDescription"
        data-error="Please enter the ride description." required>
        <br />
        User Id: <input type = "text" name = "user_id"
        data-error="Please enter the user id." required>
        <br />
        <div class="container">
        Add The Bike Ride: <input type="SUBMIT" name="" value="Submit">
        </div>
    </form>
    <a class="container #000000 black-text" href="home.jsp">Home Page</a>
</div>
    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="js/materialize.js"></script>
    <script src="js/init.js"></script>
</body>
</html>
