-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2025 at 08:02 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `empno` int(10) NOT NULL,
  `empnm` varchar(20) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `salary` int(20) NOT NULL,
  `department` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`empno`, `empnm`, `designation`, `city`, `salary`, `department`) VALUES
(102, 'Yashvi', 'Web Developer', 'Ahmedabad', 70000, 'IT'),
(103, 'Najnin', 'Analyst', 'Gandhinagar', 45500, 'Finance'),
(104, 'Asha', 'Designer', 'Rajkot', 50000, 'Marketing'),
(104, 'Asha', 'Designer', 'Rajkot', 50000, 'Marketing'),
(105, 'Himali', 'Manager', 'Ahmedabad', 75000, 'HR'),
(106, 'Akshita', 'Tax Accountant', 'Rajkot', 86000, 'Accounting');

-- --------------------------------------------------------

--
-- Table structure for table `stud`
--

CREATE TABLE `stud` (
  `RollNo` int(10) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Semester` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
