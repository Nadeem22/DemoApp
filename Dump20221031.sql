CREATE DATABASE  IF NOT EXISTS `vms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `vms`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: vms
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `entry_exit`
--

DROP TABLE IF EXISTS `entry_exit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entry_exit` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `entry_stamp` datetime DEFAULT NULL,
  `exit_stamp` datetime DEFAULT NULL,
  `family_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK47jgt1v9atf709ugvhnaw35ar` (`family_id`),
  CONSTRAINT `FK47jgt1v9atf709ugvhnaw35ar` FOREIGN KEY (`family_id`) REFERENCES `family_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entry_exit`
--

LOCK TABLES `entry_exit` WRITE;
/*!40000 ALTER TABLE `entry_exit` DISABLE KEYS */;
INSERT INTO `entry_exit` VALUES (1,'2022-10-31 20:47:04',NULL,1),(2,'2022-10-31 20:55:50',NULL,20),(3,'2022-10-31 20:57:58',NULL,20),(4,'2022-10-31 20:59:32',NULL,20),(5,NULL,'2022-10-31 21:03:21',1),(6,'2022-10-31 21:11:02',NULL,1),(7,NULL,'2022-10-31 21:11:35',1);
/*!40000 ALTER TABLE `entry_exit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `family_info`
--

DROP TABLE IF EXISTS `family_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `family_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `flat_no` varchar(255) NOT NULL,
  `no_of_member` varchar(255) NOT NULL,
  `owner_name` varchar(255) NOT NULL,
  `entry_date_time` datetime DEFAULT NULL,
  `exit_date_time` datetime DEFAULT NULL,
  `ssn_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `family_info`
--

LOCK TABLES `family_info` WRITE;
/*!40000 ALTER TABLE `family_info` DISABLE KEYS */;
INSERT INTO `family_info` VALUES (1,'12D','10','nadeem',NULL,NULL,NULL),(20,'12E','3','waseem',NULL,NULL,NULL),(21,'12F','sdgds','nadeem',NULL,NULL,NULL),(22,'12G','asdg','wetwt',NULL,NULL,NULL),(23,'asfas','1','asfaf',NULL,NULL,NULL),(24,'12K','2','nadeem',NULL,NULL,NULL),(25,'ddd','2','ttwt',NULL,NULL,NULL),(26,'10S','4','nadeem','2022-10-31 10:39:47',NULL,'122112121'),(27,'12S','5','waseem',NULL,NULL,'123234543'),(28,'12','1','nadeem','2022-10-31 13:22:36',NULL,'123434565'),(29,'D78','4','nadeem','2022-10-31 21:10:28',NULL,'123234546');
/*!40000 ALTER TABLE `family_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitor_info`
--

DROP TABLE IF EXISTS `visitor_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitor_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `flat_no` varchar(255) NOT NULL,
  `visitor_name` varchar(255) NOT NULL,
  `entry_date_time` datetime DEFAULT NULL,
  `exit_date_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitor_info`
--

LOCK TABLES `visitor_info` WRITE;
/*!40000 ALTER TABLE `visitor_info` DISABLE KEYS */;
INSERT INTO `visitor_info` VALUES (1,'12D','V1',NULL,NULL),(2,'12D','v2',NULL,NULL),(3,'1','sdf',NULL,NULL),(4,'sd','sdg',NULL,NULL),(5,'d','dfd',NULL,NULL),(6,'s','asf',NULL,NULL),(7,'123','add',NULL,NULL),(8,'12','demo1',NULL,NULL),(9,'d12','qwr',NULL,NULL),(10,'12','sdf',NULL,NULL),(11,'12K','wedf',NULL,NULL),(12,'12D','egg',NULL,NULL),(13,'12D','visitor2','2022-10-31 10:17:10',NULL);
/*!40000 ALTER TABLE `visitor_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-31 21:24:51
