/*
SQLyog Ultimate v8.82 
MySQL - 5.5.8-log : Database - select_rh
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`select_rh` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `select_rh`;

/*Table structure for table `candidato` */

DROP TABLE IF EXISTS `candidato`;

CREATE TABLE `candidato` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  `rg` varchar(9) NOT NULL,
  `profissao` varchar(50) NOT NULL,
  `area_profissional` varchar(30) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `candidato` */

/*Table structure for table `email` */

DROP TABLE IF EXISTS `email`;

CREATE TABLE `email` (
  `email_pessoal` varchar(50) NOT NULL,
  `email_comercial` varchar(50) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  CONSTRAINT `FK_email` FOREIGN KEY (`cpf`) REFERENCES `candidato` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `email` */

/*Table structure for table `endereco` */

DROP TABLE IF EXISTS `endereco`;

CREATE TABLE `endereco` (
  `rua` varchar(20) NOT NULL,
  `numero` int(4) NOT NULL,
  `bairro` varchar(20) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  CONSTRAINT `FK_endereco` FOREIGN KEY (`cpf`) REFERENCES `candidato` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `endereco` */

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `login` varchar(10) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `nivel_acesso` int(1) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  CONSTRAINT `FK_login` FOREIGN KEY (`cpf`) REFERENCES `candidato` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

/*Table structure for table `telefone` */

DROP TABLE IF EXISTS `telefone`;

CREATE TABLE `telefone` (
  `telefone_pessoal` varchar(13) NOT NULL,
  `telefone_comercial` varchar(13) NOT NULL,
  `telefone_movel` varchar(13) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  CONSTRAINT `FK_telefone` FOREIGN KEY (`cpf`) REFERENCES `candidato` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `telefone` */

/*Table structure for table `vagas` */

DROP TABLE IF EXISTS `vagas`;

CREATE TABLE `vagas` (
  `cargo` varchar(30) NOT NULL,
  `salario_min` double NOT NULL,
  `salario_max` double NOT NULL,
  `numero_vagas` int(11) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `codigo_vaga` int(20) NOT NULL,
  PRIMARY KEY (`codigo_vaga`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vagas` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
