--Doest work on h2 db. JPA ends up creating the table in h2 DB.
create table customer
(
`id` INT NOT NULL AUTO_INCREMENT,
`first_name` VARCHAR(45) NULL,
`last_name` VARCHAR(45) NULL,
 PRIMARY KEY (`id`)
);