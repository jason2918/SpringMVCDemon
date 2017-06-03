<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--页面标题-->
<title>Title</title>
<!--页面Logo-->

<!--引入bootstrap样式-->
<link href="<%=basePath %>css/bootstrap.css" rel="stylesheet"
	type="text/css" />
</head>

<body>
	<div class="container">
		<h1>Welcome, this is SpringMVC Bootstrap WebApp: ${serverTime}</h1>
	</div>

	<!--引入jquery脚本-->
	<script src="<%=basePath %>js/jquery-3.2.1.min.js"
		type="text/javascript"></script>
	<!--引入bootstrap脚本-->
	<script src="<%=basePath %>js/bootstrap.js"
		type="text/javascript"></script>
</body>

</html>

