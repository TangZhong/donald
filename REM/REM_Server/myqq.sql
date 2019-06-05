/*
Navicat MySQL Data Transfer

Source Server         : me
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : myqq

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2017-03-25 15:19:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `chatinfo`
-- ----------------------------
DROP TABLE IF EXISTS `chatinfo`;
CREATE TABLE `chatinfo` (
  `CNO` int(4) NOT NULL AUTO_INCREMENT,
  `CSENDQQ` decimal(5,0) DEFAULT NULL,
  `CRECEIVEQQ` decimal(5,0) DEFAULT NULL,
  `CDATE` datetime DEFAULT NULL,
  `TNO` int(3) DEFAULT NULL,
  PRIMARY KEY (`CNO`)
) ENGINE=InnoDB AUTO_INCREMENT=518 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chatinfo
-- ----------------------------
INSERT INTO `chatinfo` VALUES ('1', '10002', '10001', '2014-01-08 17:01:56', '5');
INSERT INTO `chatinfo` VALUES ('210', '10005', '10001', '2014-06-30 13:06:43', '234');
INSERT INTO `chatinfo` VALUES ('211', '10001', '10003', '2014-06-30 22:06:58', '240');
INSERT INTO `chatinfo` VALUES ('212', '10001', '10003', '2014-06-30 22:06:29', '241');
INSERT INTO `chatinfo` VALUES ('213', '10003', '10001', '2014-06-30 22:06:59', '242');
INSERT INTO `chatinfo` VALUES ('214', '10003', '10001', '2014-06-30 22:06:05', '243');
INSERT INTO `chatinfo` VALUES ('215', '10001', '10003', '2014-06-30 22:06:09', '244');
INSERT INTO `chatinfo` VALUES ('216', '10001', '10002', '2014-06-30 22:06:56', '250');
INSERT INTO `chatinfo` VALUES ('217', '10002', '10001', '2014-06-30 22:06:12', '251');
INSERT INTO `chatinfo` VALUES ('218', '10001', '10002', '2014-07-01 11:07:25', '260');
INSERT INTO `chatinfo` VALUES ('219', '10002', '10001', '2014-07-01 11:07:28', '261');
INSERT INTO `chatinfo` VALUES ('220', '10002', '10001', '2014-07-01 15:07:34', '270');
INSERT INTO `chatinfo` VALUES ('221', '10001', '10002', '2014-07-01 15:07:52', '271');
INSERT INTO `chatinfo` VALUES ('222', '10001', '10002', '2014-07-01 15:07:16', '272');
INSERT INTO `chatinfo` VALUES ('223', '10002', '10001', '2014-07-01 15:07:22', '273');
INSERT INTO `chatinfo` VALUES ('224', '10001', '10002', '2014-07-01 15:07:36', '274');
INSERT INTO `chatinfo` VALUES ('225', '10002', '10001', '2014-07-01 15:07:39', '275');
INSERT INTO `chatinfo` VALUES ('226', '10001', '10002', '2014-07-01 16:07:15', '280');
INSERT INTO `chatinfo` VALUES ('227', '10001', '10002', '2014-07-01 16:07:30', '281');
INSERT INTO `chatinfo` VALUES ('228', '10002', '10001', '2014-07-01 16:07:01', '282');
INSERT INTO `chatinfo` VALUES ('229', '10001', '10002', '2014-07-01 16:07:56', '283');
INSERT INTO `chatinfo` VALUES ('230', '10001', '10002', '2014-07-01 16:07:57', '284');
INSERT INTO `chatinfo` VALUES ('231', '10001', '10002', '2014-07-01 18:07:22', '290');
INSERT INTO `chatinfo` VALUES ('232', '10002', '10001', '2014-07-01 18:07:43', '291');
INSERT INTO `chatinfo` VALUES ('233', '10001', '10002', '2014-07-01 18:07:54', '292');
INSERT INTO `chatinfo` VALUES ('234', '10001', '10002', '2014-07-01 18:07:33', '293');
INSERT INTO `chatinfo` VALUES ('235', '10002', '10001', '2014-07-01 18:07:55', '294');
INSERT INTO `chatinfo` VALUES ('236', '10001', '10002', '2014-07-01 18:07:59', '295');
INSERT INTO `chatinfo` VALUES ('237', '10002', '10001', '2014-07-01 18:07:45', '296');
INSERT INTO `chatinfo` VALUES ('238', '10001', '10002', '2014-07-01 18:07:02', '297');
INSERT INTO `chatinfo` VALUES ('239', '10002', '10001', '2014-07-01 18:07:05', '298');
INSERT INTO `chatinfo` VALUES ('240', '10002', '10001', '2014-07-01 18:07:58', '299');
INSERT INTO `chatinfo` VALUES ('241', '10001', '10002', '2014-07-01 18:07:00', '300');
INSERT INTO `chatinfo` VALUES ('242', '10001', '10002', '2014-07-01 19:07:46', '301');
INSERT INTO `chatinfo` VALUES ('243', '10002', '10001', '2014-07-01 19:07:49', '302');
INSERT INTO `chatinfo` VALUES ('244', '10001', '10002', '2014-07-01 19:07:57', '303');
INSERT INTO `chatinfo` VALUES ('245', '10001', '10002', '2014-07-01 19:07:20', '304');
INSERT INTO `chatinfo` VALUES ('246', '10002', '10001', '2014-07-01 19:07:40', '305');
INSERT INTO `chatinfo` VALUES ('247', '10001', '10002', '2014-07-01 19:07:03', '306');
INSERT INTO `chatinfo` VALUES ('248', '10002', '10001', '2014-07-01 19:07:12', '307');
INSERT INTO `chatinfo` VALUES ('249', '10001', '10002', '2014-07-01 19:07:15', '308');
INSERT INTO `chatinfo` VALUES ('250', '10002', '10001', '2014-07-01 20:07:59', '309');
INSERT INTO `chatinfo` VALUES ('251', '10002', '10001', '2014-07-01 20:07:25', '310');
INSERT INTO `chatinfo` VALUES ('252', '10001', '10002', '2014-07-01 20:07:21', '311');
INSERT INTO `chatinfo` VALUES ('253', '10002', '10001', '2014-07-01 20:07:25', '312');
INSERT INTO `chatinfo` VALUES ('254', '10002', '10001', '2014-07-01 20:07:35', '313');
INSERT INTO `chatinfo` VALUES ('255', '10001', '10002', '2014-07-01 20:07:38', '314');
INSERT INTO `chatinfo` VALUES ('256', '10001', '10002', '2014-07-01 20:07:09', '315');
INSERT INTO `chatinfo` VALUES ('257', '10002', '10001', '2014-07-01 20:07:12', '316');
INSERT INTO `chatinfo` VALUES ('258', '10002', '10001', '2014-07-01 20:07:27', '317');
INSERT INTO `chatinfo` VALUES ('259', '10001', '10002', '2014-07-01 20:07:46', '318');
INSERT INTO `chatinfo` VALUES ('260', '10002', '10001', '2014-07-01 20:07:48', '319');
INSERT INTO `chatinfo` VALUES ('261', '10001', '10002', '2014-07-01 20:07:13', '320');
INSERT INTO `chatinfo` VALUES ('262', '10001', '10002', '2014-07-01 20:07:15', '321');
INSERT INTO `chatinfo` VALUES ('263', '10001', '10002', '2014-07-01 20:07:19', '322');
INSERT INTO `chatinfo` VALUES ('264', '10001', '10002', '2014-07-01 20:07:30', '323');
INSERT INTO `chatinfo` VALUES ('265', '10002', '10001', '2014-07-01 20:07:33', '324');
INSERT INTO `chatinfo` VALUES ('266', '10001', '10002', '2014-07-01 20:07:31', '325');
INSERT INTO `chatinfo` VALUES ('267', '10002', '10001', '2014-07-01 20:07:33', '326');
INSERT INTO `chatinfo` VALUES ('268', '10001', '10002', '2014-07-01 20:07:19', '327');
INSERT INTO `chatinfo` VALUES ('269', '10002', '10001', '2014-07-01 20:07:22', '328');
INSERT INTO `chatinfo` VALUES ('270', '10002', '10001', '2014-07-01 20:07:48', '329');
INSERT INTO `chatinfo` VALUES ('271', '10001', '10002', '2014-07-01 20:07:50', '330');
INSERT INTO `chatinfo` VALUES ('272', '10001', '10002', '2014-07-01 20:07:08', '331');
INSERT INTO `chatinfo` VALUES ('273', '10002', '10001', '2014-07-01 20:07:18', '332');
INSERT INTO `chatinfo` VALUES ('274', '10001', '10002', '2014-07-01 20:07:14', '333');
INSERT INTO `chatinfo` VALUES ('275', '10001', '10002', '2014-07-01 20:07:54', '334');
INSERT INTO `chatinfo` VALUES ('276', '10002', '10001', '2014-07-01 20:07:57', '335');
INSERT INTO `chatinfo` VALUES ('277', '10002', '10001', '2014-07-01 20:07:34', '336');
INSERT INTO `chatinfo` VALUES ('278', '10001', '10002', '2014-07-01 20:07:39', '337');
INSERT INTO `chatinfo` VALUES ('279', '10002', '10001', '2014-07-01 21:07:53', '340');
INSERT INTO `chatinfo` VALUES ('280', '10001', '10002', '2014-07-01 21:07:03', '341');
INSERT INTO `chatinfo` VALUES ('281', '10001', '10002', '2014-07-01 21:07:37', '342');
INSERT INTO `chatinfo` VALUES ('282', '10002', '10001', '2014-07-01 21:07:49', '343');
INSERT INTO `chatinfo` VALUES ('283', '10001', '10002', '2014-07-01 21:07:43', '344');
INSERT INTO `chatinfo` VALUES ('284', '10001', '10002', '2014-07-01 21:07:27', '345');
INSERT INTO `chatinfo` VALUES ('285', '10002', '10001', '2014-07-01 21:07:31', '346');
INSERT INTO `chatinfo` VALUES ('286', '10002', '10001', '2014-07-01 22:07:08', '350');
INSERT INTO `chatinfo` VALUES ('287', '10001', '10002', '2014-07-01 22:07:10', '351');
INSERT INTO `chatinfo` VALUES ('288', '10001', '10002', '2014-07-01 22:07:51', '352');
INSERT INTO `chatinfo` VALUES ('289', '10002', '10001', '2014-07-01 22:07:14', '353');
INSERT INTO `chatinfo` VALUES ('290', '10001', '10002', '2014-07-01 22:07:53', '354');
INSERT INTO `chatinfo` VALUES ('291', '10002', '10001', '2014-07-01 22:07:05', '355');
INSERT INTO `chatinfo` VALUES ('292', '10002', '10001', '2014-07-01 22:07:31', '356');
INSERT INTO `chatinfo` VALUES ('293', '10001', '10002', '2014-07-01 22:07:02', '357');
INSERT INTO `chatinfo` VALUES ('294', '10002', '10001', '2014-07-01 22:07:08', '358');
INSERT INTO `chatinfo` VALUES ('295', '10001', '10002', '2014-07-01 22:07:17', '359');
INSERT INTO `chatinfo` VALUES ('296', '10002', '10001', '2014-07-01 23:07:48', '360');
INSERT INTO `chatinfo` VALUES ('297', '10001', '10002', '2014-07-01 23:07:55', '361');
INSERT INTO `chatinfo` VALUES ('298', '10001', '10002', '2014-07-01 23:07:56', '362');
INSERT INTO `chatinfo` VALUES ('299', '10001', '10002', '2014-07-01 23:07:57', '363');
INSERT INTO `chatinfo` VALUES ('300', '10001', '10002', '2014-07-01 23:07:57', '364');
INSERT INTO `chatinfo` VALUES ('301', '10001', '10002', '2014-07-01 23:07:58', '365');
INSERT INTO `chatinfo` VALUES ('302', '10001', '10002', '2014-07-01 23:07:59', '366');
INSERT INTO `chatinfo` VALUES ('303', '10001', '10002', '2014-07-01 23:07:00', '367');
INSERT INTO `chatinfo` VALUES ('304', '10001', '10002', '2014-07-01 23:07:01', '368');
INSERT INTO `chatinfo` VALUES ('305', '10001', '10002', '2014-07-01 23:07:02', '369');
INSERT INTO `chatinfo` VALUES ('306', '10001', '10002', '2014-07-01 23:07:03', '370');
INSERT INTO `chatinfo` VALUES ('307', '10002', '10001', '2014-07-01 23:07:08', '371');
INSERT INTO `chatinfo` VALUES ('308', '10001', '10002', '2014-07-01 23:07:21', '372');
INSERT INTO `chatinfo` VALUES ('309', '10001', '10002', '2014-07-01 23:07:22', '373');
INSERT INTO `chatinfo` VALUES ('310', '10002', '10001', '2014-07-01 23:07:31', '374');
INSERT INTO `chatinfo` VALUES ('311', '10001', '10002', '2014-07-01 23:07:36', '375');
INSERT INTO `chatinfo` VALUES ('312', '10002', '10001', '2014-07-01 23:07:37', '376');
INSERT INTO `chatinfo` VALUES ('313', '10002', '10001', '2014-07-02 00:07:42', '377');
INSERT INTO `chatinfo` VALUES ('314', '10001', '10002', '2014-07-02 00:07:42', '380');
INSERT INTO `chatinfo` VALUES ('315', '10002', '10001', '2014-07-02 01:07:54', '381');
INSERT INTO `chatinfo` VALUES ('316', '10001', '10002', '2014-07-02 01:07:21', '382');
INSERT INTO `chatinfo` VALUES ('317', '10002', '10001', '2014-07-02 01:07:05', '383');
INSERT INTO `chatinfo` VALUES ('318', '10001', '10002', '2014-07-02 01:07:40', '384');
INSERT INTO `chatinfo` VALUES ('319', '10002', '10001', '2014-07-02 01:07:42', '385');
INSERT INTO `chatinfo` VALUES ('320', '10001', '10002', '2014-07-02 09:07:49', '390');
INSERT INTO `chatinfo` VALUES ('321', '10002', '10001', '2014-07-02 09:07:02', '391');
INSERT INTO `chatinfo` VALUES ('322', '10002', '10001', '2014-07-02 10:07:25', '400');
INSERT INTO `chatinfo` VALUES ('323', '10001', '10002', '2014-07-02 10:07:27', '401');
INSERT INTO `chatinfo` VALUES ('324', '10002', '10001', '2014-07-02 11:07:17', '402');
INSERT INTO `chatinfo` VALUES ('325', '10001', '10002', '2014-07-02 11:07:07', '403');
INSERT INTO `chatinfo` VALUES ('326', '10002', '10001', '2014-07-02 11:07:12', '404');
INSERT INTO `chatinfo` VALUES ('327', '10001', '10002', '2014-07-02 11:07:14', '405');
INSERT INTO `chatinfo` VALUES ('328', '10001', '10002', '2014-07-02 11:07:11', '406');
INSERT INTO `chatinfo` VALUES ('329', '10001', '10002', '2014-07-02 11:07:16', '407');
INSERT INTO `chatinfo` VALUES ('330', '10002', '10001', '2014-07-02 11:07:27', '408');
INSERT INTO `chatinfo` VALUES ('331', '10001', '10002', '2014-07-02 11:07:05', '409');
INSERT INTO `chatinfo` VALUES ('332', '10002', '10001', '2014-07-02 11:07:10', '410');
INSERT INTO `chatinfo` VALUES ('333', '10001', '10002', '2014-07-02 11:07:13', '411');
INSERT INTO `chatinfo` VALUES ('334', '10001', '10002', '2014-07-02 11:07:22', '412');
INSERT INTO `chatinfo` VALUES ('335', '10001', '10002', '2014-07-02 11:07:12', '413');
INSERT INTO `chatinfo` VALUES ('336', '10002', '10001', '2014-07-02 11:07:13', '414');
INSERT INTO `chatinfo` VALUES ('337', '10001', '10002', '2014-07-02 11:07:14', '415');
INSERT INTO `chatinfo` VALUES ('338', '10001', '10002', '2014-07-02 11:07:21', '416');
INSERT INTO `chatinfo` VALUES ('339', '10001', '10002', '2014-07-02 11:07:24', '417');
INSERT INTO `chatinfo` VALUES ('340', '10001', '10002', '2014-07-02 11:07:27', '418');
INSERT INTO `chatinfo` VALUES ('341', '10001', '10002', '2014-07-02 11:07:28', '419');
INSERT INTO `chatinfo` VALUES ('342', '10001', '10002', '2014-07-02 11:07:55', '420');
INSERT INTO `chatinfo` VALUES ('343', '10001', '10002', '2014-07-02 11:07:57', '421');
INSERT INTO `chatinfo` VALUES ('344', '10001', '10002', '2014-07-02 11:07:25', '422');
INSERT INTO `chatinfo` VALUES ('345', '10002', '10001', '2014-07-02 11:07:34', '423');
INSERT INTO `chatinfo` VALUES ('346', '10001', '10002', '2014-07-02 11:07:38', '424');
INSERT INTO `chatinfo` VALUES ('347', '10001', '10002', '2014-07-02 12:07:55', '430');
INSERT INTO `chatinfo` VALUES ('348', '10001', '10002', '2014-07-02 12:07:23', '431');
INSERT INTO `chatinfo` VALUES ('349', '10002', '10001', '2014-07-02 12:07:32', '432');
INSERT INTO `chatinfo` VALUES ('350', '10001', '10002', '2014-07-02 12:07:08', '433');
INSERT INTO `chatinfo` VALUES ('351', '10002', '10001', '2014-07-02 12:07:11', '434');
INSERT INTO `chatinfo` VALUES ('352', '10002', '10001', '2014-07-02 12:07:41', '435');
INSERT INTO `chatinfo` VALUES ('353', '10001', '10002', '2014-07-02 12:07:44', '436');
INSERT INTO `chatinfo` VALUES ('354', '10002', '10001', '2014-07-02 12:07:35', '437');
INSERT INTO `chatinfo` VALUES ('355', '10001', '10002', '2014-07-02 12:07:07', '438');
INSERT INTO `chatinfo` VALUES ('356', '10002', '10001', '2014-07-02 12:07:11', '439');
INSERT INTO `chatinfo` VALUES ('357', '10002', '10001', '2014-07-02 12:07:53', '440');
INSERT INTO `chatinfo` VALUES ('358', '10001', '10002', '2014-07-02 12:07:59', '441');
INSERT INTO `chatinfo` VALUES ('359', '10001', '10002', '2014-07-02 12:07:11', '442');
INSERT INTO `chatinfo` VALUES ('360', '10001', '10002', '2014-07-02 12:07:12', '443');
INSERT INTO `chatinfo` VALUES ('361', '10001', '10002', '2014-07-02 12:07:13', '444');
INSERT INTO `chatinfo` VALUES ('362', '10001', '10002', '2014-07-02 12:07:14', '445');
INSERT INTO `chatinfo` VALUES ('363', '10001', '10002', '2014-07-02 12:07:15', '446');
INSERT INTO `chatinfo` VALUES ('364', '10001', '10002', '2014-07-02 12:07:16', '447');
INSERT INTO `chatinfo` VALUES ('365', '10001', '10002', '2014-07-02 12:07:22', '448');
INSERT INTO `chatinfo` VALUES ('366', '10001', '10002', '2014-07-02 12:07:23', '449');
INSERT INTO `chatinfo` VALUES ('367', '10002', '10001', '2014-07-02 12:07:07', '450');
INSERT INTO `chatinfo` VALUES ('368', '10001', '10002', '2014-07-02 12:07:12', '451');
INSERT INTO `chatinfo` VALUES ('369', '10002', '10001', '2014-07-02 12:07:13', '452');
INSERT INTO `chatinfo` VALUES ('370', '10001', '10002', '2014-07-02 12:07:23', '453');
INSERT INTO `chatinfo` VALUES ('371', '10002', '10001', '2014-07-02 12:07:21', '454');
INSERT INTO `chatinfo` VALUES ('372', '10001', '10002', '2014-07-02 12:07:25', '455');
INSERT INTO `chatinfo` VALUES ('373', '10002', '10001', '2014-07-02 12:07:46', '456');
INSERT INTO `chatinfo` VALUES ('374', '10002', '10001', '2014-07-02 12:07:30', '457');
INSERT INTO `chatinfo` VALUES ('375', '10002', '10001', '2014-07-02 12:07:57', '458');
INSERT INTO `chatinfo` VALUES ('376', '10001', '10002', '2014-07-02 12:07:03', '459');
INSERT INTO `chatinfo` VALUES ('377', '10002', '10001', '2014-07-02 12:07:37', '460');
INSERT INTO `chatinfo` VALUES ('378', '10001', '10002', '2014-07-02 12:07:43', '461');
INSERT INTO `chatinfo` VALUES ('379', '10002', '10001', '2014-07-02 12:07:15', '462');
INSERT INTO `chatinfo` VALUES ('380', '10002', '10001', '2014-07-02 12:07:50', '463');
INSERT INTO `chatinfo` VALUES ('381', '10001', '10002', '2014-07-02 12:07:52', '464');
INSERT INTO `chatinfo` VALUES ('382', '10002', '10001', '2014-07-02 12:07:55', '465');
INSERT INTO `chatinfo` VALUES ('383', '10001', '10002', '2014-07-02 12:07:58', '466');
INSERT INTO `chatinfo` VALUES ('384', '10001', '10002', '2014-07-02 13:07:09', '467');
INSERT INTO `chatinfo` VALUES ('385', '10002', '10001', '2014-07-02 13:07:14', '468');
INSERT INTO `chatinfo` VALUES ('386', '10002', '10001', '2014-07-02 13:07:14', '469');
INSERT INTO `chatinfo` VALUES ('387', '10001', '10002', '2014-07-02 13:07:16', '470');
INSERT INTO `chatinfo` VALUES ('388', '10002', '10001', '2014-07-02 13:07:22', '471');
INSERT INTO `chatinfo` VALUES ('389', '10001', '10002', '2014-07-02 13:07:27', '472');
INSERT INTO `chatinfo` VALUES ('390', '10002', '10001', '2014-07-02 13:07:23', '473');
INSERT INTO `chatinfo` VALUES ('391', '10001', '10002', '2014-07-02 13:07:33', '474');
INSERT INTO `chatinfo` VALUES ('392', '10001', '10002', '2014-07-02 13:07:34', '475');
INSERT INTO `chatinfo` VALUES ('393', '10001', '10002', '2014-07-02 13:07:35', '476');
INSERT INTO `chatinfo` VALUES ('394', '10001', '10002', '2014-07-02 13:07:37', '477');
INSERT INTO `chatinfo` VALUES ('395', '10001', '10002', '2014-07-02 14:07:08', '480');
INSERT INTO `chatinfo` VALUES ('396', '10002', '10001', '2014-07-02 14:07:10', '481');
INSERT INTO `chatinfo` VALUES ('397', '10002', '10001', '2014-07-02 14:07:13', '482');
INSERT INTO `chatinfo` VALUES ('398', '10002', '10001', '2014-07-02 14:07:19', '483');
INSERT INTO `chatinfo` VALUES ('399', '10001', '10002', '2014-07-02 14:07:20', '484');
INSERT INTO `chatinfo` VALUES ('400', '10002', '10001', '2014-07-02 14:07:20', '485');
INSERT INTO `chatinfo` VALUES ('401', '10002', '10001', '2014-07-02 14:07:22', '486');
INSERT INTO `chatinfo` VALUES ('402', '10002', '10001', '2014-07-02 14:07:24', '487');
INSERT INTO `chatinfo` VALUES ('403', '10002', '10001', '2014-07-02 14:07:25', '488');
INSERT INTO `chatinfo` VALUES ('404', '10002', '10001', '2014-07-02 14:07:26', '489');
INSERT INTO `chatinfo` VALUES ('405', '10002', '10001', '2014-07-02 14:07:28', '490');
INSERT INTO `chatinfo` VALUES ('406', '10002', '10001', '2014-07-02 14:07:36', '491');
INSERT INTO `chatinfo` VALUES ('407', '10002', '10001', '2014-07-02 14:07:37', '492');
INSERT INTO `chatinfo` VALUES ('408', '10001', '10002', '2014-07-02 14:07:34', '493');
INSERT INTO `chatinfo` VALUES ('409', '10002', '10001', '2014-07-02 14:07:38', '494');
INSERT INTO `chatinfo` VALUES ('410', '10001', '10002', '2014-07-02 14:07:40', '495');
INSERT INTO `chatinfo` VALUES ('411', '10002', '10001', '2014-07-02 14:07:47', '496');
INSERT INTO `chatinfo` VALUES ('412', '10001', '10002', '2014-07-02 14:07:44', '497');
INSERT INTO `chatinfo` VALUES ('413', '10002', '10001', '2014-07-02 14:07:47', '498');
INSERT INTO `chatinfo` VALUES ('414', '10002', '10001', '2014-07-02 14:07:58', '499');
INSERT INTO `chatinfo` VALUES ('415', '10001', '10002', '2014-07-02 14:07:02', '500');
INSERT INTO `chatinfo` VALUES ('416', '10001', '10002', '2014-07-02 14:07:04', '501');
INSERT INTO `chatinfo` VALUES ('417', '10001', '10002', '2014-07-02 14:07:14', '502');
INSERT INTO `chatinfo` VALUES ('418', '10001', '10002', '2014-07-02 14:07:15', '503');
INSERT INTO `chatinfo` VALUES ('419', '10001', '10002', '2014-07-02 14:07:16', '504');
INSERT INTO `chatinfo` VALUES ('420', '10001', '10002', '2014-07-02 14:07:26', '505');
INSERT INTO `chatinfo` VALUES ('421', '10002', '10001', '2014-07-02 14:07:30', '506');
INSERT INTO `chatinfo` VALUES ('422', '10002', '10001', '2014-07-02 14:07:36', '507');
INSERT INTO `chatinfo` VALUES ('423', '10001', '10002', '2014-07-02 14:07:57', '508');
INSERT INTO `chatinfo` VALUES ('424', '10002', '10001', '2014-07-02 14:07:59', '509');
INSERT INTO `chatinfo` VALUES ('425', '10002', '10001', '2014-07-02 14:07:08', '510');
INSERT INTO `chatinfo` VALUES ('426', '10001', '10002', '2014-07-02 14:07:11', '511');
INSERT INTO `chatinfo` VALUES ('427', '10001', '10002', '2014-07-02 14:07:48', '512');
INSERT INTO `chatinfo` VALUES ('428', '10002', '10001', '2014-07-02 14:07:38', '513');
INSERT INTO `chatinfo` VALUES ('429', '10002', '10001', '2014-07-02 14:07:55', '514');
INSERT INTO `chatinfo` VALUES ('430', '10001', '10002', '2014-07-02 14:07:16', '515');
INSERT INTO `chatinfo` VALUES ('431', '10001', '10002', '2014-07-02 14:07:17', '516');
INSERT INTO `chatinfo` VALUES ('432', '10002', '10001', '2014-07-02 14:07:25', '517');
INSERT INTO `chatinfo` VALUES ('433', '10001', '10002', '2014-07-02 14:07:14', '518');
INSERT INTO `chatinfo` VALUES ('434', '10001', '10002', '2014-07-02 14:07:15', '519');
INSERT INTO `chatinfo` VALUES ('435', '10001', '10002', '2014-07-02 14:07:16', '520');
INSERT INTO `chatinfo` VALUES ('436', '10002', '10001', '2014-07-02 14:07:24', '521');
INSERT INTO `chatinfo` VALUES ('437', '10002', '10001', '2014-07-02 14:07:24', '522');
INSERT INTO `chatinfo` VALUES ('438', '10001', '10002', '2014-07-02 14:07:31', '523');
INSERT INTO `chatinfo` VALUES ('439', '10002', '10001', '2014-07-02 14:07:31', '524');
INSERT INTO `chatinfo` VALUES ('440', '10001', '10002', '2014-07-02 14:07:32', '525');
INSERT INTO `chatinfo` VALUES ('441', '10002', '10001', '2014-07-02 14:07:32', '526');
INSERT INTO `chatinfo` VALUES ('442', '10002', '10001', '2014-07-02 14:07:33', '527');
INSERT INTO `chatinfo` VALUES ('443', '10002', '10001', '2014-07-02 14:07:34', '528');
INSERT INTO `chatinfo` VALUES ('444', '10002', '10001', '2014-07-02 14:07:36', '529');
INSERT INTO `chatinfo` VALUES ('445', '10002', '10001', '2014-07-02 14:07:37', '530');
INSERT INTO `chatinfo` VALUES ('446', '10002', '10001', '2014-07-02 14:07:39', '531');
INSERT INTO `chatinfo` VALUES ('447', '10002', '10001', '2014-07-02 14:07:55', '532');
INSERT INTO `chatinfo` VALUES ('448', '10002', '10001', '2014-07-02 14:07:55', '533');
INSERT INTO `chatinfo` VALUES ('449', '10001', '10002', '2014-07-02 14:07:38', '534');
INSERT INTO `chatinfo` VALUES ('450', '10001', '10002', '2014-07-02 14:07:42', '535');
INSERT INTO `chatinfo` VALUES ('451', '10002', '10001', '2014-07-02 14:07:47', '536');
INSERT INTO `chatinfo` VALUES ('452', '10001', '10002', '2014-07-02 14:07:54', '537');
INSERT INTO `chatinfo` VALUES ('453', '10001', '10002', '2014-07-02 14:07:56', '538');
INSERT INTO `chatinfo` VALUES ('454', '10001', '10002', '2014-07-02 14:07:57', '539');
INSERT INTO `chatinfo` VALUES ('455', '10001', '10002', '2014-07-02 14:07:58', '540');
INSERT INTO `chatinfo` VALUES ('456', '10001', '10002', '2014-07-02 14:07:58', '541');
INSERT INTO `chatinfo` VALUES ('457', '10001', '10002', '2014-07-02 14:07:00', '542');
INSERT INTO `chatinfo` VALUES ('458', '10001', '10002', '2014-07-02 14:07:01', '543');
INSERT INTO `chatinfo` VALUES ('459', '10001', '10002', '2014-07-02 14:07:06', '544');
INSERT INTO `chatinfo` VALUES ('460', '10001', '10002', '2014-07-02 14:07:13', '545');
INSERT INTO `chatinfo` VALUES ('461', '10001', '10002', '2014-07-02 15:07:34', '550');
INSERT INTO `chatinfo` VALUES ('462', '10002', '10001', '2014-07-02 15:07:37', '551');
INSERT INTO `chatinfo` VALUES ('463', '10002', '10001', '2014-07-02 15:07:42', '552');
INSERT INTO `chatinfo` VALUES ('464', '10001', '10002', '2014-07-02 15:07:50', '553');
INSERT INTO `chatinfo` VALUES ('465', '10002', '10001', '2014-07-02 15:07:55', '554');
INSERT INTO `chatinfo` VALUES ('466', '10001', '10002', '2014-07-02 15:07:10', '555');
INSERT INTO `chatinfo` VALUES ('467', '10002', '10001', '2014-07-02 15:07:16', '556');
INSERT INTO `chatinfo` VALUES ('468', '10002', '10001', '2014-07-02 15:07:24', '557');
INSERT INTO `chatinfo` VALUES ('469', '10002', '10001', '2014-07-02 15:07:28', '558');
INSERT INTO `chatinfo` VALUES ('470', '10001', '10002', '2014-07-02 15:07:15', '559');
INSERT INTO `chatinfo` VALUES ('471', '10001', '10002', '2014-07-02 15:07:20', '560');
INSERT INTO `chatinfo` VALUES ('472', '10001', '10002', '2014-07-02 15:07:23', '561');
INSERT INTO `chatinfo` VALUES ('473', '10002', '10001', '2014-07-02 15:07:24', '562');
INSERT INTO `chatinfo` VALUES ('474', '10001', '10002', '2014-07-02 15:07:24', '563');
INSERT INTO `chatinfo` VALUES ('475', '10001', '10002', '2014-07-02 15:07:25', '564');
INSERT INTO `chatinfo` VALUES ('476', '10001', '10002', '2014-07-02 15:07:25', '565');
INSERT INTO `chatinfo` VALUES ('477', '10001', '10002', '2014-07-02 15:07:26', '566');
INSERT INTO `chatinfo` VALUES ('478', '10001', '10002', '2014-07-02 15:07:28', '567');
INSERT INTO `chatinfo` VALUES ('479', '10001', '10002', '2014-07-02 15:07:28', '568');
INSERT INTO `chatinfo` VALUES ('480', '10001', '10002', '2014-07-02 15:07:30', '569');
INSERT INTO `chatinfo` VALUES ('481', '10002', '10001', '2014-07-02 15:07:30', '570');
INSERT INTO `chatinfo` VALUES ('482', '10001', '10002', '2014-07-02 15:07:30', '571');
INSERT INTO `chatinfo` VALUES ('483', '10001', '10002', '2014-07-02 15:07:26', '572');
INSERT INTO `chatinfo` VALUES ('484', '10002', '10001', '2014-07-02 15:07:28', '573');
INSERT INTO `chatinfo` VALUES ('485', '10002', '10001', '2014-07-02 15:07:31', '574');
INSERT INTO `chatinfo` VALUES ('486', '10002', '10001', '2014-07-02 15:07:43', '575');
INSERT INTO `chatinfo` VALUES ('487', '10002', '10001', '2014-07-02 15:07:26', '576');
INSERT INTO `chatinfo` VALUES ('488', '10002', '10001', '2014-07-02 17:07:32', '580');
INSERT INTO `chatinfo` VALUES ('489', '10001', '10002', '2014-07-02 17:07:59', '581');
INSERT INTO `chatinfo` VALUES ('490', '10001', '10002', '2014-07-02 17:07:47', '582');
INSERT INTO `chatinfo` VALUES ('491', '10002', '10001', '2014-07-02 17:07:49', '583');
INSERT INTO `chatinfo` VALUES ('492', '10004', '10002', '2016-11-07 12:11:18', '590');
INSERT INTO `chatinfo` VALUES ('493', '10002', '10001', '2016-11-20 16:18:59', null);
INSERT INTO `chatinfo` VALUES ('494', '10001', '10002', '2016-11-20 16:19:01', null);
INSERT INTO `chatinfo` VALUES ('495', '10002', '10001', '2016-11-20 16:22:28', null);
INSERT INTO `chatinfo` VALUES ('496', '10001', '10002', '2016-12-05 21:34:20', null);
INSERT INTO `chatinfo` VALUES ('497', '10001', '10002', '2016-12-05 21:54:04', null);
INSERT INTO `chatinfo` VALUES ('498', '10002', '10001', '2016-12-05 21:54:19', null);
INSERT INTO `chatinfo` VALUES ('499', '10002', '10001', '2016-12-05 21:54:27', null);
INSERT INTO `chatinfo` VALUES ('500', '10002', '10001', '2016-12-25 00:02:01', null);
INSERT INTO `chatinfo` VALUES ('501', '10001', '10002', '2017-02-12 14:51:27', null);
INSERT INTO `chatinfo` VALUES ('502', '10002', '10001', '2017-02-12 14:51:35', null);
INSERT INTO `chatinfo` VALUES ('503', '10002', '10001', '2017-02-12 14:51:42', null);
INSERT INTO `chatinfo` VALUES ('504', '10002', '10001', '2017-02-12 14:51:47', null);
INSERT INTO `chatinfo` VALUES ('505', '10001', '10002', '2017-02-12 14:52:29', null);
INSERT INTO `chatinfo` VALUES ('506', '10002', '10001', '2017-02-12 14:52:44', null);
INSERT INTO `chatinfo` VALUES ('507', '10001', '10002', '2017-03-24 21:40:21', null);
INSERT INTO `chatinfo` VALUES ('508', '10002', '10001', '2017-03-24 21:40:34', null);
INSERT INTO `chatinfo` VALUES ('509', '10002', '10001', '2017-03-24 21:40:42', null);
INSERT INTO `chatinfo` VALUES ('510', '10001', '10002', '2017-03-24 22:09:22', null);
INSERT INTO `chatinfo` VALUES ('511', '10002', '10001', '2017-03-24 22:09:35', null);
INSERT INTO `chatinfo` VALUES ('512', '10002', '10001', '2017-03-24 22:09:38', null);
INSERT INTO `chatinfo` VALUES ('513', '10002', '10001', '2017-03-24 22:09:40', null);
INSERT INTO `chatinfo` VALUES ('514', '10001', '10002', '2017-03-25 15:05:48', null);
INSERT INTO `chatinfo` VALUES ('515', '10001', '10002', '2017-03-25 15:06:02', null);
INSERT INTO `chatinfo` VALUES ('516', '10002', '10001', '2017-03-25 15:06:04', null);
INSERT INTO `chatinfo` VALUES ('517', '10002', '10001', '2017-03-25 15:06:09', null);

-- ----------------------------
-- Table structure for `friends`
-- ----------------------------
DROP TABLE IF EXISTS `friends`;
CREATE TABLE `friends` (
  `FNO` decimal(2,0) NOT NULL,
  `FQQ` decimal(5,0) DEFAULT NULL,
  `FSNO` decimal(2,0) DEFAULT NULL,
  `FDATE` datetime DEFAULT NULL,
  `FSTATUS` decimal(2,0) DEFAULT NULL,
  `QQ` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`FNO`),
  UNIQUE KEY `SYS_C0012771` (`FNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friends
-- ----------------------------
INSERT INTO `friends` VALUES ('1', '10003', '0', '2013-12-27 00:00:00', '0', '10001');
INSERT INTO `friends` VALUES ('4', '10001', '0', '2013-12-27 00:00:00', '0', '10002');
INSERT INTO `friends` VALUES ('6', '10001', '1', '2013-12-27 00:00:00', '0', '10004');
INSERT INTO `friends` VALUES ('7', '10001', '1', '2013-12-27 00:00:00', '0', '10005');
INSERT INTO `friends` VALUES ('10', '10006', '0', '2014-07-01 00:00:00', '0', '10001');
INSERT INTO `friends` VALUES ('22', '10007', '0', '2014-07-01 00:00:00', '0', '10002');
INSERT INTO `friends` VALUES ('25', '10001', '0', '2014-07-01 00:00:00', '0', '10004');
INSERT INTO `friends` VALUES ('26', '10002', '0', '2014-07-01 00:00:00', '0', '10004');
INSERT INTO `friends` VALUES ('28', '10004', '0', '2014-07-01 00:00:00', '0', '10004');
INSERT INTO `friends` VALUES ('50', '10002', '0', '2014-07-01 00:00:00', '0', '10001');

-- ----------------------------
-- Table structure for `getpwd`
-- ----------------------------
DROP TABLE IF EXISTS `getpwd`;
CREATE TABLE `getpwd` (
  `GNO` decimal(3,0) NOT NULL,
  `QUESTION1` varchar(100) DEFAULT NULL,
  `ANSWER1` varchar(40) DEFAULT NULL,
  `QUESTION2` varchar(100) DEFAULT NULL,
  `ANSWER2` varchar(40) DEFAULT NULL,
  `QUESTION3` varchar(100) DEFAULT NULL,
  `ANSWER3` varchar(40) DEFAULT NULL,
  `GQQ` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`GNO`),
  UNIQUE KEY `SYS_C0012773` (`GNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of getpwd
-- ----------------------------

-- ----------------------------
-- Table structure for `getpwdinfo`
-- ----------------------------
DROP TABLE IF EXISTS `getpwdinfo`;
CREATE TABLE `getpwdinfo` (
  `GPNO` decimal(4,0) NOT NULL,
  `QUESTION` decimal(4,0) DEFAULT NULL,
  `ANSWER` varchar(100) DEFAULT NULL,
  `GQQ` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`GPNO`),
  UNIQUE KEY `SYS_C0012775` (`GPNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of getpwdinfo
-- ----------------------------
INSERT INTO `getpwdinfo` VALUES ('10', '0', '小红', '10001');
INSERT INTO `getpwdinfo` VALUES ('11', '4', '小明', '10001');
INSERT INTO `getpwdinfo` VALUES ('12', '8', '香蕉', '10001');
INSERT INTO `getpwdinfo` VALUES ('13', '1', '110', '10010');
INSERT INTO `getpwdinfo` VALUES ('14', '5', '李小龙', '10010');
INSERT INTO `getpwdinfo` VALUES ('15', '9', '乒乓球', '10010');
INSERT INTO `getpwdinfo` VALUES ('20', '3', '小红', '10011');
INSERT INTO `getpwdinfo` VALUES ('21', '6', '小明', '10011');
INSERT INTO `getpwdinfo` VALUES ('22', '10', '陕西', '10011');
INSERT INTO `getpwdinfo` VALUES ('23', '1', '110', '10012');
INSERT INTO `getpwdinfo` VALUES ('24', '5', '李小龙', '10012');
INSERT INTO `getpwdinfo` VALUES ('25', '9', '乒乓球', '10012');
INSERT INTO `getpwdinfo` VALUES ('50', '3', '小红', '10013');
INSERT INTO `getpwdinfo` VALUES ('51', '7', '李小龙', '10013');
INSERT INTO `getpwdinfo` VALUES ('52', '9', '乒乓球', '10013');
INSERT INTO `getpwdinfo` VALUES ('53', '0', '小红', '10014');
INSERT INTO `getpwdinfo` VALUES ('54', '4', '小明', '10014');
INSERT INTO `getpwdinfo` VALUES ('55', '8', '香蕉', '10014');
INSERT INTO `getpwdinfo` VALUES ('60', '1', '110', '10015');
INSERT INTO `getpwdinfo` VALUES ('61', '7', '李小龙', '10015');
INSERT INTO `getpwdinfo` VALUES ('62', '8', '香蕉', '10015');
INSERT INTO `getpwdinfo` VALUES ('63', '0', '小红', '10016');
INSERT INTO `getpwdinfo` VALUES ('64', '4', '小明', '10016');
INSERT INTO `getpwdinfo` VALUES ('65', '8', '香蕉', '10016');
INSERT INTO `getpwdinfo` VALUES ('66', '0', '小红', '10017');
INSERT INTO `getpwdinfo` VALUES ('67', '4', '小明', '10017');
INSERT INTO `getpwdinfo` VALUES ('68', '8', '香蕉', '10017');
INSERT INTO `getpwdinfo` VALUES ('69', '0', '小红', '10018');
INSERT INTO `getpwdinfo` VALUES ('70', '4', '小明', '10018');
INSERT INTO `getpwdinfo` VALUES ('71', '8', '香蕉', '10018');
INSERT INTO `getpwdinfo` VALUES ('72', '0', '小红', '10019');
INSERT INTO `getpwdinfo` VALUES ('73', '4', '小明', '10019');
INSERT INTO `getpwdinfo` VALUES ('74', '8', '香蕉', '10019');
INSERT INTO `getpwdinfo` VALUES ('75', '0', '小红', '10020');
INSERT INTO `getpwdinfo` VALUES ('76', '4', '小明', '10020');
INSERT INTO `getpwdinfo` VALUES ('77', '8', '香蕉', '10020');
INSERT INTO `getpwdinfo` VALUES ('80', '0', '小红', '10002');
INSERT INTO `getpwdinfo` VALUES ('81', '4', '小明', '10002');
INSERT INTO `getpwdinfo` VALUES ('82', '8', '香蕉', '10002');
INSERT INTO `getpwdinfo` VALUES ('83', '0', '小红', '10003');
INSERT INTO `getpwdinfo` VALUES ('84', '4', '小明', '10003');
INSERT INTO `getpwdinfo` VALUES ('85', '8', '香蕉', '10003');
INSERT INTO `getpwdinfo` VALUES ('86', '0', '小红', '10004');
INSERT INTO `getpwdinfo` VALUES ('87', '4', '小明', '10004');
INSERT INTO `getpwdinfo` VALUES ('88', '8', '香蕉', '10004');
INSERT INTO `getpwdinfo` VALUES ('89', '0', '小红', '10005');
INSERT INTO `getpwdinfo` VALUES ('90', '4', '小明', '10005');
INSERT INTO `getpwdinfo` VALUES ('91', '8', '香蕉', '10005');
INSERT INTO `getpwdinfo` VALUES ('92', '0', '小红', '10006');
INSERT INTO `getpwdinfo` VALUES ('93', '4', '小明', '10006');
INSERT INTO `getpwdinfo` VALUES ('94', '8', '香蕉', '10006');
INSERT INTO `getpwdinfo` VALUES ('95', '0', '小红', '10007');
INSERT INTO `getpwdinfo` VALUES ('96', '4', '小明', '10007');
INSERT INTO `getpwdinfo` VALUES ('97', '8', '香蕉', '10007');
INSERT INTO `getpwdinfo` VALUES ('98', '0', '小红', '10008');
INSERT INTO `getpwdinfo` VALUES ('99', '4', '小明', '10008');
INSERT INTO `getpwdinfo` VALUES ('100', '8', '香蕉', '10008');
INSERT INTO `getpwdinfo` VALUES ('101', '0', '小红', '10009');
INSERT INTO `getpwdinfo` VALUES ('102', '4', '小明', '10009');
INSERT INTO `getpwdinfo` VALUES ('103', '8', '香蕉', '10009');
INSERT INTO `getpwdinfo` VALUES ('104', '1', '110', '10021');
INSERT INTO `getpwdinfo` VALUES ('105', '4', '小明', '10021');
INSERT INTO `getpwdinfo` VALUES ('106', '8', '香蕉', '10021');
INSERT INTO `getpwdinfo` VALUES ('110', '0', '小红', '10022');
INSERT INTO `getpwdinfo` VALUES ('111', '4', '小明', '10022');
INSERT INTO `getpwdinfo` VALUES ('112', '8', '香蕉', '10022');
INSERT INTO `getpwdinfo` VALUES ('120', '0', '小红', '10023');
INSERT INTO `getpwdinfo` VALUES ('121', '4', '小明', '10023');
INSERT INTO `getpwdinfo` VALUES ('122', '8', '香蕉', '10023');
INSERT INTO `getpwdinfo` VALUES ('130', '1', '110', '10024');
INSERT INTO `getpwdinfo` VALUES ('131', '4', '小明', '10024');
INSERT INTO `getpwdinfo` VALUES ('132', '8', '香蕉', '10024');

-- ----------------------------
-- Table structure for `grouptable`
-- ----------------------------
DROP TABLE IF EXISTS `grouptable`;
CREATE TABLE `grouptable` (
  `GNO` decimal(5,0) NOT NULL DEFAULT '0',
  `GNAME` varchar(40) DEFAULT NULL,
  `GDATE` datetime DEFAULT NULL,
  PRIMARY KEY (`GNO`),
  UNIQUE KEY `SYS_C0012777` (`GNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grouptable
-- ----------------------------

-- ----------------------------
-- Table structure for `login`
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `LNO` int(5) NOT NULL AUTO_INCREMENT,
  `LIP` varchar(40) DEFAULT NULL,
  `LPORT` decimal(5,0) DEFAULT NULL,
  `LDATE` datetime DEFAULT NULL,
  `LSTATUS` decimal(1,0) DEFAULT NULL,
  `LQQ` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`LNO`),
  UNIQUE KEY `SYS_C0012780` (`LNO`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('5', '/127.0.0.1', '56612', '2017-03-25 00:00:00', '1', '10001');
INSERT INTO `login` VALUES ('6', '/127.0.0.1', '56624', '2017-03-25 00:00:00', '1', '10002');

-- ----------------------------
-- Table structure for `subgroup`
-- ----------------------------
DROP TABLE IF EXISTS `subgroup`;
CREATE TABLE `subgroup` (
  `SNO` decimal(2,0) DEFAULT NULL,
  `SNAME` varchar(40) DEFAULT NULL,
  `SDATE` date DEFAULT NULL,
  `QQ` decimal(5,0) DEFAULT NULL,
  UNIQUE KEY `SYS_C0012782` (`SNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subgroup
-- ----------------------------
INSERT INTO `subgroup` VALUES ('0', '同学', '2016-11-20', '10001');
INSERT INTO `subgroup` VALUES ('1', '朋友', '2016-11-20', '10001');
INSERT INTO `subgroup` VALUES ('2', '家人', '2016-11-20', '10001');
INSERT INTO `subgroup` VALUES ('3', '老师', '2016-11-20', '10001');
INSERT INTO `subgroup` VALUES ('4', '陌生人', '2016-11-20', '10001');
INSERT INTO `subgroup` VALUES ('5', '同学', '2016-11-20', '10002');
INSERT INTO `subgroup` VALUES ('6', '朋友', '2016-11-20', '10002');
INSERT INTO `subgroup` VALUES ('7', '家人', '2016-11-20', '10002');
INSERT INTO `subgroup` VALUES ('8', '老师', '2016-11-20', '10002');
INSERT INTO `subgroup` VALUES ('9', '陌生人', '2016-11-20', '10002');
INSERT INTO `subgroup` VALUES ('10', '同学', '2016-11-20', '10003');
INSERT INTO `subgroup` VALUES ('11', '朋友', '2016-11-20', '10003');
INSERT INTO `subgroup` VALUES ('12', '家人', '2016-11-20', '10003');
INSERT INTO `subgroup` VALUES ('21', '朋友', '2016-11-20', '10005');
INSERT INTO `subgroup` VALUES ('20', '同学', '2016-11-20', '10005');
INSERT INTO `subgroup` VALUES ('19', '陌生人', '2016-11-20', '10004');
INSERT INTO `subgroup` VALUES ('18', '老师', '2016-11-20', '10004');
INSERT INTO `subgroup` VALUES ('17', '家人', '2016-11-20', '10004');
INSERT INTO `subgroup` VALUES ('16', '朋友', '2016-11-20', '10004');
INSERT INTO `subgroup` VALUES ('13', '老师', '2016-11-20', '10003');
INSERT INTO `subgroup` VALUES ('14', '陌生人', '2016-11-20', '10003');
INSERT INTO `subgroup` VALUES ('15', '同学', '2016-11-20', '10004');
INSERT INTO `subgroup` VALUES ('22', '家人', '2016-11-20', '10005');
INSERT INTO `subgroup` VALUES ('23', '老师', '2016-11-20', '10005');
INSERT INTO `subgroup` VALUES ('24', '陌生人', '2016-11-20', '10005');
INSERT INTO `subgroup` VALUES (null, null, null, null);

-- ----------------------------
-- Table structure for `text`
-- ----------------------------
DROP TABLE IF EXISTS `text`;
CREATE TABLE `text` (
  `TNO` int(3) NOT NULL AUTO_INCREMENT,
  `TCONTEXT` text,
  `TFONTTYPE` varchar(20) DEFAULT NULL,
  `TFONTSIZE` varchar(10) DEFAULT NULL,
  `TFONTCOLOR` varchar(100) DEFAULT NULL,
  `TFONTBOLD` bigint(22) DEFAULT NULL,
  `TFONTITATIC` bigint(22) DEFAULT NULL,
  `TFONTUNDERLINE` bigint(22) DEFAULT NULL,
  UNIQUE KEY `SYS_C0012784` (`TNO`)
) ENGINE=InnoDB AUTO_INCREMENT=623 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of text
-- ----------------------------
INSERT INTO `text` VALUES ('5', '你好吗？', '楷体', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('6', '我很好！', '黑体', '30', '255*0*0', '0', '0', '0');
INSERT INTO `text` VALUES ('7', '最近在忙什么哪？', '楷体', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('8', '在最QQ的课程设计，烦死了！', '黑体', '30', '255*0*0', '0', '0', '0');
INSERT INTO `text` VALUES ('9', '我也在做课程设计！', '楷体', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('10', '做的怎么样了？', '黑体', '30', '255*0*0', '0', '0', '0');
INSERT INTO `text` VALUES ('11', '快完了！', '楷体', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('12', '好吧！', '黑体', '30', '255*0*0', '0', '0', '0');
INSERT INTO `text` VALUES ('20', '最近怎么样？', '楷体', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('21', '还行吧！', '楷体', '30', '255*0*0', '1', '0', '0');
INSERT INTO `text` VALUES ('22', '课程设计做完没？', '楷体', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('23', '马上就完了！', '楷体', '30', '255*0*0', '1', '0', '0');
INSERT INTO `text` VALUES ('24', '还没睡吗？', '华文隶书', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('25', '还没有，你哪？', '宋体', '29', '204*0*0', '1', '0', '0');
INSERT INTO `text` VALUES ('26', '怎么了？', '华文隶书', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('27', '没事！！！', '宋体', '29', '204*0*0', '1', '0', '0');
INSERT INTO `text` VALUES ('130', '干什么', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('131', '你好？', '华文隶书', '31', '255*0*51', '1', '1', '0');
INSERT INTO `text` VALUES ('132', '我很忙啊！', '黑体', '33', '0*102*204', '0', '1', '1');
INSERT INTO `text` VALUES ('133', '在干啥？', '华文隶书', '32', '255*0*51', '1', '1', '0');
INSERT INTO `text` VALUES ('134', '终于解决了这个问题!', '华文隶书', '28', '255*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('136', '？？', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('137', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('139', '你好？', '华文隶书', '21', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('140', '我很好？', '黑体', '33', '0*0*153', '1', '1', '0');
INSERT INTO `text` VALUES ('141', 'TMD终于好了！', '黑体', '33', '204*0*0', '0', '1', '0');
INSERT INTO `text` VALUES ('142', '恭喜！', '华文隶书', '32', '0*51*204', '0', '0', '0');
INSERT INTO `text` VALUES ('143', 'CCC', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('144', '是素数', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('150', '傻逼！', '黑体', '30', '204*0*0', '1', '0', '0');
INSERT INTO `text` VALUES ('151', '都是的', '楷体', '33', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('152', 'What happened？', '黑体', '30', '204*0*0', '1', '0', '0');
INSERT INTO `text` VALUES ('153', '增么了 ？', '楷体', '33', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('154', '非常好！', '华文隶书', '34', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('155', '不错！', '黑体', '33', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('160', 'DD', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('161', '帅气？', '华文隶书', '33', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('162', '漂亮', '黑体', '34', '255*0*51', '1', '1', '1');
INSERT INTO `text` VALUES ('163', '好极了', '华文隶书', '35', '0*0*204', '1', '0', '0');
INSERT INTO `text` VALUES ('164', '帅气！', '黑体', '34', '204*0*51', '1', '1', '0');
INSERT INTO `text` VALUES ('165', 'good', '华文隶书', '35', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('166', '你好吗？', '华文隶书', '30', '0*0*204', '1', '1', '0');
INSERT INTO `text` VALUES ('168', 'DDFF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('170', 'DDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('171', 'DDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('172', '好的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('173', 'DFDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('174', 'DfdF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('177', 'DFDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('178', 'DFDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('179', 'DFDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('180', 'DFf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('190', '分 分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('191', '的撒谎和第三空间啊哈、', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('192', '的哈萨克就的撒谎', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('193', '回答说家里', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('194', '大师', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('195', '大数据量', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('196', '地方', '华文隶书', '35', '204*51*0', '1', '1', '0');
INSERT INTO `text` VALUES ('197', '大时代jdas', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('198', '公开快高考公开公开', '华文隶书', '18', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('199', '罗克汉好了好了', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('200', '第三个是多少v', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('201', 'Nimabi', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('202', 'DFDFFGG', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('203', 'DF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('205', 'DFDFDFDFDFD', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('206', '结果', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('207', 'DFDFf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('208', '回忆录', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('209', '高科技', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('210', '饿饿它的独特的提高', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('211', '太爽了！', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('212', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('213', '分分分反对反对发大师傅士大夫大师傅', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('214', '好了吧', '华文隶书', '35', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('215', '犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('216', '发生分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('217', '多福多寿', '华文隶书', '35', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('218', '发到', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('219', 'we\'g\'we', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('220', '第三方第三方是', '华文隶书', '35', '153*0*51', '1', '1', '0');
INSERT INTO `text` VALUES ('221', '公开公开公开g', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('222', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('223', '犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('224', '发到', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('225', '反对', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('226', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('227', '额完成v', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('228', '热', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('229', '热', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('230', '热', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('231', '热', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('232', '而', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('233', '日尔', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('234', '范甘迪', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('240', 'S', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('241', '你们的！', '华文隶书', '35', '0*0*255', '1', '1', '0');
INSERT INTO `text` VALUES ('242', '我们的', '黑体', '35', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('243', '的', '黑体', '35', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('244', '德尔', '华文隶书', '35', '0*0*255', '1', '1', '0');
INSERT INTO `text` VALUES ('250', 'DFD', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('251', '打发第三方', '华文隶书', '34', '204*0*51', '1', '1', '0');
INSERT INTO `text` VALUES ('260', 'FSSS', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('261', 'SDSF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('270', '撒地方色粉', '华文隶书', '35', '0*0*204', '1', '0', '0');
INSERT INTO `text` VALUES ('271', 'DFD', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('272', 'DFD随碟附送房顶上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('273', '的肤色', '华文隶书', '35', '0*0*204', '1', '0', '0');
INSERT INTO `text` VALUES ('274', '东方闪电', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('275', '随碟附送', '华文隶书', '35', '0*0*204', '1', '0', '0');
INSERT INTO `text` VALUES ('280', '漂亮', '华文隶书', '35', '0*51*204', '1', '1', '0');
INSERT INTO `text` VALUES ('281', '怎么回事', '华文隶书', '35', '0*51*204', '1', '1', '0');
INSERT INTO `text` VALUES ('282', '是啊 咋么', '楷体', '35', '255*0*51', '0', '1', '0');
INSERT INTO `text` VALUES ('283', '地方', '华文隶书', '34', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('284', '帅气', '华文隶书', '33', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('290', '东渡扶桑', '华文隶书', '34', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('291', '的冯绍峰', '华文隶书', '35', '255*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('292', '我的家在东北', '华文隶书', '35', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('293', '地方', '华文隶书', '27', '0*0*255', '0', '1', '0');
INSERT INTO `text` VALUES ('294', '的身份', '华文隶书', '35', '255*51*0', '1', '1', '0');
INSERT INTO `text` VALUES ('295', '撒地方色粉', '华文隶书', '35', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('296', 'DF地方', '华文隶书', '35', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('297', '赋给', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('298', '的飞', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('299', 'DFDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('300', '的肤色', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('301', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('302', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('303', '非常好！', '华文隶书', '34', '0*51*204', '1', '0', '0');
INSERT INTO `text` VALUES ('304', '地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('305', '的肤色', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('306', '似懂非懂说', '黑体', '33', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('307', '发生的股份', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('308', '的肤色', '黑体', '33', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('309', '都是', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('310', '地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('311', '客户好了h', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('312', '地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('313', 'DF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('314', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('315', '客户', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('316', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('317', '的身份', '华文隶书', '30', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('318', '都是', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('319', '地方', '华文隶书', '35', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('320', '反对s', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('321', '犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('322', '犯得上犯得上犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('323', 'dF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('324', 'Dfd', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('325', '的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('326', '的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('327', 'DF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('328', 'DF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('329', 'DF随碟附送飞', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('330', '地方撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('331', 'DFDFDF是', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('332', 'g1h个', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('333', 'DFF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('334', 'DF大F跟谁打过', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('335', '随碟附送的身份', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('336', '似懂非懂说', '华文隶书', '33', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('337', '撒地方色粉', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('340', 'DFFDf撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('341', '撒地方', '华文隶书', '25', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('342', '法第三方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('343', '房顶上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('344', '是倒萨大', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('345', 'DFDFD', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('346', '撒地方色粉', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('350', '的身份', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('351', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('352', '随碟附送', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('353', '说发的速度', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('354', '是打发斯蒂芬', '华文隶书', '32', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('355', '撒地方色粉', '楷体', '34', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('356', '是', '楷体', '34', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('357', '分jhgjgk', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('358', '说范德萨发生发送到', '黑体', '35', '0*0*255', '1', '1', '0');
INSERT INTO `text` VALUES ('359', '就；l', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('360', '缩放时', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('361', '黑道少林和', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('362', '多喝水啊', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('363', '飞虎队n', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('364', 'f', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('365', '发生', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('366', '防沙林', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('367', '符合萨拉', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('368', '符合撒', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('369', '符合撒', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('370', '发生', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('371', '三翻四复', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('372', '航空界', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('373', '好了n', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('374', '缩放时', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('375', '好看', '楷体', '14', '0*0*255', '1', '1', '0');
INSERT INTO `text` VALUES ('376', '三翻四复', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('377', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('380', '撒地方色粉', '华文隶书', '31', '0*0*255', '1', '1', '0');
INSERT INTO `text` VALUES ('381', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('382', '撒地方', '华文隶书', '33', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('383', '谔谔', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('384', '发的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('385', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('390', '飞撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('391', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('400', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('401', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('402', '缩放时', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('403', '犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('404', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('405', '风刀霜剑l', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('406', '倒萨', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('407', '倒萨', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('408', 'wrgwegeg', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('409', '官方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('410', 'sihij', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('411', '犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('412', '倒萨', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('413', '获得胜利的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('414', 'guegvu', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('415', '倒萨健康', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('416', '倒萨', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('417', '的阿迪斯', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('418', '倒萨看开点s；阿联', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('419', 'd\'sja\'l\'k大厦离开', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('420', '房贷首付', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('421', '犯得上', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('422', '街道富士康l', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('423', 'hvjvn', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('424', '发射点；', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('430', '阿萨德发的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('431', '洪都拉斯', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('432', 'ygugiugioi', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('433', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('434', '飞是', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('435', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('436', 's飞', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('437', '缩放时', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('438', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('439', 's地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('440', 'gfu', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('441', 'H HK HL', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('442', 'YBYO \\\\', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('443', 'H', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('444', 'H', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('445', 'JK', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('446', 'J', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('447', 'J', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('448', 'HL', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('449', 'J', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('450', 'oihpn', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('451', 'H', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('452', 'vkku', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('453', 'H ;J KJ;J', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('454', 'tcutci', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('455', 'DF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('456', '飞', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('457', '飞', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('458', 'dwgvwb', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('459', 'H', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('460', 'ca', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('461', 'HL', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('462', 'bsbwbvbr', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('463', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('464', '地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('465', '地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('466', '的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('467', 'gdfsj', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('468', '地方官', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('469', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('470', 'hjhkh', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('471', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('472', 'hk', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('473', '法算法法算法法算法法算法', '华文隶书', '34', '204*0*0', '1', '1', '0');
INSERT INTO `text` VALUES ('474', 'rjedirj', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('475', 'rjeiw', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('476', 'rjew', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('477', 'rejw', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('480', 'hsfiho;osj', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('481', 'f\'j\'k\'d\'j房价肯定就', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('482', '犯得上j', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('483', '烦得很', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('484', 'fwlnfklwn', '宋体', '15', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('485', '反对', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('486', '附件打开', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('487', '反对j防静电', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('488', '发动机', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('489', '防静电', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('490', '发动机', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('491', '犯得上 就fd', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('492', '发挥d', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('493', 'gfiuwgifw', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('494', '萨芬', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('495', 'ygsuygu', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('496', '萨芬', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('497', 'wiufhiwu', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('498', '缩放时', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('499', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('500', '幅度', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('501', '高浮雕k', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('502', '健康和空间', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('503', '和', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('504', '就', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('505', '接口连接', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('506', '职称证书', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('507', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('508', '飞', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('509', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('510', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('511', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('512', '富华大厦', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('513', 'hwuhui', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('514', 'fgigfi', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('515', '和，j', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('516', '和', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('517', 'jhsbjes', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('518', '回家', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('519', '环境和快乐', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('520', '回家', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('521', 'bnfbji', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('522', 'gnjkn', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('523', '航空界', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('524', 'fsfkjnklsg', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('525', '和', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('526', 'nkjnksenf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('527', 'ekmfklsm', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('528', 'fkenlkse', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('529', 'felnfle', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('530', 'oeoef', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('531', 'lef,le', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('532', 'efesfkl\'', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('533', 'fenkfnmsel', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('534', '语音oy', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('535', '看', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('536', 'iuhiushiv', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('537', '高浮雕', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('538', '滚动f', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('539', '个', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('540', 'gd', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('541', 'g', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('542', 'gd鬼地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('543', '个', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('544', '解开了', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('545', '户籍科', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('550', '很快乐', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('551', 'wuwb', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('552', 'chvsh', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('553', '健康l', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('554', 'fuck', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('555', '规划', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('556', 'guihua', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('557', 'wydgiequy', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('558', '\\bcuhyguio', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('559', '反对', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('560', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('561', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('562', 'efwf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('563', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('564', '发送', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('565', '发送', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('566', '发送', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('567', '副书记', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('568', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('569', '富士康', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('570', 'dqd3ddddddddddddddddddd', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('571', '富士康', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('572', '分', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('573', 'fanimei', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('574', '撒地方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('575', '算法', '华文隶书', '34', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('576', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('580', '非常好？', '华文隶书', '33', '0*0*255', '1', '1', '0');
INSERT INTO `text` VALUES ('581', '是啊？', '楷体', '35', '255*0*51', '1', '0', '1');
INSERT INTO `text` VALUES ('582', '算法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('583', '啊沙发', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('590', 'ff', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('591', 'FDSDFS', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('592', 'DSFDF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('593', 'SFDSAF', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('594', '的撒大大', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('595', '范德萨发', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('596', '打发第三方', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('597', '是的撒', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('598', '成都市的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('599', '大', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('600', '地方司法', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('601', '是范德萨发范德萨发的发a', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('602', '你好啊，小美女', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('603', '大家好', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('604', '有事吗', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('605', 'sdsd', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('606', 'fdfdf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('607', 'dfadffdf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('608', 'dfdfdfdfdf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('609', '111111111111111', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('610', '听到声音了吗', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('611', '语音都已经实现了的', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('612', 'sds', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('613', 'dsfsadfds', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('614', 'dafjdsof', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('615', 'nhao', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('616', 'nhao', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('617', 'daojdaf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('618', 'cfsadmfmdsf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('619', 'fdsfd', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('620', 'dfadsf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('621', 'dfadsf', '楷体', '14', '0*0*255', '1', '0', '0');
INSERT INTO `text` VALUES ('622', 'dafdsfs', '楷体', '14', '0*0*255', '1', '0', '0');

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `QQ` decimal(5,0) NOT NULL DEFAULT '0',
  `PWD` varchar(20) DEFAULT NULL,
  `SIGN` varchar(60) DEFAULT NULL,
  `PHOTOID` decimal(2,0) DEFAULT NULL,
  `NICKNAME` varchar(20) DEFAULT NULL,
  `SEX` varchar(2) DEFAULT NULL,
  `BIRTHDAY` datetime DEFAULT NULL,
  `CONSTELLATION` varchar(100) DEFAULT NULL,
  `BLOODTYPE` varchar(10) DEFAULT NULL,
  `DIPLOMA` varchar(20) DEFAULT NULL,
  `TELEPHONE` varchar(30) DEFAULT NULL,
  `EMAIL` varchar(40) DEFAULT NULL,
  `ADDRESS` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`QQ`),
  UNIQUE KEY `SYS_C0012787` (`QQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('10001', '123', '坚持就是胜利!', '1', '小强', '男', '1990-10-11 00:00:00', '水瓶座', 'A         ', '大学本科', '18393232345', 'wewu@126.com', '陕西省西安市');
INSERT INTO `userinfo` VALUES ('10002', '123', '我的世界我做主!', '2', '小丽', '女', '1980-12-15 00:00:00', '金牛座', 'B         ', '高中', '13133232345', '123@qq.com', '四川省成都市');
INSERT INTO `userinfo` VALUES ('10003', '123', '加油!', '3', '刘虎', '男', '1990-10-11 00:00:00', '水瓶座', 'A         ', '大学本科', '18393232345', 'wewu@126.com', '山西省平遥市');
INSERT INTO `userinfo` VALUES ('10004', '123', '考试过了!', '4', '心神', '男', '1988-11-02 00:00:00', '巨蟹座', 'O         ', '初中', '15103304222', 'siwang@gmail.com', '浙江省杭州市');
INSERT INTO `userinfo` VALUES ('10005', '123', '忙啊!', '5', '送葬者', '男', '1993-01-01 00:00:00', '水瓶座', 'A         ', '大学本科', '18793232345', 'under@126.com', '陕西省宝鸡市');
INSERT INTO `userinfo` VALUES ('10006', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', '黑虎', '男', '1987-10-10 00:00:00', '白羊座(3.21-4.19)', 'B         ', '初中', '123344', 'a.com', '四川');
INSERT INTO `userinfo` VALUES ('10007', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', '塔里', '女', '1994-01-01 00:00:00', '白羊座(3.21-4.19)', 'O         ', '高中', '2324443', '1a.com', '中国');
INSERT INTO `userinfo` VALUES ('10008', '123', '我刚申请了QQ,欢迎大家加我QQ!', '7', '小名', '男', '1976-06-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '大学', '13333', '23234', 'i帧');
INSERT INTO `userinfo` VALUES ('10009', '123', '我刚申请了QQ,欢迎大家加我QQ!', '7', '冰雪奇缘', '男', '1995-04-01 00:00:00', '白羊座(3.21-4.19)', 'AB        ', '高中', '110', 'sina.com', '美国');
INSERT INTO `userinfo` VALUES ('10010', '123', '我刚申请了QQ,欢迎大家加我QQ!', '7', '机器人', '男', '1993-04-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '高中', '110', 'sin', '美国');
INSERT INTO `userinfo` VALUES ('10011', '123', '我刚申请了QQ,欢迎大家加我QQ!', '10', '我的世界', '男', '2007-04-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '小学', '220', 'ws3.com', '中国');
INSERT INTO `userinfo` VALUES ('10012', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', '沃草', '女', '1996-01-01 00:00:00', '白羊座(3.21-4.19)', 'B         ', '初中', '120', 'sinn.com', '广东');
INSERT INTO `userinfo` VALUES ('10013', '123', '我刚申请了QQ,欢迎大家加我QQ!', '10', 'JohnSina', '女', '1991-09-01 00:00:00', '处女座(8.23-9.22)', 'O         ', '博士', '123444', 'sina.com', '日本');
INSERT INTO `userinfo` VALUES ('10014', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', '拉登', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'B         ', '大学', '911', 'ladeng', '阿富汗');
INSERT INTO `userinfo` VALUES ('10015', '123', '我刚申请了QQ,欢迎大家加我QQ!', '6', 'Fucker', '女', '1996-11-01 00:00:00', '天蝎座(10.24-11.22)', 'O         ', '小学', '123', 'sind', '韩国');
INSERT INTO `userinfo` VALUES ('10016', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'DUDU', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '12', '1112', '133', '中国');
INSERT INTO `userinfo` VALUES ('10017', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'DDF', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '12', '123233', '23', 'we');
INSERT INTO `userinfo` VALUES ('10018', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'DF', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '1', '12', '12', '12');
INSERT INTO `userinfo` VALUES ('10019', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'FD', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '1', '123', '123', '13');
INSERT INTO `userinfo` VALUES ('10020', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', '我的', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '初中', '12', '撒地方', '北京');
INSERT INTO `userinfo` VALUES ('10021', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'DFDFD', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', 'A         ', '1', '3', 'd', 'd');
INSERT INTO `userinfo` VALUES ('10022', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'G', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', '1         ', '1', '1', '1', '1');
INSERT INTO `userinfo` VALUES ('10023', '123', '我刚申请了QQ,欢迎大家加我QQ!', '1', 'FDD', '男', '2014-01-01 00:00:00', '白羊座(3.21-4.19)', '1         ', '1', '1', '1', '1');
INSERT INTO `userinfo` VALUES ('10024', '123', '我刚申请了QQ,欢迎大家加我QQ!', '10', '我的世界', '男', '1990-03-01 00:00:00', '白羊座(3.21-4.19)', 'B         ', '大学', '122', '12', '中国');

-- ----------------------------
-- Table structure for `user_group`
-- ----------------------------
DROP TABLE IF EXISTS `user_group`;
CREATE TABLE `user_group` (
  `UGNO` decimal(2,0) DEFAULT NULL,
  `QQ` decimal(5,0) DEFAULT NULL,
  `GNO` decimal(5,0) DEFAULT NULL,
  UNIQUE KEY `SYS_C0012789` (`UGNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_group
-- ----------------------------
