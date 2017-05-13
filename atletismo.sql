-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 12-05-2017 a las 16:33:12
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
(1, 'Carrera por la paz', 'Cañada del rosal', 'Sevilla', '2016-05-21', '10:30:00', 6000),
(2, 'San Anton', 'Jaén', 'Jaén', '2016-12-29', '17:00:00', 10000),
(3, 'Ruta los Califas', 'Córdoba', 'Córdoba', '2017-05-06', '19:00:00', 10000),
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
(1, 35.50, '11111111Q', 'Senior', 1),
(2, 37.60, 'admin', 'promesa', 1),
(3, 40.01, '55555555L', 'senior', 1),
(4, 55.59, '11111111Q', 'senior', 2),
(5, 59.40, 'admin', 'promesa', 2),
(6, 61.04, '55555555L', 'senior', 2),
(7, 54.59, '11111111Q', 'senior', 3),
(8, 57.40, 'admin', 'promesa', 3),
(9, 63.04, '55555555L', 'senior', 3),
(10, 89.59, '11111111Q', 'senior', 4),
(11, 95.40, 'admin', 'promesa', 4),
(12, 101.04, '55555555L', 'senior', 4);

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
  UNIQUE KEY `nombreusuario` (`nombreusuario`),
  UNIQUE KEY `contrasenya` (`contrasenya`),
  UNIQUE KEY `numerocuenta` (`numerocuenta`),
  UNIQUE KEY `numerocuenta_2` (`numerocuenta`),
  UNIQUE KEY `numerocuenta_3` (`numerocuenta`),
  UNIQUE KEY `numerocuenta_4` (`numerocuenta`),
  UNIQUE KEY `numerocuenta_5` (`numerocuenta`),
  KEY `numerocuenta_6` (`numerocuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`dni`, `nombre`, `apellidos`, `sexo`, `telefono`, `anyonacimiento`, `nombreusuario`, `contrasenya`, `numerocuenta`, `administrador`) VALUES
('11111111Q', 'Ana', 'Gomez Rey', 'femenino', 666666666, 1990, 'anagomez', 'rey1111', '111-12-5897-1548965878', 0),
('53595576X', 'ismael', 'perez', 'masculino', 696320615, 1996, 'aiperez', 'tonto', '', 0),
('55555555L', 'Celestina', 'Palomino Blanco', 'femenino', 688888888, 1996, 'celepaba', 'yalocreo', NULL, 0),
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
