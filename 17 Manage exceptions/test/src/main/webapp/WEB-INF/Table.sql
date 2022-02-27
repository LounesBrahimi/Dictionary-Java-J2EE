CREATE DATABASE javaee DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE  persons (
 id INT( 4 ) NOT NULL AUTO_INCREMENT ,
 firstName VARCHAR( 20 ) NOT NULL ,
 lastName VARCHAR( 20 ) NOT NULL ,
 PRIMARY KEY ( id )
) ENGINE = INNODB;

insert into persons(firstName, lastName) values ("Lounes", "Brahimi");
insert into persons(firstName, lastName) values ("Eclipse", "Amazigh");