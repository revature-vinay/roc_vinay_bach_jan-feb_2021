# SQL Study Guide

You should be able to explain and apply all of the following topics:

# Basics
- Schema
- SQL language and sublanguages
    - DDL (Data definition language)
        - ALTER
        - TRUNCATE
        - CREATE
        - DROP
    - DML (Data manipulation language)
        - CRUD operations
        - SELECT
        - INSERT
        - UPDATE
        - DELETE
    - DQL (Data query language)
        - SELECT
    - DCL (Data control language)
        - GRANT
        - REVOKE
    - TCL (Transaction control language)
        - COMMIT
        - ROLLBACK
        - SAVEPOINT
        - SET TRANSACTION
- RDBMS systems and popular vendors
    - PostgreSQL
    - Oracle
    - MySQL
    - MS SQL
    - These are different dialects and different systems
- SQL data types
    - VARCHAR(n)
    - INTEGER
    - SERIAL (postgres)
    - NUMERIC
    - BOOLEAN
    - etc.
- Constraints
    - NOT NULL
    - PRIMARY KEY
    - UNIQUE
    - FOREIGN KEY
    - DEFAULT
    - CHECK
- Composite keys
    - Primary key composed of two or more columns
    - Each column is called a **candidate key**

# Relationships & Normalization
- Referential integrity
- Multiplicity/cardinality relationships
    - One-to-one
        - the foreign key is on either table
        - the foreign key also has the unique constraint
    - One-to-many
        - the foreign key is on the many table
    - Many-many
        - Junction tables
            - Has the foreign keys pointing to each table
- Normalization
    - 1NF 
        - Atomic data
        - Primary key
    - 2NF
        - 1NF + ...
        - No partial dependencies
            - Your columns must describe the entire key
        - if you don't have a composite key, you're already in 2NF
    - 3NF
        - No transitive dependencies
        - Your columns must describe only the key itself
    - 1NF ("the key"), 2NF("the whole key"), 3NF ("nothing but the key")

# Queries
- Query clauses
    - SELECT
    - FROM
    - WHERE
    - GROUP BY
    - HAVING
    - ORDER BY
- Aliases
- Joins
    - INNER
    - OUTER
    - LEFT/RIGHT
    - CROSS
    - SELF
- Set Operations
    - UNION
    - UNION ALL
    - INTERSECT
    - EXCEPT

## Aggregate Functions
- Generally use in combination with GROUP BY
- MIN
- MAX
- AVG
- COUNT
- SUM
- etc..

## Scalar Functions
- LEN
- UPPER
- LOWER
- ABS
- TRIM

## PL/SQL
- User defined functions

# Transactions
- Properties of a transaction (ACID)
    - Atomicity
    - Consistency
    - Isolation
    - Durability
- Isolation levels (in order of least strict to most strict)
    - Read uncommitted 
    - Read committed: prevents dirty reads
    - Repeatable read: prevents dirty reads + non-repeatable reads
    - Serializable: prevents dirty reads + non-repeatable + phantom
- Read phenomena
    - Dirty read
    - Non-repeatable read
    - Phantom read

# JDBC
- JDBC classes/interfaces
    - DriverManager (class)
    - Connection (interface)
    - DataSource
    - SQLException (class)
    - Statement (interface)
    - PreparedStatement (interface)
    - CallableStatement (interface)
    - ResultSet (interface)
- Creating database connection
    - We made a utility class
    - WE then do all of the logic in the getConnection() method to return a Connection object
- Connection Parameters
    - Connection String (URL)
        - `jdbc:postgresql://<host name>:<port>/<database name>`
    - username
    - password
        - Hardcode (which is not advised)
        - Set in environment variables
        - Set in properties file
- JDBC autocommit mode
- Data access object (DAO) design pattern

# 3 layer architecture
- Presentation layer
    - This basically represents the layer that the user interacts with
    - This could be a menu system like in our console application
    - More realistically, it would be a layer representing REST API endpoints
- Service layer
    - This contains the business logic of the application
    - This is the intermediary between the presentation layer and the DAO layer
- DAO layer
    - Interaction with the database