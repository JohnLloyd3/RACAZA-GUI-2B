-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2025 at 06:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petadoption`
--

-- --------------------------------------------------------

--
-- Table structure for table `adoption_records`
--

CREATE TABLE `adoption_records` (
  `adoption_id` int(11) NOT NULL,
  `adopter_id` int(20) NOT NULL,
  `pet_id` int(11) NOT NULL,
  `adoption_date` date NOT NULL,
  `status` varchar(20) DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adoption_records`
--

INSERT INTO `adoption_records` (`adoption_id`, `adopter_id`, `pet_id`, `adoption_date`, `status`) VALUES
(1, 22, 3, '2025-05-14', 'Adopted'),
(2, 22, 3, '2025-05-14', 'Adopted'),
(6, 22, 1, '2025-05-14', 'Adopted'),
(7, 22, 4, '2025-05-14', 'Pending'),
(8, 22, 4, '2025-05-14', 'Adopted'),
(9, 23, 9, '2025-05-14', 'Adopted'),
(10, 23, 5, '2025-05-14', 'Adopted'),
(11, 23, 6, '2025-05-14', 'Adopted'),
(12, 23, 8, '2025-05-14', 'Adopted'),
(13, 23, 11, '2025-05-14', 'Adopted'),
(14, 22, 14, '2025-05-14', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `logID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`logID`, `userID`, `action`, `date_time`) VALUES
(1, 1, 'Test log entry', '2025-05-13 18:29:37'),
(2, 1, 'Test log entry', '2025-05-13 18:30:10'),
(3, 22, 'Admin logged in', '2025-05-13 18:30:36'),
(4, 22, 'Admin logged in', '2025-05-13 18:34:27'),
(5, 22, 'Admin logged in', '2025-05-13 18:36:14'),
(6, 22, 'Admin logged in', '2025-05-14 11:42:16'),
(7, 22, 'Admin logged in', '2025-05-14 11:51:31'),
(8, 22, 'Admin logged in', '2025-05-14 11:52:16'),
(9, 22, 'Admin logged in', '2025-05-14 12:07:05'),
(10, 22, 'Admin logged in', '2025-05-14 12:08:14'),
(11, 22, 'Admin logged in', '2025-05-14 12:23:06'),
(12, 22, 'Admin logged in', '2025-05-14 12:25:34'),
(13, 23, 'Admin logged in', '2025-05-14 12:26:43'),
(14, 22, 'Admin logged in', '2025-05-14 12:35:48'),
(15, 22, 'Admin logged in', '2025-05-14 12:37:01'),
(16, 23, 'User logged in', '2025-05-14 12:38:54'),
(17, 22, 'Admin logged in', '2025-05-14 12:39:23'),
(18, 23, 'User logged in', '2025-05-14 12:40:35'),
(19, 23, 'User logged in', '2025-05-14 12:52:51'),
(20, 23, 'User logged in', '2025-05-14 12:54:50'),
(21, 22, 'Admin logged in', '2025-05-14 13:20:22'),
(22, 22, 'Admin logged in', '2025-05-14 13:23:35');

-- --------------------------------------------------------

--
-- Table structure for table `pets`
--

CREATE TABLE `pets` (
  `pet_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `species` varchar(50) NOT NULL,
  `breed` varchar(50) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `color` varchar(50) NOT NULL,
  `status` varchar(255) DEFAULT 'Available',
  `image_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pets`
--

INSERT INTO `pets` (`pet_id`, `name`, `species`, `breed`, `age`, `gender`, `color`, `status`, `image_path`) VALUES
(1, 'Buddy', 'Dog', 'Golden Retriever', 30, 'Male', 'Golden', 'Adopted', 'src/images/petdefault.png'),
(3, 'Jericho', 'Dog', 'Bulldog', 20, 'Male', 'Black', 'Adopted', 'src/images/petdefault.png'),
(4, 'Lloyd', 'Dog', 'Shitzu', 30, 'Female', 'White', 'Adopted', 'src/images/petdefault.png'),
(5, 'Buddy', 'Dog', 'Labrador', 3, 'Male', '', 'Adopted', 'src/images/petdefault.png'),
(6, 'Bella', 'Cat', 'Persian', 2, 'Female', '', 'Adopted', 'src/images/petdefault.png'),
(7, 'Max', 'Dog', 'Bulldog', 4, 'Male', '', 'Adopted', 'src/images/petdefault.png'),
(8, 'Luna', 'Cat', 'Siamese', 1, 'Female', '', 'Adopted', 'src/images/petdefault.png'),
(9, 'Charlie', 'Dog', 'Beagle', 5, 'Male', '', 'Adopted', 'src/images/petdefault.png'),
(10, 'Lucy', 'Cat', 'Maine Coon', 3, 'Female', '', 'Adopted', 'src/images/petdefault.png'),
(11, 'Rocky', 'Dog', 'Poodle', 2, 'Male', '', 'Adopted', 'src/images/petdefault.png'),
(12, 'Milo', 'Cat', 'Bengal', 4, 'Male', '', 'Available', 'src/images/petdefault.png'),
(13, 'Sadie', 'Dog', 'Golden Retriever', 6, 'Female', '', 'Adopted', 'src/images/petdefault.pngg'),
(14, 'Coco', 'Cat', 'Ragdoll', 2, 'Female', '', 'Pending Adoption Approval', 'src/images/petdefault.png'),
(15, 'Daisy', 'Dog', 'Corgi', 3, 'Female', '', 'Available', 'src/images/petdefault.png'),
(16, 'Oscar', 'Cat', 'Sphynx', 5, 'Male', '', 'Adopted', 'src/images/petdefault.png'),
(17, 'Bailey', 'Dog', 'Shih Tzu', 4, 'Male', '', 'Available', 'src/images/petdefault.png'),
(18, 'Molly', 'Cat', 'Scottish Fold', 3, 'Female', '', 'Available', 'src/images/petdefault.png'),
(19, 'Rex', 'Dog', 'Rottweiler', 7, 'Male', '', 'Adopted', 'src/images/petdefault.png');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_firstname` varchar(50) NOT NULL,
  `u_lastname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(250) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `image` varchar(255) NOT NULL DEFAULT 'src/images/defaultimage.png',
  `reset_code` varchar(50) DEFAULT NULL,
  `reset_expiry` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`, `image`, `reset_code`, `reset_expiry`) VALUES
(1, 'John Lloyd', 'Racaza', 'johnlloydracaza88@gmail.com', 'johnlloyd23', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'Admin', 'Active', 'src/images/defaultimage.png', '26MET3', '2025-05-15 00:32:45'),
(2, 'Leonelen ', 'Carmen', 'leonelencarmen11@gmail.com', 'leonelen11', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'User', 'Active', 'src/images/defaultimage.png', NULL, NULL),
(3, 'Jay Lester', 'Racaza', 'lester@gmail.com', 'lester123', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'User', 'Active', 'src/images/defaultimage.png', NULL, NULL),
(21, 'lloyd', 'john', 'lloyd@gmail.com', 'lloyd', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'Admin', 'Active', 'src/images/defaultimage.png', NULL, NULL),
(22, 'admin', 'admin', 'admin', 'admin', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'Admin', 'Active', 'src/images/defaultimage.png', NULL, NULL),
(23, 'useruser', 'useruser', 'user123@gmail.com', 'user1', '14XWNRGmRaJIdaEJ4O8dplYN2U0Um2c0lJqWVWyzRJ8=', 'User', 'Active', '1747158261988_petdefault.png', NULL, NULL);

--
-- Triggers `tbl_user`
--
DELIMITER $$
CREATE TRIGGER `set_reset_expiry` BEFORE INSERT ON `tbl_user` FOR EACH ROW BEGIN
    IF NEW.reset_code IS NOT NULL THEN
        SET NEW.reset_expiry = NOW() + INTERVAL 5 MINUTE;
    END IF;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adoption_records`
--
ALTER TABLE `adoption_records`
  ADD PRIMARY KEY (`adoption_id`),
  ADD KEY `adopter_id` (`adopter_id`),
  ADD KEY `pet_id` (`pet_id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`logID`),
  ADD KEY `fk_userID` (`userID`);

--
-- Indexes for table `pets`
--
ALTER TABLE `pets`
  ADD PRIMARY KEY (`pet_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adoption_records`
--
ALTER TABLE `adoption_records`
  MODIFY `adoption_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `logID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `pets`
--
ALTER TABLE `pets`
  MODIFY `pet_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adoption_records`
--
ALTER TABLE `adoption_records`
  ADD CONSTRAINT `adoption_records_ibfk_1` FOREIGN KEY (`adopter_id`) REFERENCES `tbl_user` (`u_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `adoption_records_ibfk_2` FOREIGN KEY (`pet_id`) REFERENCES `pets` (`pet_id`) ON DELETE CASCADE;

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `fk_userID` FOREIGN KEY (`userID`) REFERENCES `tbl_user` (`u_id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
