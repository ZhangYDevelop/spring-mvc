<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    request.setAttribute("contextPath", contextPath);
%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/tags/head.jsp"></jsp:include>
</head>
<body>
    <div class="jumbotron" style="text-align: center;">
        <h1>403</h1>
        <p> 抱歉，你无权限访问</p>
        <div style="position: relative;
                top: 50%;
                left: 40%;
                height: 360px;
                width: 100%;
                max-width: 430px;
                background-repeat: no-repeat;
                background-size: 100% 100%;
                background-image: url(<%=contextPath%>/resources/images/403.svg);
                "></div>
    </div>
</body>
</html>
