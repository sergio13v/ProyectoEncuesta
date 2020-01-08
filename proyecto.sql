-- MySQL dump 10.16  Distrib 10.1.38-MariaDB, for debian-linux-gnueabihf (armv7l)
--
-- Host: localhost    Database: proyecto
-- ------------------------------------------------------
-- Server version	10.1.38-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ENCUESTA`
--

DROP TABLE IF EXISTS `ENCUESTA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ENCUESTA` (
  `ID_ENCUESTA` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOM_ENCUESTA` varchar(100) NOT NULL,
  `DESCRIPCION_ENCUESTA` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_ENCUESTA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ENCUESTA`
--

LOCK TABLES `ENCUESTA` WRITE;
/*!40000 ALTER TABLE `ENCUESTA` DISABLE KEYS */;
/*!40000 ALTER TABLE `ENCUESTA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ENCUESTA_PREGUNTA`
--

DROP TABLE IF EXISTS `ENCUESTA_PREGUNTA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ENCUESTA_PREGUNTA` (
  `ID_ENCUESTA` bigint(20) DEFAULT NULL,
  `ID_PREGUNTA` bigint(20) DEFAULT NULL,
  KEY `ENCUESTA_PREGUNTA_FK` (`ID_ENCUESTA`),
  KEY `ENCUESTA_PREGUNTA_FK_1` (`ID_PREGUNTA`),
  CONSTRAINT `ENCUESTA_PREGUNTA_FK` FOREIGN KEY (`ID_ENCUESTA`) REFERENCES `ENCUESTA` (`ID_ENCUESTA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ENCUESTA_PREGUNTA_FK_1` FOREIGN KEY (`ID_PREGUNTA`) REFERENCES `PREGUNTA` (`ID_PREGUNTA`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ENCUESTA_PREGUNTA`
--

LOCK TABLES `ENCUESTA_PREGUNTA` WRITE;
/*!40000 ALTER TABLE `ENCUESTA_PREGUNTA` DISABLE KEYS */;
/*!40000 ALTER TABLE `ENCUESTA_PREGUNTA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PREGUNTA`
--

DROP TABLE IF EXISTS `PREGUNTA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PREGUNTA` (
  `ID_PREGUNTA` bigint(20) NOT NULL AUTO_INCREMENT,
  `PREGUNTA` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_PREGUNTA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PREGUNTA`
--

LOCK TABLES `PREGUNTA` WRITE;
/*!40000 ALTER TABLE `PREGUNTA` DISABLE KEYS */;
/*!40000 ALTER TABLE `PREGUNTA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RESPUESTA`
--

DROP TABLE IF EXISTS `RESPUESTA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RESPUESTA` (
  `ID_RESPUESTA` bigint(20) NOT NULL AUTO_INCREMENT,
  `ID_PREGUNTA` bigint(20) NOT NULL,
  `RESPUESTA` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_RESPUESTA`),
  KEY `RESPUESTA_FK` (`ID_PREGUNTA`),
  CONSTRAINT `RESPUESTA_FK` FOREIGN KEY (`ID_PREGUNTA`) REFERENCES `PREGUNTA` (`ID_PREGUNTA`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RESPUESTA`
--

LOCK TABLES `RESPUESTA` WRITE;
/*!40000 ALTER TABLE `RESPUESTA` DISABLE KEYS */;
/*!40000 ALTER TABLE `RESPUESTA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SESION`
--

DROP TABLE IF EXISTS `SESION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SESION` (
  `ID_SESION` bigint(20) NOT NULL AUTO_INCREMENT,
  `ID_USUARIO` bigint(20) NOT NULL,
  `ID_ENCUESTA` bigint(20) NOT NULL,
  `FECHA` datetime NOT NULL,
  PRIMARY KEY (`ID_SESION`),
  KEY `SESION_FK` (`ID_USUARIO`),
  KEY `SESION_FK_1` (`ID_ENCUESTA`),
  CONSTRAINT `SESION_FK` FOREIGN KEY (`ID_USUARIO`) REFERENCES `USUARIOS` (`ID_USUARIO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `SESION_FK_1` FOREIGN KEY (`ID_ENCUESTA`) REFERENCES `ENCUESTA` (`ID_ENCUESTA`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SESION`
--

LOCK TABLES `SESION` WRITE;
/*!40000 ALTER TABLE `SESION` DISABLE KEYS */;
/*!40000 ALTER TABLE `SESION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SESION_PREGUNTAS`
--

DROP TABLE IF EXISTS `SESION_PREGUNTAS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SESION_PREGUNTAS` (
  `ID_SESION` bigint(20) DEFAULT NULL,
  `ID_PREGUNTA` bigint(20) DEFAULT NULL,
  `ID_RESPUESTA` bigint(20) DEFAULT NULL,
  KEY `SESION_PREGUNTAS_FK` (`ID_SESION`),
  KEY `SESION_PREGUNTAS_FK_1` (`ID_PREGUNTA`),
  KEY `SESION_PREGUNTAS_FK_2` (`ID_RESPUESTA`),
  PRIMARY KEY (`ID_SESION`, `ID_PREGUNTA`),
  CONSTRAINT `SESION_PREGUNTAS_FK` FOREIGN KEY (`ID_SESION`) REFERENCES `SESION` (`ID_SESION`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `SESION_PREGUNTAS_FK_1` FOREIGN KEY (`ID_PREGUNTA`) REFERENCES `PREGUNTA` (`ID_PREGUNTA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `SESION_PREGUNTAS_FK_2` FOREIGN KEY (`ID_RESPUESTA`) REFERENCES `RESPUESTA` (`ID_RESPUESTA`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SESION_PREGUNTAS`
--

LOCK TABLES `SESION_PREGUNTAS` WRITE;
/*!40000 ALTER TABLE `SESION_PREGUNTAS` DISABLE KEYS */;
/*!40000 ALTER TABLE `SESION_PREGUNTAS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `USUARIOS`
--

DROP TABLE IF EXISTS `USUARIOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `USUARIOS` (
  `ID_USUARIO` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOM_USUARIO` varchar(100) NOT NULL,
  `PASSWD` bigint(20) NOT NULL,
  `ADMIN` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID_USUARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `USUARIOS`
--

LOCK TABLES `USUARIOS` WRITE;
/*!40000 ALTER TABLE `USUARIOS` DISABLE KEYS */;
/*!40000 ALTER TABLE `USUARIOS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-07 20:19:31
