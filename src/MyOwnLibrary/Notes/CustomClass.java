package MyOwnLibrary.Notes;
/*
 Classes -> Class is a blueprint. It comes first, Object is created out of the class

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

--> CLASS: Where Objects Come From
     - A class is an entity that determines how an object will behave and what the object will contain.
     - A class is a blueprint or set of instruction to build a specific type of object.
     - Class itself is not concrete -> means it is not physically real. But we can create object from class

--> OBJECTS: Object is created out of the class
     - Object: is concrete.
     - An object is an instance of a class.
     - An object can store data. The data stored in an object are commonly called fields.
     - The new keyword is used to create an instance of a class.

--> INSTANCE VARIABLES: object variables
    - Instance variable belongs to instance of the class
    - Instance variables are attribute of the custom class. We declare an instance variables and create a attribute of class
    - each object has its own copy of instance variable
    - declared outside the blocks or methods
    - this. ->  Refers to the object instance. We can call any object instances.

--> INSTANCE METHODS: object methods
    - Instance method has direct access to instance variables
    - does not have static specifier
    - An instance method in Java is basically a method of the class.
    - Non-static method which is declared inside a class is an instance method
    - To invoke an instance method, we have to create the object of the class

--> Class vs Object
- Class is a collection of similar objects            - Object is an instance of a class
- Class is conceptual (is a template)                 - Object is real
- No memory is allocated for a class                  - Each object has its own memory
- Class can exist without any objects                 - Objects can not exist without a class


--> Car class:
     - data/Attribute: -> brand, model, year, color, mileage...
     - actions/functions: -> driver(), stop() ....

--> toString();
     - the method gets executed automatically whenever we pass the object name into the print statement
     - When we don't have it we get hashCode to the screen
     - Compiler calls it automatically

--> Java Memory Allocation. -> Java Runtime Environment
      ->  Stack is a section of memory which contains methods, local variables, and reference variables. // Other than primitive variable calls reference variables
                 - Methods, Local variables, Reference variables
      -> Heap is a section of memory which contains Objects. Instance variables are created in the heap.
                 - Objects, Instance Variables



-->  We can create Array or ArrayList to store objects that we created from class inside.
     EX: - ArrayList<Cat>catList=new ArrayList<>();  -> catList.addAll(Arrays.asList(cat1, cat2));
         - Car[] cars = {car1, car2, car3};
         - We can use the methods we created on the class to manipulate the objects


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

Instance Methods vs Static Methods in Java


--> Instance Methods:
    - The instance method requires the object of its class to be created before it can be called.
    - An instance method does not need any keyword.
    - Instance methods have multiple copies depending on the number of instances created for that particular class.
    - An instance method is invoked by using the object reference
    - We can’t access instance methods and instance variables with the help of Static methods in Java.

--> Static Methods:
    - Static methods in Java can be called without creating the object of the class.
    - Java static method is declared using static keyword.
    - The static method has a single copy for a class.
    - We can invoke a static method by using its class reference.
    - We can access static variables and static methods with the help of the Instance method.

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



 */





