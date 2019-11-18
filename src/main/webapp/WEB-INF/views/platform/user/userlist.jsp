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
        <%--var app = angular.module('tableApp', []);--%>
        <%--app.controller('tableAppCtl', function ($scope, $http) {--%>
            <%--$scope.pageInfo = {};--%>
            <%--// 获取菜单数据--%>
            <%--$scope.getUserList = function () {--%>
                <%--var url = '<%=contextPath%>/platform/user/userinfo';--%>
                <%--$http.post(url, {}, {}).then(function (res) {--%>
                    <%--debugger--%>
                    <%--$scope.pageInfo = res.data;--%>
                <%--});--%>
            <%--};--%>
            <%--$scope.getUserList();--%>
        <%--})--%>
        APP.controller('formCtl', function($scope, $http) {
            var ctrl = this;
            $scope.pageInfo = {};
            $scope.currentPage = 1;
            $scope.itemCntEachPage = 2;
            // 获取菜单数据
            $scope.getUserList = function () {
                var url = '<%=contextPath%>/platform/user/userinfo';
                var page = $scope.currentPage - 1;
                $scope.param = {page: page, pageSize: $scope.itemCntEachPage };
                $http.get(url, {params: $scope.param}).then(function (res) {
                    $scope.pageInfo = res.data;
                    $scope.itemCnt = res.data.total;
                });
            };
            $scope.onChange = function(value) {
                console.log(ctrl.currentPage);
                $scope.getUserList();
            };

        });

        // $(function () {
        //     angular.bootstrap(document.getElementById("pageNation"),['pageNation']);
        // })
    </script>
</head>
<body ng-app="pageNation" ng-controller="formCtl as ctrl" id ="pageNation">
    <table class="table table-bordered table-striped">
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
            <td>{{item.created_time | date:'yyyy-MM-dd hh:mm:ss'}}</td>
        </tr>
        </tbody>
    </table>
     <div style="float: right;margin-right:20px;" >
         <pagination
                 pg-item-cnt="itemCnt"
                 pg-current="currentPage"
                 pg-on-change="onChange()"
                 pg-home-text="首页"
                 pg-end-text="尾页"
                 pg-item-cnt-each-page="itemCntEachPage">
         </pagination>
     </div>
</body>
</html>