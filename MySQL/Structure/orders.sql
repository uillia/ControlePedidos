-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: market
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `idOrder` int NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `registerDate` date DEFAULT NULL,
  `prevDeliveryDate` date DEFAULT NULL,
  `initialPrice` decimal(10,2) DEFAULT NULL,
  `finalPrice` decimal(10,2) DEFAULT NULL,
  `comments` varchar(200) DEFAULT NULL,
  `idEmployee` int NOT NULL,
  `prevDays` int DEFAULT NULL,
  `idSupplierEmployee` int NOT NULL,
  `idStatusOrder` int DEFAULT NULL,
  PRIMARY KEY (`idOrder`),
  KEY `idEmployee` (`idEmployee`),
  KEY `idSupplierEmployee` (`idSupplierEmployee`),
  KEY `idStatusOrder` (`idStatusOrder`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`idEmployee`) REFERENCES `employees` (`idEmployee`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`idSupplierEmployee`) REFERENCES `supplierperson` (`idSupplierPerson`),
  CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`idStatusOrder`) REFERENCES `statusorder` (`idStatusOrder`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-01  0:56:43
