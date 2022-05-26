-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2022 at 04:45 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `appeks`
--

-- --------------------------------------------------------

--
-- Table structure for table `biner`
--

CREATE TABLE `biner` (
  `id_biner` int(11) NOT NULL,
  `biner_pesan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biner`
--

INSERT INTO `biner` (`id_biner`, `biner_pesan`) VALUES
(1, '01110011 01100001 01111001 01100001 00100000 01100110 01100001 01110011 01101001 01101000'),
(2, '01101000 01100001 01101001'),
(3, '01101000 01100001 01101001'),
(4, '01101000 01100001 01101001 00100000 01100110 01100001 01110011 01101001 01101000 01110101 01101100'),
(5, '01110111 01100101 01101100 01100011 01101111 01101101 01100101 00100000 01100110 01100001 01110011 01101001 01101000'),
(6, '01101000 01100101 01101100 01101100 01101111'),
(7, '01110100 01100101 01110011'),
(8, '01110100 01100101 01110011'),
(9, '01101000 01100001 01101001 00101100 00100000 01110011 01100001 01111001 01100001 00100000 01100110 01100001 01110011 01101001 01101000'),
(10, '01110011 01100001 01111001 01100001'),
(11, ''),
(12, '01101000 01101001'),
(13, '01101000 01100101 01111001'),
(14, '00110001 00110010'),
(15, '01100110 01100110'),
(16, '01100001 01110000 01100001 00100000 01101011 01100001 01101101 01110101 00100000 01110011 01100101 01101000 01100001 01110100 00111111'),
(17, '01101000 01100001 01101100 01101111 00101100 00100000 01100001 01110000 01100001 00100000 01101011 01100001 01100010 01100001 01110010 00111111'),
(18, '01101000 01100001 01101001 00101100 00100000 01100001 01110000 01100001 00100000 01101011 01100001 01100010 01100001 01110010 00111111');

-- --------------------------------------------------------

--
-- Table structure for table `detile_biner`
--

CREATE TABLE `detile_biner` (
  `id_detile_biner` int(11) NOT NULL,
  `id_biner` int(11) NOT NULL,
  `id_pesan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detile_biner`
--

INSERT INTO `detile_biner` (`id_detile_biner`, `id_biner`, `id_pesan`) VALUES
(1, 1, 9),
(2, 2, 10),
(3, 3, 11),
(4, 4, 12),
(5, 5, 13),
(6, 6, 14),
(7, 7, 15),
(8, 8, 16),
(9, 9, 17),
(10, 10, 18),
(12, 12, 19),
(13, 13, 20),
(14, 14, 21),
(15, 15, 22),
(16, 16, 23),
(17, 17, 24),
(18, 18, 25);

-- --------------------------------------------------------

--
-- Table structure for table `detile_penerima_pesan`
--

CREATE TABLE `detile_penerima_pesan` (
  `id_detile_penerima_pesan` int(11) NOT NULL,
  `id_pesan` int(11) NOT NULL,
  `id_penerima` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `detile_pengirim_pesan`
--

CREATE TABLE `detile_pengirim_pesan` (
  `id_detile_pengirim_pesan` int(11) NOT NULL,
  `id_pesan` int(11) NOT NULL,
  `id_pengirim` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detile_pengirim_pesan`
--

INSERT INTO `detile_pengirim_pesan` (`id_detile_pengirim_pesan`, `id_pesan`, `id_pengirim`) VALUES
(3, 9, 1),
(4, 10, 1),
(5, 11, 1),
(6, 12, 1),
(7, 13, 1),
(8, 14, 1),
(9, 15, 1),
(10, 16, 1),
(11, 17, 1),
(12, 18, 1),
(13, 19, 1),
(14, 20, 1),
(15, 21, 1),
(16, 22, 1),
(17, 23, 1),
(18, 24, 1),
(19, 25, 1);

-- --------------------------------------------------------

--
-- Table structure for table `penerima`
--

CREATE TABLE `penerima` (
  `id_penerima` int(11) NOT NULL,
  `nama_penerima` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penerima`
--

INSERT INTO `penerima` (`id_penerima`, `nama_penerima`) VALUES
(1, 'user2');

-- --------------------------------------------------------

--
-- Table structure for table `pengirim`
--

CREATE TABLE `pengirim` (
  `id_pengirim` int(11) NOT NULL,
  `nama_pengirirm` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengirim`
--

INSERT INTO `pengirim` (`id_pengirim`, `nama_pengirirm`) VALUES
(1, 'user1');

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `id_pesan` int(11) NOT NULL,
  `pesan` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`id_pesan`, `pesan`, `created_at`) VALUES
(9, 'saya fasih', '2022-05-25 08:40:08'),
(10, 'hai', '2022-05-25 16:10:07'),
(11, 'hai', '2022-05-25 17:12:34'),
(12, 'hai fasihul', '2022-05-25 17:13:17'),
(13, 'welcome fasih', '2022-05-25 17:13:44'),
(14, 'hello', '2022-05-25 17:14:38'),
(15, 'tes', '2022-05-25 17:16:44'),
(16, 'tes', '2022-05-25 17:17:03'),
(17, 'hai, saya fasih', '2022-05-25 17:53:03'),
(18, 'saya', '2022-05-25 18:03:09'),
(19, 'hi', '2022-05-25 18:24:56'),
(20, 'hey', '2022-05-25 18:40:08'),
(21, '12', '2022-05-25 18:42:51'),
(22, 'ff', '2022-05-25 18:46:15'),
(23, 'apa kamu sehat?', '2022-05-25 18:46:31'),
(24, 'halo, apa kabar?', '2022-05-25 19:03:19'),
(25, 'hai, apa kabar?', '2022-05-26 12:22:33');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biner`
--
ALTER TABLE `biner`
  ADD PRIMARY KEY (`id_biner`);

--
-- Indexes for table `detile_biner`
--
ALTER TABLE `detile_biner`
  ADD PRIMARY KEY (`id_detile_biner`),
  ADD KEY `id_binary` (`id_biner`),
  ADD KEY `id_pesan` (`id_pesan`);

--
-- Indexes for table `detile_penerima_pesan`
--
ALTER TABLE `detile_penerima_pesan`
  ADD PRIMARY KEY (`id_detile_penerima_pesan`),
  ADD KEY `id_penerima` (`id_penerima`),
  ADD KEY `id_pesan` (`id_pesan`);

--
-- Indexes for table `detile_pengirim_pesan`
--
ALTER TABLE `detile_pengirim_pesan`
  ADD PRIMARY KEY (`id_detile_pengirim_pesan`),
  ADD KEY `id_pengirim` (`id_pengirim`),
  ADD KEY `id_pesan` (`id_pesan`);

--
-- Indexes for table `penerima`
--
ALTER TABLE `penerima`
  ADD PRIMARY KEY (`id_penerima`);

--
-- Indexes for table `pengirim`
--
ALTER TABLE `pengirim`
  ADD PRIMARY KEY (`id_pengirim`);

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`id_pesan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biner`
--
ALTER TABLE `biner`
  MODIFY `id_biner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `detile_biner`
--
ALTER TABLE `detile_biner`
  MODIFY `id_detile_biner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `detile_penerima_pesan`
--
ALTER TABLE `detile_penerima_pesan`
  MODIFY `id_detile_penerima_pesan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `detile_pengirim_pesan`
--
ALTER TABLE `detile_pengirim_pesan`
  MODIFY `id_detile_pengirim_pesan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `penerima`
--
ALTER TABLE `penerima`
  MODIFY `id_penerima` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pengirim`
--
ALTER TABLE `pengirim`
  MODIFY `id_pengirim` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `id_pesan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detile_biner`
--
ALTER TABLE `detile_biner`
  ADD CONSTRAINT `detile_biner_ibfk_1` FOREIGN KEY (`id_biner`) REFERENCES `biner` (`id_biner`),
  ADD CONSTRAINT `detile_biner_ibfk_2` FOREIGN KEY (`id_pesan`) REFERENCES `pesan` (`id_pesan`);

--
-- Constraints for table `detile_penerima_pesan`
--
ALTER TABLE `detile_penerima_pesan`
  ADD CONSTRAINT `detile_penerima_pesan_ibfk_1` FOREIGN KEY (`id_penerima`) REFERENCES `penerima` (`id_penerima`),
  ADD CONSTRAINT `detile_penerima_pesan_ibfk_2` FOREIGN KEY (`id_pesan`) REFERENCES `pesan` (`id_pesan`);

--
-- Constraints for table `detile_pengirim_pesan`
--
ALTER TABLE `detile_pengirim_pesan`
  ADD CONSTRAINT `detile_pengirim_pesan_ibfk_1` FOREIGN KEY (`id_pengirim`) REFERENCES `pengirim` (`id_pengirim`),
  ADD CONSTRAINT `detile_pengirim_pesan_ibfk_2` FOREIGN KEY (`id_pesan`) REFERENCES `pesan` (`id_pesan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
