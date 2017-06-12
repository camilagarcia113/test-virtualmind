Run mvn spring-boot:run

Then go to the following endpoints to access to the information:

localhost:8080/users
localhost:8080/quotation/{currency} where {currency} can be ARS, USD, BRL


The sql script for the users creation table and data insertion is in src/main/resources/schema.sql

It's not necessary to run the script. The DB will be created when the application is starting to run
But the user and password for the datasource should be changed in the application.properties

To see the web page, once the app is up and running go to localhost:8080/index.html
