# JDBC
JDBC stands for Java Database Connectivity. It is a relatively low-level API used to write Java code that interacts with relational databases via SQL.

The JDBC API has classes and interfaces that are located in the `java.sql` and `javax.sql` packages. There are several key classes and interfaces that are commonly encountered when writing JDBC code.

- `DriverManager` class: used to register a database driver
- `DataSource` interface: used to retrieve connections as an alternative to `DriverManager`
- `Connection` interface: represents the actual physical connection with the database
- `SQLException` class: this is the general exception that is thrown when something goes wrong when accessing the database
- `Statement` interface: used in order to execute SQL statements
- `PreparedStatement` interface: represents pre-compiled SQL statements (which you can also pass different parameters into)
- `CallableStatement` interface: used to execute stored procedures (user defined functions)
- `ResultSet` interface: represents data returned from the database

# Creating a Database Connection
To obtain a connection to the database, we need to have the credentials to our database. The location of the database is known as a **connection string**, which includes information about what SQL driver we're using, the ip address/domain, the port, and what the database name is.

Since we're utilizing Postgres, the beginning of our connection string will specifically be

`jdbc:postgresql:`

The final form of the connection string will be formatted as:

`jdbc:postgresql://<HOST_NAME>:<PORT>/<DB_NAME>`

In summary, what we need is
- A connection string
- Username
- Password

Steps to utilize JDBC:
1. Register the JDBC driver
2. Open a connection
3. Execute some JDBC statement using either
- `Statement`
- `PreparedStatement`
- `CallableStatement`
4. Retrieve the results that are returned in a `ResultSet` object