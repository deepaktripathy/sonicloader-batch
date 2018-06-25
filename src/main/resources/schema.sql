DROP DATABASE IF EXISTS DATADB;
CREATE DATABASE DATADB;
--create user datauser;
--grant all on datadb.* to 'datauser'@'localhost' identified by 'datapass';

DROP DATABASE IF EXISTS BATCHDB;
CREATE DATABASE BATCHDB;
--create user batchuser;
--grant all on batchdb.* to 'batchuser'@'localhost' identified by 'batchpass';

--DROP TABLE IF EXISTS STUDENT;

/*
CREATE TABLE STUDENT (
  id         BIGINT(10)   NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name      VARCHAR(255) NOT NULL,
  last_name      VARCHAR(255) NOT NULL,
  email      VARCHAR(255) NOT NULL,
  age        INT(3)       NOT NULL
);
*/