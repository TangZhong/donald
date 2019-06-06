/*
Navicat MySQL Data Transfer

Source Server         : sgps-node
Source Server Version : 50643
Source Host           : 47.100.104.16:3306
Source Database       : flower

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-05-28 17:14:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for T_ADDRESS
-- ----------------------------
DROP TABLE IF EXISTS `T_ADDRESS`;
CREATE TABLE `T_ADDRESS` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地址唯一标识id',
  `userId` int(11) DEFAULT NULL COMMENT '外键，userId',
  `phone` varchar(14) DEFAULT NULL COMMENT '手机号码',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `isDefault` tinyint(4) DEFAULT NULL COMMENT '是否默认地址，1默认，2非默认',
  `province` varchar(100) DEFAULT NULL COMMENT '省份，如：江西',
  `city` varchar(100) DEFAULT NULL COMMENT '城市，如：南昌',
  `area` varchar(100) DEFAULT NULL COMMENT '区，如：高新开发区',
  `detail` text COMMENT '详细地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of T_ADDRESS
-- ----------------------------
INSERT INTO `T_ADDRESS` VALUES ('2', '10', '123456789', '张三', '2', 'gd', 'cq', 'nanan', '不知道的多多多多多');
INSERT INTO `T_ADDRESS` VALUES ('10', '10', '133422151521', '哈哈哈哈', '1', '阿萨德静安寺', '级大神快来得及啊', '到静安寺考虑节点', '就断开拉丝机的');

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论唯一标识id',
  `userId` int(11) DEFAULT NULL COMMENT '外键，用户id',
  `productId` int(11) DEFAULT NULL COMMENT '外键，产品id',
  `content` text COMMENT '内容',
  `picture` varchar(255) DEFAULT NULL COMMENT '评价图片',
  `praise` int(11) DEFAULT NULL COMMENT '赞',
  `start_time` datetime DEFAULT NULL COMMENT '评论时间',
  `status` tinyint(4) DEFAULT NULL COMMENT '评论状态：1正常，2审核，3已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_comment
-- ----------------------------

-- ----------------------------
-- Table structure for t_feedback
-- ----------------------------
DROP TABLE IF EXISTS `t_feedback`;
CREATE TABLE `t_feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `feedbackTime` datetime NOT NULL,
  `content` varchar(512) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_feedback
-- ----------------------------
INSERT INTO `t_feedback` VALUES ('1', '1', '2019-05-27 19:07:57', '233333333333333');
INSERT INTO `t_feedback` VALUES ('2', '10', '2019-05-28 12:52:41', '123121');
INSERT INTO `t_feedback` VALUES ('3', '10', '2019-05-28 16:54:15', '46546465');
INSERT INTO `t_feedback` VALUES ('4', '10', '2019-05-28 16:54:29', '??');
INSERT INTO `t_feedback` VALUES ('5', '10', '2019-05-28 16:55:35', '?????');

-- ----------------------------
-- Table structure for T_ORDER
-- ----------------------------
DROP TABLE IF EXISTS `T_ORDER`;
CREATE TABLE `T_ORDER` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单唯一标识id',
  `userId` int(11) DEFAULT NULL COMMENT '外键，用户id',
  `detail` text COMMENT '订单描述',
  `price` double(10,2) DEFAULT NULL COMMENT '订单总价格',
  `status` tinyint(4) DEFAULT NULL COMMENT '订单状态,0已取消，1待支付，2待发货，3待收货，4待评价，5已评价',
  `start_date` datetime DEFAULT NULL COMMENT '下单时间',
  `addressId` int(11) DEFAULT NULL COMMENT '外键，地址id',
  `remark` text COMMENT '备注',
  `order_number` int(11) DEFAULT NULL COMMENT '流水号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of T_ORDER
-- ----------------------------
INSERT INTO `T_ORDER` VALUES ('2', '10', '好大啊啊沙发金卡双方都啊啊啊', '2200.00', '0', '2019-05-23 19:34:07', '2', '无', '5464');
INSERT INTO `T_ORDER` VALUES ('16', '10', '好大啊啊啊啊啊啊', '100.00', '0', '2019-05-23 19:34:07', '2', '无', '123');

-- ----------------------------
-- Table structure for T_ORDERLIST
-- ----------------------------
DROP TABLE IF EXISTS `T_ORDERLIST`;
CREATE TABLE `T_ORDERLIST` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单项唯一标识id',
  `orderId` int(11) DEFAULT NULL COMMENT '外键，订单id',
  `productId` int(11) DEFAULT NULL COMMENT '外键，产品id',
  `userId` int(11) DEFAULT NULL COMMENT '外键，用户id',
  `number` int(11) DEFAULT NULL COMMENT '购买数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of T_ORDERLIST
-- ----------------------------
INSERT INTO `T_ORDERLIST` VALUES ('1', '16', '1', '123456', '10');
INSERT INTO `T_ORDERLIST` VALUES ('2', '16', '2', '123456', '123');
INSERT INTO `T_ORDERLIST` VALUES ('3', '2', '5', '123456', '10');

-- ----------------------------
-- Table structure for T_PRODUCT
-- ----------------------------
DROP TABLE IF EXISTS `T_PRODUCT`;
CREATE TABLE `T_PRODUCT` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品唯一标识id',
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `type` tinyint(255) DEFAULT NULL COMMENT '商品类型：1鲜花，2绿植，3饰品，4永生花(假花)',
  `image` varchar(255) DEFAULT NULL COMMENT 'json字符串数组组成的，可存储多个商品图片',
  `price` double(10,2) DEFAULT NULL COMMENT '价格——人民币',
  `freight` double(10,2) DEFAULT NULL COMMENT '运费',
  `sold` int(11) DEFAULT NULL COMMENT '已销售多少件',
  `extra` varchar(255) DEFAULT NULL COMMENT '额外字段',
  `introduce` text COMMENT '商品介绍',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态：1正在出售，2已下架',
  `inventory` int(11) DEFAULT NULL COMMENT '库存量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of T_PRODUCT
-- ----------------------------
INSERT INTO `T_PRODUCT` VALUES ('1', '玫瑰花', '1', '/image/meigui.jpg,/image/meigui.jpg', '299.00', '10.00', '2', null, '新鲜采摘', '1', '99');
INSERT INTO `T_PRODUCT` VALUES ('2', '荔枝玫瑰花', '1', '/image/lizhimeigui.jpg', '169.00', '10.00', '1', null, '小清新', '1', '99');
INSERT INTO `T_PRODUCT` VALUES ('3', '小猪佩奇钥匙扣', '3', '/image/peiqi.jpg', '50.00', '10.00', '0', null, '小巧', '1', '99');
INSERT INTO `T_PRODUCT` VALUES ('4', '兔兔钥匙扣', '3', '/image/tutu.jpg', '30.00', '10.00', '9', null, '可爱', '1', '99');
INSERT INTO `T_PRODUCT` VALUES ('5', '兔兔钥匙扣', '2', '/image/tutu.jpg', '111.00', '23.00', '3', null, 'cute', '1', '11');
INSERT INTO `T_PRODUCT` VALUES ('6', '狗狗钥匙扣', '1', '/image/tutu.jpg', '222.00', '32.00', '2', null, 'small', '1', '22');
INSERT INTO `T_PRODUCT` VALUES ('7', 'juju钥匙扣', '1', '/image/meigui.jpg', '9999.00', '20.00', '3', null, '好多', '1', '1');

-- ----------------------------
-- Table structure for t_shopcar
-- ----------------------------
DROP TABLE IF EXISTS `t_shopcar`;
CREATE TABLE `t_shopcar` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '购物车项唯一标识id',
  `productId` int(11) DEFAULT NULL COMMENT '外键，商品id',
  `userId` int(11) DEFAULT NULL COMMENT '外键，用户id',
  `number` int(11) DEFAULT NULL COMMENT '购买数量',
  `selected` tinyint(4) DEFAULT NULL COMMENT '是否被选中，0未选中，1选中',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_shopcar
-- ----------------------------
INSERT INTO `t_shopcar` VALUES ('1', '4', '14', '1', '1');
INSERT INTO `t_shopcar` VALUES ('2', '1', '14', '11', '1');
INSERT INTO `t_shopcar` VALUES ('3', '2', '14', '1', '0');
INSERT INTO `t_shopcar` VALUES ('4', '3', '14', '6', '1');
INSERT INTO `t_shopcar` VALUES ('5', '7', '14', '1', '1');
INSERT INTO `t_shopcar` VALUES ('6', '6', '14', '1', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户唯一标识id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `type` tinyint(4) DEFAULT NULL COMMENT '类型：1管理员，2普通用户...',
  `extra` varchar(255) DEFAULT NULL COMMENT '额外字段，可作为签名等字段',
  `openid` char(255) NOT NULL COMMENT '微信小程序的用户唯一标识，用于判断用户是否注册',
  `phone` varchar(14) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('10', null, null, null, null, 'opD6m5KMupHYZrrO1dvOBODSEt22', null);
INSERT INTO `t_user` VALUES ('11', null, null, null, null, 'opD6m5KMupHYZrrO1dvOBODSEt3', null);
INSERT INTO `t_user` VALUES ('12', null, null, null, null, 'opD6m5KMupHYZrrO1dvOBODS23', null);
INSERT INTO `t_user` VALUES ('13', null, null, null, null, 'opD6m5KMupHYZrrO1dvOBODSEt434', null);
INSERT INTO `t_user` VALUES ('14', null, null, null, null, 'opD6m5KMupHYZrrO1dvOBODSEt0w', null);
SET FOREIGN_KEY_CHECKS=1;
