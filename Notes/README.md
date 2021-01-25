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
| ^ | Logical XOR | Evaluate to true if one of the statements are true and only one | x > 10 ^ x < 10
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

# One of the Pillars of OOP: Encapsulation

Encapsulation is the principle in OOP of
1. Containing related state and behavior together in a class
    - Can help us to adhere to the Single Responsibility Principle (SRP)
2. Hiding and preventing change to an object's data members
    - Prevents arbitrary external changes that could cause an object to be in an invalid/inconsistent state (for example, age being negative)

Encapsulation introduces the idea of **getter** and **setter** methods, also known as **accessor** and **mutator** methods, respectively. Getter methods are used to access private fields from outside, while setter methods allow us to modify private fields from outside. Access to the getter and setter methods are controlled by access modifiers, which we have covered.

# Variables Scopes
Like all other programming languages, Java has the concept of scope. Scope is inter-related with the access modifiers, but is a different concept (try not to confuse these two topics).

1. Static Scope
    - Static scope refers to a variable that belongs to the class itself
2. Instance Scope
    - Instance scope referes to a variable that belongs to a particular instance/object
    - Instance methods can access static fields/methods! (directly)
3. Method Scope
    - Refers to variables defined within a method
    - Once the method finishes executing (when the method returns), then the variable will no longer be in scope
4. Block Scope
    - Refers to a block of code within a method
    - For example, variables declared inside an if statement code block, for loop block, while loop block, etc.

# One of the Pillars of OOP: Polymorphism
Polymorphism means "taking on many forms". In the context of object-oriented programming (OOP), polymorphism describes how objects can behave differently in different contexts. In Java, this comes often in the form of the following:
- Method Overloading
- Method Overriding

## Method Overloading
Method overloading describes the case where there are two or more methods in a class with the same name, but different method signature in the form of different types of parameters and/or different numbers of parameters.

We have already covered this. Method overloading is also known as **compile-time** polymorphism, because the parameter/argument list is already known at compilation. Behind the scenes, the compiler differentiates these methods, because for all intents and purposes, these are different methods entirely.

## Method Overriding
Method overriding describes the case in which a child class has the same method signature as a method in the parent class. However, this method in the child class can have a different implementation (different code inside the method). Child classes can change the default behavior, which makes class hierarchies and inheritance more flexible and dynamic. Method overriding is **run-time polymorphism**

When overriding a parent method in a child class, the method must:
- Have a covariant return type
- The same method name
- The same method parameters
- The same access modifier or more access (ex. if the parent method is default, the child must be default or higher (protected, public))

```java
Animal anotherAnimal = new Dog();
anotherAnimal.makeNoise();
```

When we declare reference variable anotherAnimal, it is of the `Animal` type, but actually refers to an instance of `Dog` in memory. Therefore, when we use the `makeNoise` method, we actually use `Dog`'s version of the `makeNoise` method. This is known as **virtual method invocation**. Since the method that is executed is determined at runtime, it is known as **runtime** or **dynamic** polymorphism.

### Static methods
Another important point to note is that we cannot override `static` methods. If a subclass has a static method with the same name as the parent, the parent method is hidden.

### Covariant return types
When we override a method, we can actually change its return type, as long as the return type is a **subtype**/**subclass** of the original. These are known as covariant return types. This does not apply to primitives.

# Java: Annotations
Java annotations are special constructs that may be seen throughout Java code. Annotations use the `@` symbol followed by the annotation name. They are used to provide metadata about source code to the compiler and JVM. They can be placed on classes, methods, fields, and other constructs depending on how they are originally defined.

One of the primary purposes of annotations is to enforce rules in code or to abstract away some functionality provided by a library or framework. Annotations are often processed using Java's built-in `Reflection API` to dynamically provide functionality for developers.

You should be familiar with a few built-in annotations:
- `@Override`: declares that a method must override an inherited method
- `@Deprecated`: marks a method as obsolete
- `@SuppressWarnings`: instructs compiler to suppress compilation warnings, IDE, etc.
- `@FunctionalInterface`: designates an interface as a functional interface

# Java: Object class
The Object class is a special class that is the root class of all other classes. Even though we're not required to explicitly extend the Object class, all classes inherit from this class either directly or indirectly.
- Indirect: If the class is extending another class already (ex. Dog extends Animal), the superclass(es) (such as Animal) will be extending from Object class
- Direct: If we don't extend any other class, we can think of the class as directly extending Object with an implicit `extends Object`.

## Methods
The Object class has some important methods we should be taking into account:
- `toString()`: the toString() method inherited from the Object class is automatically called when we print an object. If this method is not overridden in our own classes, it will print the output as `fully.qualified.ClassName@hashedMemoryAddress`
- `equals(Object o)`: compares two objects. The == compares to see if the memory address is the same, which will return true if both variables are pointing to the same object in memory. If .equals() is not overridden in our own classes, the `equals` method will behave exactlly the same as `==`.
- `hashCode()` returns a hash code, which is a number that is used for putting objects into finite numbers of categories. For instance, hashcodes are often used in HashMaps, HashSets, and other data structures that rely on hashing. If this is not overridden, by default it will basically hash the memory address of where an object is stored.
- `finalize()` is a method that is called by the garbage collector whenever it determines that an object is no longer reachable (meaning there are no variables pointing to that object). This can be overridden to perform cleanup duties before garbage collection, but in newer versions of Java, this method has been deprecated.

There are some rules for hashCode():
- If we override equals(), we should also override hashCode()
- The result of hashCode() should remain consistent in a program (meaning it should have a predictable result)
- if .equals() returns true, the hashcodes MUST be equal
- if .equals() returns false, the hashcodes do not necessarily need to be different. However, having our hash function provide as much diversity as possible will improve performance of data structures such as hash tables.

# Java: Final keyword
The `final` keyword is a type of **non-access** modifier that can be used when declaring an entity. The final keyword essentially means that the value cannot be modified in the future. `final` can be used on variables, parameters, methods, and classes.

## Final variables
If a variable is declared with the final keyword, once initialized, the value cannot be changed.
- The variable does not necessarily need to be initialized at the time of declaration.
- If declared by not initialized, it is considered a **blank final variable**.

If the variable is a reference variable, we cannot change what object the variable refers to. But this does not stop us from modifying properties of the object itself.

## Final parameters
If final is used with a method parameter, it means the variable's contents cannot be changed in the function (method).

## Final methods
A method that is declared with the final keyword
- Cannot be **overridden** (instance methods) by a child class
- Cannot be **hidden** (static methods) by subclasses

## Final classes
Classes declared as final cannot be extended by other classes

# Java: Strings in Greater Depth
Strings in Java are NOT primitives unlike some other programming languages. They are instead **immutable** objects that are instantiated from the `String` class. 

Immutable: means that the properties of the object cannot be altered once created.
- Immutability is accomplished using
    - private and final fields
    - not implementing "setter" methods
    - etc.
- Implications of immutability: all methods in the String class return a **new String object**.
    - We cannot change a String object's value, so a new String must be generated with the desired modifications

## String API methods
- `concat(String str)`: concatenates the specified string to the end of **this** string
    - remember that this returns a completely new string because of String immutability
- `startsWith`: returns a boolean if a string starts with a certain sequence of characters
    - `startsWith(String prefix)`
    - `startsWith(String prefix, int offset)`
- `endsWith(String suffix)`
- `contains(CharSequence s)`: returns a boolean that is true if the String contains that particular sequence of characters
- `charAt(int index)`: returns a char at the specified index
- `matches(String regex)`: returns a boolean that is true if the string matches a given **regular expression**
- `substring(int startingIndex)`: take a portion of the string from the starting index all the way to the end of the string
- `substring(int startingIndex, int endingIndex)`: goes from the startingIndex to the endingIndex not inclusive

# Java: StringBuilder and StringBuffer
Because Strings are immutable like mentioned previously, it could be really inefficient to use Strings if we have to constantly generate new Strings. Imagine a situtation in which we are generating new strings through an iterative process in a for or while loop, tacking on additional characters and therefore creating a new String object each loop.

Instead, StringBuilder and StringBuffer can be used, which is a way to construct strings in a mutable process. They both contain methods such as `append()` and `insert()`, which mutate the internal sequence of characters (which is not possible with immutable Strings). StringBuffer is similar to StringBuilder, except it is synchronized (which means it is thread-safe and can only be accessed by 1 thread at a time), and therefore useful for multi-threaded applications where multiple threads may be accessing the object.

| Class | Immutable? | Thread-safe? | Speed |
| :---- | :--------- | :----------- | :---- |
| String | Y | Y | Slowest |
| StringBuilder | N | N | Fastest |
| StringBuffer | N | Y | Fast |

# One of the pillars of OOP: Abstraction
Abstraction is a principle in which we centralize common characteristics and generalize behavior into conceptual modules. By utilizing abstraction, we hide underlying complexity of implementation. For example, when we drive a car, we don't need to know how the car works, only how we need to use the accelerator, brakes, steering wheel, etc. The car abstracts away the internal details of the engine, transmission, cooling, and other functions.

## Abstract Classes
In Java, we achieve abstraction using abstract classes and/or interfaces. Abstract classes are classes declared using the `abstract` keyword that cannot be instantiated. Abstract classes essentially serve as templates for which other classes extend from. Within abstract classes there can be both **abstract methods** and **concrete methods**. Abstract methods must be implemented by the concrete subclasses that extend the abstract class. An abstract class can contain instance fields and concrete methods just like concrete classes.

The primary differences, as summarized:
- Abstract classes cannot be instantiated
- However, they can contain everything that normal classes have, with the addition of abstract methods

## Interfaces
Interfaces cannot be instantiated just like abstract classes. They serve as contracts for methods that a class must implement. To inherit from interfaces, classes would use the `implements` keyword to implement an interface. Multiple interfaces can be implemented by a class, unlike abstract classes, since a child class can ever only extend one parent class. Interfaces can have variables, but they are implicitly set to `public`, `static`, and `final`, so no instance fields can be defined in an interface unlike abstract classes. Before Java 8, interfaces could ONLY contain abstract methods to be implemented in classes, but since then, interfaces can also have implementations if marked with the `default` keyword (not be confused with the default access-modifier). Interfaces can also contain static methods (and remember static methods are not ever inherited).

One of the reasons interfaces have more restrictions than abstract classes is to allow Java to support the ability to implement multiple interfaces at once. The issue with multiple inheritance in Java is ambiguity that can arise if two classes had the same method name, since Java would not know which method implementation to inherit.

# Java: Generics
Generics were added in Java 5 to provide compile-time type checking and removing the risk of ClassCastException. This allows us to achieve type-safety, especially when using the built-in Java collections.

Java allows us to define classes with generic types, which are classes or interfaces that are parameterized. We can use angle brackets to specify parameter type.

# Java: Collections Framework
The Collections framework or API is a set of classes and interfaces in Java that implement commonly used data structures. Below is a diagram showing the Collection hierarchy. The most important interfaces are as follows:
- `Iterable`: this guarantees that the collection can be iterated over
- `Collection`: This is the top level interface of the entire Collections API
- `List`: an ordered collection of elements, similar to an array
- `Set`: a collection that does not contain duplicates (not necessarily ordered)
- `Queue`: a collection that operates on a first-in-first-out (FIFO) basis, just like people waiting in a line (queue)
- `Stack`: a collection that operates on a last-in-first-out (LIFO) basis, similar to a stack of plates
- `Map`: contain key/value pairs and **is separate from the Collection hierarchy**. It does not implement iterable, but can be iterated over in a different manner.

There is also a **Collections class** that contains static utility methods that we can use to perform various operations on our Collection objects.

# Java: Exceptions
Exceptions are events that occur during the execution of programs that disrupt the normal flow of instructions.

In the context of Java, exceptions are objects that wrap an exceptional event that occurred inside the execution of a method. Exception objects contain information such as the following:
- Type of exception
- The state of the program when the exception occurred
- Other custom information
    - Messages
    - etc.

Exceptions can be
- Thrown
- Caught

When learning the idea of Exceptions, it is important to understand its hierarchy. This allows us to understand and differentiate between Errors and Exceptions, and also, very importantly, the difference between checked and unchecked exceptions.

## Checked vs Unchecked Exceptions
Checked Exceptions
- The `Exception` class and all of its subclasses (except RuntimeException) are known as checked exceptions
- Checked exceptions represent occasions where it is reasonable to anticipate something unexpected to occur, such as when a file does not exist when we are trying to access it.
- Checked exceptions **MUST** be handled or declared by the programmer, otherwise the code will not compile

Unchecked Exceptions
- The `RuntimeException` class is a special type of exception that is not required to be handled or declared
- Unchecked exceptions are typically reserved for issues such as
    - `ArithmeticException` for illegal arithmetic, such as dividing by 0
    - `IndexOutOfBoundsException` if we try to reference an index that is larger than the size of our array
    - `NullPointerException` if we try to access a field or invoke an instance method on something that is pointing to no object (`null`)
    - `ClassCastException` if we try to downcast from a parent reference type to some child reference type that is hierarchically valid, but the object is not of that instance.

One common misconception is that unchecked exceptions are RuntimeExceptions while checked exceptions are "compile-time". In fact, both unchecked and checked exceptions occur at Runtime. There is really no such thing as exceptions at compile time.

We have compilation-errors, which would be problems with your code's syntax, but this is totally different from exceptions. These would be issues that cause your code to not compile at all.

## Handling Exception v. Declaring Exceptions
Handling: risky code is placed inside a try/catch block
- Try-catch-finally
    - In order to handle exceptions, a try/catch block can be used
    - `try` encloses the code that may throw an exception
    - `catch` defines an exception to catch and runs the code inside if that exception is caught
    - `finally` is used to run whether an exception is thrown or not. It will ALWAYS execute unless System.exit() is called or the program crashes.

Declaring: the type of exception to be thrown by the method is listed in the method signature using the throws keyword. Instead of handling it within that same method, we let the code that calls that particular method deal with it instead.