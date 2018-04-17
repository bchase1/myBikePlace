<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/16/18
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace - Update Bike Ride Description</title>
</head>
<body class="container #18ffff #ffab91 deep-orange lighten-3">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace - Update Bike Ride Description</h1>
    <div class="row center"></div>
</div>
<div id="content">
    <form action="updateUserBikeRide" method="POST">
        Ride Description: <input type = "text" name = "rideDescription"
                                 data-error="Please enter the ride description." required>
        <br />
        User Id: <input type = "text" name = "id"
                        data-error="Please enter the bike rides id." required>
        <br />
        <div class="container">
            <button type="SUBMIT" class="btn btn-default col-sm-offset-3"
                    data-disable="true">Update The Bike Ride Description
            </button>
            <button type="reset" class="btn btn-default">Clear</button>
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

