-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Sam 27 Juin 2020 à 15:21
-- Version du serveur: 5.1.36
-- Version de PHP: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Base de données: `locationterrain`
--

-- --------------------------------------------------------

--
-- Structure de la table `industriel`
--

CREATE TABLE IF NOT EXISTS `industriel` (
  `NUMERO` int(2) NOT NULL AUTO_INCREMENT,
  `CAPSOCIAL` double NOT NULL,
  `STAT` char(255) NOT NULL,
  `VILLE` char(255) NOT NULL,
  `TEL` char(255) NOT NULL,
  PRIMARY KEY (`NUMERO`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `industriel`
--

INSERT INTO `industriel` (`NUMERO`, `CAPSOCIAL`, `STAT`, `VILLE`, `TEL`) VALUES
(1, 5000000, 'SA', 'yaounde', '698524178'),
(2, 2000000, 'SA', 'yaounde', '69854712'),
(3, 2356, 'SA', 'Yaounde', '2456783');

-- --------------------------------------------------------

--
-- Structure de la table `investissement`
--

CREATE TABLE IF NOT EXISTS `investissement` (
  `CODEI` varchar(128) NOT NULL,
  `CODE` varchar(128) NOT NULL,
  `MONTINIT` double NOT NULL,
  `MONTLONG` double NOT NULL,
  `VOLUME` double NOT NULL,
  PRIMARY KEY (`CODEI`),
  KEY `I_FK_INVESTISSEMENT_PARCELLE` (`CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `investissement`
--

INSERT INTO `investissement` (`CODEI`, `CODE`, `MONTINIT`, `MONTLONG`, `VOLUME`) VALUES
('i1', '1', 2000000, 5000000, 500000),
('i2', '1', 2500000, 5000000, 500000),
('i3', '1', 2800000, 5000000, 500000),
('i4', '2', 3000000, 7000000, 500000),
('i5', '2', 2000000, 7000000, 500000),
('i6', '3', 2500000, 4000000, 500000),
('i7', '4', 2500000, 4000000, 500000),
('i8', '5', 2500000, 4000000, 400000),
('i9', '5', 2500000, 4300000, 500000),
('i10', '5', 2500000, 4000000, 600000);

-- --------------------------------------------------------

--
-- Structure de la table `localisation`
--

CREATE TABLE IF NOT EXISTS `localisation` (
  `CODEL` varchar(128) NOT NULL,
  `LIBELLE` char(255) NOT NULL,
  `DESCRIPTION` char(255) NOT NULL,
  PRIMARY KEY (`CODEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `localisation`
--

INSERT INTO `localisation` (`CODEL`, `LIBELLE`, `DESCRIPTION`) VALUES
('1', 'emana', 'c''est a emana'),
('2', 'newbell', 'c''est a doula');

-- --------------------------------------------------------

--
-- Structure de la table `parcelle`
--

CREATE TABLE IF NOT EXISTS `parcelle` (
  `CODE` varchar(128) NOT NULL,
  `NUMERO` int(2) DEFAULT NULL,
  `CODEL` varchar(128) NOT NULL,
  `SUPERFICIE` bigint(4) NOT NULL,
  `LATITUDE` double(5,2) NOT NULL,
  `LONGITUDE` double(5,2) NOT NULL,
  `NOMBREINVEST` int(2) NOT NULL,
  PRIMARY KEY (`CODE`),
  KEY `I_FK_PARCELLE_INDUSTRIEL` (`NUMERO`),
  KEY `I_FK_PARCELLE_LOCALISATION` (`CODEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `parcelle`
--

INSERT INTO `parcelle` (`CODE`, `NUMERO`, `CODEL`, `SUPERFICIE`, `LATITUDE`, `LONGITUDE`, `NOMBREINVEST`) VALUES
('1', 2, '1', 200, 999.99, 999.99, 3),
('2', 1, '2', 100, 999.99, 999.99, 2),
('3', 2, '2', 150, 999.99, 999.99, 1),
('4', 3, '1', 210, 999.99, 999.99, 1),
('5', 2, '2', 230, 999.99, 999.99, 3);
