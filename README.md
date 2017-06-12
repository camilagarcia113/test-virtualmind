#### Steps to run the application:

* MySql db configuration should be changed in the application.properties (user and password).
* The sql script for the users creation table and data insertion is in src/main/resources/schema.sql
    * Only create the schema **usersDB**, it should be enough to get the app up and running.
      ```
      CREATE SCHEMA usersDB;
      USE usersDB;
      ```

      The **users** table will be created and populated when it is starting to run.

* Run ```mvn spring-boot:run ```

* Then go to the following endpoints to access to the information:
    * **localhost:8080/users** -> to get the users saved in the db
    * **localhost:8080/quotation/{currency}** -> to get the quotation of the currency (where {currency} can be ARS, USD, BRL)

* To see the quotations web page **localhost:8080/index.html**
