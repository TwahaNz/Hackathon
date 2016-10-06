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
    <title>People Features!</title>
    <link href="../../css/custom.css" rel="stylesheet">
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/bootstrap-theme.min.css">
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

<div class="container-fluid spaces-bottom">
    <div align="center">
        <table class="table table-bordered table-width">
            <tbody>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <c:if test="${not empty features}">
                <c:forEach var="feature" items="${features}">
                    <tr>
                        <td class="column-width-buttons">
                            <div align="center" class="votes-buttons">
                                <button class="btn btn-success btn-lg glyphicon glyphicon-chevron-up"></button>
                                <br/>
                                <br/>
                                <button class="btn btn-danger btn-lg glyphicon glyphicon-chevron-down"></button>
                            </div>
                        </td>
                        <td>
                            <div align="center" class="spaces-top"><h2 class="page-header spaces-top">${feature.id}
                                - ${feature.name}</h2>
                            </div>
                        </td>
                        <div align="center" class="spaces-top">
                            <td class="column-width page-header">
                                <div align="center"><h1 class="spaces-top">Votes</h1></div>
                                <div align="center"><h1 class="fonts">${feature.vote}</h1></div>
                            </td>
                        </div>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
        <hr/>
    </div>
</div>

</body>
</html>
