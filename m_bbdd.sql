-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-02-2022 a las 15:10:50
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `m_bbdd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleteria`
--

CREATE TABLE `boleteria` (
  `sala` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `boleteria`
--

INSERT INTO `boleteria` (`sala`, `precio`) VALUES
(1, 300),
(5, 1000),
(1, 500),
(5, 1200),
(5, 15.12),
(7, 25.2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras_teatro`
--

CREATE TABLE `obras_teatro` (
  `titulo` varchar(250) COLLATE utf8mb4_spanish_ci NOT NULL,
  `duracion` int(11) NOT NULL,
  `actores` text COLLATE utf8mb4_spanish_ci NOT NULL,
  `tematica` varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
  `sala` int(11) NOT NULL,
  `horarios` text COLLATE utf8mb4_spanish_ci NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `obras_teatro`
--

INSERT INTO `obras_teatro` (`titulo`, `duracion`, `actores`, `tematica`, `sala`, `horarios`, `estado`) VALUES
('Hamlet', 120, 'Hamlet,Gertrudis', 'Tragedia', 4, '23:00', 1),
('Macbeth', 100, 'Duncan,Malcolm', 'Tragedia', 9, '20:00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `titulo` varchar(250) COLLATE utf8mb4_spanish_ci NOT NULL,
  `duracion` int(11) NOT NULL,
  `genero` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
  `sinapsis` text COLLATE utf8mb4_spanish_ci NOT NULL,
  `sala` int(11) NOT NULL,
  `horarios` text COLLATE utf8mb4_spanish_ci NOT NULL,
  `censura` varchar(2) COLLATE utf8mb4_spanish_ci NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`titulo`, `duracion`, `genero`, `sinapsis`, `sala`, `horarios`, `censura`, `estado`) VALUES
('Into Spiderverse', 110, 'Animación', 'El joven Miles Morales desarrolla poderes que lo transforman en el Hombre Araña.', 9, '9:00', 'no', 1),
('Moana', 110, 'Fantasia', 'Vaiana Waialiki es una joven entusiasta del mar y la única hija de un jefe marinero.', 5, '15:00', 'no', 1),
('Parodia 300', 90, 'Comedia', 'Parodia de la exitosa película 300', 2, '11:00', 'si', 1),
('Spiderman', 120, 'Accion', 'Tercera entrega de la saga protagonizada por Peter Parker (Tom Holland)', 1, '17:00,18:00', 'no', 1),
('Venom', 120, 'Accion', 'Pelicula de venom', 7, '17:00,20:00', 'si', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas`
--

CREATE TABLE `salas` (
  `id_sala` int(11) NOT NULL,
  `disponible` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `salas`
--

INSERT INTO `salas` (`id_sala`, `disponible`) VALUES
(1, 0),
(2, 0),
(3, 0),
(4, 0),
(5, 1),
(6, 1),
(7, 0),
(8, 1),
(9, 1),
(10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `password`) VALUES
('Jose', 987654321),
('Gilmar', 666);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `obras_teatro`
--
ALTER TABLE `obras_teatro`
  ADD PRIMARY KEY (`titulo`);

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`titulo`);

--
-- Indices de la tabla `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`id_sala`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
