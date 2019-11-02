<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>登陆</title>
    <link rel="shortcut icon" href="<%=contextPath%>/resources/images/favicon.ico" type="image/x-icon">
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
    <script type="text/javascript">
        $(function () {
            $('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' /* optional */
            });
        });

        //刷新验证码
        function codeClick() {
            $("#imgCode").attr("src", $("#imgCode").attr("src") + "?nocache=" + new Date().getTime());
        }

        document.onkeydown = function (event) {
            var e = event || window.event || arguments.callee.caller.arguments[0];
            if (e && e.keyCode == 13) {
                $scope.login();
            }
        };
        var app = angular.module('myApp', []);
        app.controller('formCtrl', function ($scope, $http) {
            $scope.user = {};
            $scope.loginUser = {username: '', password: '', usercode: ''};
            $scope.submit = function () {
                $scope.user.password = hex_md5($scope.user.password);
                // 简单的 GET 请求，可以改为 POST
                var url = '<%=contextPath%>/platform/user/add';
                $http.post(url, {}, {params: $scope.user}).then(function (res) {
                    if (res.data.success) {
                        $('#myModal').modal('hide');
                        alert("注册成功");
                        s
                    } else {
                        alert("注册失败：" + res.data.message)
                    }
                });
            };
            $scope.login = function () {
                var remember = $("#remember").val();
                $scope.loginUser.password = hex_md5($scope.loginUser.password);
                if (remember === "1") {
                    data['remember'] = remember;
                }
                if (!$scope.loginUser.username) {
                    $(".login_msg").html("用户名不能为空");
                    return;
                }
                if (!$scope.loginUser.password) {
                    $(".login_msg").html("密码不能为空");
                    return;
                }
                var url = '<%=contextPath%>/login';
                $http.post(url, {}, {params: $scope.loginUser}).then(function (res) {
                    if (res.data.success) {
                        $(".login_msg").html("登录成功正在跳转，请稍候...");
                        window.location = '<%=contextPath%>/platform/main';
                    } else if (res.data.code == '004') {
                        $(".login_msg").html(data.message);
                    } else {
                        $("#ssid").val(data.data);
                        /* $(".login_msg").html(data.message); */
                        $(".login_msg").html("用户名或密码错误，请重新登录");
                    }
                });
            }
            // 用户注册
            $scope.register = function () {
                window.location.href = '<%=contextPath%>/platform/register/user';
            }
        });

    </script>
</head>
<body class="hold-transition login-page" style="background: #74cee4;">
<div class="login-box" ng-app="myApp" ng-controller="formCtrl">
    <div class="login-logo">
        <b>Admin</b>ZY
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>
        <form>
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="Account" ng-model="loginUser.username">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="Password" ng-model="loginUser.password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                    <input  class="form-control required" placeholder="Verification Code"  ng-model="loginUser.userCode"/>
                <span class="glyphicon glyphicon-check form-control-feedback"></span>

            </div>
            <div class="form-group has-feedback" style="text-align: right">
                    <img  style="margin-top: -5px;" src="<%=contextPath%>/pictureCheckCode" id="imgCode" width="63" height="23" alt="单击可刷新"
                          onclick="codeClick();"/> <a  href="#" style="margin-left: 10px; "  onclick="codeClick();">看不清，换一张</a>
            </div>
            <div class="row">
                <div class="login_msg" style="text-align: center;"></div>
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox" id="remember" name="remember" ng-model="loginUser.remember"> Remember
                            Me
                        </label>
                    </div>
                </div>
                <div class="col-xs-4">
                    <button ng-click="login()" class="btn btn-primary btn-block btn-flat">Sign In</button>
                </div>
            </div>
        </form>
        <!-- /.social-auth-links -->
        <a href="#">I forgot my password</a><br>
        <a href="#" ng-click="register()" class="text-center">Register a new membership</a>
    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->
<!-- iCheck -->
<script type="text/javascript">
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
    });
</script>
</body>

</html>
