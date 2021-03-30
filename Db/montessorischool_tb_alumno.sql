-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: montessorischool
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `tb_alumno`
--

DROP TABLE IF EXISTS `tb_alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_alumno` (
  `id_alumno` int NOT NULL AUTO_INCREMENT,
  `apm_alumno` varchar(30) NOT NULL,
  `app_alumno` varchar(30) NOT NULL,
  `edad_alumno` int NOT NULL,
  `nombre_alumno` varchar(30) NOT NULL,
  `sexo_alumno` varchar(5) NOT NULL,
  `id_boleta` int DEFAULT NULL,
  `id_cuenta` int DEFAULT NULL,
  `id_prof` int DEFAULT NULL,
  PRIMARY KEY (`id_alumno`),
  KEY `FKtgcg5gagv3h4ff9wpv59aebkd` (`id_boleta`),
  KEY `FK2y7qeth2nbsciri94yjt3l2a4` (`id_cuenta`),
  KEY `FK5aicaou0b7ktvhq4wr52trsjn` (`id_prof`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_alumno`
--

LOCK TABLES `tb_alumno` WRITE;
/*!40000 ALTER TABLE `tb_alumno` DISABLE KEYS */;
INSERT INTO `tb_alumno` VALUES (1,'Valdez','Perez',10,'Geovanni','H',2,3,5),(2,'Lopez','Sanchez',8,'Erika','M',4,2,4),(3,'Ortiz','Ignacio',6,'Mayrani','M',3,4,3),(4,'Urizar','Fajardo',7,'Victor','H',1,5,2),(5,'Onofre','Cruz',8,'Francisco','H',5,1,1);
/*!40000 ALTER TABLE `tb_alumno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-30 11:25:45
