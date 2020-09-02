:beginner: **JDBC**

- Java Database Connectivity
- Driver (MySql Driver & Oracle Driver)
- Established a connection
  - using the driver manager

:label: ***Executing Queries***  
- Statement
- PreparedStatement

:label: ***Inovking Stored Procs***  
- CallableStatement


--Give it a try! 

:point_right: List of Interfaces in JDBC  
```java
Connector
Statement
PreparedStatement
CallableStatement
ResultSet
```

:point_right: List of CheckedExceptions  
```java
ClassNotFoundException
SQLExceptions
```
 
:point_right: List of Classes  
- OracleDriver
- Class (generic)
- DriverManager

:label: ***Lambda Expressions***

- Why Lambda?
- Less code
- To allow functional programming using OOP
- helps making anonymous class easy

:question: type of lambda?

- a Functional Interface.
- an anoymous class implementation of the functional interface.  

:question: syntax for lambda expression  

epxression :    () -> statement
(param1, param2) -> { statement1, statement 2}.

:question: Can we treat lambdas as 
- (function + data) that can be carried anywhere in your application
- by assigning it to a reference.

variable = function [lambda expression]
carry the variable anywhere
pass it as a paramter to other functions.

:beginner: **Power of interfaces**  
InternetConnectivity
Fibernet
Lan

--Interfaces are contracts
--That are implemented based on specific needs.

