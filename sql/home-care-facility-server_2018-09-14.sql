# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 192.168.85.208 (MySQL 5.6.41)
# Database: home-care-facility-server
# Generation Time: 2018-09-14 02:30:59 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table facility_payment_basic_info
# 缴费基本信息表

DROP TABLE IF EXISTS `facility_payment_basic_info`;

CREATE TABLE `facility_payment_basic_info` (
  `fileNo` char(18) NOT NULL DEFAULT '' COMMENT '档案号',
  `monthPayMount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '月基础费用',
  `yearPayMount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '年收费',
  `oncePayMount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '一次性收费',
  `depositPayMount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '押金收费',
  `brokenAmount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '损耗金额',
  `accountBalance` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '账户余额',
  `sumPaymentAmount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '当月需缴纳费用',
  `shouldFeeAmount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '应该缴纳的费用',
  `paymentState` varchar(100) NOT NULL DEFAULT '待缴费' COMMENT '缴费状态',
  `paymentDetailList` text COMMENT '费用明细列表',
  `paymentTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '缴费时间',
  `dealUser` varchar(100) DEFAULT NULL COMMENT '处理人',
  `monthDay` int(2) unsigned zerofill NOT NULL DEFAULT '00' COMMENT '距离下月缴费剩余天数',
  `checkInTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入住时间',
  `value9` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value10` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value11` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value12` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value13` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value14` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value15` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value16` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value17` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value18` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value19` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value20` varchar(100) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`fileNo`),
  UNIQUE KEY `fileNo` (`fileNo`),
  CONSTRAINT `payment_id` FOREIGN KEY (`fileNo`) REFERENCES `facility_user_id_mapping_tb` (`fileNo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `facility_payment_basic_info` WRITE;
/*!40000 ALTER TABLE `facility_payment_basic_info` DISABLE KEYS */;

INSERT INTO `facility_payment_basic_info` (`fileNo`, `monthPayMount`, `yearPayMount`, `oncePayMount`, `depositPayMount`, `brokenAmount`, `accountBalance`, `sumPaymentAmount`, `shouldFeeAmount`, `paymentState`, `paymentDetailList`, `paymentTime`, `dealUser`, `monthDay`, `checkInTime`, `value9`, `value10`, `value11`, `value12`, `value13`, `value14`, `value15`, `value16`, `value17`, `value18`, `value19`, `value20`)
VALUES
	('20180903164810',1520.00,120.00,20.00,2100.00,0.00,0.00,3760.00,3760.00,'待缴费','00000,00100,00300,10000,10100,20000,30000,30100','2018-09-09 14:15:21','测试',00,'0000-00-00 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	('20180903164834',1320.00,120.00,20.00,2100.00,0.00,0.00,3560.00,3560.00,'待缴费','00001,00100,00300,10000,10100,20000,30000,30100','2018-09-09 14:14:35','测试',00,'0000-00-00 00:00:00',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40000 ALTER TABLE `facility_payment_basic_info` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table facility_user_basic_info_tb
# 用户基本信息表

DROP TABLE IF EXISTS `facility_user_basic_info_tb`;

CREATE TABLE `facility_user_basic_info_tb` (
  `fileNo` char(14) NOT NULL DEFAULT '' COMMENT '用户身份证号',
  `userName` varchar(100) DEFAULT NULL COMMENT '姓名',
  `userSex` int(2) unsigned zerofill DEFAULT NULL COMMENT '性别',
  `userBirthday` date DEFAULT NULL COMMENT '出生日期',
  `userAge` int(11) DEFAULT NULL COMMENT '年龄',
  `userContact` char(11) DEFAULT NULL COMMENT '联系方式',
  `userMarriage` int(2) unsigned zerofill DEFAULT NULL COMMENT '婚姻状况',
  `userNation` int(2) unsigned zerofill DEFAULT NULL COMMENT '民族',
  `userBloodType` int(2) unsigned zerofill DEFAULT NULL COMMENT '血型',
  `userHealthyState` int(2) unsigned zerofill DEFAULT NULL COMMENT '健康状态',
  `userPolitical` int(2) unsigned zerofill DEFAULT NULL COMMENT '政治面貌',
  `userEmployee` int(2) unsigned zerofill DEFAULT NULL COMMENT '退休职业',
  `userIsLocal` int(2) unsigned zerofill DEFAULT NULL COMMENT '本地户口',
  `userLiveState` int(2) unsigned zerofill DEFAULT NULL COMMENT '居住情况',
  `userFamilyNum` int(11) DEFAULT NULL COMMENT '家庭人口',
  `userHomeAddress` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `userHouseHoldAddress` varchar(200) DEFAULT NULL COMMENT '户籍地址',
  `userCategory` int(2) unsigned zerofill DEFAULT NULL COMMENT '人员类别',
  `userReligion` int(2) unsigned zerofill DEFAULT NULL COMMENT '宗教信仰',
  `userHobby` varchar(100) DEFAULT NULL COMMENT '爱好',
  `userDietary` varchar(100) DEFAULT NULL COMMENT '饮食特点',
  `userEduDegree` int(2) unsigned zerofill DEFAULT NULL COMMENT '文化程度',
  `userWorkAbility` int(2) unsigned zerofill DEFAULT NULL COMMENT '劳动能力',
  `userPocketbook` int(2) unsigned zerofill DEFAULT NULL COMMENT '经济来源',
  `value1` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value2` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value3` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value4` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value5` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value6` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value7` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value8` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value9` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value10` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value11` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value12` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value13` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value14` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value15` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value16` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value17` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value18` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value19` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value20` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '预留字段',
  PRIMARY KEY (`fileNo`),
  CONSTRAINT `facility_user_basic_info_tb_ibfk_1` FOREIGN KEY (`fileNo`) REFERENCES `facility_user_id_mapping_tb` (`fileNo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `facility_user_basic_info_tb` WRITE;
/*!40000 ALTER TABLE `facility_user_basic_info_tb` DISABLE KEYS */;

INSERT INTO `facility_user_basic_info_tb` (`fileNo`, `userName`, `userSex`, `userBirthday`, `userAge`, `userContact`, `userMarriage`, `userNation`, `userBloodType`, `userHealthyState`, `userPolitical`, `userEmployee`, `userIsLocal`, `userLiveState`, `userFamilyNum`, `userHomeAddress`, `userHouseHoldAddress`, `userCategory`, `userReligion`, `userHobby`, `userDietary`, `userEduDegree`, `userWorkAbility`, `userPocketbook`, `value1`, `value2`, `value3`, `value4`, `value5`, `value6`, `value7`, `value8`, `value9`, `value10`, `value11`, `value12`, `value13`, `value14`, `value15`, `value16`, `value17`, `value18`, `value19`, `value20`, `createTime`)
VALUES
	('20180903164834','张三',00,NULL,68,'15551010622',00,00,00,NULL,00,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-09-09 11:33:43');

/*!40000 ALTER TABLE `facility_user_basic_info_tb` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table facility_user_id_mapping_tb
# 用户身份证档案号映射表

DROP TABLE IF EXISTS `facility_user_id_mapping_tb`;

CREATE TABLE `facility_user_id_mapping_tb` (
  `fileNo` char(14) NOT NULL DEFAULT '',
  `userId` char(18) NOT NULL DEFAULT '',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`fileNo`),
  UNIQUE KEY `usrId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `facility_user_id_mapping_tb` WRITE;
/*!40000 ALTER TABLE `facility_user_id_mapping_tb` DISABLE KEYS */;

INSERT INTO `facility_user_id_mapping_tb` (`fileNo`, `userId`, `createTime`)
VALUES
	('20180903164810','341113196102210814','2018-09-03 16:48:25'),
	('20180903164834','341113196102210816','2018-09-03 16:48:38');

/*!40000 ALTER TABLE `facility_user_id_mapping_tb` ENABLE KEYS */;
UNLOCK TABLES;

DELIMITER ;;
/*!50003 SET SESSION SQL_MODE="NO_ENGINE_SUBSTITUTION" */;;
/*!50003 CREATE */ /*!50017 DEFINER=`root`@`%` */ /*!50003 TRIGGER `trigger_usrMappingTb_createFileNo` BEFORE INSERT ON `facility_user_id_mapping_tb` FOR EACH ROW set new.fileNo=DATE_FORMAT(now(),'%Y%m%d%H%i%s') */;;
DELIMITER ;
/*!50003 SET SESSION SQL_MODE=@OLD_SQL_MODE */;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- 设备基本信息表
CREATE TABLE `facility_device_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `deviceNo` varchar(50) DEFAULT NULL COMMENT '设备号',
  `deviceMajorCategory` varchar(50) NOT NULL DEFAULT '' COMMENT '设备大类',
  `deviceSubCategory` varchar(50) NOT NULL DEFAULT '' COMMENT '设备子类',
  `deviceName` varchar(100) DEFAULT 'deviceMajorCategory+deviceSubCategory' COMMENT '预留字段',
  `openTime` timestamp NULL DEFAULT NULL COMMENT '开通时间',
  `deviceOpenStatus` varchar(100) NOT NULL DEFAULT '未开通' COMMENT '设备开通状态',
  `deviceOnlineStatus` varchar(100) DEFAULT NULL COMMENT '设备在线状态',
  `deviceBindStatus` varchar(100) DEFAULT '未绑定' COMMENT '设备绑定状态',
  `bedNo` varchar(100) DEFAULT NULL COMMENT '绑定信息',
  `simNo` varchar(100) DEFAULT '无' COMMENT 'SIM卡号',
  `deviceProperty` varchar(100) DEFAULT NULL COMMENT '设备属性',
  `devicePrice` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '设备单价',
  `deviceServicePrice` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '设备服务费',
  `remarkInfo` varchar(100) DEFAULT NULL COMMENT '设备信息备注',
  `brokenAmount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '设备损耗金额',
  `returnRemarkInfo` varchar(100) NOT NULL DEFAULT '正常归还' COMMENT '归还备注',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `value4` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value5` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value6` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value7` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value8` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value9` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value10` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value11` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value12` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value13` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value14` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value15` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value16` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value17` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value18` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value19` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value20` varchar(100) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`id`),
  UNIQUE KEY `deviceNo` (`deviceNo`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 192.168.85.208 (MySQL 5.6.41)
# Database: home-care-facility-server
# Generation Time: 2018-09-14 09:00:01 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table facility_bed_info
# 床位基本信息表

DROP TABLE IF EXISTS `facility_bed_info`;

CREATE TABLE `facility_bed_info` (
  `fileNo` char(14) DEFAULT NULL COMMENT '关联的设备号',
  `bedNo` varchar(50) NOT NULL COMMENT '床位号',
  `buildNo` varchar(50) DEFAULT NULL COMMENT '楼栋号',
  `floorNo` varchar(50) NOT NULL COMMENT '楼层号',
  `roomNo` varchar(50) NOT NULL COMMENT '房间号',
  `roomType` varchar(100) NOT NULL DEFAULT '' COMMENT '房间类型',
  `nursingType` varchar(100) DEFAULT NULL COMMENT '护理类型',
  `bedStatus` varchar(50) NOT NULL DEFAULT '空闲' COMMENT '床位状态',
  `bedLocate` varchar(50) DEFAULT NULL COMMENT '床位朝向',
  `remarkInfo` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `value22` varchar(200) NOT NULL DEFAULT '' COMMENT '预留字段',
  `value1` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value2` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value3` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value4` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value5` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value6` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value7` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value8` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value9` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value10` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value11` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value12` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value13` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value14` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value15` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value16` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value17` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value18` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value19` varchar(100) DEFAULT NULL COMMENT '预留字段',
  `value20` varchar(100) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`bedNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `facility_bed_info` WRITE;
/*!40000 ALTER TABLE `facility_bed_info` DISABLE KEYS */;

INSERT INTO `facility_bed_info` (`fileNo`, `bedNo`, `buildNo`, `floorNo`, `roomNo`, `roomType`, `nursingType`, `bedStatus`, `bedLocate`, `remarkInfo`, `createTime`, `value22`, `value1`, `value2`, `value3`, `value4`, `value5`, `value6`, `value7`, `value8`, `value9`, `value10`, `value11`, `value12`, `value13`, `value14`, `value15`, `value16`, `value17`, `value18`, `value19`, `value20`)
VALUES
  (NULL,'A100101','A栋','1层','001','智能2人间','自理','空闲','朝南',NULL,'2018-09-14 10:59:22','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40000 ALTER TABLE `facility_bed_info` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

