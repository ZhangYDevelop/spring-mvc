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
            // https://blog.csdn.net/qq_36987822/article/details/83857708 后续参照该网址优化，分页等功能
            // 获取菜单数据
            $scope.getUserList = function () {
                var url = '<%=contextPath%>/platform/sysmodule/getAllSysModule';
                $http.post(url, {}, {}).then(function (res) {
                    if (res.data && res.data.length > 0) {
                        var temp = [];
                        res.data.forEach(function (item) {
                            var flag = temp.find(function (value) { return value.id == item.id });
                            if (!flag) temp.push(item);
                        })
                        $("#example1").bootstrapTable({
                            data: temp,
                            idField: 'id',
                            dataType:'jsonp',
                            // striped : true, //是否显示行间隔色
                            // cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                            // pagination : true, //是否显示分页（*）
                            // sortable : false, //是否启用排序
                            // sidePagination : "server", //分页方式：client客户端分页client客户端分页，server服务端分页（*）
                            // pageNumber : 1, //初始化加载第一页，默认第一页
                            // pageSize : 9, //每页的记录行数（*）
                            // pageList : [ 10, 25, 50, 100 ], //可供选择的每页的行数（*）
                            columns: [
                                { field: 'check',  checkbox: true, formatter: function (value, row, index) {
                                        if (row.check == true) {
                                            // console.log(row.serverName);
                                            //设置选中
                                            return {  checked: true };
                                        }
                                    }
                                },
                                { field: 'moduleName',  title: '模块名称' },
                                // {field: 'id', title: '编号', sortable: true, align: 'center'},
                                // {field: 'pid', title: '所属上级'},
                                { field: 'moduleUrl',  title: 'moduleUrl', sortable: true,  align: 'center' },
                                { field: 'isOk', title: '是否有效' , formatter: function (value, row ,index) {
                                        return value == '1' ?  '有效' : '无效';
                                    } },
                                { field: 'operate', title: '操作', align: 'center', events : operateEvents, formatter: function () {
                                        return [
                                            ' <div class="btn-group"> <button type="button" class="btn btn-info"><i class="fa fa-pencil-square-o" ></i>&nbsp;修改</button> <button type="button" class="btn btn-info"><i class="fa fa-trash-o" ></i>&nbsp;删除</button> </div>'
                                        ].join('');
                                    } },
                            ],

                            //在哪一列展开树形
                            treeShowField: 'moduleName',
                            //指定父id列
                            parentIdField: 'parentModule',
                            onResetView: function(data) {
                                //console.log('load');
                                $("#example1").treegrid({
                                    initialState: 'collapsed',// 所有节点都折叠
                                    // initialState: 'expanded',// 所有节点都展开，默认展开
                                    treeColumn: 1,
                                    // expanderExpandedClass: 'glyphicon glyphicon-minus',  //图标样式
                                    // expanderCollapsedClass: 'glyphicon glyphicon-plus',
                                    onChange: function() {
                                        $("#example1").bootstrapTable('resetWidth');
                                    }
                                });

                                //只展开树形的第一级节点
                                $("#example1").treegrid('getRootNodes').treegrid('expand');

                            },
                            onCheck:function(row){
                                var datas = $table.bootstrapTable('getData');
                                // 勾选子类
                                selectChilds(datas,row,"id","parentModule",true);

                                // 勾选父类
                                selectParentChecked(datas,row,"id","parentModule")

                                // 刷新数据
                                $table.bootstrapTable('load', datas);
                            },
                            onUncheck:function(row){
                                var datas = $table.bootstrapTable('getData');
                                selectChilds(datas,row,"id","parentModule",false);
                                $("#example1").bootstrapTable('load', datas);
                            },
                            // bootstrap-table-treetreegrid.js 插件配置 -- end
                        });

                    }

                });
            };
            $scope.getUserList();
        })
        //初始化操作按钮的方法
        window.operateEvents = {
            'click .RoleOfadd': function (e, value, row, index) {
                add(row.id);
            },
            'click .RoleOfdelete': function (e, value, row, index) {
                del(row.id);
            },
            'click .RoleOfedit': function (e, value, row, index) {
                update(row.id);
            }
        };

    </script>
</head>
<body ng-app="myApp" ng-controller="formCtrl">

<table id="example1" class="table table-bordered table-striped">
</table>
</body>
</html>