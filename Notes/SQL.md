# SQL
SQL stands for **structured query language**, which is a domain-specific language for working with a particular category of databases known as relational databases. 

SQL is known as a **declarative language**, which means that we essentially declare what we want data we want to retrieve and let the engine under the hood take care of what needs to be done. Most of the heavy lifting in order to retrieve the data is abstracted away from the user. This is opposed to **imperative languages** such as Java, Python, or C. Imperative languages are languages that require giving instructions to the finest level of detail in which we need to specifically define what we want to accomplish.

SQL is NOT a programming language, but is rather a "query" language that allows us to perform operations on a relational database.

SQL has English-like syntax that allows people who need to access data from a relational database ease of use. It abstracts away the process of retrieving or manipulating data and shifts the focus to WHAT instead of HOW. 

# Relational Databases
A relational database is a database that stores information in tables in the form of rows and columns. This is very similar to how data is stored in a spreadsheet. Each row in the table is a particular record, while the columns correspond to the different properties in the table. 

## Relational Database Management System (RDBMS)
To provide for a way to utilize the concept of relational databases, we have RDBMSes, or **relational database management systems**.
- Refers to the database program itself
- This is the software that executes queries on data
    - retrieving
    - updating
    - adding
- Many different RDBMSes available
    - Oracle
    - PostgreSQL ("Postgres")
    - MySQL
    - MS SQL Server
    - Microsoft Access
    - These are all different flavors of SQL that can have differences in the language dialect

# SQL Datatypes
Similar to how we have various datatypes in Java, we also have datatypes within SQL.

## Numeric Types
| Name | Storage Size | Description | Range |
| :--- | :----------- | :----- | :---- |
| smallint | 2 bytes | small-range integer | -32768 to 32767 |
| integer | 4 bytes | typical choice for integer | -2147483648 to 2147483647 | 
| bigint | 8 bytes | large-range integer | 	-9223372036854775808 to +9223372036854775807 |
| decimal | variable | user-specified precision | up to 131072 digits before decimal point, up to 16383 digits after |
| numeric | variable | user-specified precision | up to 131072 digits before decimal point, up to 16383 digits after |
| real | 4 bytes | variable-precision | 6 decimal digits precision |
| double precision | 8 bytes | variable-precision | 15 decimal digits precision |
| smallserial | 2 bytes | small autoincrementing integer | 1 to 32767 |
| serial | 4 bytes | autoincrementing integer | 1 to 2147483647 | 
| bigserial | 8 bytes | large autoincrementing integer | 1 to 9223372036854775807 |

## Monetary Types
| Name | Storage Size | Description | Range |
| :--- | :----------- | :---------- | :---- |
| money | 8 bytes | currency amount | -92233720368547758.08 to +92233720368547758.07 | 

## Character Types
| Name | Description |
| :--- | :---------- |
| varchar(n) | variable-length with limit |
| character(n), char(n) | fixed-length, blank padded |
| text | variable unlimited length |

There are also other types such as
- Date/Time types
- Binary data types (to store files and images, for example)
- Boolean type
- etc.

# SQL Sublanguages
SQL statements are separated into different sub-languages. In SQL, we have 5 different sublanguages to be aware of.
- DDL - Data definition language
- DML - Data manipulation language
- DQL - Data query language
- DCL - Data control language
- TCL - Transaction control language

## Data Definition Language (DDL)
Data definition language is a sublanguage used to define the database schema, which is essentially the structure or skeleton of the database. Keywords belonging to DDL include:
- CREATE, which is used to create new tables (or also objects)
- ALTER, which is used to modify existing tables (or also objects)
- DROP, which is used to delete tables (or also objects)
- TRUNCATE, which is used to delete data inside a table, but NOT the table itself

DDL statements cannot be rolled back, so changes made by these are permanent.

## Data manipulation language (DML) 
Data manipulation language is a sublanguage used to perform operations known commonly as CRUD operations. CRUD stands for (create, read, update, and delete). In the context of DML, the following keywords correspond to each letter in the CRUD acronym, respectively:
- INSERT, which is used to insert a new record into a table
- SELECT, which is used to obtain one or more rows in a table. This is what is used to query data
- UPDATE, which is used to modify one or more records in a table based on a WHERE clause
- DELETE, which is used to delete one or more records in a table based on a WHERE clause

## Data Query Language (DQL)
Sometimes SELECT, which is included in data manipulation language, is included within a separate sub-category known as DQL. This is a point of contention between different people, so just be aware of this difference. DQL is what allows us to retrieve, or query, data from the database. There are some clauses we should be aware of here

### SELECT
SELECT allows us to select data based on various columns. This is followed by the FROM clause, which is where we would specify which table to select from. 

We can choose which columns to select
```sql
SELECT column1, column2, ...
FROM table_name;
```

We can also display data from all columns using the (*) wildcard
```sql
SELECT *
FROM table_name;
```

The `WHERE` clause allows us to select records that match a certain condition
```sql
SELECT *
FROM table_name
WHERE condition
```

### GROUP BY 
The group by clause can be added after SELECT... FROM ... WHERE ... in order to combine all rows by some column specified in the query and any aggregate functions performed that were stated
```sql
SELECT name, COUNT(name)
FROM student
GROUP BY name
```
We can also add a `HAVING` clause after the `GROUP BY` in order to filter out the results after filtering. 

**Keep in mind the difference between WHERE and HAVING**

# Aggregate and Scalar Functions
## Scalar Functions

Scalar functions act on individual values, PER ROW. Scalar functions can be used with the SELECT or WHERE clause
- UPPER(<value>)
- LOWER(<value>)
- LENGTH(<value>)
- ROUND(<value>)
- ABS(<value>)
- Many others

## Aggregate Functions
Aggregate functions operator on multiple values (across multiple rows). These functions can be used to combine, or aggregate, the values existing in a column
- MAX(<COLUMN>)
- MIN(<COLUMN>)
- AVG(<COLUMN>)
- SUM(<COLUMN>)
- COUNT(<COLUMN>)
- and others..

Aggregate functions are used in the SELECT clause, and cannot be used in the WHERE clause.

If we are selecting more than one column in the SELECT clause, a GROUP BY clause is required.

If we want to do some filtering similar to WHERE with aggregate functions, the HAVING clause would be required

# Schema
A database schema refers to the structure of data defined in a relational database. This includes the tables and their columns + datatypes along with the relationship between different tables. These schemas are enforced using constraints that are defined when creating tables. We can visualize the schema of a relational database when we utilize entity-relatioship diagrams, or ERDs.

# Constraints
In SQL, we have the idea of constraints that we can define for specific columns when defining a table. This allows us to ensure consistency and integrity of data in a table. Some of the constraints are the following:
- PRIMARY KEY
- FOREIGN KEY
- NOT NULL
- UNIQUE
- CHECK
- DEFAULT

## Primary Key
A primary key is a constraint that uniquely identifies a record in a table. Usually this constraint will be added to some sort of ID field/column, such as "employee_id". A primary key is inherently consisting of two other constraints, which are NOT NULL and UNIQUE. In other words, a primary must be provided when inserting a record into a table, unless we have some sort of automatic generation for that primary key behind the scenes.

## Foreign Key
A foreign key is a constraint that signifies that a column is being used to refer to a primary key on a different table. This is what allows us to establish relationships between different tables. For example, if we have 2 tables, owner and car, to model the relationship between owners and their cars, we may have a car table with the foreign key `owner_id` that would reference the `id` field in the owner table. We would then know who the owner of a car is if we look up the id of the owner table.

## Not null
The not null constraint requires that all records (or rows) have a value for that particular field that has this constraint applied to. In other words, if we require data in this column to be present for every record, we would use not null.

## Unique
Unique requires that there are no duplicate values for a particular column across the different records for which the unique constraint is applied

## Check
Check provides the ability to perform validation on records being inserted or modified.

## Default
This constraint allows us to set default values for a column for which this constraint is being applied to, in case we do not provide the column data ourself when inserting a record.

## Composite Keys
Most of the time, the primary key for a table will consist of a single column. Sometimes, however, multiple columns may be used together to create a primary key to uniquely identify a row. These columns are known as **candidate keys**. This forms a primary key with multiple columns known as a **composite key**. In the example of a CD collection, for instance, we may have in a table called `Track` the fields/columns `track_no`, `album_id`, `genre`, etc. Notice that `track_no` by itself would not work as a primary key because a track number may have a track #1, for instance. Therefore, we may create a composite key from `track_no` and `album_id` which would actually be unique.

# Referential Integrity
When we create relationships between tables as we demonstrated with the link between the primary key in one table and the foreign key in another table, we want to make sure that integrity is upheld. For example, we should not have a situation in which a record is pointing to another record that does not exist in the database. If referential integrity is not upheld, we would have a situation in which the database contains **orphan records** - records whose foreign keys are not pointing to an existing record in another table. We can prevent this from occuring by setting CASCADE DELETE, which will allow for records with foreign keys pointing to a record being deleted to be deleted themselves (this is known as a cascading operation).

# Multiplicity
Table relationships, as mentioned before, can be established through the use of foreign key constraints within our tables. There are different types of relationships we can have between tables in relational databases:
- One to One: A classroom has one projector (unique constraint on foreign key)
- One to Many / Many to one: A student has many books. (Many books have one student)
- Many to Many: A teacher can have many students, but a student can also have many teachers

In the case of a one-to-one relationship, the foreign key could be on either side of the relationship. We may have a classroom_id foreign key on the projector table, or we could have a projector_id foreign key on the classroom table, for instance.

A one-to-many relationship requires the foreign key to be on the **many** side of the relationship. The book table would have a foreign key student_id signifying that the book belongs to a particular student.

Many-to-many relationships require that a junction table be created. This allows for the two tables that are both many to be related to each other. We could create some sort of table such as class, which contains two foreign keys, with one pointing to teacher and the other to student.

# Database Normalization
Database Normalization is a design pattern for databases that aims to reduce redundancy and duplicate data. It also aims to help keep a database organized and maintainable.

Referential integrity should always be upheld (e.g. should not have situations with orphan records).

Levels of normalization:
- 0NF = Zero Normal Form
    - No normalization at all
    - Chaos
- 1NF = 1st Normal Form
    - Data should be atomic (e.g. a name field with both First and Last name 'John Doe' should be broken into two columns (firstname, lastname), ('John', 'Doe'))
    - Table must have a primary key
- 2NF = 1st NF + No partial dependencies
    - Cannot have columns dependent on only one part of the composite key
    - You are automatically in 1NF if you have no composite key
- 3NF = 2nd NF + no transitive dependencies
    - If column C is related to column B which is related to column A (PK), we are not in 3NF because C is only indirectly related to the primary key

The way to remember each of these would be that we must have **the key (1NF),  the whole key (2NF), and nothing but the key (3NF).

# Transaction Properties: ACID
Whenever we perform modifications to the data in our database, we are utilizing the SQL sub-language known as DML (data manipulation language). Whatever operations occur before a COMMIT statement is considered as a single transaction, or unit of work. An example of a transaction may be the transferring of money from bank account A to bank account B. Whenever we perform any sort of data manipulation, we need to think about how we might group our units of work together into transactions. Transactions have 4 different properties summarized as the ACID properties:

- Atomicity: this means that all transactions will execute successfully, or none at all
- Consistency: constraints are enforced for every committed transaction. This means that the primary and foreign keys, data types, checks, NOT NULL, UNIQUE, etc. will be upheld. If any violation occurs, the transaction will be rolled back
- Isolation: If we have two transactions occuring at the same time (concurrently) and working on the same data, we should not have one transaction disturbing the other. Isolation essentially gives us some guarantee that concurrently running transactions do not affect one another.
- Durability: Durability means when a transaction is complete (it has been committed), the changes should be persisted to the database. If the system were to suddenly lose power or crash, upon restart of the system, the changes should still be there.

# Isolation Levels & Read phenomena
Isolation levels are applied within the RDBMS to provide consistency to how data is read and transacted and to avoid certain read phenomena. 

## Read phenomena (transaction issues)
Read phenomena describes strange occurrences that could occur if the same data is being manipulated by two or more transactions at the same time. We often try to handle transactions at the same time instead of one after the other because this is faster. There are three read phenomena that should be taken into account:
- Dirty Read
    - Describes the situation when a transaction reads data that has been added by a different transaction that has not committed yet
    - If this uncommitted transaction happens to fail at some point, it will be rolled back, which results in data that is actually not there to be read by this other transaction anyways
    - Hence, this is why it is called dirty read
- Non-repeatable read
    - Describes the situation when a transaction re-reads data sometime later in the transaction that was previously read in the same transaction which another transaction that has already been committed has modified
- Phantom read
    - Describes a situation in which we a transaction re-runs a query and sees that the number of records may have changed because some other transaction modified a value that caused the query to no longer include that record.
    (e.g. if our transaction were querying ages less than 18 and then we query it again later in the transaction, but in between that time another transaction changed someone's age from 18 to 19, we may see that a record is now missing in the second query)

## Isolation Levels
- Refers to the degree in which two transactions will interfere with each other when modifying the same data
- When applications become more complex and more traffic and modifications are made to the application database, we need to account for transactions occuring at the same time
- The more strict our isolation level, the more careful the system is about avoiding conflicts, but this could cause performance issues since concurrency decreases

| Isolation Level | Dirty Read | Non-repeatable Read | Phantom Read |
| :-------------- | :--------- | :------------------ | :----------- |
| Read Uncommitted | Y | Y | Y |
| Read Committed | N | Y | Y |
| Repeatable Read | N | N | Y |
| Serializable | N | N | N |

# Database Joins
- Joins are operations that allow us to "join" data together from different tables
- Useful when retrieving data based on the relationships between tables
- Several types
    - INNER JOIN
        - Only show records that have the condition matching on both sides
    - FULL OUTER JOIN
        - Show matching records and records that have no match, with NULL values on the opposite side
    - LEFT/RIGHT JOIN
        - Data from the LEFT (or RIGHT) table are paired with the other, with NULLS if no match is found for the other side
    - CROSS JOIN
        - Cross product of both tables
        - Produces a list of permutations
            - A lot of data!
            - if one table has 1000 records, and another has 2000
                - 1000 * 2000 = 2,000,000 rows for the result
    - SELF JOIN
        - Not really its own category of JOINs
        - It is a join on the same table
        - e.g. employee table may have a manager_id FK pointing to employee_id PK on the same table!

```SQL
SELECT <columns> FROM <left table> <JOIN TYPE> JOIN <right>
ON <left table>.column = <right table>.column
```

# Set Operations
Set operations are performed using set operators, which are different from joins. Instead of joining two tables together by their columns, set operators take the rows of different result sets and combine them. 

Some operators include:
- UNION [ALL]
    - UNION doesn't keep duplicates unlike UNION ALL
- INTERSECT
    - returns records common between queries
- EXCEPT
    - removes from our first result set what rows appear in the second result set and gives us the first set MINUS the second set