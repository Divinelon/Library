create database library;
use library;

create table User(
  user_id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  telephone VARCHAR(25) NOT NULL,
  user_password VARCHAR(32) NOT NULL,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  isLibrarian BIT NOT NULL,
  primary key(user_id)
);

create table Genre(
genre_id INT NOT NULL AUTO_INCREMENT,
kind_of_genre VARCHAR(70),
primary key(genre_id)
);

create table Author(
author_id INT NOT NULL AUTO_INCREMENT,
author_name VARCHAR(45) NOT NULL,
primary key(author_id)
);

create table Book(
book_id INT NOT NULL AUTO_INCREMENT,
title VARCHAR(45) NOT NULL,
count INT NOT NULL,
year INT NOT NULL,
authorId INT NOT NULL,
genreId INT NOT NULL,
primary key(book_id),

INDEX fk_Book_Author_id (authorId ASC),
INDEX fk_Book_Genre_id (genreId ASC),
CONSTRAINT fk_Book_Author FOREIGN KEY (authorId) REFERENCES library.Author (author_id),
CONSTRAINT fk_Book_Genre FOREIGN KEY (genreId) REFERENCES library.Genre (genre_id)
   
);

create table Status(
status_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(45) NOT NULL,
primary key (status_id)
);

create table BookOrder(
  id INT NOT NULL AUTO_INCREMENT,
  userId INT NOT NULL,
  bookId INT NOT NULL,
  statusId INT NOT NULL,
  PRIMARY KEY (id),
  
  INDEX fk_BookOrder_User_idx (userId ASC),
  INDEX fk_BookOrder_Book_idx (bookId ASC),
  INDEX fk_BookOrder_Status_idx (statusId ASC),
  
  CONSTRAINT fk_BookOrder_User FOREIGN KEY (userId) REFERENCES library.User(user_id),
  CONSTRAINT fk_BookOrder_Book  FOREIGN KEY (bookId) REFERENCES library.Book(book_id),
  CONSTRAINT fk_BookOrder_Status FOREIGN KEY (statusId) REFERENCES library.Status (status_id)
   
);

