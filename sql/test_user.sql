/*
 Navicat Premium Dump SQL

 Source Server         : 测试机
 Source Server Type    : MySQL
 Source Server Version : 80037 (8.0.37-0ubuntu0.22.04.3)
 Source Host           : 192.168.1.88:3306
 Source Schema         : sgapp

 Target Server Type    : MySQL
 Target Server Version : 80037 (8.0.37-0ubuntu0.22.04.3)
 File Encoding         : 65001

 Date: 19/07/2024 18:24:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '名字',
  `age` int DEFAULT NULL COMMENT '年龄',
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '电话',
  `mail` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

SET FOREIGN_KEY_CHECKS = 1;
