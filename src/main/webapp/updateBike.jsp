<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/16/18
  Time: 7:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace - Update Bike Accessories</title>
</head>
<body class="container #18ffff #9fa8da indigo lighten-3 ">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace - Update Bike Accessories</h1>
    <div class="row center"></div>
</div>
<div id="content">
    <form action="updateUserBike?id=${param.id}" method="POST">
        Accessories: <input type = "text" name = "accessories"
                            data-error="Please enter the accessories." required>
        <br />
        <button type="SUBMIT" class="btn btn-default col-sm-offset-3"
                data-disable="true">Update The Bike Accessories
        </button>
        <button type="reset" class="btn btn-default">Clear</button>
    </form>
    <a class="container #000000 black-text" href="home.jsp">Home Page</a>
</div>
<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>
</body>
</html>

