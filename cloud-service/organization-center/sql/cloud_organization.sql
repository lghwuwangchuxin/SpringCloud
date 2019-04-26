/*
Navicat MySQL Data Transfer

Source Server         : mysql_localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : cloud_organization

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-04-26 16:29:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cloud_org
-- ----------------------------
DROP TABLE IF EXISTS `cloud_org`;
CREATE TABLE `cloud_org` (
  `org_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `org_name` varchar(255) DEFAULT NULL COMMENT '组织名称',
  `org_parent_id` int(255) DEFAULT NULL COMMENT '上级代码ID',
  `org_path` varchar(255) DEFAULT NULL COMMENT '路径',
  `org_short_id` int(11) DEFAULT NULL COMMENT '上级简称ID',
  `org_short_name` varchar(255) DEFAULT NULL COMMENT '上级简称名称',
  `org_state` int(255) DEFAULT NULL COMMENT '状态 1.有效2.无效',
  `org_create_date` date DEFAULT NULL COMMENT '创建时间',
  `org_update_date` date DEFAULT NULL COMMENT '修改时间',
  `org_code` varchar(255) DEFAULT NULL COMMENT '组织代码',
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cloud_org
-- ----------------------------
