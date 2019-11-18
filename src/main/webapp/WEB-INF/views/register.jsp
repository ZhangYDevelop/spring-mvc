<%--
  Created by IntelliJ IDEA.
  User: zhangy
  Date: 2019-11-02
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path ;
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
    <link rel="shortcut icon" href="<%=contextPath%>/resources/images/favicon.ico" type="image/x-icon" >
    <script src="<%=contextPath%>/resources/js/jquery.min.js"></script>
    <link href="<%=contextPath%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=contextPath%>/resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=contextPath%>/resources/css/ionicons.min.css" rel="stylesheet">
    <link href="<%=contextPath%>/resources/css/square/blue.css" rel="stylesheet">
    <link href="<%=contextPath%>/resources/css/AdminLTE.min.css" rel="stylesheet">
    <script src="<%=contextPath%>/resources/js/bootstrap.min.js"></script>
    <script src="<%=contextPath%>/resources/js/encrypt/md5.js"></script>
    <script src="<%=contextPath%>/resources/js/icheck.min.js"></script>
    <script src="<%=contextPath%>/resources/js/angular-1.5.8/angular.min.js"></script>
    <script src="<%=contextPath%>/resources/js/message/message.js"></script>
</head>
<body class="hold-transition register-page" style="background: #74cee4;">
<div class="register-box" ng-app="myApp" ng-controller="formCtrl">
    <div class="register-logo">
        <a href="../../index2.html"><b>Admin</b>ZY</a>
    </div>

    <div class="register-box-body">
        <p class="login-box-msg">Register a new membership</p>
        <form>
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="Account" ng-model="user.username">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="Password" ng-model="user.password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="Full name" ng-model="user.entity_name">
                <span class="glyphicon glyphicon-edit form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="Phone" ng-model="user.user_phone">
                <span class="glyphicon glyphicon-phone form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">

                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button ng-click="register()" class="btn btn-primary btn-block btn-flat">Register</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <a href="#"  ng-click="login()" class="text-center">I already have a membership</a>
    </div>
    <!-- /.form-box -->
</div>
<!-- /.register-box -->
<script type="text/javascript">
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
    });
    var app = angular.module('myApp', []);
    app.controller('formCtrl', function($scope, $http) {
        $scope.user = {};
        $scope.login = function () {
            window.location.href = '<%=contextPath%>/platform/login';
        }

        $scope.register = function () {
            $scope.user.password =  hex_md5($scope.user.password);
            var url = '<%=contextPath%>/platform/user/add';
            $http.post(url, {}, {params:$scope.user}).then(function (res) {
                if (res.data.success) {
                    MessageHelp.alert({message: "注册成功, 三秒后跳转到登录页"});
                    setTimeout(function () {
                        window.location.href = '<%=contextPath%>/platform/login';
                    }, 3000);
                } else {
                    alert("注册失败：" + res.data.message)
                }
            });
        }
    });
</script>
</body>
</html>
