# MySQL-Front 5.1  (Build 4.2)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: room
# ------------------------------------------------------
# Server version 5.1.44-community

DROP DATABASE IF EXISTS `room`;
CREATE DATABASE `room` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `room`;

#
# Source for table admin
#

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(20) NOT NULL DEFAULT '',
  `apass` varchar(15) NOT NULL DEFAULT '',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Dumping data for table admin
#

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'yyj','123456');
INSERT INTO `admin` VALUES (2,'cp','123456');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table fee
#

DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `udorm` int(11) NOT NULL DEFAULT '0',
  `uhouse` varchar(15) NOT NULL DEFAULT '',
  `fw` varchar(15) NOT NULL DEFAULT '',
  `fe` varchar(15) NOT NULL DEFAULT '',
  `ft` varchar(15) NOT NULL DEFAULT '',
  `fi` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

#
# Dumping data for table fee
#

LOCK TABLES `fee` WRITE;
/*!40000 ALTER TABLE `fee` DISABLE KEYS */;
INSERT INTO `fee` VALUES (1,1,'101','150','264','414',b'0');
INSERT INTO `fee` VALUES (2,2,'205','95','186','281',b'0');
INSERT INTO `fee` VALUES (3,16,'413','20','80','100',b'0');
INSERT INTO `fee` VALUES (4,12,'505','65','100','165',b'1');
INSERT INTO `fee` VALUES (5,3,'510','120','160','280',b'1');
INSERT INTO `fee` VALUES (6,5,'605','232','565','797',b'1');
INSERT INTO `fee` VALUES (7,6,'206','52','160','212',b'1');
INSERT INTO `fee` VALUES (8,6,'205','100','230','330',b'1');
INSERT INTO `fee` VALUES (9,3,'306','122','306','428',b'1');
INSERT INTO `fee` VALUES (10,9,'308','69','76','145',b'1');
INSERT INTO `fee` VALUES (11,9,'306','665','100','765',b'0');
INSERT INTO `fee` VALUES (12,14,'206','118','306','424',b'1');
INSERT INTO `fee` VALUES (13,13,'302','36','100','136',b'1');
/*!40000 ALTER TABLE `fee` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table user
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL DEFAULT '',
  `upass` varchar(15) NOT NULL DEFAULT '',
  `udorm` varchar(15) NOT NULL DEFAULT '',
  `uhouse` varchar(15) DEFAULT '',
  `unumber` varchar(15) NOT NULL DEFAULT '',
  `uidentity` bit(1) NOT NULL DEFAULT b'0',
  `uclass` varchar(15) NOT NULL DEFAULT '16电商3班',
  `ubed` varchar(15) NOT NULL DEFAULT '',
  `usex` bit(1) DEFAULT NULL,
  `utel` varchar(15) NOT NULL DEFAULT '',
  `uonline` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

#
# Dumping data for table user
#

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'张三','123456','1','101','1620420301',b'1','16电商3班','1',b'0','1620156464',b'0');
INSERT INTO `user` VALUES (2,'李四','123456','1','101','1620420302',b'0','16电商3班','2',b'0','1620156464',b'1');
INSERT INTO `user` VALUES (3,'王五','123456','1','101','1620420303',b'0','16电商3班','3',b'0','1620156464',b'1');
INSERT INTO `user` VALUES (4,'刘六','123456','1','101','1620420304',b'0','16电商3班','4',b'0','1620156464',b'0');
INSERT INTO `user` VALUES (5,'zs','123456','2','205','1620420305',b'0','16电商3班','1',b'0','1620156464',b'0');
INSERT INTO `user` VALUES (6,'lisa','111111','2','205','1620420306',b'1','16电商3班','2',b'0','1620156464',b'1');
INSERT INTO `user` VALUES (7,'wangye','111111','2','205','1620420307',b'0','16电商3班','3',b'0','1620156464',b'1');
INSERT INTO `user` VALUES (8,'liulu','111111','2','205','1620420308',b'0','16电商3班','4',b'0','1620156464',b'0');
INSERT INTO `user` VALUES (9,'溜溜','123456','16','413','1620420309',b'0','16电商3班','1',b'1','215446464',b'1');
INSERT INTO `user` VALUES (10,'呜呜','123456','16','413','1620420310',b'0','16电商3班','2',b'1','1620145669',b'1');
INSERT INTO `user` VALUES (11,'琪琪','123456','16','413','1620420311',b'0','16电商3班','3',b'1','5656567898',b'1');
INSERT INTO `user` VALUES (12,'呼呼','123456','16','413','1620420312',b'1','16电商3班','4',b'1','1564575778',b'1');
INSERT INTO `user` VALUES (13,'huhuhu','123456','14','206','1620420313',b'0','16电商3班','1',b'0','162016466444',b'0');
INSERT INTO `user` VALUES (14,'liuliuloi','123456','14','206','1620420314',b'1','16电商3班','2',b'0','162049565668',b'1');
INSERT INTO `user` VALUES (15,'nnnnn','123456','14','206','1620420315',b'0','16电商3班','3',b'0','162655656',b'1');
INSERT INTO `user` VALUES (16,'ddddad','123456','14','206','1620420316',b'0','16电商3班','4',b'0','1255565656',b'1');
INSERT INTO `user` VALUES (17,'吉吉','123456','3','510','1620420317',b'0','16电商3班','1',b'1','1564565656',b'1');
INSERT INTO `user` VALUES (18,'妮妮','111111','3','510','1620420318',b'0','16电商3班','2',b'1','22644464564',b'1');
INSERT INTO `user` VALUES (19,'比比','123456','3','510','1620420319',b'1','16电商3班','3',b'1','46565656',b'1');
INSERT INTO `user` VALUES (20,'默默','111111','3','510','1620420320',b'0','16电商3班','4',b'1','565656479',b'1');
INSERT INTO `user` VALUES (21,'bnbnbn','111111','3','306','1620420321',b'1','16电商3班','1',b'1','166465665',b'1');
INSERT INTO `user` VALUES (22,'fdfdfd','111111','3','306','1620420322',b'0','16电商3班','2',b'1','54645545644',b'1');
INSERT INTO `user` VALUES (23,'hghghg','123456','3','306','1620420323',b'0','16电商3班','3',b'1','465656565',b'1');
INSERT INTO `user` VALUES (24,'vcvcvc','123456','3','306','1620420324',b'0','16电商3班','4',b'1','565656565',b'1');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(20) DEFAULT NULL,
  `mpass` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usernumber` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `udorm` varchar(20) DEFAULT NULL,
  `uhouse` varchar(20) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;