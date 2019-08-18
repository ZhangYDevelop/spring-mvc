<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
    <link rel="shortcut icon" href="<%=basePath%>/resources/images/favicon.ico" type="image/x-icon" >
    <script type="text/javascript" >
        /**
         *登陆
         */
        function  login() {
            $.ajax({
                url:'<%=basePath%>api/platform/login',
                data: {username:$("#username").val(), password:$("#password").val()},
                type:'post',
                dataType:'json',
                success:function(data){
                    if(data.success){
                        $(".login_msg").html("登录成功正在跳转，请稍候...");
                        window.location='<%=basePath%>api/platform/main';
                    }else if(data.code == '004'){
                        //强制登录
                        if(confirm("当前用户已登录或非正常退出，是否强制登录？")){
                            $("#forcelogin").val('1');
                            login();
                        }
                    }else{
                        $("#ssid").val(data.data);
                        /* $(".login_msg").html(data.message); */
                        $(".login_msg").html("用户名或密码错误，请重新登录");
                    }
                }
            });
        }
    </script>
</head>
<body id = "loginBody">
      <div class="container">
          <div class="form row" >
              <div class="form-horizontal col-md-offset-3" id="login_form">
                  <h3 class="form-title">LOGIN</h3>
                  <div class="col-md-9">
                      <div class="form-group">
                          <i class="fa fa-user fa-lg"></i>
                          <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/>
                      </div>
                      <div class="form-group">
                          <i class="fa fa-lock fa-lg"></i>
                          <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
                      </div>
                      <div class="form-group">
                          <label class="checkbox">
                              <input type="checkbox" name="remember" value="1"/>记住我
                          </label>
                      </div>
                      <div class="form-group col-md-offset-9">
                          <div class="login_msg"></div>
                          <button type="submit" class="btn btn-success pull-right" name="submit" onclick="login()">登录</button>
                      </div>
                  </div>
              </div>
          </div>
      </div>
</body>
</html>
