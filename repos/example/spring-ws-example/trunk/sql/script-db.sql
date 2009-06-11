/*
SQLyog Community Edition- MySQL GUI v7.02 
MySQL - 5.0.67-community-nt : Database - db_demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_demo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_demo`;

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` bigint(10) unsigned NOT NULL auto_increment,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `person` */

insert  into `person`(`id`,`firstName`,`lastName`) values (1,'Warren','Roque'),(2,'Jorge','Roque'),(3,'Angelo','Roque'),(4,'Melanie','Roque'),(5,'priyanka','brank ...'),(7,'Julio','Maguina'),(8,'Ricardo','Mejia'),(9,'Julio','Maguina');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
