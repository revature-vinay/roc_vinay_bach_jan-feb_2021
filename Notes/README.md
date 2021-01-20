# Java
Java is a high-level, compiled, strongly typed object-oriented programming (OOP) language.
- High-level: Code that is easily human readable, as opposed to binary or assembly.
- Hybrid between compiled and interpreted language: Human-readable code is **compiled**, or transformed, into a form more optimized for computers to read
    - For example, C++ code is compiled into binary
    - Java code on the other hand is compiled into Java byte-code, which the Java Virtual Machine (JVM) will then interpret this byte-code and essentially run the program.
- Strongly-typed: variables declared of a certain type can only have values assigned to it of that same type

## Benefits
- Platform independent (write once, run anywhere)
- C-language inspired syntax
- Automatic memory management: accomplished with the help of a *garbage-collector*
- Extensive built-in runtime library
- Rich open-source community

# Java 8 Features
We will be using Java 8, which is one of the Long Term Support (LTS) versions of Java. This was a really significant update that added a lot of features. 

Java 8 added features such as
- Lambda expressions
- Method references
- Functional interfaces
- Stream API
- Default methods in interfaces
- Collectors class
- etc

# JVM, JRE, and JDK
In order to write and run Java, we need to have an understanding of the JVM, JRE, and JDK. In particular, understanding these different components that make up the core ability to run and write Java programs sets a foundation for what it means when we encounter all of these terms whenever, for instance, we're installing Java.

- JVM (Java Virtual Machine): Enables a computer to run Java programs. It essentially behaves like an interpreter or just-in-time compiler (JIT) which takes bytecode and translate it to something the computer can understand at an even lower level than bytecode. 
    - We have different implementations of the JVM for different operating systems
        - Linux
        - Windows
        - Mac
        - etc..
        - The important thing to take away from this is that this allows you to run the same bytecode on any operating system (**platform independence**)
- JRE (Java runtime environment): Contains the JVM and runtime libraries that our code may be calling and using. If the only thing we need to do is run Java programs, all we need to install is the JRE.
- JDK (Java development kit): contains the JRE (which of course contains the JVM) + developer tools like the compiler (javac), debugger, documentation tools (javadoc), and other command-line utilities

If we want to both write and run Java programs, we should install a JDK. If we only want to run Java programs and not write them (for example your customers), we would install a JRE.

## Write Once Run Anywhere (platform independence)
Platform independence is establsihed by the JVM. We only need to compile the code once from source code into bytecode, which will then allow us to run our Java program on any operating system, any machine, as long as we have a JVM compatible for that particular operating system. 

# Java Data Types
At a high level, there are two main groups of data types. These are the following:
- Primitive data types
- Object reference data types

Primitive data types are the fundamental data types in Java that make up the building blocks for Object data types. We can have various states that are composed of either primitives or object references.

Think of chemistry, for example. In our various mixtures, we can have a mix of compounds, molecules, atoms, etc., but ultimately everything reduces down at some point to atoms. Atoms are analogous to the idea of primitives.

## Primitives
- Four categories of primitives:
    - Integer types (integral types)
        - ex. `10`, `11`, etc...
    - Floating point types (decimal numbers)
        - ex. `10.0`, `11.564`, etc..
    - Character type
        - represents a single character
        - ex. `'c'`
    - Boolean type
        - represents a true/false value
- Important property: stored by value

Java is passed by value, unlike some other programming languages.

---
**Integral Types**
| Type | Bits | Min Value | Max Value | Literal Form |
| :--- | :--- | :-------- | :-------- | :----------- |
| byte | 8 bits | -128 | 127 | 0 |
| short | 16 bits | -32768 | 32767 | 0 |
| int | 32 bits | -2,147,483,648 | 2,147,483,647 | 0 |
| long | 64 bits | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 0L |

---
**Floating Point Types**
| Type | Bits | Min Value | Max Value | Literal Form |
| :--- | :--- | :-------- | :-------- | :----------- |
| float | 32 bits | 1.4 * 10 ^ -45 | 3.4 * 10^38 | 0.0f |
| double | 64 bits | 4.9 * 10^-324 | 1.7 * 10^308 | 0.0 |

---

**Character Type**
- Stores a single unicode character
- Literal values can be placed between single quotes `'c'`, or `'C'`
- For unicode points, use \u followed by the 4-digit hex value
- Can store positive numbers 0 -> 65535
---

**Boolean Type**
- Stores true/false
- Literal values are simply **true** and **false**

Maybe to remember primitives, go in this order: byte -> short -> char -> int -> long -> float -> double + boolean

## Object Reference Types
- Object reference types are the other category of data type besides primitives. They are used to refer to objects
- In particular, they do not store the object itself. They contain an address (or link) to this object that is somewhere else in memory
    - Unlike primitives, which do store the value itself
    - Think of a reference type as a variable holding information on where an object of that particular type (as defined by the class, which you can think of as a blueprint) is located

# Java: Classes and Objects
- Java has the idea of **classes** and **objects** built into the language
    - Objects: represent real-world or conceptual entities
        - object have **members**, which are composed of two types:
            - State: (also known as fields or instance variables)
            - Behavior: (also known as instance methods)
    - Classes: these are the blueprints for how to create objects
        - This is where the methods and fields are defined
        - Objects are created from these class **blueprints**
- Allow us to use OOP in Java

# Casting
In Java, at a high level, we essentially have two forms of casting:
- Explicit casting
- Implicit casting

Casting can be performed on both primitive and reference data types. For primitives, this is known as primitive conversion, and for reference variables, it is known generally as casting. 

In both cases, we "turn" one type into another, but the difference between primitive conversion and reference type casting is quite different. The difference mainly stems from the fact that primitive variables contain a value, which results in actual changes in its value.

## Primitive Variable Casting
Primitive casting is known as type conversion. This allows us to change the value from one data type to another. Implicit casting occurs if we go from a primitive type that is **smaller** in range to one that is **larger** in range. In technical terms, implicit casting occurs when the casting operation is "safe", while explicit casting is necessary if it is unsafe (in cases where you can lose data).

- Widening Conversion
    - Occurs implicitly
    - byte -> short -> char -> int -> long -> float -> double
    - Notice how long fits inside float, despite long being 64 bits and float being 32 bits.. because of how the ranges are represented
- Narrowing Conversion
    - Occurs explicitly
    - Care should be taken
    - double -> float -> long -> int -> char -> short -> byte

## Reference Variable casting
Reference variable casting occurs when we convert from one reference type to another. In the case of reference variable casting, implicit casting occurs if we go from a child class type up to a parent class type, which is "safe" operation. Explicit casting occurs if we go from parent class to child class, which is "unsafe".

- Unlike primitive casting, reference casting doesn't touch the object itself
    - Reference casting simply labels the object a different way
    - It either expands or narrows methods/properties available to work with
- Implicit casting, going from child to parent, is known as **upcasting** because we're going up the hierarchy of inheritance
- Explicit casting, going from parent to child, is known as **downcasting** since we are going down the hierarchy to a more specific reference type
    - This widens the methods and properties we can work with

# Java: Operators
Operators in Java allow us to perform operations with our primitives. In Java, we have 5 different categories of operators.
- Arithmetic Operators (adding, subtracting, dividing, multiplying, etc.)
- Logical Operators (these are operators that evaluate to true/false aka boolean, &&, || (AND, OR, NOT...))
- Assignment Operators (=, *=, /=, ...)
- Relational Operators
- Relational Operators (comparison operators)
- Bitwise Operators

## Arithmetic Operators
Arithmetic operators perform common mathematical operations.
| Operator | Name | Description | Example |
| :------- | :--- | :---------- | :------ |
| + | Addition | Adds together two values | x + y |
| - | Subtraction | Subtract one value from another | x - y |
| * | Multiplication | Multiplies two values | x * y |
| / | Division | Divides a value by another | x / y |
| % | Modulus | Evaluates to the division remainder | x % y |
| ++ | Increment | Increases the value of a variable by 1 | ++x or x++ |
| -- | Decrement | Decreases the value of a variable by 1 | --x or x-- |

Operator Precedence (from highest to lowest)
- Postfix (x++ or x--)
- Prefix (++x or --x)
- Multiplicative (*, /, % <- modulo operator)
- Additive (+, -)
- Generally follows PEMDAS

Operators with equal precendence are evaluated from left to right
```java
int x = 1 + 2 - 5 + 3 // 1 + 2 - 5 + 3 = 3 - 5 + 3 = -2 + 3 = 1
```

We can override precedence using parentheses
```java
int x0 = 1 + 2 * 3 // 1 + 6 = 7
int x1 = (1 + 2) * 3 // 3 * 3 = 9
```

Nested parentheses are evaluated from inside out
```java
int x = ((1 + 2) * 3) * 4
// (3 * 3) * 4 = 9 * 4 = 36
```

## Logical Operators
Logical operators are used to perform operations with booleans

| Operator | Name | Description | Example |
| :------- | :--- | :---------- | :------ |
| && | Logical AND | Evaluates to true if both statements are true | x > 10 && x < 20 |
| \|\| | Logical OR | Evaluates to true if at least one of the statements is true | x < 10 \|\| x > 20 | 
| ! | Logical NOT | Evaluates to false if the result is true and vice versa | !(x < 5) |

## Assignment Operators
Assignment Operators allow us to assign values to a particular variable

| Operator | Example | Equivalency |
| :------- | :------ | :---------- |
| = | x = 3 | x = 3 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 | x = x % 3 |

## Relational Operators
THese are also known as comparison operators, which allow us to compare values against each other. These operators evaluate to boolean values.

| Operator | Name | Example |
| :------- | :--- | :------ |
| == | Equal to | x == y |
| != | Not equal | x != y |
| > | Greater than | x > y |
| < | Less than | x < y |
| >= | Greater than or equal to | x >= y |
| <= | Less than or equal to | x <= y |
| instanceof | Instance Comparator | returns true if a reference variable is pointing to an object of that type | x instanceof String |

## Bitwise Operators
Bitwise operators are used to perform binary logic with bit representation of integer or long primitives

| Operator | Description | Example | Same as | Result | Decimal |
| :---- | :---- | :---- | :---- | :---- | :----
| & | AND - Sets corresponding bit to 1 if both bits are 1 | 5 & 1 | 0101 & 0001 | 0001 | 1 |
| \| | OR - Sets each bit to 1 if any of the two bits is 1 | 5 \| 1 | 0101 \| 0001 | 0101 | 5 |
| ~ | NOT - switches bits to the inverse | ~5 | ~0101 | 1010 | 10 |
| ^ | XOR - Sets a bit to 1 if one and only 1 of the bits is 1 | 5 ^ 1 | 0101 ^ 0001 | 0100 | 4 |
| << | Zero-fill left shift - Shifts bits left, pushes in zeroes from the right and lets leftmost bits fall off | 9 << 1 | 1001 << 1 | 0010 | 2 |
| >> | Signed right shift - Shift right by pushing in copies of leftmost bit on the left and letting rightmost bits fall off | 9 >> 1 | 1001 >> 1 | 1100 | |
| >>> | Zero-fill right shift | 9 >>> 1 | 1001 >>> 1 | 0100 | 4 |

