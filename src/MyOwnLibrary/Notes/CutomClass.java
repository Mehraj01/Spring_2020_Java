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
 char gender; ==> gender has default value
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
--> Stack is a section of memory which contains methods, local variables, and reference variables.
          ==> Methods, Local variables, Reference variables
--> Heap is a section of memory which contains Objects. Instance variables are created in the heap.
          ==> Objects, Instance Variables



==> Class: where the objects came from , determines how the object should behave
==> Instance variables: object variables
Instance variables are attribute of the custom class. We declare an instance variables and create a attribute of class
        -  each object has its own copy of instance variable
        - declared outside the blocks or methods

==> instance methods: object methods ==> Only difference of instance method that it dosen't have static key word
        - does not have static specifier
An instance method in Java is basically a method of the class. In other words, a non-static method which is declared
inside a class is an instance method. This kind of method requires an object of its class to created before
it can be called. To invoke an instance method, we have to create the object of the class.

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


  ==========================================

  -> WE create toString(); method to able to print object Array to the screen.
     -> In ArrayList class we have we have toString(); method because of that we able to print it to the screen directly
     -> Array wwe dont have it
     -> when we have toString(); method we able to pass object name directly to the print statement
     -> when we dont have toString(); method in the class then we get a hashcode when we try to pass object to the print statement
     -> we dont call toString(); method. Compiler calls it automatically
     -> we need toString(); method when we need to print object info directly to the screen

  ========================================

 We can create Array or ArrayList to store objects that we created from class inside.
 for exmp:
   We can create ArrayList of car, cat etc. And Our date Type will be the same our class name
    ->   ArrayList<Cat>catList=new ArrayList<>();  ==> catList.addAll(Arrays.asList(cat1, cat2));
    ->  Car[] cars = {car1, car2, car3};
    -> We can use the methods we created on the class tp manipulate the objects


       Day 34 Java
    --> class itself is not concrete ==>  means it is not physically real. But we can create object from class
    --> concrete means ot is not real
        -> class : not concrete
        -> object: is concrete

   -->  A concrete class is a class that has an implementation for all of its methods.
    They cannot have any unimplemented methods. It can also extend an abstract class or implement an interface
    as long as it implements all their methods. It is a complete class and can be instantiated.

   --> In other words, we can say that any class which is not abstract is a concrete class.

   --> Necessary condition for a concrete class: There must be an implementation for each and every method.



-> this: refers to the object instance
		this.: we can call any object instances

-> We use this. key work to call the instance variable to the method and we assign our local variable.
   Instance Variables:
         String breed;
         String size;
         int age;
         String color;
         String name;
 - public void setDogInfo(String breed, String size, int age, String color, String name){ // local variables inside the parameter
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;
        // this keyword is used for calling object instance (instance variables)

   => this.breed ==> is the instance variable that we call inside our method and assigning it to the local variable
   => When we dont add this key word and our local variable name as same as instance variable then it will assign local
   variable to local variable which we dont want to do.
      ==> breed = breed; ==> local variable = local variable ==> compiler calling local variable
      ==> this.breed =breed; > instance variable =local variable ==> compiler calling instance variable

      ==> if we dont use this. keyword then we have to use different names for our local variables
          to able assign it to instance variables
    }


========================================================================================================================
--> Instance Methods vs Static Methods in Java
1. The instance method requires the object of its class to be created before it can be called.
Static methods in Java can be called without creating the object of the class.
2. Java static method is declared using static keyword.
An instance method does not need any keyword.
3. The static method has a single copy for a class.
But instance methods have multiple copies depending on the number of instances created for that particular class.
4. We can invoke a static method by using its class reference.
An instance method is invoked by using the object reference.
5. We can’t access instance methods and instance variables with the help of Static methods in Java.
We can access static variables and static methods with the help of the Instance method.
========================================================================================================================
















 */





