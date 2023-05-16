CREATE DATABASE  IF NOT EXISTS `LIS` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `LIS`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: LIS
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `tblCatReligion`
--

DROP TABLE IF EXISTS `tblCatReligion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblCatReligion` (
                                  `idReligion` int NOT NULL AUTO_INCREMENT,
                                  `descripcion` varchar(45) NOT NULL,
                                  PRIMARY KEY (`idReligion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCatReligion`
--

LOCK TABLES `tblCatReligion` WRITE;
/*!40000 ALTER TABLE `tblCatReligion` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblCatReligion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_AreaServLabEmpleados`
--

DROP TABLE IF EXISTS `tbl_AreaServLabEmpleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_AreaServLabEmpleados` (
                                            `IdAreaServLabEmpleados` int NOT NULL,
                                            `IdAreaLabServicio` int DEFAULT NULL,
                                            `IdEmpleado` int NOT NULL,
                                            `IdSucursal` int NOT NULL,
                                            PRIMARY KEY (`IdAreaServLabEmpleados`),
                                            KEY `Reftbl_Empleado411` (`IdEmpleado`),
                                            KEY `Reftbl_cat_AreasLabServicio401` (`IdAreaLabServicio`),
                                            KEY `FK_tbl_AreaServLabEmpleados_tbl_cat_Sucursales` (`IdSucursal`),
                                            CONSTRAINT `FK_tbl_AreaServLabEmpleados_tbl_cat_Sucursales` FOREIGN KEY (`IdSucursal`) REFERENCES `tbl_cat_Sucursales` (`IdSucursal`),
                                            CONSTRAINT `Reftbl_cat_AreasLabServicio401` FOREIGN KEY (`IdAreaLabServicio`) REFERENCES `tbl_cat_AreasLabServicio` (`IdAreaLabServicio`),
                                            CONSTRAINT `Reftbl_Empleado411` FOREIGN KEY (`IdEmpleado`) REFERENCES `tbl_Empleado` (`IdEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_AreaServLabEmpleados`
--

LOCK TABLES `tbl_AreaServLabEmpleados` WRITE;
/*!40000 ALTER TABLE `tbl_AreaServLabEmpleados` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_AreaServLabEmpleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_Empleado`
--

DROP TABLE IF EXISTS `tbl_Empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_Empleado` (
                                `IdEmpleado` int NOT NULL,
                                `IdProfesiones` int NOT NULL,
                                `IdUsuarioCreacion` int DEFAULT NULL,
                                `IdUsuarioEliminacion` int DEFAULT NULL,
                                `IdUsuarioModificacion` int DEFAULT NULL,
                                `FechaCreacion` datetime(6) DEFAULT NULL,
                                `FechaModificacion` datetime(6) DEFAULT NULL,
                                `FechaEliminacion` datetime(6) DEFAULT NULL,
                                `IdMunicipioRes` int NOT NULL,
                                `IdMunicipioNac` int NOT NULL,
                                `IdDepartamentoNac` int NOT NULL,
                                `IdDepartamentoRes` int NOT NULL,
                                `IdPaisNac` int NOT NULL,
                                `IdPaisRes` int NOT NULL,
                                `IdIdentificacion` int NOT NULL,
                                `IdEstadoCivil` int NOT NULL,
                                `IdSexo` int NOT NULL,
                                `IdNacionalidad` int NOT NULL,
                                `NumIdentificacion` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `NumINSS` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `CodMinsa` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `PrimerNombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `SegundoNombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `PrimerApellido` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `SegundoApellido` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `FechaNac` date NOT NULL,
                                `EdadIngreso` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Email` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `DireccionDomiciliar` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `TelefonoDomiciliar` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `TelefonoMovil` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `FechaContrato` date DEFAULT NULL,
                                `UrlFoto` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `Activo` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Estado` int NOT NULL,
                                PRIMARY KEY (`IdEmpleado`),
                                KEY `Reftbl_cat_Nacionalidad91` (`IdNacionalidad`),
                                KEY `Reftbl_cat_Identificacion81` (`IdIdentificacion`),
                                KEY `Reftbl_cat_Sexo61` (`IdSexo`),
                                KEY `Reftbl_cat_Profesiones981` (`IdProfesiones`),
                                KEY `Reftbl_cat_Pais211` (`IdPaisRes`),
                                KEY `Reftbl_cat_Pais221` (`IdPaisNac`),
                                KEY `Reftbl_cat_Departamento231` (`IdDepartamentoRes`),
                                KEY `Reftbl_cat_Departamento241` (`IdDepartamentoNac`),
                                KEY `Reftbl_cat_Municipio251` (`IdMunicipioNac`),
                                KEY `Reftbl_cat_Municipio261` (`IdMunicipioRes`),
                                KEY `Reftbl_cat_EstadoCivil71` (`IdEstadoCivil`),
                                CONSTRAINT `Reftbl_cat_Departamento231` FOREIGN KEY (`IdDepartamentoRes`) REFERENCES `tbl_cat_Departamento` (`IdDepartamento`),
                                CONSTRAINT `Reftbl_cat_Departamento241` FOREIGN KEY (`IdDepartamentoNac`) REFERENCES `tbl_cat_Departamento` (`IdDepartamento`),
                                CONSTRAINT `Reftbl_cat_EstadoCivil71` FOREIGN KEY (`IdEstadoCivil`) REFERENCES `tbl_cat_EstadoCivil` (`IdEstadoCivil`),
                                CONSTRAINT `Reftbl_cat_Identificacion81` FOREIGN KEY (`IdIdentificacion`) REFERENCES `tbl_cat_Identificacion` (`IdIdentificacion`),
                                CONSTRAINT `Reftbl_cat_Municipio251` FOREIGN KEY (`IdMunicipioNac`) REFERENCES `tbl_cat_Municipio` (`IdMunicipio`),
                                CONSTRAINT `Reftbl_cat_Municipio261` FOREIGN KEY (`IdMunicipioRes`) REFERENCES `tbl_cat_Municipio` (`IdMunicipio`),
                                CONSTRAINT `Reftbl_cat_Nacionalidad91` FOREIGN KEY (`IdNacionalidad`) REFERENCES `tbl_cat_Nacionalidad` (`IdNacionalidad`),
                                CONSTRAINT `Reftbl_cat_Pais211` FOREIGN KEY (`IdPaisRes`) REFERENCES `tbl_cat_Pais` (`IdPais`),
                                CONSTRAINT `Reftbl_cat_Pais221` FOREIGN KEY (`IdPaisNac`) REFERENCES `tbl_cat_Pais` (`IdPais`),
                                CONSTRAINT `Reftbl_cat_Profesiones981` FOREIGN KEY (`IdProfesiones`) REFERENCES `tbl_cat_Profesiones` (`IdProfesiones`),
                                CONSTRAINT `Reftbl_cat_Sexo61` FOREIGN KEY (`IdSexo`) REFERENCES `tbl_cat_Sexo` (`IdSexo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_Empleado`
--

LOCK TABLES `tbl_Empleado` WRITE;
/*!40000 ALTER TABLE `tbl_Empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_Empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_Examenes`
--

DROP TABLE IF EXISTS `tbl_Examenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_Examenes` (
                                `IdExamen` int NOT NULL,
                                `IdAreaLabServicio` int NOT NULL,
                                `IdMetodologia` int NOT NULL,
                                `IdCategoriaExamenes` int NOT NULL,
                                `IdTipoMuestra` int NOT NULL,
                                `IdUnidadMedidas` int NOT NULL,
                                `IdTipoResultado` int NOT NULL,
                                `Descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `DescripcionCorta` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `LisCode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `Conteo` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Confidencial` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Calculado` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Estado` int NOT NULL,
                                PRIMARY KEY (`IdExamen`),
                                KEY `Reftbl_cat_TipoMuestra641` (`IdTipoMuestra`),
                                KEY `Reftbl_cat_AreasLabServicio691` (`IdAreaLabServicio`),
                                KEY `Reftbl_cat_Metodologia671` (`IdMetodologia`),
                                KEY `Reftbl_cat_CategoriaExamenes651` (`IdCategoriaExamenes`),
                                KEY `Reftbl_cat_TipoResultado611` (`IdTipoResultado`),
                                KEY `Reftbl_cat_UnidadMedidas631` (`IdUnidadMedidas`),
                                CONSTRAINT `Reftbl_cat_AreasLabServicio691` FOREIGN KEY (`IdAreaLabServicio`) REFERENCES `tbl_cat_AreasLabServicio` (`IdAreaLabServicio`),
                                CONSTRAINT `Reftbl_cat_CategoriaExamenes651` FOREIGN KEY (`IdCategoriaExamenes`) REFERENCES `tbl_cat_CategoriaExamenes` (`IdCategoriaExamenes`),
                                CONSTRAINT `Reftbl_cat_Metodologia671` FOREIGN KEY (`IdMetodologia`) REFERENCES `tbl_cat_Metodologia` (`IdMetodologia`),
                                CONSTRAINT `Reftbl_cat_TipoMuestra641` FOREIGN KEY (`IdTipoMuestra`) REFERENCES `tbl_cat_TipoMuestra` (`IdTipoMuestra`),
                                CONSTRAINT `Reftbl_cat_TipoResultado611` FOREIGN KEY (`IdTipoResultado`) REFERENCES `tbl_cat_TipoResultado` (`IdTipoResultado`),
                                CONSTRAINT `Reftbl_cat_UnidadMedidas631` FOREIGN KEY (`IdUnidadMedidas`) REFERENCES `tbl_cat_UnidadMedidas` (`IdUnidadMedidas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_Examenes`
--

LOCK TABLES `tbl_Examenes` WRITE;
/*!40000 ALTER TABLE `tbl_Examenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_Examenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_Ordenes`
--

DROP TABLE IF EXISTS `tbl_Ordenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_Ordenes` (
                               `IdOrden` int NOT NULL,
                               `N_Orden` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                               `IdEmpleado` int NOT NULL,
                               `IdPaciente` int NOT NULL,
                               `IdTipoServicio` int NOT NULL,
                               `IdTipoOrden` int NOT NULL,
                               `Asistencia` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                               `Observaciones` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                               `FechaOrden` date NOT NULL,
                               `Activo` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                               `FechaImprime` datetime(6) DEFAULT NULL,
                               `IdUsuarioImprime` int DEFAULT NULL,
                               `Estado` int NOT NULL,
                               `Finalizado` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                               `FechaCita` date DEFAULT NULL,
                               `FechaPReporte` datetime(6) NOT NULL,
                               PRIMARY KEY (`IdOrden`),
                               KEY `FK_tbl_Ordenes_tbl_Empleado` (`IdEmpleado`),
                               KEY `FK_tbl_Ordenes_tbl_Paciente` (`IdPaciente`),
                               KEY `FK_tbl_Ordenes_tbl_cat_TipoServicio` (`IdTipoServicio`),
                               KEY `FK_tbl_Ordenes_tbl_cat_TipoOrden` (`IdTipoOrden`),
                               KEY `FK_tbl_Ordenes_tbl_Usuarios` (`IdUsuarioImprime`),
                               CONSTRAINT `FK_tbl_Ordenes_tbl_cat_TipoOrden` FOREIGN KEY (`IdTipoOrden`) REFERENCES `tbl_cat_TipoOrden` (`IdTipoOrden`),
                               CONSTRAINT `FK_tbl_Ordenes_tbl_cat_TipoServicio` FOREIGN KEY (`IdTipoServicio`) REFERENCES `tbl_cat_TipoServicio` (`IdTipoServicio`),
                               CONSTRAINT `FK_tbl_Ordenes_tbl_Empleado` FOREIGN KEY (`IdEmpleado`) REFERENCES `tbl_Empleado` (`IdEmpleado`),
                               CONSTRAINT `FK_tbl_Ordenes_tbl_Paciente` FOREIGN KEY (`IdPaciente`) REFERENCES `tbl_Paciente` (`IdPaciente`),
                               CONSTRAINT `FK_tbl_Ordenes_tbl_Usuarios` FOREIGN KEY (`IdUsuarioImprime`) REFERENCES `tbl_Usuarios` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_Ordenes`
--

LOCK TABLES `tbl_Ordenes` WRITE;
/*!40000 ALTER TABLE `tbl_Ordenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_Ordenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_OrdenesDetalle`
--

DROP TABLE IF EXISTS `tbl_OrdenesDetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_OrdenesDetalle` (
                                      `IdOrdenDetalle` int NOT NULL,
                                      `IdOrden` int NOT NULL,
                                      `N_Orden` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                      `IdExamen` int NOT NULL,
                                      `Activo` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                      PRIMARY KEY (`IdOrdenDetalle`),
                                      KEY `FK_tbl_OrdenesDetalle_tbl_Ordenes` (`IdOrden`),
                                      KEY `FK_tbl_OrdenesDetalle_tbl_Examenes` (`IdExamen`),
                                      CONSTRAINT `FK_tbl_OrdenesDetalle_tbl_Examenes` FOREIGN KEY (`IdExamen`) REFERENCES `tbl_Examenes` (`IdExamen`),
                                      CONSTRAINT `FK_tbl_OrdenesDetalle_tbl_Ordenes` FOREIGN KEY (`IdOrden`) REFERENCES `tbl_Ordenes` (`IdOrden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_OrdenesDetalle`
--

LOCK TABLES `tbl_OrdenesDetalle` WRITE;
/*!40000 ALTER TABLE `tbl_OrdenesDetalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_OrdenesDetalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_Paciente`
--

DROP TABLE IF EXISTS `tbl_Paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_Paciente` (
                                `IdPaciente` int NOT NULL,
                                `IdIdentificacion` int NOT NULL,
                                `NumIdentificacion` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `NumExpediente` int NOT NULL,
                                `NumINSS` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `IdEstadoCivil` int NOT NULL,
                                `Email` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `IdSexo` int NOT NULL,
                                `IdNacionalidad` int NOT NULL,
                                `IdPaisNac` int NOT NULL,
                                `IdDepartamentoNac` int NOT NULL,
                                `IdMunicipioNac` int NOT NULL,
                                `IdPaisRes` int NOT NULL,
                                `IdDepartamentoRes` int NOT NULL,
                                `IdMunicipioRes` int NOT NULL,
                                `IdTipoSangre` int NOT NULL,
                                `IdProfesiones` int NOT NULL,
                                `idReligion` int NOT NULL,
                                `PrimerNombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `SegundoNombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `PrimerApellido` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `SegundoApellido` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `FechaNac` date NOT NULL,
                                `DireccionDomiciliar` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `TelefonoDomiciliar` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `TelefonoMovil` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `Activo` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Emabrazada` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `Fallecido` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                `Estado` int NOT NULL,
                                PRIMARY KEY (`IdPaciente`),
                                KEY `Reftbl_cat_Pais821` (`IdPaisNac`),
                                KEY `Reftbl_cat_Pais831` (`IdPaisRes`),
                                KEY `Reftbl_cat_Departamento841` (`IdDepartamentoNac`),
                                KEY `Reftbl_cat_Departamento851` (`IdDepartamentoRes`),
                                KEY `Reftbl_cat_Municipio871` (`IdMunicipioRes`),
                                KEY `Reftbl_cat_Nacionalidad801` (`IdNacionalidad`),
                                KEY `Reftbl_cat_Municipio861` (`IdMunicipioNac`),
                                KEY `Reftbl_cat_EstadoCivil881` (`IdEstadoCivil`),
                                KEY `Reftbl_cat_Identificacion791` (`IdIdentificacion`),
                                KEY `Reftbl_cat_Sexo811` (`IdSexo`),
                                KEY `Reftbl_cat_TipoSangre1041` (`IdTipoSangre`),
                                KEY `Reftbl_cat_Profesiones901` (`IdProfesiones`),
                                KEY `paciente_religion_idx` (`idReligion`),
                                CONSTRAINT `paciente_religion` FOREIGN KEY (`idReligion`) REFERENCES `tblCatReligion` (`idReligion`) ON DELETE CASCADE ON UPDATE CASCADE,
                                CONSTRAINT `Reftbl_cat_Departamento841` FOREIGN KEY (`IdDepartamentoNac`) REFERENCES `tbl_cat_Departamento` (`IdDepartamento`),
                                CONSTRAINT `Reftbl_cat_Departamento851` FOREIGN KEY (`IdDepartamentoRes`) REFERENCES `tbl_cat_Departamento` (`IdDepartamento`),
                                CONSTRAINT `Reftbl_cat_EstadoCivil881` FOREIGN KEY (`IdEstadoCivil`) REFERENCES `tbl_cat_EstadoCivil` (`IdEstadoCivil`),
                                CONSTRAINT `Reftbl_cat_Identificacion791` FOREIGN KEY (`IdIdentificacion`) REFERENCES `tbl_cat_Identificacion` (`IdIdentificacion`),
                                CONSTRAINT `Reftbl_cat_Municipio861` FOREIGN KEY (`IdMunicipioNac`) REFERENCES `tbl_cat_Municipio` (`IdMunicipio`),
                                CONSTRAINT `Reftbl_cat_Municipio871` FOREIGN KEY (`IdMunicipioRes`) REFERENCES `tbl_cat_Municipio` (`IdMunicipio`),
                                CONSTRAINT `Reftbl_cat_Nacionalidad801` FOREIGN KEY (`IdNacionalidad`) REFERENCES `tbl_cat_Nacionalidad` (`IdNacionalidad`),
                                CONSTRAINT `Reftbl_cat_Pais821` FOREIGN KEY (`IdPaisNac`) REFERENCES `tbl_cat_Pais` (`IdPais`),
                                CONSTRAINT `Reftbl_cat_Pais831` FOREIGN KEY (`IdPaisRes`) REFERENCES `tbl_cat_Pais` (`IdPais`),
                                CONSTRAINT `Reftbl_cat_Profesiones901` FOREIGN KEY (`IdProfesiones`) REFERENCES `tbl_cat_Profesiones` (`IdProfesiones`),
                                CONSTRAINT `Reftbl_cat_Sexo811` FOREIGN KEY (`IdSexo`) REFERENCES `tbl_cat_Sexo` (`IdSexo`),
                                CONSTRAINT `Reftbl_cat_TipoSangre1041` FOREIGN KEY (`IdTipoSangre`) REFERENCES `tbl_cat_TipoSangre` (`IdTipoSangre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_Paciente`
--

LOCK TABLES `tbl_Paciente` WRITE;
/*!40000 ALTER TABLE `tbl_Paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_Paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_Resultados`
--

DROP TABLE IF EXISTS `tbl_Resultados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_Resultados` (
                                  `IdResultados` int NOT NULL,
                                  `IdExamen` int DEFAULT NULL,
                                  `IdOrden` int NOT NULL,
                                  `Resultado` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                  `Observaciones` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                  `Procesado` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                  `FechaProcesa` datetime(6) DEFAULT NULL,
                                  `IdUsuarioProcesa` int DEFAULT NULL,
                                  `Validado` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                  `FechaValida` datetime(6) DEFAULT NULL,
                                  `IdUsuarioValida` int DEFAULT NULL,
                                  `Impreso` int DEFAULT NULL,
                                  `FechaImprime` datetime(6) DEFAULT NULL,
                                  `IdUsuarioImprime` int DEFAULT NULL,
                                  `Estado` int NOT NULL,
                                  PRIMARY KEY (`IdResultados`),
                                  KEY `FK_tbl_Resultados_tbl_Examenes` (`IdExamen`),
                                  KEY `FK_tbl_Resultados_tbl_Usuarios` (`IdUsuarioValida`),
                                  KEY `FK_tbl_Resultados_tbl_Usuarios1` (`IdUsuarioProcesa`),
                                  KEY `FK_tbl_Resultados_tbl_Usuarios2` (`IdUsuarioImprime`),
                                  KEY `FK_tbl_Resultados_tbl_Ordenes` (`IdOrden`),
                                  CONSTRAINT `FK_tbl_Resultados_tbl_Examenes` FOREIGN KEY (`IdExamen`) REFERENCES `tbl_Examenes` (`IdExamen`),
                                  CONSTRAINT `FK_tbl_Resultados_tbl_Ordenes` FOREIGN KEY (`IdOrden`) REFERENCES `tbl_Ordenes` (`IdOrden`),
                                  CONSTRAINT `FK_tbl_Resultados_tbl_Usuarios` FOREIGN KEY (`IdUsuarioValida`) REFERENCES `tbl_Usuarios` (`IdUsuario`),
                                  CONSTRAINT `FK_tbl_Resultados_tbl_Usuarios1` FOREIGN KEY (`IdUsuarioProcesa`) REFERENCES `tbl_Usuarios` (`IdUsuario`),
                                  CONSTRAINT `FK_tbl_Resultados_tbl_Usuarios2` FOREIGN KEY (`IdUsuarioImprime`) REFERENCES `tbl_Usuarios` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_Resultados`
--

LOCK TABLES `tbl_Resultados` WRITE;
/*!40000 ALTER TABLE `tbl_Resultados` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_Resultados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_RolOpciones`
--

DROP TABLE IF EXISTS `tbl_RolOpciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_RolOpciones` (
                                   `IdRolOpciones` int NOT NULL,
                                   `IdOpciones` int NOT NULL,
                                   `IdRol` int NOT NULL,
                                   PRIMARY KEY (`IdRolOpciones`),
                                   KEY `Reftbl_cat_Rol461` (`IdRol`),
                                   KEY `Reftbl_cat_Opciones471` (`IdOpciones`),
                                   CONSTRAINT `Reftbl_cat_Opciones471` FOREIGN KEY (`IdOpciones`) REFERENCES `tbl_cat_Opciones` (`IdOpciones`),
                                   CONSTRAINT `Reftbl_cat_Rol461` FOREIGN KEY (`IdRol`) REFERENCES `tbl_cat_Rol` (`IdRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_RolOpciones`
--

LOCK TABLES `tbl_RolOpciones` WRITE;
/*!40000 ALTER TABLE `tbl_RolOpciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_RolOpciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_UsuarioRol`
--

DROP TABLE IF EXISTS `tbl_UsuarioRol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_UsuarioRol` (
                                  `IdUsuarioRol` int NOT NULL,
                                  `IdUsuario` int NOT NULL,
                                  `IdRol` int NOT NULL,
                                  PRIMARY KEY (`IdUsuarioRol`),
                                  KEY `Reftbl_cat_Rol441` (`IdRol`),
                                  KEY `Reftbl_Usuarios451` (`IdUsuario`),
                                  CONSTRAINT `Reftbl_cat_Rol441` FOREIGN KEY (`IdRol`) REFERENCES `tbl_cat_Rol` (`IdRol`),
                                  CONSTRAINT `Reftbl_Usuarios451` FOREIGN KEY (`IdUsuario`) REFERENCES `tbl_Usuarios` (`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_UsuarioRol`
--

LOCK TABLES `tbl_UsuarioRol` WRITE;
/*!40000 ALTER TABLE `tbl_UsuarioRol` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_UsuarioRol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_Usuarios`
--

DROP TABLE IF EXISTS `tbl_Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_Usuarios` (
                                `IdUsuario` int NOT NULL,
                                `IdEmpleado` int DEFAULT NULL,
                                `Login` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Pwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Activo` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Estado` int NOT NULL,
                                `IdUsuarioCreacion` int DEFAULT NULL,
                                `IdUsuarioModificacion` int DEFAULT NULL,
                                `IdUsuarioEliminacion` int DEFAULT NULL,
                                `FechaCreacion` date DEFAULT NULL,
                                `FechaModificacion` date DEFAULT NULL,
                                `FechaEliminacion` date DEFAULT NULL,
                                PRIMARY KEY (`IdUsuario`),
                                KEY `Reftbl_Empleado421` (`IdEmpleado`),
                                CONSTRAINT `Reftbl_Empleado421` FOREIGN KEY (`IdEmpleado`) REFERENCES `tbl_Empleado` (`IdEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_Usuarios`
--

LOCK TABLES `tbl_Usuarios` WRITE;
/*!40000 ALTER TABLE `tbl_Usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_AreasLabServicio`
--

DROP TABLE IF EXISTS `tbl_cat_AreasLabServicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_AreasLabServicio` (
                                            `IdAreaLabServicio` int NOT NULL,
                                            `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                            `Estado` int NOT NULL,
                                            PRIMARY KEY (`IdAreaLabServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_AreasLabServicio`
--

LOCK TABLES `tbl_cat_AreasLabServicio` WRITE;
/*!40000 ALTER TABLE `tbl_cat_AreasLabServicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_AreasLabServicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_AreasServ`
--

DROP TABLE IF EXISTS `tbl_cat_AreasServ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_AreasServ` (
                                     `IdAreaServ` int NOT NULL,
                                     `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                     `DescripcionCorta` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                     `Prioridad` int DEFAULT NULL,
                                     `Estado` int NOT NULL,
                                     PRIMARY KEY (`IdAreaServ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_AreasServ`
--

LOCK TABLES `tbl_cat_AreasServ` WRITE;
/*!40000 ALTER TABLE `tbl_cat_AreasServ` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_AreasServ` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_CategoriaExamenes`
--

DROP TABLE IF EXISTS `tbl_cat_CategoriaExamenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_CategoriaExamenes` (
                                             `IdCategoriaExamenes` int NOT NULL,
                                             `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                             `Estado` int NOT NULL,
                                             PRIMARY KEY (`IdCategoriaExamenes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_CategoriaExamenes`
--

LOCK TABLES `tbl_cat_CategoriaExamenes` WRITE;
/*!40000 ALTER TABLE `tbl_cat_CategoriaExamenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_CategoriaExamenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Departamento`
--

DROP TABLE IF EXISTS `tbl_cat_Departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Departamento` (
                                        `IdDepartamento` int NOT NULL,
                                        `IdPais` int NOT NULL,
                                        `Descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                        `Estado` int NOT NULL,
                                        PRIMARY KEY (`IdDepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Departamento`
--

LOCK TABLES `tbl_cat_Departamento` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Departamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Especialidades`
--

DROP TABLE IF EXISTS `tbl_cat_Especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Especialidades` (
                                          `IdEspecialidades` datetime(6) NOT NULL,
                                          `IdEmpleado` int NOT NULL,
                                          `IdProfesiones` int NOT NULL,
                                          `Descripcion` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                          PRIMARY KEY (`IdEspecialidades`),
                                          KEY `Reftbl_Empleado1011` (`IdEmpleado`),
                                          KEY `Reftbl_cat_Profesiones1001` (`IdProfesiones`),
                                          CONSTRAINT `Reftbl_cat_Profesiones1001` FOREIGN KEY (`IdProfesiones`) REFERENCES `tbl_cat_Profesiones` (`IdProfesiones`),
                                          CONSTRAINT `Reftbl_Empleado1011` FOREIGN KEY (`IdEmpleado`) REFERENCES `tbl_Empleado` (`IdEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Especialidades`
--

LOCK TABLES `tbl_cat_Especialidades` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Especialidades` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_EstadoCivil`
--

DROP TABLE IF EXISTS `tbl_cat_EstadoCivil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_EstadoCivil` (
                                       `IdEstadoCivil` int NOT NULL,
                                       `Descripcion` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                       `Estado` int NOT NULL,
                                       PRIMARY KEY (`IdEstadoCivil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_EstadoCivil`
--

LOCK TABLES `tbl_cat_EstadoCivil` WRITE;
/*!40000 ALTER TABLE `tbl_cat_EstadoCivil` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_EstadoCivil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Hospital`
--

DROP TABLE IF EXISTS `tbl_cat_Hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Hospital` (
                                    `IdHospital` int NOT NULL,
                                    `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                    `Estado` int NOT NULL,
                                    PRIMARY KEY (`IdHospital`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Hospital`
--

LOCK TABLES `tbl_cat_Hospital` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Hospital` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Identificacion`
--

DROP TABLE IF EXISTS `tbl_cat_Identificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Identificacion` (
                                          `IdIdentificacion` int NOT NULL,
                                          `IdNacionalidad` int NOT NULL,
                                          `Descripcion` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                          `Estado` int NOT NULL,
                                          PRIMARY KEY (`IdIdentificacion`),
                                          KEY `FK_tbl_cat_Identificacion_tbl_cat_Nacionalidad` (`IdNacionalidad`),
                                          CONSTRAINT `FK_tbl_cat_Identificacion_tbl_cat_Nacionalidad` FOREIGN KEY (`IdNacionalidad`) REFERENCES `tbl_cat_Nacionalidad` (`IdNacionalidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Identificacion`
--

LOCK TABLES `tbl_cat_Identificacion` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Identificacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Identificacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_IndicacionExaPaciente`
--

DROP TABLE IF EXISTS `tbl_cat_IndicacionExaPaciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_IndicacionExaPaciente` (
                                                 `IdIndicacionExaPaciente` int NOT NULL,
                                                 `IdExamen` int NOT NULL,
                                                 `Indicacion` varchar(1200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                                 PRIMARY KEY (`IdIndicacionExaPaciente`),
                                                 KEY `Reftbl_Examenes741` (`IdExamen`),
                                                 CONSTRAINT `Reftbl_Examenes741` FOREIGN KEY (`IdExamen`) REFERENCES `tbl_Examenes` (`IdExamen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_IndicacionExaPaciente`
--

LOCK TABLES `tbl_cat_IndicacionExaPaciente` WRITE;
/*!40000 ALTER TABLE `tbl_cat_IndicacionExaPaciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_IndicacionExaPaciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Metodologia`
--

DROP TABLE IF EXISTS `tbl_cat_Metodologia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Metodologia` (
                                       `IdMetodologia` int NOT NULL,
                                       `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                       `Estado` int NOT NULL,
                                       PRIMARY KEY (`IdMetodologia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Metodologia`
--

LOCK TABLES `tbl_cat_Metodologia` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Metodologia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Metodologia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Municipio`
--

DROP TABLE IF EXISTS `tbl_cat_Municipio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Municipio` (
                                     `IdMunicipio` int NOT NULL,
                                     `IdDepartamento` int NOT NULL,
                                     `Descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                     `Estado` int NOT NULL,
                                     PRIMARY KEY (`IdMunicipio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Municipio`
--

LOCK TABLES `tbl_cat_Municipio` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Municipio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Municipio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Nacionalidad`
--

DROP TABLE IF EXISTS `tbl_cat_Nacionalidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Nacionalidad` (
                                        `IdNacionalidad` int NOT NULL,
                                        `Descripcion` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                        PRIMARY KEY (`IdNacionalidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Nacionalidad`
--

LOCK TABLES `tbl_cat_Nacionalidad` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Nacionalidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Nacionalidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Ocupaciones`
--

DROP TABLE IF EXISTS `tbl_cat_Ocupaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Ocupaciones` (
                                       `IdOcupaciones` int NOT NULL,
                                       `IdEmpleado` int NOT NULL,
                                       `IdProfesiones` int NOT NULL,
                                       `Descripcion` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                       PRIMARY KEY (`IdOcupaciones`),
                                       KEY `Reftbl_cat_Profesiones1021` (`IdProfesiones`),
                                       KEY `Reftbl_Empleado1031` (`IdEmpleado`),
                                       CONSTRAINT `Reftbl_cat_Profesiones1021` FOREIGN KEY (`IdProfesiones`) REFERENCES `tbl_cat_Profesiones` (`IdProfesiones`),
                                       CONSTRAINT `Reftbl_Empleado1031` FOREIGN KEY (`IdEmpleado`) REFERENCES `tbl_Empleado` (`IdEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Ocupaciones`
--

LOCK TABLES `tbl_cat_Ocupaciones` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Ocupaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Ocupaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Opciones`
--

DROP TABLE IF EXISTS `tbl_cat_Opciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Opciones` (
                                    `IdOpciones` int NOT NULL,
                                    `Descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                    `Url` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                    PRIMARY KEY (`IdOpciones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Opciones`
--

LOCK TABLES `tbl_cat_Opciones` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Opciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Opciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Pais`
--

DROP TABLE IF EXISTS `tbl_cat_Pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Pais` (
                                `IdPais` int NOT NULL,
                                `Descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                `Estado` int NOT NULL,
                                PRIMARY KEY (`IdPais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Pais`
--

LOCK TABLES `tbl_cat_Pais` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Pais` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Perfiles`
--

DROP TABLE IF EXISTS `tbl_cat_Perfiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Perfiles` (
                                    `IdPerfiles` int NOT NULL,
                                    `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                    `Estado` int NOT NULL,
                                    PRIMARY KEY (`IdPerfiles`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Perfiles`
--

LOCK TABLES `tbl_cat_Perfiles` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Perfiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Perfiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_PerfilesExamenes`
--

DROP TABLE IF EXISTS `tbl_cat_PerfilesExamenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_PerfilesExamenes` (
                                            `IdPerfilesExamenes` int NOT NULL,
                                            `IdExamen` int NOT NULL,
                                            `IdPerfiles` int NOT NULL,
                                            PRIMARY KEY (`IdPerfilesExamenes`),
                                            KEY `Reftbl_Examenes771` (`IdExamen`),
                                            KEY `Reftbl_cat_Perfiles481` (`IdPerfiles`),
                                            CONSTRAINT `Reftbl_cat_Perfiles481` FOREIGN KEY (`IdPerfiles`) REFERENCES `tbl_cat_Perfiles` (`IdPerfiles`),
                                            CONSTRAINT `Reftbl_Examenes771` FOREIGN KEY (`IdExamen`) REFERENCES `tbl_Examenes` (`IdExamen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_PerfilesExamenes`
--

LOCK TABLES `tbl_cat_PerfilesExamenes` WRITE;
/*!40000 ALTER TABLE `tbl_cat_PerfilesExamenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_PerfilesExamenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Profesiones`
--

DROP TABLE IF EXISTS `tbl_cat_Profesiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Profesiones` (
                                       `IdProfesiones` int NOT NULL,
                                       `Descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                       `Estado` int NOT NULL,
                                       PRIMARY KEY (`IdProfesiones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Profesiones`
--

LOCK TABLES `tbl_cat_Profesiones` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Profesiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Profesiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Rol`
--

DROP TABLE IF EXISTS `tbl_cat_Rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Rol` (
                               `IdRol` int NOT NULL,
                               `Descripcion` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                               `Estado` int NOT NULL,
                               PRIMARY KEY (`IdRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Rol`
--

LOCK TABLES `tbl_cat_Rol` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Sexo`
--

DROP TABLE IF EXISTS `tbl_cat_Sexo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Sexo` (
                                `IdSexo` int NOT NULL,
                                `Descripcion` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                PRIMARY KEY (`IdSexo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Sexo`
--

LOCK TABLES `tbl_cat_Sexo` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Sexo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Sexo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_Sucursales`
--

DROP TABLE IF EXISTS `tbl_cat_Sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_Sucursales` (
                                      `IdSucursal` int NOT NULL,
                                      `IdHospital` int NOT NULL,
                                      `IdMunicipio` int NOT NULL,
                                      `IdDepartamento` int NOT NULL,
                                      `IdPais` int NOT NULL,
                                      `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                      `Direccion` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                      `Telefono` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                      `UrlLogo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                      `Estado` int NOT NULL,
                                      PRIMARY KEY (`IdSucursal`),
                                      KEY `Reftbl_cat_Pais371` (`IdPais`),
                                      KEY `Reftbl_cat_Departamento381` (`IdDepartamento`),
                                      KEY `Reftbl_cat_Municipio391` (`IdMunicipio`),
                                      KEY `FK_tbl_cat_Sucursales_tbl_cat_Hospital` (`IdHospital`),
                                      CONSTRAINT `FK_tbl_cat_Sucursales_tbl_cat_Hospital` FOREIGN KEY (`IdHospital`) REFERENCES `tbl_cat_Hospital` (`IdHospital`),
                                      CONSTRAINT `Reftbl_cat_Departamento381` FOREIGN KEY (`IdDepartamento`) REFERENCES `tbl_cat_Departamento` (`IdDepartamento`),
                                      CONSTRAINT `Reftbl_cat_Municipio391` FOREIGN KEY (`IdMunicipio`) REFERENCES `tbl_cat_Municipio` (`IdMunicipio`),
                                      CONSTRAINT `Reftbl_cat_Pais371` FOREIGN KEY (`IdPais`) REFERENCES `tbl_cat_Pais` (`IdPais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_Sucursales`
--

LOCK TABLES `tbl_cat_Sucursales` WRITE;
/*!40000 ALTER TABLE `tbl_cat_Sucursales` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_Sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_TipoMuestra`
--

DROP TABLE IF EXISTS `tbl_cat_TipoMuestra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_TipoMuestra` (
                                       `IdTipoMuestra` int NOT NULL,
                                       `Descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                       `Estado` int NOT NULL,
                                       PRIMARY KEY (`IdTipoMuestra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_TipoMuestra`
--

LOCK TABLES `tbl_cat_TipoMuestra` WRITE;
/*!40000 ALTER TABLE `tbl_cat_TipoMuestra` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_TipoMuestra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_TipoOrden`
--

DROP TABLE IF EXISTS `tbl_cat_TipoOrden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_TipoOrden` (
                                     `IdTipoOrden` int NOT NULL,
                                     `Descripcion` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                                     PRIMARY KEY (`IdTipoOrden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_TipoOrden`
--

LOCK TABLES `tbl_cat_TipoOrden` WRITE;
/*!40000 ALTER TABLE `tbl_cat_TipoOrden` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_TipoOrden` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_TipoResultado`
--

DROP TABLE IF EXISTS `tbl_cat_TipoResultado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_TipoResultado` (
                                         `IdTipoResultado` int NOT NULL,
                                         `Descripcion` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                         PRIMARY KEY (`IdTipoResultado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_TipoResultado`
--

LOCK TABLES `tbl_cat_TipoResultado` WRITE;
/*!40000 ALTER TABLE `tbl_cat_TipoResultado` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_TipoResultado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_TipoSangre`
--

DROP TABLE IF EXISTS `tbl_cat_TipoSangre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_TipoSangre` (
                                      `IdTipoSangre` int NOT NULL,
                                      `Descripcion` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                      PRIMARY KEY (`IdTipoSangre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_TipoSangre`
--

LOCK TABLES `tbl_cat_TipoSangre` WRITE;
/*!40000 ALTER TABLE `tbl_cat_TipoSangre` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_TipoSangre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_TipoServicio`
--

DROP TABLE IF EXISTS `tbl_cat_TipoServicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_TipoServicio` (
                                        `IdTipoServicio` int NOT NULL,
                                        `Descripcion` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                        PRIMARY KEY (`IdTipoServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_TipoServicio`
--

LOCK TABLES `tbl_cat_TipoServicio` WRITE;
/*!40000 ALTER TABLE `tbl_cat_TipoServicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_TipoServicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_UnidadMedidas`
--

DROP TABLE IF EXISTS `tbl_cat_UnidadMedidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_UnidadMedidas` (
                                         `IdUnidadMedidas` int NOT NULL,
                                         `UnidadMedida` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                                         `Estado` int DEFAULT NULL,
                                         PRIMARY KEY (`IdUnidadMedidas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_UnidadMedidas`
--

LOCK TABLES `tbl_cat_UnidadMedidas` WRITE;
/*!40000 ALTER TABLE `tbl_cat_UnidadMedidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_UnidadMedidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cat_ValoresNormales`
--

DROP TABLE IF EXISTS `tbl_cat_ValoresNormales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cat_ValoresNormales` (
                                           `IdValoresNormales` int NOT NULL,
                                           `IdExamen` int NOT NULL,
                                           `IdSexo` int NOT NULL,
                                           `RangoAlto` double NOT NULL,
                                           `RangoBajo` double NOT NULL,
                                           `Estado` int NOT NULL,
                                           PRIMARY KEY (`IdValoresNormales`),
                                           KEY `Reftbl_cat_Sexo711` (`IdSexo`),
                                           KEY `Reftbl_Examenes701` (`IdExamen`),
                                           CONSTRAINT `Reftbl_cat_Sexo711` FOREIGN KEY (`IdSexo`) REFERENCES `tbl_cat_Sexo` (`IdSexo`),
                                           CONSTRAINT `Reftbl_Examenes701` FOREIGN KEY (`IdExamen`) REFERENCES `tbl_Examenes` (`IdExamen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cat_ValoresNormales`
--

LOCK TABLES `tbl_cat_ValoresNormales` WRITE;
/*!40000 ALTER TABLE `tbl_cat_ValoresNormales` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cat_ValoresNormales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'LIS'
--

--
-- Dumping routines for database 'LIS'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-07 11:24:37
