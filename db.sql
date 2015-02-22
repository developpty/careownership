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
  `ending_time` datetime DEFAULT NULL,
  `pre_planned_purpose` varchar(500) DEFAULT NULL,
  `topic_activities` varchar(500) DEFAULT NULL,
  `accomplishment` varchar(500) DEFAULT NULL,
  `goals_nextmeeting` varchar(500) DEFAULT NULL,
  `mentees_next_meeting` varchar(500) DEFAULT NULL,
  `mentors_next_meeting` varchar(500) DEFAULT NULL,
  `time_next_meeting` datetime DEFAULT NULL,
  `place_next_meeting` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`form_id`),
  KEY `mentor_id_fkey_idx` (`mentor_id`,`mentee_id`),
  CONSTRAINT `mentor_id_fkey` FOREIGN KEY (`mentor_id`, `mentee_id`) REFERENCES `mentor_mentee` (`mentor_id`, `mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forms`
--

LOCK TABLES `forms` WRITE;
/*!40000 ALTER TABLE `forms` DISABLE KEYS */;
INSERT INTO `forms` VALUES (1,1,1,'2015-02-20 16:10:45','Library','2015-02-20 16:10:00','asdi daskldj sadkljasdw sadjkjla cxue uqewl sdlxz weq','1.dsaodaoho jjo 2. dasdja','ashdas dashw sjdkx weqoe pipo','odaja qweqw eff gfgr','dasd ewqe jty cbv iioyu','eqwe tretr dasdas cbv uuy','2015-02-23 16:10:45','Apartment'),(2,3,1,'2015-02-15 16:10:45','Apartment','2015-02-15 16:00:00','ashd dwqhew qwe czx ht','1.dw cc tretu uy','das xcz rty ii fc','asda weqe','hh ytuyt iul bvcb','zc qwe ytuyt opo','2015-02-26 15:10:45','Library');
/*!40000 ALTER TABLE `forms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentees`
--

DROP TABLE IF EXISTS `mentees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mentees` (
  `mentee_id` int(11) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `SSN` varchar(45) NOT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `maritial_status` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `zipcode` varchar(10) DEFAULT NULL,
  `highest_education_level` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mentee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentees`
--

LOCK TABLES `mentees` WRITE;
/*!40000 ALTER TABLE `mentees` DISABLE KEYS */;
INSERT INTO `mentees` VALUES (1,'Steel','City','5899641','male',32,'married','4716 Ellsworth Ave','15213','high school'),(2,'Carnegie','Library','895774','female',25,'single','4563 dawson St','18974','Undergraduate'),(3,'Book','Window','89554','male',27,'single','8947 forbes Ave','14987','master');
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
  CONSTRAINT `mentee_id_ref` FOREIGN KEY (`mentee_id`) REFERENCES `mentees` (`mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `mentor_id_ref` FOREIGN KEY (`mentor_id`) REFERENCES `mentors` (`mentor_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor_mentee`
--

LOCK TABLES `mentor_mentee` WRITE;
/*!40000 ALTER TABLE `mentor_mentee` DISABLE KEYS */;
INSERT INTO `mentor_mentee` VALUES (1,1),(3,1),(1,2),(2,2),(2,3),(3,3);
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
  `full_name` varchar(45) NOT NULL,
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
INSERT INTO `mentors` VALUES (1,'Sprite Lenovo','sprite','123'),(2,'Coffe Bead','coffe','123'),(3,'Sanwich Board','sanwich','123');
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
INSERT INTO `staff` VALUES (1,'Lebron James','james','123'),(2,'Kobe Byrant','kobe','123');
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

-- Dump completed on 2015-02-21 17:10:17
