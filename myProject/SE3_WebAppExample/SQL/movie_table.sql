CREATE TABLE `movie` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Movie_Name` varchar(50) NOT NULL,
  `Director` varchar(50) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `Rating` int(3) NOT NULL,
  `Comment` varchar(40) NOT NULL,
  PRIMARY KEY  (`ID`)
  );
  
 

  
  INSERT INTO movie VALUES (null, "Saving Private Ryan", "Steven Spielberg", "Action", 9,""),
  						  (null, "The Wolf of Wall Street", "Martin Scorsese", "Comedy", 10,""),
  						  (null, "Face/Off", "John Woo", "Action", 6,""),
  						  (null, "The Dark Knight Rises", "Christopher Nolan", "Thriller", 10,"");

 DROP TABLE movie;
SELECT ALL * FROM movie;
INSERT into movie values(null, "Jurasic Park", "Steven Spielberg","Action", 9,"");
INSERT into movie values(null, "The Lord of the Rings", "Peter Jackson","Action", 10,"");
INSERT into movie values(null, "The Hobbit 1", "Peter Jackson","Magical", 10,"");
INSERT into movie values(null, "The Hobbit 2", "Peter Jackson","Magical", 7,"");
INSERT into movie values(null, "The Hobbit 3", "Peter Jackson","Magical", 8,"");
INSERT into movie values(null, "Avatar", "James Cameron","Thriller", 10,"Great movie");



UPDATE movie SET RATING = 5 WHERE ID = 2;
UPDATE movie SET COMMENT = 'HEY' WHERE ID = 2;
SELECT ALL * FROM movie;
