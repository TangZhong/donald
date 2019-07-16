/*
 Navicat Premium Data Transfer

 Source Server         : 10.199.245.40
 Source Server Type    : MySQL
 Source Server Version : 50529
 Source Host           : 10.199.245.40:3306
 Source Schema         : music

 Target Server Type    : MySQL
 Target Server Version : 50529
 File Encoding         : 65001

 Date: 16/07/2019 18:28:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for song_listing
-- ----------------------------
DROP TABLE IF EXISTS `song_listing`;
CREATE TABLE `song_listing`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createDate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `playCount` bigint(10) DEFAULT NULL,
  `isValid` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `version` bigint(10) DEFAULT NULL,
  `songsInListing` int(10) DEFAULT NULL,
  `listingCollected` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
