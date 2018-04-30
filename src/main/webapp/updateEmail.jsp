<%--
  Created by IntelliJ IDEA.
  User: sighguy4
  Date: 4/28/18
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <title>myBikePlace - Update Email</title>
</head>
<body class="container #18ffff #9fa8da indigo lighten-3 ">
<div class="container">
    <br><br>
    <h1 class="header center #000000 black-text text-lighten-2">myBikePlace - Update Email</h1>
    <div class="row center"></div>
</div>
<div id="content">
    <form action="updateUserEmail?id=${param.id}" method="POST">
        Email: <input type = "text" name = "email"
                            data-error="Please enter the email address." required>
        <br />
        <button type="SUBMIT" class="btn btn-default col-sm-offset-3"
                data-disable="true">Update The User Email
        </button>
        <button type="reset" class="btn btn-default">Clear</button>
    </form>
    <a class="container #000000 black-text" href="admin.jsp">Admin Page</a>
</div>
<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>
</body>
</html>
