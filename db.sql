

CREATE TABLE `mentees` (
  `mentee_id` int(11) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `SSN` varchar(45) NOT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `maritial_status` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `zipcode` varchar(10) DEFAULT NULL,
  `highest_education_level` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mentee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `mentors` (
  `mentor_id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(45) NOT NULL,
  `login_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`mentor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `mentor_mentee` (
  `mentor_id` int(11) NOT NULL,
  `mentee_id` int(11) NOT NULL,
  PRIMARY KEY (`mentor_id`,`mentee_id`),
  KEY `mentee_id_ref_idx` (`mentee_id`),
  CONSTRAINT `mentee_id_ref` FOREIGN KEY (`mentee_id`) REFERENCES `mentees` (`mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `mentor_id_ref` FOREIGN KEY (`mentor_id`) REFERENCES `mentors` (`mentor_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `staff` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(45) NOT NULL,
  `login_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `forms` (
  `form_id` int(11) NOT NULL AUTO_INCREMENT,
  `mentor_id` int(11) NOT NULL,
  `mentee_id` int(11) NOT NULL,
  `meeting_time` datetime DEFAULT NULL,
  `meeting_place` varchar(45) DEFAULT NULL,
  `ending_time` datetime DEFAULT NULL,
  `pre_planned_purpose` varchar(500) DEFAULT NULL,
  `topic_activities` varchar(500) DEFAULT NULL,
  `accomplishment` varchar(500) DEFAULT NULL,
  `goals_nextmeeting` varchar(500) DEFAULT NULL,
  `mentees_next_meeting` varchar(500) DEFAULT NULL,
  `mentors_next_meeting` varchar(500) DEFAULT NULL,
  `time_next_meeting` datetime DEFAULT NULL,
  PRIMARY KEY (`form_id`),
  KEY `mentor_id_fkey_idx` (`mentor_id`,`mentee_id`),
  CONSTRAINT `mentor_id_fkey` FOREIGN KEY (`mentor_id`, `mentee_id`) REFERENCES `mentor_mentee` (`mentor_id`, `mentee_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
