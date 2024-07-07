/**
 * Author:  Miguel Castro
 */
﻿CREATE TABLE `movie` (
  `id` INT(10) AUTO_INCREMENT PRIMARY KEY,
  `title` VARCHAR(180) NOT NULL,
  `gender` VARCHAR(180) NOT NULL,
  `classification` INT(10),
  `description` VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
