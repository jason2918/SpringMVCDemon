<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + "/";
   	
%>
<html lang="en">

<head>

    <meta charset="utf-8">
   <!--  <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=basePath %>bootstrap/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=basePath %>bootstrap/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=basePath %>bootstrap/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<%=basePath %>bootstrap/vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=basePath %>bootstrap/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

	<link href="<%=basePath %>bootstrap/extractcss/DT_bootstrap.css" rel="stylesheet">
	<link href="<%=basePath %>bootstrap/extractcss/dt_table.css" rel="stylesheet">
	<link href="<%=basePath %>bootstrap/extractcss/dt_page.css" rel="stylesheet">
	
</head>

<body>

    <div id="wrapper">
		 
		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <%@ include file="commonTop.jsp" %>
            <%@ include file="leftNav.jsp" %>
        </nav>
        
        <%
        	String id = (String)session.getAttribute("id");
        %>
        <%
        	if (id != null && id.equals("stockCreate")) {
        %>
        <%@ include file="createStockData.jsp" %>
        <%
        	} else if (id != null && id.equals("stockQuery")) {
        %>
       	<%@ include file="queryStockData.jsp" %>
       	<%
        	} else {
       	%>
       	<%@ include file="queryPocData.jsp" %>
       	<%
        	}
       	%>
		
    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="<%=basePath %>bootstrap/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=basePath %>bootstrap/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=basePath %>bootstrap/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="<%=basePath %>bootstrap/vendor/raphael/raphael.min.js"></script>
    <script src="<%=basePath %>bootstrap/vendor/morrisjs/morris.min.js"></script>
    <script src="<%=basePath %>bootstrap/data/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="<%=basePath %>bootstrap/dist/js/sb-admin-2.js"></script>

</body>

</html>
