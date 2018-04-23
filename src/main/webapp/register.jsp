<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/17/18
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace - Register</title>
</head>
<body class="container #18ffff #81d4fa light-blue lighten-3 ">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace - Register</h1>
    <div class="row center"></div>
</div>
<div id="content">
    <form action="addUser" method="POST">
        Email Address: <input type = "text" name = "email"
                           data-error="Please enter the email address." required>
        <br />
        First Name: <input type = "text" name = "firstName"
                           data-error="Please enter your first name." required>
        <br />
        Last Name: <input type = "text" name = "lastName"
                          data-error="Please enter your last name." required>
        <br />
        Password: <input type = "text" name = "pass"
                            data-error="Please enter your password." required>
        <br />
        User Name: <input type = "text" name = "userName"
                        data-error="Please enter the user name." required>
        <br />
        <button type="SUBMIT" class="btn btn-default col-sm-offset-3"
                data-disable="true">Register
        </button>
        <button type="reset" class="btn btn-default">Clear</button>
    </form>
    <a class="container #000000 black-text" href="index.jsp">Welcome Page</a>
</div>
<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>
</body>
</html>

