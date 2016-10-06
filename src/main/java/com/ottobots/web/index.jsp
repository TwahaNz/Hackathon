<%@ page import="com.sun.org.apache.xpath.internal.SourceTree" %>
<%--
  Created by IntelliJ IDEA.
  User: maybra01
  Date: 10/6/2016
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="css/custom.css" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top remove-margin-bottom">
    <div>
        <div align="center" class="navbar-header altered-menu">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.php">CSG International - My Favourite Features</a>
        </div>
    </div>
</nav>
';

<%--<div class="container">
    <div class="jumbotron">
        <h1>Features</h1>
        <p>Anonymously Vote For Your Features. Go Ahead..</p>
    </div>
</div--%>

<div class="container spaces-bottom">
    <div align="center">
        <table class="table table-bordered table-width">
            <tbody>
            <%for (int i = 0; i < 10; i++) {%>
            <tr>
                <td>
                    <div align="center" class="spaces-top"><h3 class="page-header spaces-top">Build-Pipeline View</h3>
                    </div>
                    <button class="btn btn-success btn-lg glyphicon glyphicon-chevron-up"></button>
                    <br/>
                    <br/>
                    <button class="btn btn-danger btn-lg glyphicon glyphicon-chevron-down"></button>
                </td>
                <div align="center" class="spaces-top">
                    <td class="column-width page-header">
                        <div align="center"><h4>Number Of Votes</h4></div>
                    </td>
                </div>
                <% }%>
            </tr>
            </tbody>
        </table>
        <hr/>
    </div>
</div>

</body>
</html>
