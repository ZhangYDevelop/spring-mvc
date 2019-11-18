<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <jsp:include page="/WEB-INF/tags/head.jsp"></jsp:include>
    <script type="text/javascript">
        var app = angular.module('tableApp', []);
        app.controller('tableAppCtl', function ($scope, $http) {
            $scope.pageInfo = {};
            // 获取菜单数据
            $scope.getUserList = function () {
                var url = '<%=contextPath%>/platform/user/userinfo';
                $http.post(url, {}, {}).then(function (res) {
                    debugger
                    $scope.pageInfo = res.data;
                });
            };
            $scope.getUserList();
        })
        APP.controller('formCtl', function() {
            var ctrl = this;

            ctrl.itemCnt = 100;
            ctrl.currentPage = 1;
            ctrl.itemCntEachPage = 10;

            ctrl.onChange = function() {
                console.log(ctrl.currentPage);
            };
        });

        $(function () {
            angular.bootstrap(document.getElementById("pageNation"),['pageNation']);
        })
    </script>
</head>
<body >
    <table id="example1" class="table table-bordered table-striped" ng-app="tableApp" ng-controller="tableAppCtl as ctrl">
        <thead>
        <tr>
            <th>用户名</th>
            <th>账号</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>创建时间</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="item in pageInfo.list">
            <td>{{item.entity_name}}</td>
            <td>{{item.username}}  </td>
            <td>{{item.user_phone}}</td>
            <td> {{item.user_email}}</td>
            <td>{{item.created_date}}</td>
        </tr>
        </tbody>
    </table>
     <div style="float: right;margin-right:20px;" ng-app="pageNation" ng-controller="formCtl as ctrl" id ="pageNation">
         <pagination
                 pg-item-cnt="ctrl.itemCnt"
                 pg-current="ctrl.currentPage"
                 pg-on-change="ctrl.onChange()"
                 pg-home-text="首页"
                 pg-end-text="尾页"
                 pg-item-cnt-each-page="ctrl.itemCntEachPage">
         </pagination>
     </div>
</body>
</html>