/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-01-11 16:13:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cron`
-- ----------------------------
DROP TABLE IF EXISTS `cron`;
CREATE TABLE `cron` (
  `cron_id` varchar(30) NOT NULL,
  `cron` varchar(30) NOT NULL,
  PRIMARY KEY (`cron_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cron
-- ----------------------------
INSERT INTO `cron` VALUES ('1', '0/5 * * * * ?');
