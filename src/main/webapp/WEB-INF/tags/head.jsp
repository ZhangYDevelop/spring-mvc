<%@ page language="java" pageEncoding="utf-8" %>

<%
    String path = request.getContextPath();
    String contextPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ path;
    request.setAttribute("contextPath", contextPath);
%>
<meta http-equiv="X-UA-Compatible" content="edge"/>
<link rel="shortcut icon" href="<%=contextPath%>/resources/images/favicon.ico" type="image/x-icon" >
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/_all-skins.min.css">
<!-- Morris chart -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/jquery-jvectormap.css">
<!-- Date Picker -->
<link rel="stylesheet"
      href="<%=contextPath%>/resources/css/bootstrap-datepicker.min.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/daterangepicker.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="<%=contextPath%>/resources/css/bootstrap3-wysihtml5.min.css">
<link rel="shortcut icon" href="<%=contextPath%>/resources/images/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="<%=contextPath%>/resources/css/dataTables.bootstrap.css">

<link rel="stylesheet" href="https://cdn.bootcss.com/jquery-treegrid/0.2.0/css/jquery.treegrid.min.css">

<!-- Google Font -->
<link rel="stylesheet"
      href="<%=contextPath%>/resources/css/css.css">

<!-- jQuery 3 -->
<script src="<%=contextPath%>/resources/js/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="<%=contextPath%>/resources/js/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=contextPath%>/resources/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="<%=contextPath%>/resources/js/raphael.min.js"></script>
<script src="<%=contextPath%>/resources/js/morris.min.js"></script>
<!-- Sparkline -->
<script src="<%=contextPath%>/resources/js/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="<%=contextPath%>/resources/js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="<%=contextPath%>/resources/js/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="<%=contextPath%>/resources/js/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="<%=contextPath%>/resources/js/moment.min.js"></script>
<script src="<%=contextPath%>/resources/js/daterangepicker.js"></script>
<!-- datepicker -->
<script src="<%=contextPath%>/resources/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="<%=contextPath%>/resources/js/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="<%=contextPath%>/resources/js/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=contextPath%>/resources/js/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=contextPath%>/resources/js/adminlte.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<%--<script src="<%=contextPath%>/resources/js/dashboard.js"></script>--%>
<!-- AdminLTE for demo purposes -->
<script src="<%=contextPath%>/resources/js/demo.js"></script>
<script src="<%=contextPath%>/resources/js/html5shiv.min.js"></script>
<script src="<%=contextPath%>/resources/js/respond.min.js"></script>
<script src="<%=contextPath%>/resources/js/angular-1.5.8/angular.min.js"></script>
<script src="<%=contextPath%>/resources/js/jquery.dataTables.min.js"></script>
<script src="<%=contextPath%>/resources/js/dataTables.bootstrap.js"></script>

<script src="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.12.0/extensions/treegrid/bootstrap-table-treegrid.js"></script>
<script src="https://cdn.bootcss.com/jquery-treegrid/0.2.0/js/jquery.treegrid.min.js"></script>
