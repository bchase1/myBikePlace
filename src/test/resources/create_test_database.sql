drop DATABASE myBikePlace_test;
CREATE DATABASE myBikePlace_test;
use myBikePlace_test;


CREATE TABLE user
(
  id INT AUTO_INCREMENT
    PRIMARY KEY,
  createDate TIMESTAMP DEFAULT current_timestamp,
  email VARCHAR(255) NULL,
  firstName VARCHAR(255) NULL,
  lastName VARCHAR(255) NULL,
  pass VARCHAR(255) NULL,
  updateDate TIMESTAMP DEFAULT current_timestamp,
  userName VARCHAR(255) NULL,
  CONSTRAINT user_id_uindex
  UNIQUE (userName)
);

CREATE TABLE bike
(
  id INT PRIMARY KEY not null AUTO_INCREMENT,
  modelYear VARCHAR(4) NULL,
  bikeBrand VARCHAR(255) NULL,
  bikeName VARCHAR(255) NULL,
  accessories VARCHAR(255) NULL,
  user_id INT NOT NULL,
  CONSTRAINT bike_user_id_fk FOREIGN KEY
    (user_id) REFERENCES user(id) on DELETE
    CASCADE on UPDATE CASCADE
);

CREATE TABLE bikeRides
(
  id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  milesRidden int(3) NOT NULL,
  rideDescription VARCHAR(255) NULL,
  user_id int NOT NULL,
  CONSTRAINT bikeRides_user_id_fk FOREIGN KEY
    (user_id) REFERENCES user(id) on DELETE
    CASCADE on UPDATE CASCADE
);

CREATE TABLE role
(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  roleName VARCHAR(255) NULL,
  userName VARCHAR(255) NULL,
  user_id INT NOT NULL,
  CONSTRAINT role_user_id_fk FOREIGN KEY
    (user_id) REFERENCES user(id) on DELETE
    CASCADE on UPDATE CASCADE
);

