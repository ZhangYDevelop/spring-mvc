create  table sys_user (
    id  int (10) not null,
    username varchar (64) default  null,
    realName varchar (64) default  null,
    password varchar (64) default null ,
    accountNonExpired int(5) default  null,
    accountNonLocked int(5) default  null,
    enabled int(5) default null,
    credentialsNonExpired int(5) default null,
    createTime date  default null,
    createUserId varchar(36)  default null,
    primary key (`id`)
) DEFAULT CHARSET 'utf8';;


create  table sys_role (
  id  int (10) not null,
  role_name varchar (64) default null,
  role_desc varchar(64) default null,
  primary key (`id`)
) DEFAULT CHARSET 'utf8';

create table sys_permission (
   id  int (10) not null,
   perm_name varchar (64) default null,
   perm_tag varchar (64) default null,
   primary key (`id`)
) DEFAULT CHARSET 'utf8';

create table sys_role_permission (
   id  int (10) not null,
   role_id int(10) default  null,
   perm_id int(10) default null,
   primary key (`id`)
)DEFAULT CHARSET 'utf8';

create table sys_user_role (
  id  int (10) not null,
  user_id int(10) default  null,
  role_id int(10) default null,
  primary key (`id`)
)DEFAULT CHARSET 'utf8';



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_module`;
CREATE TABLE `sys_module`  (
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `module_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `module_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `parent_module` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `module_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `module_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `module_icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `module_eng_desc` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_run_work_flow` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_modify` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_ok` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_num` int(11) NULL DEFAULT NULL,
  `is_display_front` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_top_menu` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_side_menu` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `creator` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `created_time` datetime(0) NULL DEFAULT NULL,
  `modifier` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modified_time` datetime(0) NULL DEFAULT NULL,
  `ext_field_1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext_field_2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext_field_3` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext_field_4` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ext_field_5` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_sys_module_code`(`module_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_module
-- ----------------------------
INSERT INTO `sys_module` VALUES ('0026c983-c96d-482b-97d6-fe18f23b0fd6', '文件日志', 'file_logs', '73cd0e61-1ea4-4186-bbce-5c9dd715121f', '业务模块', '/admin/system/logs/filelog', NULL, '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('00d315db-1d61-4d18-b199-c6e5433207ea', '整改单汇总(管监)', 'supervisorSheet', 'adc8a539-605b-4c55-84e9-88eac300d4d9', '业务模块', '/business/qualityManagement/supervisorSheet', NULL, '', '0', '0', '0', 7, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('00dbe901-c240-4f32-b6cd-dc88e3a52189', '文档编号方案', 'RESOURCE_SERIALNUM_SCHEME', '75c810b6-b22d-460a-a653-b0abd7170314', '业务模块', '/admin/system/resourceSerialnumScheme', NULL, '', '0', '0', '1', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('05dab46f-304c-422c-8d1e-67d2e025d960', '自定义构件属性', 'ComponentProperty', '620c78d8-1a78-4944-a13e-6dfc417267d5', '业务模块', '/business/three-dmodel/componentProperty', NULL, '', '0', '0', '1', 5, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('064d7a24-fa54-4279-99bf-8f048bc177fd', '管监巡检统计', 'safetyAssessmentStatistics', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/safetyAssessmentStatistics', NULL, '', '0', '0', '0', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('0f24a590-3a85-4d92-9b8e-a4067e66cfbd', 'FORGE_BIM清溪基地', 'frogemodelbroweBim', '620c78d8-1a78-4944-a13e-6dfc417267d5', '业务模块', '/business/frogemodelbroweBim', NULL, '', '0', '0', '1', 6, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('1114ffe9-3aa4-4d03-b1fb-c829d1b798b0', '质量模型', 'qualityModel', 'adc8a539-605b-4c55-84e9-88eac300d4d9', '业务模块', '/business/qualityManagement/qualityModel', NULL, '', '0', '0', '1', 8, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('11af70c5-bedb-47a9-a894-e247c83fccba', '算量管理', 'quantityManagement', 'fb151784-9dae-44e6-8c99-98f330305ed6', '业务模块', '/business/costManagement/quantityManagement', NULL, '', '0', '0', '1', 10, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('14fec805-17c2-4c0f-836e-f94f91390304', '视频设备管理页面', 'safeVideoEquipment', '75c810b6-b22d-460a-a653-b0abd7170314', '业务模块', '/business/securityManagement/safeVideoEquipment', NULL, '', '0', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('1779aeb2-a5f4-4944-a3f1-61ef0d21705c', '日常安全文明巡查', 'SafetyInspectionTour', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/inspectionStatistics', NULL, '', '0', '0', '1', 3, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('18bdac96-092a-40b1-91fd-483b84c6cca2', '整改单统计（管监）', 'assessentPunchList', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/assessentPunchList', NULL, '', '0', '0', '0', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('1a16fd09-3767-4348-bf3d-2c2f6826ae6b', '字典管理', 'system_dict', '75c810b6-b22d-460a-a653-b0abd7170314', '业务模块', '/admin/system/dicts', NULL, '', '0', '0', '1', 1, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('1a863476-d4bd-428d-8aba-b72ada4e35aa', '安全二维码管理', 'safeQrcodeManagement', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/safeQrcodeManagement', NULL, '', '0', '0', '1', 6, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('1b81ddbf-9370-4a8e-b8a9-edc8c48091a0', '任务管理', 'task_management', NULL, '业务模块', '/business/task-management', 'icon-list', '', '0', '0', '1', 6, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('1c5f8cb4-ce63-442c-8720-86aac7cad7f1', '施工月度计划', 'building_monthly_plan', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/buildingMonthlyPlan', NULL, '', '0', '0', '0', 6, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('202f9913-65f0-487a-b7bb-41acbbbd61de', '整改单统计（工程）', 'projectPunchList', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/projectPunchList', NULL, '', '0', '0', '1', 5, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('222d01a5-10f1-4a89-abd9-23e508813f56', '安全巡查记录', 'safeCheckRecord', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/safeCheckRecord', NULL, '', '0', '0', '1', 7, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('266be373-ae1e-482d-b25e-9ce7a7485855', '模型结构', 'modelStructure', '620c78d8-1a78-4944-a13e-6dfc417267d5', '业务模块', '/business/three-dmodel/modelStructure', NULL, '', '0', '0', '0', 2, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('2690c64a-6261-477e-acb4-36279cfd99ab', '权限流程', 'PERMISSION_FLOW', 'c98e953b-fbb1-4053-aa88-0eff09f08c9d', '核心模块', '/admin/system/permissionFlow', NULL, '', '0', '0', '1', 6, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('2d16a4a7-7c47-422e-85ed-8b56c54c5494', '权限角色管理', 'PERMISSION_ROLE', 'c98e953b-fbb1-4053-aa88-0eff09f08c9d', '核心模块', '/admin/system/permissionRole', NULL, '', '0', '0', '1', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('2d808ebd-a1bc-4ee6-9734-1893d043682f', '进度填报', 'completion_rate', '36a4e59a-9b05-4fe7-90b6-ed9189a21bdd', '业务模块', '/business/cockpit-data/completion-rate', 'anticon anticon-form', '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('2df4a969-859f-4be5-aa1f-fc28e75db0f9', '标注', 'designAssociatedMark', 'e96f3d9d-e0b4-4d62-9c7b-72d4fdb1fe0f', '业务模块', '/business/designAssociated/designAssociatedMark', NULL, '', '0', '0', '1', 1, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('2e7a9fe9-2c08-4534-86bf-0cd3e530e139', '支付管理', 'contractPayInfo', 'fb151784-9dae-44e6-8c99-98f330305ed6', '业务模块', '/business/costManagement/contractPayInfo', NULL, '', '0', '0', '1', 70, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('303a4bc9-0275-45cd-b7e2-9463402795aa', '清单与模型关联', 'modelInventory', 'fb151784-9dae-44e6-8c99-98f330305ed6', '业务模块', '/business/costManagement/modelInventoryManagement', NULL, '', '0', '0', '1', 80, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('36a4e59a-9b05-4fe7-90b6-ed9189a21bdd', '驾驶舱数据录入', 'cockpit', NULL, '业务模块', '/business/cockpit', 'anticon anticon-rocket', '', '0', '0', '1', 14, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('3a712eb1-f768-4b52-a2f8-1e2a6e62322d', '重大节点', 'majorNode', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/majorNode', NULL, '', '0', '0', '1', 9, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('3b7cfa5f-bdfc-4412-b800-7645285812fc', '设计变更', 'designCheck', '7bd0c5de-a999-4da6-91fb-2f82434b172c', '业务模块', '/business/designAssociated/designCheck', NULL, '', '0', '0', '1', 7, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('3c691cf7-6389-4184-abb2-cb39286b558a', '测试子模块2', '2323', '4d14b71d-24d4-4ca8-9f0b-f47c9878f2b1', '业务模块', '32323', NULL, NULL, '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('3ccbd615-d176-4d30-93b2-ba0d36d1e70a', '驾驶舱', 'cockpitpage', NULL, '业务模块', '/cockpit/home', 'anticon anticon-laptop', '', '0', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('40991128-d65b-4faa-a791-58b4a4802950', '质量检查', 'inspectionStatistics', 'adc8a539-605b-4c55-84e9-88eac300d4d9', '业务模块', '/business/qualityManagement/inspectionStatistics', NULL, '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('46feebce-0fcf-465a-b0b6-fe0808924682', '方案报审', 'designSchemeAudit', '7bd0c5de-a999-4da6-91fb-2f82434b172c', '业务模块', '/business/designAssociated/designSchemeAudit', NULL, '', '0', '0', '1', 9, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('4a0e5b98-6426-46dd-a376-e6e864df7267', '视频监控', 'projectVideo', '6e434241-3fc7-4b15-b293-1fe49cb0ac3b', '业务模块', '/business/project-manage/projectVideo', NULL, '', '0', '0', '1', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('4c3b1637-688d-4d04-a555-c8f184f2e296', '开发报建计划下发', 'test1', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/test1', NULL, '', '0', '0', '0', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('4cb309da-ba58-4d84-9f56-f5ff2f56da59', '任务', 'designAssociatedTask', 'e96f3d9d-e0b4-4d62-9c7b-72d4fdb1fe0f', '业务模块', '/business/designAssociated/designAssociatedTask', NULL, '', '0', '0', '1', 3, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('551075a3-ba63-4bf0-b211-ab8bfe65ef66', '短信记录', 'SMS_RECORD', '73cd0e61-1ea4-4186-bbce-5c9dd715121f', '核心模块', '/admin/system/logs/smslog', NULL, '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('5532c86d-4ada-4ccf-9a19-707fe8bcefa0', '进度报表', 'process_statistics', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/processStatistics', NULL, '', '0', '0', '1', 12, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('55a728f3-60f1-409b-9562-6759e6331268', '碰撞检测', 'modelCrashCheck', 'e96f3d9d-e0b4-4d62-9c7b-72d4fdb1fe0f', '核心模块', '/business/designAssociated/modelCrashCheck', NULL, '', '0', '0', '0', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('56f32d1c-f0be-4465-b71c-106fc3123585', '进度管理', 'processManagement', NULL, '业务模块', '/business/processManagement', 'icon-speedometer', NULL, '0', '0', '1', 5, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('5b395934-959e-4f1e-bb57-eb1715f2b5bd', '指标排名', 'indexRank', '36a4e59a-9b05-4fe7-90b6-ed9189a21bdd', '业务模块', '/business/cockpit-data/index-rank', NULL, '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('5bf25e33-43bc-41c4-b0d2-1dd11936e203', '建造模型', 'constructModel', NULL, '业务模块', '/business/constructModel', 'icon-home', '', '0', '0', '1', 9, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('5c466633-351d-44fa-8dc6-b08234af580c', '合同管理', 'contractManagement', 'fb151784-9dae-44e6-8c99-98f330305ed6', '业务模块', '/business/costManagement/contractManagement', NULL, '', '0', '0', '1', 20, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('5c838768-1940-4b62-89b7-81743d4f5627', '检查记录清单', 'securityRecordList', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/securityRecordList', NULL, '', '0', '0', '1', 14, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('6051a16e-093a-4db7-892f-6a6e2503db1a', '项目详情', 'projectDetail', '6e434241-3fc7-4b15-b293-1fe49cb0ac3b', '业务模块', '/business/project-manage/projectDetail', NULL, '', '0', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('60947620-4aea-4eec-a70d-d4a43312af57', '模块管理', 'modules', 'c98e953b-fbb1-4053-aa88-0eff09f08c9d', '业务模块', '/admin/system/modules', NULL, '', '0', '0', '1', 1, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('60cc8538-7cb9-4a59-b622-1a96eec905a4', '进度产值', 'scheduleOutput', 'fb151784-9dae-44e6-8c99-98f330305ed6', '业务模块', '/business/costManagement/scheduleOutput', NULL, '', '0', '0', '1', 50, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('611267d0-467e-48b7-973e-6ea8beb916a0', '安全晨会', 'safetyBriefings', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/safetyBriefings', NULL, '', '0', '0', '1', 8, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('620c78d8-1a78-4944-a13e-6dfc417267d5', '模型管理', 'three-dmodel', NULL, '业务模块', '/business/three-dmodel', 'icon-puzzle', '', '0', '0', '1', 3, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('69f89aaa-e6f3-4f4c-b1c4-45744a631b50', '模型组合', 'modelCompose', '620c78d8-1a78-4944-a13e-6dfc417267d5', '业务模块', '/business/three-dmodel/modelCompose', NULL, '', '0', '0', '1', 1, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('6d73b274-7e24-4e73-9659-97dbce451a23', '分部分项管理', 'safetyPatroClause', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/safetyPatroClause', NULL, '', '0', '0', '0', 12, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('6e434241-3fc7-4b15-b293-1fe49cb0ac3b', '项目信息', 'projectManagement', NULL, '业务模块', '/business/project-manage', 'icon-globe', '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('6f9c7122-8b79-4328-96a3-218adcaa0008', '流程管理', 'WORKFLOW', '951aff45-aa7a-471f-b4e6-90614f2bbc8b', '核心模块', '/admin/workflow', NULL, '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('73cd0e61-1ea4-4186-bbce-5c9dd715121f', '日志管理', 'system_logs', '951aff45-aa7a-471f-b4e6-90614f2bbc8b', '业务模块', '/admin/logs', NULL, '', '0', '0', '1', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('75c810b6-b22d-460a-a653-b0abd7170314', '系统设置', 'system_settings', '951aff45-aa7a-471f-b4e6-90614f2bbc8b', '业务模块', '/admin/system', NULL, '', '0', '0', '1', 3, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('764d562d-685f-4ae3-85e0-7f7380fe705f', '个人消息', 'notification', '1b81ddbf-9370-4a8e-b8a9-edc8c48091a0', '业务模块', '/admin/message/notification', NULL, '', '0', '0', '1', 3, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('7b14cde1-248c-47bd-862e-3c558187673c', '基岩灌浆', 'bedrockStarch', 'adc8a539-605b-4c55-84e9-88eac300d4d9', '业务模块', '/business/qualityManagement/bedrockStarch', NULL, '', '0', '0', '1', 9, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('7bd0c5de-a999-4da6-91fb-2f82434b172c', '设计管理', 'designAssociated', NULL, '业务模块', '/business/designAssociated', 'icon-tag', '', '0', '0', '1', 4, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('7de0e88a-500c-44c7-a7d4-88c3ff9c8bc8', '开发报建计划考核', 'tets3', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/test3', NULL, NULL, '0', '0', '0', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('84792806-84f8-4259-97c0-2f301b73b20c', '模型对比', 'model_contrast', '620c78d8-1a78-4944-a13e-6dfc417267d5', '业务模块', '/business/three-dmodel/modelContrast', NULL, '用于模型对比', '0', '0', '0', 3, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('85e43069-d99b-4c65-a5a5-db56b163304d', '人材调差管理', 'materialAdjustPrice', 'fb151784-9dae-44e6-8c99-98f330305ed6', '业务模块', '/business/costManagement/materialAdjustPrice', NULL, '', '0', '0', '1', 40, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('861d3cce-bda1-4450-a840-364e97f0cb2b', '查询模板', 'query_mould', '620c78d8-1a78-4944-a13e-6dfc417267d5', '业务模块', '/business/three-dmodel/queryMould', NULL, '', '0', '0', '0', 4, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('872925aa-be2d-4778-897b-8ed3d0875e86', '开发报建证照录入', 'test2', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/test2', NULL, NULL, '0', '0', '0', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('8788bf90-3f7a-4da8-8c1c-2de175b7ad0f', '整改单汇总', 'rectificationSheet', 'adc8a539-605b-4c55-84e9-88eac300d4d9', '业务模块', '/business/qualityManagement/rectificationSheet', NULL, '', '0', '0', '1', 6, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('8d71174b-9e1e-46e4-bebc-e88dcff8ee52', '视图', 'designAssociatedView', 'e96f3d9d-e0b4-4d62-9c7b-72d4fdb1fe0f', '业务模块', '/business/designAssociated/designAssociatedView', NULL, '', '0', '0', '0', 2, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('8ee6cc90-0523-4cf8-9a15-ff41ccede5a4', '项目资料', 'projectInformation', NULL, '业务模块', '/business/projectInformation', 'icon-exclamation', '', '1', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('8f4bd8ce-a30f-4a6a-99f9-6b63c3fa1e99', '我的流程', 'TASK-PERSON-WORKFLOW', '1b81ddbf-9370-4a8e-b8a9-edc8c48091a0', '业务模块', '/business/task-management/person-workflow', NULL, '', '0', '0', '1', 3, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('90df12c6-2c62-48aa-b15b-e85cce688da8', '里程碑', 'keyNode', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/keyNode', NULL, '', '0', '0', '1', 4, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('91056a8a-8e9d-4ba9-aa38-1fb78ba0a048', '进度对比', 'processModelCompare', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/processModelCompare', NULL, '', '0', '0', '1', 11, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('92c69c9a-f325-4757-b4d9-1f2bab04e1ad', '项目总览', 'projectProfile', '6e434241-3fc7-4b15-b293-1fe49cb0ac3b', '业务模块', '/business/project-manage/projectProfile', NULL, '', '0', '0', '1', 1, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('951aff45-aa7a-471f-b4e6-90614f2bbc8b', '系统管理', 'admin', NULL, '核心模块', '/admin', 'icon-grid', '管理人员机构以及权限', '0', '0', '1', 20, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('9827bae9-4010-4e23-b07b-9726eb350a7f', '安全地基监测', 'safeFoundationMonitor', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/safeFoundationMonitor', NULL, '', '0', '0', '1', 9, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('98af355a-fe82-4355-b4c4-b8236ed6e451', '节假日管理', 'WORKFLOW-HOLIDAYS', '6f9c7122-8b79-4328-96a3-218adcaa0008', '核心模块', '/admin/workflow/holidays', NULL, '', '0', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('9944f165-c41d-4c21-b080-3f8a49fa9500', '安全问题统计', 'securityProblemStaistics', 'dad5d583-2082-4ae9-819b-48e17338aebe', '业务模块', '/business/securityManagement/securityProblemStaistics', NULL, '', '0', '0', '1', 13, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('9d0b3534-b41e-4a2f-b50e-e8f7eba4fbb9', '角色管理', 'roles', 'c98e953b-fbb1-4053-aa88-0eff09f08c9d', '业务模块', '/admin/system/roles', NULL, '', '0', '0', '1', 1, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('9f171213-07e5-4490-a450-77fc4b4b270f', '施工年度计划', 'building_yearly_plan', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/buildingYearlyPlan', NULL, '', '0', '0', '0', 5, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('9fad5acf-7e27-4622-83f1-9b1659dfaa82', '施工周计划', 'building_weekly_plan', '56f32d1c-f0be-4465-b71c-106fc3123585', '业务模块', '/business/processManagement/buildingWeeklyPlan', NULL, '', '0', '0', '0', 7, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a097e633-5c5f-4bf0-8aa6-ce62e638d480', '单位管理', 'unit', 'cf8b5957-73e0-4f9b-834f-d1b3ce8098ae', '业务模块', '/admin/hrms/unit', NULL, '', '0', '0', '1', 1, '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a0ebb092-9de8-4e0a-8ee7-5ba5efd648ea', '模块日志', 'log_module_operate', '73cd0e61-1ea4-4186-bbce-5c9dd715121f', '业务模块', '/admin/system/logs/modulelog', NULL, '', '0', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a1a38648-8da8-489f-9182-573d72c4183d', '会议管理', 'meeting', NULL, '业务模块', '/business/meeting', 'anticon anticon-team', '', '0', '0', '1', 15, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a66d1466-396b-4713-821d-cbe36fb6a8d2', '形象进度', 'projectSnap', '6e434241-3fc7-4b15-b293-1fe49cb0ac3b', '业务模块', '/business/project-manage/projectSnap', NULL, '', '0', '0', '1', 3, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a67ccebc-89b4-4515-9c51-bf7621d45ec0', '日常质量检查', 'nonAssessment', 'adc8a539-605b-4c55-84e9-88eac300d4d9', '业务模块', '/business/qualityManagement/nonAssessment', NULL, '', '0', '0', '1', 3, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a67dfddf-406c-4f25-bd68-db3618a66c4b', '收发文', 'receiveSend', '1b81ddbf-9370-4a8e-b8a9-edc8c48091a0', '业务模块', '/business/task-management/receiveSend', NULL, '', '0', '0', '1', 12, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a69e0f23-ef43-4ff1-862b-f3456d1022c6', '共享交流', 'modelShare', '7bd0c5de-a999-4da6-91fb-2f82434b172c', '业务模块', '/business/designAssociated/modelShareRoom', NULL, '', '0', '0', '1', 8, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_module` VALUES ('a6e7e718-b243-46d5-a0cc-b705b4da64d7', '通知公告', 'notice_management', '1b81ddbf-9370-4a8e-b8a9-edc8c48091a0', '业务模块', '/business/task-management/noticeManagement', NULL, '', '0', '0', '1', 2, '0', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
