<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!doctype html>
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <tiles:insertAttribute name="title" ignore="true" />
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

		<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">


		<link href="${pageContext.request.contextPath}/resources/js/vendor/modernizr-2.8.3.min.js" rel="stylesheet"/>
    </head>
    <body>
    
    <tiles:insertAttribute name="header" />
    

    <div class="container">
    
    <tiles:insertAttribute name="body" />
    </div> <!-- /container -->        

        <script src="js/vendor/jquery-1.11.2.min.js"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>