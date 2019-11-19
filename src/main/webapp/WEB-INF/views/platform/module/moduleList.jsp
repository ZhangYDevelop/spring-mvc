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
        var app = angular.module('myApp', []);
        app.controller('formCtrl', function ($scope, $http) {
            $scope.dataList = [];
            $scope.moduleObject = {};
            // 获取菜单数据
            $scope.getModuleList = function () {
                var url = '<%=contextPath%>/platform/sysmodule/getAllSysModule';
                //$http.post(url, {}, {}).then(function (res) {
                $("#example1").bootstrapTable({
                    //data: res.data,
                    url: url,
                    method: 'get',
                    idField: 'id',
                    // dataType:'json',
                    columns: [
                        {
                            field: 'check', checkbox: true, formatter: function (value, row, index) {
                                if (row.check == true) {
                                    //设置选中
                                    return {checked: true};
                                }
                            }
                        },
                        {field: 'moduleName', title: '模块名称'},
                        // {field: 'id', title: '编号', sortable: true, align: 'center'},
                        // {field: 'pid', title: '所属上级'},
                        {field: 'moduleUrl', title: '模块路径', sortable: true, align: 'center'},
                        {
                            field: 'isOk', title: '是否有效', formatter: function (value, row, index) {
                                return value == '1' ? '有效' : '无效';
                            }
                        },
                        {
                            field: 'operate', title: '操作', align: 'center', events: window.operateEvents = {
                                'click .RoleOfdelete': function (e, value, row, index) {
                                    MessageHelp.confirm({message: '确定删除？'}).on(function (success) {
                                        if (success) {
                                            var url = '<%=contextPath%>/platform/sysmodule/delModel';
                                            $http.post(url, {}, {params: {id: row.id}}).then(function (res) {
                                                if (res.data.success) {
                                                    MessageHelp.alert({message: "删除成功"});
                                                } else {
                                                    MessageHelp.alert({message: "删除失败"});
                                                }
                                                $("#example1").bootstrapTable('remove', {
                                                    field: 'id',
                                                    values: [row.id]
                                                });
                                            });
                                        }
                                    })

                                },
                                'click .RoleOfedit': function (e, value, row, index) {
                                }
                            }, formatter: function () {
                                return [
                                    ' <div class="btn-group"> <button  type="button" class="btn btn-info RoleOfedit" ><i class="fa fa-pencil-square-o" ></i>修改</button> <button type="button" class="btn btn-info RoleOfdelete" ><i class="fa fa-trash-o" ></i>删除</button> </div>'
                                ].join('');
                            }
                        },
                    ],

                    //在哪一列展开树形
                    treeShowField: 'moduleName',
                    //指定父id列
                    parentIdField: 'parentModule',
                    toolbar: "#toolbar", //设置工具栏的Id或者class
                    onResetView: function (data) {
                        //console.log('load');
                        $("#example1").treegrid({
                            // initialState: 'collapsed',// 所有节点都折叠
                            initialState: 'expanded',// 所有节点都展开，默认展开
                            treeColumn: 1,
                            onChange: function () {
                                $("#example1").bootstrapTable('resetWidth');
                            }
                        });
                        //只展开树形的第一级节点
                        $("#example1").treegrid('getRootNodes').treegrid('expand');

                    },
                    onCheck: function (row) {
                        var datas = $table.bootstrapTable('getData');
                        // 勾选子类
                        selectChilds(datas, row, "id", "parentModule", true);

                        // 勾选父类
                        selectParentChecked(datas, row, "id", "parentModule")

                        // 刷新数据
                        $table.bootstrapTable('load', datas);
                    },
                    formatLoadingMessage: function () {
                        return "请稍等，正在加载中...";
                    },
                    formatNoMatches: function () {  //没有匹配的结果
                        return '无符合条件的记录';
                    }
                });
            }
            $scope.getModuleList();
            $scope.addModule = function () {
                var url = '<%=contextPath%>/platform/sysmodule/addModel';
                $http.post(url, {}, {params: $scope.moduleObject}).then(function (res) {
                    debugger
                    MessageHelp.alert({message: "保存成功"});
                    $('#modal-default').modal('hide');
                });
            }

            $scope.getTree = function () {
                var url = '<%=contextPath%>/platform/sysmodule/getAllSysModuleJson'
                $http.get(url, {}, {}).then(function (value) {
                    $scope.dataList = value.data;
                })
            }
            $scope.getTree();

        })


    </script>
</head>
<body ng-app="myApp" ng-controller="formCtrl as modulePage">
<table id="example1" class="table table-bordered table-striped"></table>
<div id="toolbar">
    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#modal-default"><i
            class="fa  fa-plus"></i>新增
    </button>
</div>
<div class="modal fade" id="modal-default">
    <div class="modal-dialog" style="width: 700px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">新增模块信息</h4>
            </div>
            <div class="modal-body">
                <div class="box-body">
                    <div class="form-group" style="height: 35px;">

                        <label for="moduleName" class="col-sm-2 control-label">模块名称：</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="moduleName" ng-model="moduleObject.moduleName">
                        </div>
                        <label for="moduleUrl" class="col-sm-2 control-label">模块路径：</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="moduleUrl" ng-model="moduleObject.moduleUrl">
                        </div>

                    </div>
                    <div class="form-group" style="height: 35px;">
                        <label for="moduleIcon" class="col-sm-2 control-label">图标：</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="moduleIcon" ng-model="moduleObject.moduleIcon">
                        </div>
                        <label for="orderNum" class="col-sm-2 control-label">序号：</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="orderNum" ng-model="moduleObject.orderNum">
                        </div>
                    </div>
                    <div class="form-group" style="height: 35px;">
                        <label for="moduleIcon" class="col-sm-2 control-label">父节点：</label>
                        <div class="col-sm-4">
                            <%--<select class="selectpicker" ng-model="moduleObject.parentModule">--%>
                                <%--&lt;%&ndash;<optgroup label="{{item.moduleName}}" ng-options="item in dataList">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<option ng-options="child in item.childern">{{child.moduleName}}</option>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</optgroup>&ndash;%&gt;--%>
                                    <%--<option ng-options="item in dataList">{{item.moduleName}}</option>--%>
                            <%--</select>--%>
                            <select  ng-model="moduleObject.parentModule" style="width: 160px;" >
                                <option ng-repeat="x in dataList" value="{{x.id}}">{{x.moduleName}}</option>
                            </select>
                        </div>
                        <label class="col-sm-2 control-label">是否有效：</label>
                        <div class="col-sm-4">
                            <input type="radio" ng-model="moduleObject.isOk" value="1"> 是
                            <input type="radio" ng-model="moduleObject.isOk" value="0"> 否
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" ng-click="addModule()">保存</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
</body>
</html>