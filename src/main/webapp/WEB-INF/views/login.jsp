<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path ;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>登陆</title>
    <script src="<%=basePath%>/resources/js/jquery.min.js"></script>
    <link href="<%=basePath%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/css/login.css" rel="stylesheet">
    <script src="<%=basePath%>/resources/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>/resources/js/encrypt/md5.js"></script>
    <script src="<%=basePath%>/resources/js/angular-1.5.8/angular.js"></script>
    <link rel="shortcut icon" href="<%=basePath%>/resources/images/favicon.ico" type="image/x-icon">
    <script type="text/javascript">
        /**
         *登陆
         */
        function login() {
            var passward = hex_md5($("#password").val());
            var username = $("#username").val();
            var userCode = $("#userCode").val();
            var remember = $("#remember").val();
            var data = {username: username, password: passward ,userCode: userCode};
            if (remember === "1") {
                data['remember'] = remember;
            }
            if (!username)  {
                $(".login_msg").html("用户名不能为空");
                return;
            }
            if (!passward)  {
                $(".login_msg").html("密码不能为空");
                return;
            }
            console.log(data)
            $.ajax({
                url: '<%=basePath%>/login',
                data: data,
                type: 'post',
                dataType: 'json',
                success: function (data) {
                    if (data.success) {
                        $(".login_msg").html("登录成功正在跳转，请稍候...");
                        window.location = '<%=basePath%>/platform/main';
                    } else if (data.code == '004') {
                        $(".login_msg").html(data.message);
                    } else {
                        $("#ssid").val(data.data);
                        /* $(".login_msg").html(data.message); */
                        $(".login_msg").html("用户名或密码错误，请重新登录");
                    }
                }
            });
        }

        //刷新验证码
        function codeClick() {
            $("#imgCode").attr("src", $("#imgCode").attr("src") + "?nocache=" + new Date().getTime());
        }

        document.onkeydown = function (event) {
            var e = event || window.event || arguments.callee.caller.arguments[0];
            if (e && e.keyCode == 13) {
                login();
            }
        };
        var app = angular.module('myApp', []);
        app.controller('formCtrl', function($scope, $http) {
            $scope.user = {};
            $scope.submit = function() {
                $scope.user = angular.copy($scope.user);
                alert("dfdfd")
                // 简单的 GET 请求，可以改为 POST
                $http({
                    method: 'GET',
                    url: '<%=basePath%>/platform/user/add',
                    data: $scope
                }).then(function successCallback(response) {
                    // 请求成功执行代码
                    debugger
                }, function errorCallback(response) {
                    // 请求失败执行代码
                });
            };
            $scope.submit();
        });

    </script>
</head>
<body id="loginBody">
    <div class="container">
        <div class="form row">
            <div class="form-horizontal col-md-offset-3" id="login_form">
                <h3 class="form-title">用户登录</h3>
                <div class="col-md-9">
                    <div class="form-group">
                        <i class="fa fa-user fa-lg"></i>
                        <input class="form-control required" type="text" placeholder="用户名" id="username"
                               name="username" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <div class="form-group">
                        <i class="fa fa-lock fa-lg"></i>
                        <input class="form-control required" type="password" placeholder="密码" id="password"
                               name="password" maxlength="8"/>
                    </div>
                    <div class="form-group">
                        <input style="width: 120px;float: left;" class="form-control required" placeholder="不需要" readonly="readonly" type="text" id="userCode"/>
                        <div  style="margin: 5px 5px;float: right;" >
                            <img src="<%=basePath%>/pictureCheckCode" id="imgCode" width="63" height="23" alt="单击可刷新"
                                 onclick="codeClick();"/><a href="#" onclick="codeClick();">刷新</a>
                        </div>
                    </div>
                    <div class="form-group">
                        <div>
                            <label class="checkbox" style="float: left;">
                                <input type="checkbox" id="remember" name="remember" value="1"/>记住我
                            </label>
                            <div style="float: right; margin: 5px 5px;">
                                <a href="#" data-toggle="modal" data-target="#myModal">注册</a>
                                <!-- 按钮触发模态框 -->
                                <a href="#" >忘记密码</a>
                            </div>
                        </div>

                    </div>
                    <div class="form-group col-md-offset-9">
                        <div class="login_msg"></div>
                        <button type="submit" class="btn btn-success" name="submit" style="width: 230px;" onclick="login()">登录
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1"  role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" ng-app="myApp" ng-controller="formCtrl">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        用户注册
                    </h4>
                </div>
                <div class="modal-body">
                    <form role="form" id="userRegister">
                        <div class="form-group">
                            <label for="name" >账号</label>
                            <input type="text" name="username" class="form-control" id="name" ng-model="user.username"
                                   placeholder="请输入账号">
                        </div>
                        <div class="form-group">
                            <label for="name" >密码</label>
                            <input type="password" name="password" class="form-control" id="password2" ng-model="user.password"
                                   placeholder="请输入密码">
                        </div>
                        <div class="form-group">
                            <label for="name">用户名</label>
                            <input type="realName" name="entity_name" class="form-control" id="entity_name"
                                   placeholder="请输入用户名">
                        </div>
                        <div class="form-group">
                            <label for="name">电话</label>
                            <input type="text" class="form-control" id="tel" name="tel"
                                   placeholder="请输入电话">
                        </div>
                        <div class="form-group">
                            <label for="name">邮箱</label>
                            <input type="text" class="form-control" id="mail" name="mail"
                                   placeholder="请输入邮箱">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="submit" class="btn btn-primary" ng-click="submit()">
                        保存
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</body>
</html>
