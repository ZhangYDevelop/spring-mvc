<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>主页</title>
    <script src="<%=basePath%>/resources/js/jquery.min.js"></script>
    <link href="<%=basePath%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/css/main.css" rel="stylesheet">
    <script src="<%=basePath%>/resources/js/bootstrap.min.js"></script>
    <link rel="shortcut icon" href="<%=basePath%>/resources/images/favicon.ico" type="image/x-icon" >
</head>
<body>
    <!--顶部导航栏部分-->
    <nav class="navbar navbar2">
        <div class="container-fluid">
            <!-- logo设置 -->
            <div class="navbar-header">
                <a class="logo" title="logoTitle" href="home">eshop</a>
            </div>

            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li role="presentation">
                        <a href="#">当前用户：<span class="badge">管理员</span></a>
                    </li>
                    <li>
                        <a href="#"><span class="glyphicon glyphicon-lock"></span>退出登录</a>
                    </li>
                </ul>
            </div>

        </div>   <!-- .container-fluid -->
    </nav>

    <!-- 中间主体内容部分 -->
    <div class="pageContainer">
        <!-- 左侧导航栏 -->
        <div class="pageSidebar">
            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">

                <!-- 个人中心 -->
                <div class="panel2">

                    <div class="panel-heading" role="tab">
                        <h4 class="panel-title">
                            <a href="nav2.html" target="mainFrame">
                                <span class="glyphicon glyphicon-fire"></span>
                                个人中心
                            </a>
                        </h4>
                    </div>

                </div>

                <!-- 用户管理 -->
                <div class="panel2">

                    <div class="panel-heading" role="tab" id="headingOne">
                        <h4 class="panel-title">
                            <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                <span class="glyphicon glyphicon-user"></span>
                                用户管理
                                <span class="glyphicon glyphicon-menu-left pull-right"></span>
                            </a>
                        </h4>
                    </div>

                    <div id="collapseOne" class="collapse panel3" role="tabpanel" aria-labelledby="headingOne">
                        <div class="panel-body">
                            <p>
                                <span class="glyphicon glyphicon-record"></span>
                                <a href="nav1.html" target="mainFrame">用户列表</a>
                            </p>
                            <p>
                                <span class="glyphicon glyphicon-record"></span>
                                <a href="nav2.html" target="mainFrame">管理员列表</a>
                            </p>
                        </div>
                    </div>
                </div>

                <!-- 商品管理 -->
                <div class="panel2">

                    <div class="panel-heading" role="tab" id="headingTwo">
                        <h4 class="panel-title">
                            <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                                <span class="glyphicon glyphicon-gift"></span>
                                商品管理
                                <span class="glyphicon glyphicon-menu-left pull-right"></span>
                            </a>
                        </h4>
                    </div>

                    <div id="collapseTwo" class="collapse panel3" role="tabpanel" aria-labelledby="headingTwo">
                        <div class="panel-body">
                            <p>
                                <span class="glyphicon glyphicon-record"></span>
                                <a href="nav1.html" target="mainFrame">商品列表</a>
                            </p>
                            <p>
                                <span class="glyphicon glyphicon-record"></span>
                                <a href="nav2.html" target="mainFrame">添加商品</a>
                            </p>
                        </div>
                    </div>
                </div>

                <!-- 分类管理 -->
                <div class="panel2">

                    <div class="panel-heading" role="tab" id="headingThree">
                        <h4 class="panel-title">
                            <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="true" aria-controls="collapseThree">
                                <span class="glyphicon glyphicon-screenshot"></span>
                                分类管理
                                <span class="glyphicon glyphicon-menu-left pull-right"></span>
                            </a>
                        </h4>
                    </div>

                    <div id="collapseThree" class="collapse panel3" role="tabpanel" aria-labelledby="headingThree">
                        <div class="panel-body">
                            <p>
                                <span class="glyphicon glyphicon-record"></span>
                                <a href="nav1.html" target="mainFrame">分类列表</a>
                            </p>
                            <p>
                                <span class="glyphicon glyphicon-record"></span>
                                <a href="nav2.html" target="mainFrame">添加分类</a>
                            </p>
                        </div>
                    </div>
                </div>

                <!-- 订单管理 -->
                <div class="panel2">

                    <div class="panel-heading" role="tab">
                        <h4 class="panel-title">
                            <a role="button" href="nav2.html" target="mainFrame">
                                <span class="glyphicon glyphicon-duplicate"></span>
                                订单管理
                            </a>
                        </h4>
                    </div>

                </div>

                <!-- 评论管理 -->
                <div class="panel2">

                    <div class="panel-heading" role="tab">
                        <h4 class="panel-title">
                            <a role="button" href="nav2.html" target="mainFrame">
                                <span class="glyphicon glyphicon-erase"></span>
                                评论管理
                            </a>
                        </h4>
                    </div>

                </div>

            </div>


        </div>

        <!-- 左侧导航和正文内容的分隔线 -->
        <div class="splitter"></div>

        <!-- 正文内容部分 -->
        <div class="pageContent">
            <iframe src="<%=basePath%>api/platform/userList" id="mainFrame" name="mainFrame"
                    frameborder="0" width="100%"  height="100%" frameBorder="0">
            </iframe>
        </div>

    </div>		<!-- 主体部分结束 -->

    <!-- 底部页脚部分 -->
    <div class="footer">
        <p class="text-center">
            2019 © zhangy-platform.
        </p>
    </div>
</body>
</html>
