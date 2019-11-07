-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2019 at 09:37 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `showtime`
--

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `movie_id` varchar(4) NOT NULL,
  `movie_name` varchar(40) NOT NULL,
  `move_price` int(4) NOT NULL,
  `movie_genre` varchar(30) NOT NULL,
  `movie_duration` varchar(20) NOT NULL DEFAULT '120 min',
  `movie_directer` varchar(40) NOT NULL,
  `movie_desc` varchar(5000) NOT NULL,
  `movie_primary` varchar(5000) NOT NULL,
  `movie_secondary` varchar(5000) NOT NULL,
  `css` varchar(3000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`movie_id`, `movie_name`, `move_price`, `movie_genre`, `movie_duration`, `movie_directer`, `movie_desc`, `movie_primary`, `movie_secondary`, `css`) VALUES
('M001', 'CHICHHCHORE', 245, 'COMEDY', '120 min', 'Nitesh Tiwari', 'The setup was within 1990\'s till present where Anni, a divorcee used his past experience in overcoming challenges of being a loser in college where he met His Wife, Maya and his Losers friends, Saxa, Mummy, Acid, Derek and Bevda.', 'images/chhi_s.jpg', 'images/chhi_s.jpg', 'fadee'),
('M002', 'DREAM GIRL', 250, 'ROMANCE , COMEDY', '126', 'Raaj Shaandilyaa', 'Rom-com Movie, directed by Raaj Shaandilyaa, stars Ayushmann Khurrana who plays a \'dream girl\'. In every love story, there is always one trying to win the heart of the other, who could be the \'dream girl\'.', 'images/dream_s.jpg', 'images/dream_s.jpg', 'jsdhj'),
('M003', 'BATLA HOUSE', 300, 'Action', '120 min', ' Nikkhil Advani', 'This action thriller is based on the real-life incident of \'Batla House Encounter\', officially known as Operation Batla House, to the silver screen.', 'images/batla_s.JPG', 'images/Batla.jpg', 'batlaa'),
('M004', 'End Game', 245, ' Action, Adventure, Drama', '181 min', 'Anthony Russo, Joe Russo', 'After the devastating events of Avengers: Infinity War (2018), the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos\'s actions and undo the chaos to the universe', 'images/end_s.jpg', 'images/end.jpg', 'end'),
('M005', 'Bala', 300, 'Comedy', '120 min', ' Amar Kaushik', 'The film focuses on a young man Gaurav Rawat aka Bala (Ayushmann Khurrana) plagued with premature baldness and the way he copes with the situation. Revolving around his everyday struggle due to hair loss.', 'images/bala_s.jpg', 'images/bala.jpg', 'bala'),
('M006', 'Housefull 4', 200, ' Action, Comedy, Fantasy ', '145 min', 'Farhad Samji', 'In 1419 Sitamgarh, 3 couples are parted away due to an evil conspiracy. 600 hundred years later in 2019 in London, the couples\'s reincarnations meet again but this time each one of them is marrying the wrong person.', 'images/h4_s.jpg', 'images/h4.jpg', 'h4');
-- --------------------------------------------------------
--
-- Table structure for table `reservation`
--
CREATE TABLE `reservation` (
  `theatre_name` varchar(30) NOT NULL,
  `movie_name` varchar(30) NOT NULL,
  `slot_id` int(4) NOT NULL,
  `date` date NOT NULL,
  `screen_id` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `reservation`
--
INSERT INTO `reservation` (`theatre_name`, `movie_name`, `slot_id`, `date`, `screen_id`) VALUES
('PVR PACIFIC', 'CHICHHCHORE', 1, '2019-11-01', 2),
('PVR VIKASPURI', 'CHICHHCHORE', 2, '2019-10-31', 2);
-- --------------------------------------------------------
--
-- Table structure for table `theatre`
--
CREATE TABLE `theatre` (
  `theatre_id` varchar(4) NOT NULL,
  `theatre_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `theatre`
--
INSERT INTO `theatre` (`theatre_id`, `theatre_name`) VALUES
('T003', 'INOX JANAKPURI'),
('T001', 'PVR PACIFIC'),
('T002', 'PVR VIKASPURI');
-- --------------------------------------------------------
--
-- Table structure for table `ticket`
--
CREATE TABLE `ticket` (
  `username` varchar(30) NOT NULL,
  `ticket_id` varchar(4) NOT NULL,
  `theatre_name` varchar(30) NOT NULL,
  `movie_name` varchar(40) NOT NULL,
  `move_price` int(4) NOT NULL,
  `theatre_id` varchar(4) NOT NULL,
  `booking_id` int(15) NOT NULL,
  `booking_date` date NOT NULL,
  `booking_time` time NOT NULL,
  `show_date` date NOT NULL,
  `show_time` time NOT NULL,
  `ticket_price` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- --------------------------------------------------------
--
-- Table structure for table `time_slots`
--
CREATE TABLE `time_slots` (
  `slot_id` int(4) NOT NULL,
  `timing` varchar(30) NOT NULL,
  `seat_booked` varchar(5000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `time_slots`
--
INSERT INTO `time_slots` (`slot_id`, `timing`, `seat_booked`) VALUES
(1, '10:15', 'A1,A4'),
(1, '12:50', 'A5,A4'),
(2, '16:50', 'A5,A4');
-- --------------------------------------------------------
--
-- Table structure for table `user`
--
CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(40) NOT NULL,
  `role` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Dumping data for table `user`
--
INSERT INTO `user` (`username`, `name`, `password`, `role`) VALUES
('', '', '', 'user'),
('dilip@gmail.com', 'Dilip', 'belvile', 'user'),
('Eclipse21', 'Nitesh', 'Random@!1', 'admin'),
('Knight@gmail.com', 'Nitesh', 'hellobaby', 'user'),
('PixelSpades', 'Colonel Belvile', 'Random@!1', 'user'),
('ranveer11', 'Ranveer', 'Ranveer@1', 'user'),
('tarun@gmail.com', 'Tarun', 'belvile', 'user');
--
-- Indexes for dumped tables
--
--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`movie_id`),
  ADD UNIQUE KEY `movie_name` (`movie_name`);
--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`slot_id`),
  ADD KEY `theatre_name` (`theatre_name`),
  ADD KEY `movie_name` (`movie_name`);
--
-- Indexes for table `theatre`
--
ALTER TABLE `theatre`
  ADD PRIMARY KEY (`theatre_id`),
  ADD UNIQUE KEY `theatre_name` (`theatre_name`);
--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`ticket_id`),
  ADD UNIQUE KEY `booking_id` (`booking_id`),
  ADD KEY `theatre_id` (`theatre_id`),
  ADD KEY `movie_name` (`movie_name`),
  ADD KEY `username` (`username`);
--
-- Indexes for table `time_slots`
--
ALTER TABLE `time_slots`
  ADD KEY `slot_id` (`slot_id`);
--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`),
  ADD KEY `name` (`name`),
  ADD KEY `pasword` (`password`);
--
-- Constraints for dumped tables
--
--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`theatre_name`) REFERENCES `theatre` (`theatre_name`),
  ADD CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`movie_name`) REFERENCES `movie` (`movie_name`);
--
-- Constraints for table `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`theatre_id`) REFERENCES `theatre` (`theatre_id`),
  ADD CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`movie_name`) REFERENCES `movie` (`movie_name`),
  ADD CONSTRAINT `ticket_ibfk_3` FOREIGN KEY (`username`) REFERENCES `user` (`username`);
--
-- Constraints for table `time_slots`
--
ALTER TABLE `time_slots`
  ADD CONSTRAINT `time_slots_ibfk_1` FOREIGN KEY (`slot_id`) REFERENCES `reservation` (`slot_id`);
COMMIT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;