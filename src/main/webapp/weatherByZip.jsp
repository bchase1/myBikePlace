<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 5/5/18
  Time: 12:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace - Get Weather By Zip Code</title>
</head>
<body class="container #18ffff #ffab91 deep-orange lighten-3">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace - Get Weather By Zip Code</h1>
    <div class="row center"></div>
</div>
<div id="content">
    <form action="getWeather" method="POST">
        Zip Code: <input type = "text" name = "zipCode"
                             data-error="Please enter the zip code." required>
        <br />
        <div class="container">
            <button type="SUBMIT" class="btn btn-default col-sm-offset-3"
                    data-disable="true">Get Weather For The Zip Code You Entered
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

