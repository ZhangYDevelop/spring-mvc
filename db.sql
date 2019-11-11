/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : system

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 10/11/2019 16:33:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_module`;
CREATE TABLE `sys_module` (
  `id` varchar(36) NOT NULL,
  `module_name` varchar(50) DEFAULT NULL,
  `module_code` varchar(50) DEFAULT NULL,
  `parent_module` varchar(36) DEFAULT NULL,
  `module_type` varchar(30) DEFAULT NULL,
  `module_url` varchar(255) DEFAULT NULL,
  `module_icon` varchar(100) DEFAULT NULL,
  `module_eng_desc` varchar(50) DEFAULT NULL,
  `is_run_work_flow` varchar(1) DEFAULT NULL,
  `is_modify` varchar(1) DEFAULT NULL,
  `is_ok` varchar(1) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `is_display_front` varchar(1) DEFAULT NULL,
  `is_top_menu` varchar(1) DEFAULT NULL,
  `is_side_menu` varchar(1) DEFAULT NULL,
  `creator` varchar(36) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `modifier` varchar(36) DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  `ext_field_1` varchar(50) DEFAULT NULL,
  `ext_field_2` varchar(100) DEFAULT NULL,
  `ext_field_3` varchar(100) DEFAULT NULL,
  `ext_field_4` varchar(200) DEFAULT NULL,
  `ext_field_5` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `uk_sys_module_code` (`module_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` varchar(36) NOT NULL,
  `code` varchar(50) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `method` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `is_ok` varchar(1) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `sys_module_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `uk_sys_permission_url_method` (`url`,`method`) USING BTREE,
  UNIQUE KEY `uk_sys_permission_code` (`code`) USING BTREE,
  KEY `fk_sys_permission_sys_module_id` (`sys_module_id`) USING BTREE,
  CONSTRAINT `fk_sys_permission_sys_module_id` FOREIGN KEY (`sys_module_id`) REFERENCES `sys_module` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL,
  `role_name` varchar(50) DEFAULT NULL,
  `role_code` varchar(50) DEFAULT NULL,
  `role_desc` varchar(500) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `is_ok` varchar(1) DEFAULT NULL,
  `org_id` varchar(36) DEFAULT NULL,
  `creator` varchar(36) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `modifier` varchar(36) DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  `tenant_id` varchar(36) DEFAULT NULL,
  `ext_field_1` varchar(50) DEFAULT NULL,
  `ext_field_2` varchar(100) DEFAULT NULL,
  `ext_field_3` varchar(100) DEFAULT NULL,
  `ext_field_4` varchar(200) DEFAULT NULL,
  `ext_field_5` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` varchar(36) NOT NULL,
  `sys_user_id` varchar(36) DEFAULT NULL,
  `sys_role_id` varchar(36) DEFAULT NULL,
  `sys_permission_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_sys_role_permission_sys_user_id` (`sys_user_id`) USING BTREE,
  KEY `fk_sys_role_permission_sys_role_id` (`sys_role_id`) USING BTREE,
  KEY `fk_sys_role_permission_sys_permission_id` (`sys_permission_id`) USING BTREE,
  CONSTRAINT `fk_sys_role_permission_sys_permission_id` FOREIGN KEY (`sys_permission_id`) REFERENCES `sys_permission` (`id`),
  CONSTRAINT `fk_sys_role_permission_sys_role_id` FOREIGN KEY (`sys_role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `fk_sys_role_permission_sys_user_id` FOREIGN KEY (`sys_user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `entity_id` varchar(36) DEFAULT NULL,
  `entity_type` varchar(50) DEFAULT NULL,
  `entity_name` varchar(100) DEFAULT NULL,
  `application_name` varchar(100) DEFAULT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `user_phone` varchar(100) DEFAULT NULL,
  `personal_status` varchar(200) DEFAULT NULL COMMENT '个性签名',
  `password` varchar(60) DEFAULT NULL,
  `pwd_question` varchar(100) DEFAULT NULL,
  `pwd_answer` varchar(100) DEFAULT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `last_pwd_chg_date` datetime DEFAULT NULL,
  `is_online` varchar(1) DEFAULT NULL,
  `is_locked_out` varchar(1) DEFAULT NULL,
  `is_changed_pwd` varchar(1) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `is_ok` varchar(1) DEFAULT NULL,
  `org_id` varchar(36) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `created_by` varchar(50) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` varchar(50) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `accountNonExpired` int(5) DEFAULT NULL,
  `accountNonLocked` int(5) DEFAULT NULL,
  `enabled` int(5) DEFAULT NULL,
  `credentialsNonExpired` int(5) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `creator` varchar(36) DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  `modifier` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` varchar(36) NOT NULL,
  `sys_user_id` varchar(36) DEFAULT NULL,
  `sys_role_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_sys_user_role_sys_user_id` (`sys_user_id`) USING BTREE,
  KEY `fk_sys_user_role_sys_role_id` (`sys_role_id`) USING BTREE,
  CONSTRAINT `fk_sys_user_role_sys_role_id` FOREIGN KEY (`sys_role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `fk_sys_user_role_sys_user_id` FOREIGN KEY (`sys_user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
