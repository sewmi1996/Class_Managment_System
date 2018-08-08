-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2018 at 07:43 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `classmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_details`
--

CREATE TABLE `attendance_details` (
  `StudentNo` int(10) NOT NULL,
  `StudentName` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `TelNo` int(10) NOT NULL,
  `Date` datetime(6) DEFAULT NULL,
  `CourseID` varchar(10) NOT NULL,
  `UserID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `class_details`
--

CREATE TABLE `class_details` (
  `Day` varchar(255) NOT NULL,
  `StartTime` datetime(6) NOT NULL,
  `EndTime` datetime(6) NOT NULL,
  `Tutor` varchar(255) NOT NULL,
  `Grade` varchar(255) NOT NULL,
  `CourseID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_details`
--

CREATE TABLE `course_details` (
  `CourseID` varchar(10) NOT NULL,
  `SubjectID` int(3) NOT NULL,
  `Grade` varchar(3) NOT NULL,
  `TutorID` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_details`
--

INSERT INTO `course_details` (`CourseID`, `SubjectID`, `Grade`, `TutorID`) VALUES
('BUD06', 6, '6', '2'),
('ENG06', 5, '6', '4'),
('HIS06', 3, '6', '5'),
('MATH06', 1, '6', '3'),
('SCI06', 2, '6', '6'),
('SIN06', 4, '6', '1');

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE `enrollment` (
  `StudentNo` int(10) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `CourseID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `guardian_details`
--

CREATE TABLE `guardian_details` (
  `StudentNo` varchar(10) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `NICNo` varchar(10) NOT NULL,
  `TelNo` int(10) NOT NULL,
  `Address` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `StudentNo` int(10) NOT NULL,
  `UserID` varchar(10) NOT NULL,
  `CourseID` varchar(10) NOT NULL,
  `ReceiptNo` int(10) NOT NULL,
  `Amount` int(4) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

CREATE TABLE `student_details` (
  `StudentNo` varchar(10) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `TelNo` int(10) NOT NULL,
  `DOB` date NOT NULL,
  `Imergency_call` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`StudentNo`, `Name`, `Address`, `TelNo`, `DOB`, `Imergency_call`) VALUES
('001', 'Saman', 'Kurunegala', 372248573, '2002-01-12', '0371245789'),
('002', 'Kumari', 'Polgahawela', 374589754, '2004-12-15', '0710445789'),
('003', 'Nuwan', 'Ibbagamuwa', 374989754, '2003-05-14', '0723875789'),
('004', 'Chamari', 'Polgahawela', 371867559, '2002-12-19', '0759845789'),
('005', 'Waruni', 'Malkaduwawa', 374589754, '2005-09-21', '0782457459');

-- --------------------------------------------------------

--
-- Table structure for table `subject_details`
--

CREATE TABLE `subject_details` (
  `SubjectID` int(3) NOT NULL,
  `SubjectName` varchar(11) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `subject_details`
--

INSERT INTO `subject_details` (`SubjectID`, `SubjectName`) VALUES
(1, 'Mathematics'),
(2, 'Science'),
(3, 'History'),
(4, 'Sinhala'),
(5, 'English'),
(6, 'Buddhism');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `UserID` varchar(3) NOT NULL,
  `Username` varchar(10) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `NICNo` varchar(10) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Position` varchar(255) NOT NULL,
  `Tel` varchar(11) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`UserID`, `Username`, `Name`, `NICNo`, `Address`, `Position`, `Tel`, `Password`, `Email`) VALUES
('1', 'admin', 'adminadmin', '965240137v', 'negambo', 'admin', '01102457896', '*4ACFE3202A5FF5CF467898FC58AAB1D615029441', 'sewmiherath@gmail.com'),
('2', 'ayodhya', 'ayodhya manewa', '945681025v', 'Anuradhapura', 'Tutor', '07715489624', '*1335E8DC511B1BD43ABD7FD8BA85A8DCC0A4FD49', 'ayodhyamanewa.a2@gmail.com'),
('3', 'shalintha', 'shalintha subhashana', '950113855v', 'Ragama', 'Tutor', '0774880284', '*F1BB02D29CB382BD2E5BA67530166A6C07DE17B1', 'subhashana011@gmail.com'),
('4', 'shevindi', 'shevindi rodrigo', '953456567v', 'Wennappuwa', 'Tutor', '0715945303', '*34313901B46A25949FC9824AF0A91BA6EFEEE917', 'shevi.rodrigo@gmail.com'),
('5', 'nadeeshani', 'NK Weerasinghe', '953456523v', 'Wennappuwa', 'Tutor', '0715678818', '*E6658980D21D4852A1866DE2ED8DBFCF0623169C', 'nkweerasinghe818@gmail.com'),
('6', 'sewmi', 'sewmi herath', '953456123v', 'Kuruneagla', 'Tutor', '0714900874', '*8FBF26A1C5129ED6FD5B0EBDFBA15556E2347DC1', 'sewmiherath@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance_details`
--
ALTER TABLE `attendance_details`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `course_details`
--
ALTER TABLE `course_details`
  ADD PRIMARY KEY (`CourseID`);

--
-- Indexes for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `student_details`
--
ALTER TABLE `student_details`
  ADD PRIMARY KEY (`StudentNo`);

--
-- Indexes for table `subject_details`
--
ALTER TABLE `subject_details`
  ADD PRIMARY KEY (`SubjectID`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `Username` (`Username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
