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

# Java: Control Flow
Code within our methods are executed from top to bottom in the order that they have appeared. However, when it comes to programming, we often don't want things to execute in a straight line. **Control flow statements** allow us to break up the flow of execution by including decision making, looping, and branching abilities in order to enable our program to conditionally execute blocks of code.

We have three different types of control flow statements
- Decision-making statements
    - if-then
    - if-then-else
    - switch
- Looping statements
    - for
    - while
    - do-while
- Branching statements
    - break
    - continue
    - return

## Decision-making statements
- if-then
    - Tells our program to execute a certain block of code if the test evaluates to true
- if-then-else
    - Gives your program a secondary path of execution if the test evaluates to false
    - You might be aware of some programming languages having a special "elseif / elif / elsif" keyword
        - This does not actually exist in Java, instead the else and if keywords are separate
- switch
    - Simplifies the process of having multiple execution paths
    - Works with *byte*, *short*, *char*, *int*
    - Also works with some other types like *enums*, *String*, and wrapper classes such as *Byte*, *Short*, *Character*, *Integer*
    - There is a concept known as fall-through with switch statements, where if you omit a break keyword, you will execute all subsequent cases
    - We can also include a default case that executes if no other is met

## Looping statements
- for statement (for loop)
    - Gives us a compact way to iterate over ranges of values

```java
for (<initialization>; <termination>; <increment>) {
    // code here
}
```

- *initialization* expression intializes the loop
- *termination* expression terminates the loop once it evaluates to false
- *increment* expression which can be used to increment or decrement a value in that section, per iteration of the loop

- while loop
    - Allows us the ability to loop over a block of code while some condition is true
    - If the condition is initially false, the while block will never execute

- do-while loop
    - very similar to the while loop
    - The main difference is that the do-while block is guaranteed to execute at least once

## Branching statements
- break
    - has two forms:
        - labeled
        - unlabeled
    - break is also used not only in loops, but also in switch statements to not "fall-through" to the subsequent cases
- continue
    - skips current iteration of for, while, and do-while loop
    - has two forms:
        - labeled
        - unlabeled
- return
    - same as the method return statement
    - used to exit from the current method entirely
    - we can use return; for void methods, or return some value for non void methods

# Java: Arrays
Arrays in Java are contiguous blocks of memory of sequentially stored elements of the same type. Some important properties of arrays in Java include:
- Arrays are a fixed size, so once they are instantiated (**they are objects**), their size cannot change
- Variables in arrays are ordered and have indices beginning from 0
- The size of an array must be specified by an int value (not long or short, etc.)
- Can be multi-dimensional (array of arrays)
- The length of an array can be found by accessing its length field

# Java : Methods and Parameters
Methods are blocks of code that only run when they are called. The purpose of utilizing methods is to reuse code by defining it only once, and then using it many times. We have already seen the usage of methods in the form of "public static void main(String[] args)" method, which is used as the entry-point of execution in our Java programs.

- Methods must be declared within a class in Java
- Methods are defined with an access modifier, follow by any number of non-access modifiers, return type, and then the name of the method and parentheses with parameters inside
```java
public static int add(int x, int y) {
    return x + y;
}
```
- public (access modifier): means this method can be accessed from anywhere
- static (non-access modifier): this method belongs directly to the class it is defined in and not to an object of that class
- int: this method should return an int primitive value
- x, y: these are int parameters that can be passed into the method

To use this method, we need to write the method's name, followed by the parameters supplied inside the parentheses and a semicolon.

```java
public static void main(String[] args) {
    int y = add(1, 2);
    System.out.println(y);
}
```

## Method Overloading
It is possible to have methods with duplicate names in Java. This allows us to group methods with similar functionality together and not have to create unique names for each. In order to overload methods, we need to
- Have different parameter types
- Have a different number of parameters

There is no ambiguity as to which method you want to execute based on this criteria.

```java
public static int add(int x, int y) {
    return x + y;
}

public static int add(int x, int y, int z) {
    return x + y + z;
}
```

Overloaded methods, despite having the same name, are all different methods! They are not actually related in any way except naming. Oftentimes, you will hear method overloading refered to as **compile-time polymorphism**, because the compiler, when translating the source code to bytecode, will have a clear distinction between each overloaded method.

## Method Var-args
Var-args stands for "variable arguments", which allows us to set arguments that can be determined at runtime. Under the hood, Java creates an array that contains the arguments provided. There are two important constraints when working with varargs:
- You can only have 1 varargs parameter per method
- It must be the last parameter defined

# Java : Constructors
When we use the new keyword to create an object, the JVM invokes a special class member called a **constructor**. A constructor declares how an object is to be instantiated and initialized from the class blueprint.
- Constructors are declared like methods, but the method signature does not contain a return type
- Constructors always have the same name as the class it is defined in

## Constructor associated keywords
- this keyword
    - Can be used for constructor chaining when invoked as a method (ex. this(..))
    - Or to be refered to as the object being instantiated
        - Done to avoid "variable shadowing" problems
- super keyword
    - references the parent class
    - when invoked like a method (ex. super(..)), the parent class constructor is called
- Default constructor
    - if we don't define a constructor, the default constructor is provided automatically by the compiler
    - the default constructor is known as the no-args constructor
    - NOTE: IF we define a constructor in our class, this will NOT be provided

The default no-args constructor looks like this, except it is implicitly inserted
```java
public MyClass() {
    super();
}
```

# One of the Pillars of OOP: Inheritance
Inheritance is the process by which classes, and thus, objects, can **inherit** the state and behavior of other classes. The class that other classes inherit from is known as a **base/parent/super** class, while the class that inherits from another class is called the **child/sub**-class.

## Terminology
- Base/Parent/Super class: the class from which the other classes inherit from
- Sub/Child class: the class that inherits from another class
- IS-A relationship: A class that inherits from another class forms an IS-A relationship with the parent class
(ex. Dog is an Animal)

In Java, all **NON-private** fields and methods are inherited from a parent class.

## Benefit
The main benefit with inheritance is reusability of code. By using inheritance, we can abide by the DRY principle (don't repeat yourself).

# Wrapper Classes
Wrapper classes allow us to represent primitives as objects. This is important when we begin learning about data structures in the built-in Java Collection API, which can only store objects and not primitives.
- Wrapper classes are part of the java.util package
- Conversion between a wrapper object and a primitive occurs automatically
    - This is known as **autoboxing** when automatic conversion from primitive to object happens
    - It is known as **unboxing** when we convert from object to primitive
    - Remember these terms!

## Wrapper utility methods/fields
### Fields
- MAX_VALUE: constant holding the maximum value of that particular wrapper object / primitive can have
- MIN_VALUE: constant holding the minimum value of that particular wrapper object / primitive can have
- SIZE: the number of bits used to represent an int value
- TYPE: *Class* instance representing primitive type

### Methods (static methods)
- valueOf(...): parses argument into a wrapper object containing the value
- parseInt, parseDouble, ... etc: parses the argument into a primitive of that type
- intValue, longValue, doubleValue, etc.: returns value of wrapper object as primitive

# Packages and Imports
Packages are used to group related classes. We can essentially think of packages like folders. Packages are used to group similar code as well as to prevent naming conflicts in order to promote maintainability. We have:
- Built in packages from the Java API
- User-defined packages (as what we have been creating ourselves)

Imports allow us to use classes from other packages. The **import** keyword tells the JVM what class to use from where. We also **import static**, (static imports), which allow us to import static methods and members and use them directly without needing to refer to the classname + dot operator. 

The **package** keyword followed by package name should be the first line in the .java file, followed by any imports from other classes.

# Access Modifiers
Access modifiers help to restrict the accessibility of a class, constructor, field, or method. We have four possible access modifiers in Java, from most restrictive to least:
1. Private
    - Allows for access only within the same class
2. Default
    - This is the access modifier that the class or class member will have if we do not specify any of the other 3 access modifiers
    - Allows for access within the same package
3. Protected
    - Allows for access within the same package as well as any subclasses outside of that package
4. Public
    - Allows for access anywhere, any package, anything