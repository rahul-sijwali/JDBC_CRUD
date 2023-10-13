JDBC crud web appplication using servlet, controller, factory, singleton
DAO,DTO,Connection pool

Tested on java 17 and tomcat 9.0.71

remember to edit src\\in\\rahul\\properties\\application.properties to put suitable values

keep the table ready use the command given below

CREATE TABLE student(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(30),
age varchar(30),
address varchar(30)
);


dependencies:
	servlet-api
	HikariCP
	mysql-connector-j
	slf4j-api
	slf4j-simple

