/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : yunkuo_cms_2014

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2013-12-01 23:40:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `c_article`
-- ----------------------------
DROP TABLE IF EXISTS `c_article`;
CREATE TABLE `c_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_article
-- ----------------------------
INSERT INTO `c_article` VALUES ('1', 'aaa');

-- ----------------------------
-- Table structure for `c_category`
-- ----------------------------
DROP TABLE IF EXISTS `c_category`;
CREATE TABLE `c_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_category
-- ----------------------------
INSERT INTO `c_category` VALUES ('1', '国内新闻');
INSERT INTO `c_category` VALUES ('2', '体育新闻');
INSERT INTO `c_category` VALUES ('3', '娱乐新闻');

-- ----------------------------
-- Table structure for `yk_user`
-- ----------------------------
DROP TABLE IF EXISTS `yk_user`;
CREATE TABLE `yk_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL DEFAULT '0',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `sex` int(1) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `status` int(11) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` varchar(50) DEFAULT '127.0.0.1' COMMENT '最后登录IP',
  `login_count` int(11) DEFAULT '0' COMMENT '登录次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ak_username` (`username`),
  KEY `fk_g_user_role` (`role_id`),
  CONSTRAINT `fk_g_user_role` FOREIGN KEY (`role_id`) REFERENCES `g_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='yunkuocms用户表';

-- ----------------------------
-- Records of yk_user
-- ----------------------------
INSERT INTO `yk_user` VALUES ('1', '1', 'admin', null, 'admin@yunkuo.com', '0', null, null, '0');
