#### REST Demo
A simple application to demonstrate how to build a Bank Account web service using Spring boot.

##### Technologies used
The following technologies have been used to build this demo application.

	■ Java 1.8
	■ Maven
	■ Springboot
	■ Jacoco plugin - for code coverage
	■ MySQL Ver 14.14 
	■ RabbitMQ 
	
	

The application has the following functionalities with the following constraints:- 

 **Deposit**
 
 	■ Max deposit for the day = $150K
	■ Max deposit per transaction = $40K
	■ Max deposit frequency = 4 transactions/day
	
 **Withdraw**
 
	■ Max withdrawal for the day = $50K
	■ Max withdrawal per transaction = $20K
	■ Max withdrawal frequency = 3 transactions/day
	■ Cannot withdraw when balance is less than withdrawal amount
	
 **Query balance**
 
##### Run instructions

Start mysql and create a database and user to access the database with.

	create database bank;
	create user 'banker'@'localhost' identified by 'banker'; -- Creates the user
    grant all on bank.* to 'banker'@'localhost'; 
    
   Sample call to add a new account 
   
    curl 'localhost:8080/accounts/add?number=121312131&name=omari&type=Credit'
    
 
 In order to run the 

 1. tests run 
 
	■ mvn test
	
 
 2. the application 
 
	■ mvn spring-boot:run
	
	
	

 
 
 
 
