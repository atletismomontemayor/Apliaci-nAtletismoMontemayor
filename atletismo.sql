-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 14-05-2017 a las 18:07:22
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `atletismo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE IF NOT EXISTS `carrera` (
  `codigo` int(20) NOT NULL,
  `nombre` char(50) NOT NULL,
  `localidad` char(20) NOT NULL,
  `provincia` char(20) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `distancia` int(7) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carrera`
--

INSERT INTO `carrera` (`codigo`, `nombre`, `localidad`, `provincia`, `fecha`, `hora`, `distancia`) VALUES
(1, 'Carrera por la paz', 'Cañada del rosal', 'Sevilla', '2017-09-21', '10:30:00', 6000),
(2, 'San Anton', 'Jaén', 'Jaén', '2017-12-29', '17:00:00', 10000),
(3, 'Ruta los Califas', 'Córdoba', 'Córdoba', '2017-10-06', '19:00:00', 10000),
(4, 'Ruta de la miel', 'Hornachuelos', 'Córdoba', '2017-01-12', '09:30:00', 17000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `nombre` char(15) NOT NULL,
  `descripcion` mediumtext,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`nombre`, `descripcion`) VALUES
('alevin', '9 y 10'),
('benjamin', 'Estos tienen 7 y 8 años'),
('cadete', '13 y 14'),
('chupete', 'Estos tienen menos de 5 años'),
('infantil', '11 y 12'),
('junior', '17 y 18'),
('juvenil', '15 y 16'),
('prebenjamin', 'Estos tienen 5 y 6 años'),
('promesa', '19, 20 y 21'),
('senior', '22 hasta 35'),
('veteranos', '35 en adelante');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE IF NOT EXISTS `inscripcion` (
  `numeroinscripcion` int(255) NOT NULL AUTO_INCREMENT,
  `tiempo` float(5,2) NOT NULL,
  `dnipersona` char(9) NOT NULL,
  `nombrecategoria` char(15) NOT NULL,
  `codigocarrera` int(20) NOT NULL,
  PRIMARY KEY (`numeroinscripcion`),
  KEY `dnipersona` (`dnipersona`),
  KEY `nombrecategoria` (`nombrecategoria`),
  KEY `codigocarrera` (`codigocarrera`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`numeroinscripcion`, `tiempo`, `dnipersona`, `nombrecategoria`, `codigocarrera`) VALUES
(1, 35.50, '52412631Q', 'Senior', 1),
(2, 37.60, 'admin', 'promesa', 1),
(3, 40.01, '57875452L', 'senior', 1),
(4, 55.59, '52412631Q', 'senior', 2),
(5, 59.40, 'admin', 'promesa', 2),
(6, 61.04, '57875452L', 'senior', 2),
(7, 54.59, '52412631Q', 'senior', 3),
(8, 57.40, 'admin', 'promesa', 3),
(9, 63.04, '57875452L', 'senior', 3),
(10, 89.59, '52412631Q', 'senior', 4),
(11, 95.40, 'admin', 'promesa', 4),
(12, 101.04, '57875452L', 'senior', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `dni` char(9) NOT NULL,
  `nombre` char(25) NOT NULL,
  `apellidos` char(50) NOT NULL,
  `sexo` enum('masculino','femenino') NOT NULL,
  `telefono` int(9) NOT NULL,
  `anyonacimiento` int(5) NOT NULL,
  `nombreusuario` char(25) NOT NULL,
  `contrasenya` char(25) NOT NULL,
  `numerocuenta` char(100) DEFAULT NULL,
  `administrador` tinyint(1) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `nombreusuario` (`nombreusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`dni`, `nombre`, `apellidos`, `sexo`, `telefono`, `anyonacimiento`, `nombreusuario`, `contrasenya`, `numerocuenta`, `administrador`) VALUES
('52412631Q', 'Ana', 'Gomez Rey', 'femenino', 658320149, 1990, 'anagomez', 'anita123', '111-12-5897-1548965878', 0),
('53595576X', 'ismael', 'perez', 'masculino', 696320615, 1996, 'aiperez', 'tonto', '', 0),
('57875452L', 'Celestina', 'Palomino Blanco', 'femenino', 685231475, 1996, 'celepaba', 'yalocreo', NULL, 0),
('admin', 'admin', 'admin', '', 0, 0, 'admin', 'admin', 'admin', 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`dnipersona`) REFERENCES `persona` (`dni`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`nombrecategoria`) REFERENCES `categoria` (`nombre`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `inscripcion_ibfk_3` FOREIGN KEY (`codigocarrera`) REFERENCES `carrera` (`codigo`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
