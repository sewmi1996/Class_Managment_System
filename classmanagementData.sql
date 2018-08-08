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

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`StudentNo`, `Name`, `Address`, `TelNo`, `DOB`, `Imergency_call`) VALUES
('001', 'Saman', 'Kurunegala', 372248573, '2002-01-12', '0371245789'),
('002', 'Kumari', 'Polgahawela', 374589754, '2004-12-15', '0710445789'),
('003', 'Nuwan', 'Ibbagamuwa', 374989754, '2003-05-14', '0723875789'),
('004', 'Chamari', 'Polgahawela', 371867559, '2002-12-19', '0759845789'),
('005', 'Waruni', 'Malkaduwawa', 374589754, '2005-09-21', '0782457459');

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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
