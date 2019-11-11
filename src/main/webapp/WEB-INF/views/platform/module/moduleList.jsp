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
            $scope.userListData = null;
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
                        debugger
                        temp = JSON.parse(
                            '[{"id":1,"parentModule":0,"status":1,"moduleName":"用户管理","permissionValue":"open:user:manage"},' +
                            '{"id":2,"parentModule":0,"status":1,"moduleName":"系统管理","permissionValue":"open:system:manage"},' +
                            '{"id":3,"parentModule":1,"status":1,"moduleName":"新增用户","permissionValue":"open:user:add"},' +
                            '{"id":4,"parentModule":1,"status":1,"moduleName":"修改用户","permissionValue":"open:user:edit"},' +
                            '{"id":5,"parentModule":1,"status":0,"moduleName":"删除用户","permissionValue":"open:user:del"},' +
                            '{"id":6,"parentModule":2,"status":1,"moduleName":"系统配置管理","permissionValue":"open:systemconfig:manage"},' +
                            '{"id":7,"parentModule":6,"status":1,"moduleName":"新增配置","permissionValue":"open:systemconfig:add"},' +
                            '{"id":8,"parentModule":6,"status":1,"moduleName":"修改配置","permissionValue":"open:systemconfig:edit"},' +
                            '{"id":9,"parentModule":6,"status":0,"moduleName":"删除配置","permissionValue":"open:systemconfig:del"},' +
                            '{"id":10,"parentModule":2,"status":1,"moduleName":"系统日志管理","permissionValue":"open:log:manage"},' +
                            '{"id":11,"parentModule":10,"status":1,"moduleName":"新增日志","permissionValue":"open:log:add"},' +
                            '{"id":12,"parentModule":10,"status":1,"moduleName":"修改日志","permissionValue":"open:log:edit"},' +
                            '{"id":13,"parentModule":10,"status":0,"moduleName":"删除日志","permissionValue":"open:log:del"}]');
                        $("#example1").bootstrapTable({
                            data: temp,
                            idField: 'id',
                            dataType:'jsonp',
                            columns: [
                                { field: 'check',  checkbox: true, formatter: function (value, row, index) {
                                        if (row.check == true) {
                                            // console.log(row.serverName);
                                            //设置选中
                                            return {  checked: true };
                                        }
                                    }
                                },
                                { field: 'moduleName',  title: '名称' },
                                // {field: 'id', title: '编号', sortable: true, align: 'center'},
                                // {field: 'pid', title: '所属上级'},
                                // { field: 'status',  title: '状态', sortable: true,  align: 'center', formatter: 'statusFormatter'  },
                                // { field: 'permissionValue', title: '权限值'  },
                                // { field: 'operate', title: '操作', align: 'center', events : operateEvents, formatter: 'operateFormatter' },
                            ],

                            // bootstrap-table-treegrid.js 插件配置 -- start

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

        // 格式化按钮
        function operateFormatter(value, row, index) {
            return [
                '<button type="button" class="RoleOfadd btn-small  btn-primary" style="margin-right:15px;"><i class="fa fa-plus" ></i>&nbsp;新增</button>',
                '<button type="button" class="RoleOfedit btn-small   btn-primary" style="margin-right:15px;"><i class="fa fa-pencil-square-o" ></i>&nbsp;修改</button>',
                '<button type="button" class="RoleOfdelete btn-small   btn-primary" style="margin-right:15px;"><i class="fa fa-trash-o" ></i>&nbsp;删除</button>'
            ].join('');

        }
        // 格式化类型
        function typeFormatter(value, row, index) {
            if (value === 'menu') {  return '菜单';  }
            if (value === 'button') {  return '按钮'; }
            if (value === 'api') {  return '接口'; }
            return '-';
        }
        // 格式化状态
        function statusFormatter(value, row, index) {
            if (value === 1) {
                return '<span class="label label-success">正常</span>';
            } else {
                return '<span class="label label-default">锁定</span>';
            }
        }

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