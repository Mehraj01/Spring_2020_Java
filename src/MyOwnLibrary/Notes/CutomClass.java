package MyOwnLibrary.Notes;
/*

Classes : Where Objects Come From
--> A class is an entity that determines how an object will behave and what the object will contain.
--> A class is a blueprint or set of instruction to build a specific type of object.

Objects
--> An object is an instance of a class.
--> An object can store data. The data stored in an object are commonly called fields.

Writing a Simple Class
Access Modifier ==> keyword ==> Class Name

Access Modifier
--> An access modifier indicates how the class may be accessed.
--> The public access modifier indicates that the class will be publicly available to code that is written outside of the class.

Writing a Method
--> When a method is designed to work on an instance of a class, it is referred to as an instance method,
and you do not write the word static in the header.

Creating an Object/Instance
--> The new keyword is used to create an instance of a class.

Default values for Instance Variables
- public class student{
 String name; ==> name has the default value null
 int age; ==> age has the default value 0
 boolean isScienceMajor; ==> isScienceMajor has default value false
 char gender; ==> gender has default value '\u000'
 }

Accessing an Object’s Data and Methods?
--> An Object’s member refer to its data fields and methods. After an object is created,
its data can be accessed and its methods can be invoked using the dot operator (.)

Class vs Object
Class                                                Object
Class is a collection of similar objects             Object is an instance of a class
Class is conceptual (is a template)                  Object is real
No memory is allocated for a class                   Each object has its own memory
Class can exist without any objects                  Objects can not exist without a class

Java Memory Allocation
Java Runtime Environment
--> Stack is a section of memory which contains methods, local variables, and reference
variables. ==> Methods, Local variables, Reference variables
--> Heap is a section of memory which contains Objects. Instance variables are created in the heap. ==> Objects, Instance Variables



==> Class: where the objects came from , determines how the object should behave
==> Instance variables: object variables
Instance variables are attribute of the custom class. We declare an instance variables and create a attribute of class
        -  each object has its own copy of instance variable
        - declared outside the blocks or methods

==> instance methods: object methods ==> Only difference of instance method that it dosen't have static key word
        - does not have static specifier

==> local variable: variables that are declared within a block
==> toString(): the method gets executed automatically whenever we pass the object name into the print statement

 =>  cat class:
      data/attributes:  instance variables
        breed, color, age

      actions: instance methods
        sleep(), eat(), drink()

 => car class:
     data/Attribute:
       brand, model, year, color, mileage...

     actions/functions:
           driver(), stop() ....



 */