-- MySQL dump 10.13  Distrib 5.5.41, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: careownership
-- ------------------------------------------------------
-- Server version	5.5.41-0+wheezy1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `debt_change`
--

DROP TABLE IF EXISTS `debt_change`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `debt_change` (
  `debt_change_id` int(11) NOT NULL AUTO_INCREMENT,
  `current_total_debt` int(11) DEFAULT NULL,
  `current_debt_type` varchar(45) DEFAULT NULL,
  `current_debt_description` varchar(45) DEFAULT NULL,
  `current_debt_date` date DEFAULT NULL,
  `mentee_id` int(11) NOT NULL,
  PRIMARY KEY (`debt_change_id`),
  KEY `debt_mentee_idx` (`mentee_id`),
  CONSTRAINT `debt_mentee` FOREIGN KEY (`mentee_id`) REFERENCES `mentees` (`mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `debt_change`
--

LOCK TABLES `debt_change` WRITE;
/*!40000 ALTER TABLE `debt_change` DISABLE KEYS */;
INSERT INTO `debt_change` VALUES (1,789,'student','sadawq weqe das asd','2014-08-09',1),(2,441,'payday','asd adw wqewq','2015-01-01',1),(3,558,'auto','asdi weqe opad ','2015-02-01',2);
/*!40000 ALTER TABLE `debt_change` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employment_change`
--

DROP TABLE IF EXISTS `employment_change`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employment_change` (
  `employment_change_id` int(11) NOT NULL AUTO_INCREMENT,
  `current_position` varchar(45) DEFAULT NULL,
  `current_monthly_earnings` int(11) DEFAULT NULL,
  `current_employer` varchar(45) DEFAULT NULL,
  `date_of_change` date DEFAULT NULL,
  `current_notes` varchar(500) DEFAULT NULL,
  `mentee_id` int(11) NOT NULL,
  PRIMARY KEY (`employment_change_id`),
  KEY `employment_mentee_idx` (`mentee_id`),
  CONSTRAINT `employment_mentee` FOREIGN KEY (`mentee_id`) REFERENCES `mentees` (`mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employment_change`
--

LOCK TABLES `employment_change` WRITE;
/*!40000 ALTER TABLE `employment_change` DISABLE KEYS */;
INSERT INTO `employment_change` VALUES (1,'staff',3000,'dasdas','2014-01-02','sdd wqeqwe',1),(2,'manager',6000,'qweqwe','2013-03-04','sdd errr ggg',2),(3,'president',10000,'wqewsad','2015-01-01','sdsdw',2);
/*!40000 ALTER TABLE `employment_change` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forms`
--

DROP TABLE IF EXISTS `forms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forms` (
  `form_id` int(11) NOT NULL AUTO_INCREMENT,
  `mentor_id` int(11) NOT NULL,
  `mentee_id` int(11) NOT NULL,
  `meeting_time` datetime DEFAULT NULL,
  `meeting_place` varchar(45) DEFAULT NULL,
  `meeting_notes` varchar(500) DEFAULT NULL,
  `next_meeting_goals` varchar(500) DEFAULT NULL,
  `topic_covered` varchar(500) DEFAULT NULL,
  `topic_covered_other` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`form_id`),
  KEY `mentor_id_fkey_idx` (`mentor_id`,`mentee_id`),
  KEY `mentee_id_idx` (`mentee_id`),
  CONSTRAINT `mentee_id` FOREIGN KEY (`mentee_id`) REFERENCES `mentees` (`mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `mentor_id` FOREIGN KEY (`mentor_id`) REFERENCES `mentors` (`mentor_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forms`
--

LOCK TABLES `forms` WRITE;
/*!40000 ALTER TABLE `forms` DISABLE KEYS */;
/*!40000 ALTER TABLE `forms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentees`
--

DROP TABLE IF EXISTS `mentees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mentees` (
  `mentee_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `pretraining_completed` varchar(1) DEFAULT NULL,
  `pretraining_date_complete` date DEFAULT NULL,
  `ltp1_completed` varchar(1) DEFAULT NULL,
  `ltp1_date_complete` date DEFAULT NULL,
  `ltp2_completed` varchar(1) DEFAULT NULL,
  `ltp2_date_complete` date DEFAULT NULL,
  `ltp3_completed` varchar(1) DEFAULT NULL,
  `ltp3_date_complete` date DEFAULT NULL,
  `ltp4_completed` varchar(1) DEFAULT NULL,
  `ltp4_date_complete` date DEFAULT NULL,
  `other_goals` varchar(200) DEFAULT NULL,
  `current_saving` int(11) DEFAULT NULL,
  `notes` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`mentee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentees`
--

LOCK TABLES `mentees` WRITE;
/*!40000 ALTER TABLE `mentees` DISABLE KEYS */;
INSERT INTO `mentees` VALUES (1,'Sprite','Books','y','2014-02-21','y','2014-08-09','n',NULL,'n',NULL,'n',NULL,'no',3455,'weqe qewqe'),(2,'Windows','Mico','n',NULL,'n',NULL,'n',NULL,'n',NULL,'n',NULL,'qwe das tyrt',8997,'hahahaha');
/*!40000 ALTER TABLE `mentees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentor_mentee`
--

DROP TABLE IF EXISTS `mentor_mentee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mentor_mentee` (
  `mentor_id` int(11) NOT NULL,
  `mentee_id` int(11) NOT NULL,
  PRIMARY KEY (`mentor_id`,`mentee_id`),
  KEY `mentee_id_ref_idx` (`mentee_id`),
  CONSTRAINT `mentor_id_ref` FOREIGN KEY (`mentor_id`) REFERENCES `mentors` (`mentor_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `mentee_id_ref` FOREIGN KEY (`mentee_id`) REFERENCES `mentees` (`mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor_mentee`
--

LOCK TABLES `mentor_mentee` WRITE;
/*!40000 ALTER TABLE `mentor_mentee` DISABLE KEYS */;
INSERT INTO `mentor_mentee` VALUES (1,1),(2,2);
/*!40000 ALTER TABLE `mentor_mentee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentors`
--

DROP TABLE IF EXISTS `mentors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mentors` (
  `mentor_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `middle_initial` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `apt#` varchar(10) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zipcode` varchar(45) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `highest_education_level` varchar(45) DEFAULT NULL,
  `notes` varchar(200) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `emergency_contact` varchar(45) DEFAULT NULL,
  `emergency_contact_description` varchar(100) DEFAULT NULL,
  `emergency_contact_contact_info` varchar(100) DEFAULT NULL,
  `login_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`mentor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentors`
--

LOCK TABLES `mentors` WRITE;
/*!40000 ALTER TABLE `mentors` DISABLE KEYS */;
INSERT INTO `mentors` VALUES (1,'Lebron','James',NULL,25,'XXX St','18','Cleveland','OH','12345','M','high school','','1990-01-01','655478','hdasd wqueq wuasdas','dasdwq qweqw','james','123'),(2,'Kobe','Bryant',NULL,30,'XXX Ave','19','Los Angels','CA','54321','M','high school',NULL,'1985-01-01','895576','dasdwqdaxc dwq qw','as daswqeq','kobe','123');
/*!40000 ALTER TABLE `mentors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(45) NOT NULL,
  `login_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'LL James','james','123'),(2,'Kobe Byrant','kobe','123');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-21 21:24:36
