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
    <link rel="shortcut icon" href="<%=basePath%>/resources/images/favicon.ico" type="image/x-icon">
    <script type="text/javascript">
        /**
         *登陆
         */
        function login() {
            var passward = hex_md5($("#password").val());
            var username = $("#username").val();
            var userCode = $("#userCode").val();
            if (!username)  {
                $(".login_msg").html("用户名不能为空");
                return;
            }
            if (!passward)  {
                $(".login_msg").html("密码不能为空");
                return;
            }
            $.ajax({
                url: '<%=basePath%>/login',
                data: {username: username, password: passward ,userCode: userCode},
                type: 'post',
                dataType: 'json',
                success: function (data) {
                    if (data.success) {
                        $(".login_msg").html("登录成功正在跳转，请稍候...");
                        window.location = '<%=basePath%>/api/platform/main';
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
                    <i class="fa fa-lock fa-lg"></i>
                    <input class="form-control required" placeholder="不需要" readonly="readonly" type="text" id="userCode"/>
                    <div class="Code">
                        <img src="<%=basePath%>/pictureCheckCode" id="imgCode" width="63" height="23" alt="单击可刷新"
                             onclick="codeClick();"/>
                        看不清楚，<a href="#" onclick="codeClick();">换一张</a>
                    </div>
                </div>
                <div class="form-group">
                    <label class="checkbox">
                        <input type="checkbox" name="remember" value="1"/>记住我
                    </label>
                </div>
                <div class="form-group col-md-offset-9">
                    <div class="login_msg"></div>
                    <button type="submit" class="btn btn-success pull-right" name="submit" onclick="login()">登录
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
