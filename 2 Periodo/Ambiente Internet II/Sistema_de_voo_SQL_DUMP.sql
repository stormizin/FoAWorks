/*
SQLyog Ultimate v8.82 
MySQL - 5.5.16 : Database - db_voo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_voo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_voo`;

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `cpf` varchar(16) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clientes` */

/*Table structure for table `companhia_aerea` */

DROP TABLE IF EXISTS `companhia_aerea`;

CREATE TABLE `companhia_aerea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(3) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `email` varchar(30) NOT NULL,
  `site` varchar(50) NOT NULL,
  `cnpj` varchar(19) NOT NULL,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `companhia_aerea` */

/*Table structure for table `data_voo` */

DROP TABLE IF EXISTS `data_voo`;

CREATE TABLE `data_voo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dataa` varchar(15) NOT NULL,
  `horario` time NOT NULL,
  `origem` varchar(50) NOT NULL,
  `destino` varchar(50) NOT NULL,
  `n_vagas` int(11) NOT NULL,
  `vagas_disp` int(11) NOT NULL,
  `idCompanhia` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_data_voo` (`idCompanhia`),
  CONSTRAINT `FK_data_voo` FOREIGN KEY (`idCompanhia`) REFERENCES `companhia_aerea` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data_voo` */

/*Table structure for table `reservas` */

DROP TABLE IF EXISTS `reservas`;

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `n_voo` int(11) NOT NULL,
  `dt_reserva` date NOT NULL,
  `dt_programacao` varchar(10) NOT NULL,
  `nomeCliente` varchar(50) NOT NULL,
  `cpf` varchar(16) NOT NULL,
  `n_reservas` int(11) NOT NULL,
  `cid_origem` varchar(50) NOT NULL,
  `cid_dest` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_reservas` (`n_voo`),
  CONSTRAINT `FK_reservas` FOREIGN KEY (`n_voo`) REFERENCES `data_voo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `reservas` */

insert  into `reservas`(`id`,`n_voo`,`dt_reserva`,`dt_programacao`,`nomeCliente`,`cpf`,`n_reservas`,`cid_origem`,`cid_dest`) values (1,1,'2012-06-04','11/12/1990','Rodrigo Medeiros','121.130.707-74',0,'Volta Redonda','Rio de Janeiro');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(10) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `nome` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`id`,`login`,`senha`,`nome`) values (1,'storm','123','Rodrigo'),(2,'admin','admin','admin'),(3,'teste','123','Guest');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
