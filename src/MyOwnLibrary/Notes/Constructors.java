package MyOwnLibrary.Notes;

/*
Constructors
-> A special method that every class MUST have
-> It’s used when we create the objects of a class
-> We can use constructors to initialize the object’s instance variables.
-> Execution of a constructor ALWAYS depends on the object



Creating Constructors
• Constructor is a special method that matches the name of the class and has no return type nor a specifier.



Types of Constructors
• No-argument Constructor: A constructor that has no parameter is known as default constructor.
If we do not define a constructor in a class, then compiler creates default constructor(with no argument) for the class.
• Parameterized Constructor: A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with our own values, then we pass parameters to the constructor.


Constructors Overloading
• we can have multiple constructors in a class by implementing method overloading

========================= NOTES

-> regular methods:
                                        MUST          MUST
        Access-modifers   specifier   return-type  methodName(Parameter){
                statements;
        }
        Access modifiers: public, protected, default, private
        specifiers: static, abstract, final, synchronized
        return-type: void, any primitive and none primitives
        methodName: any name
        parameter: any datatype


-> Constructor: very special method
     -  MethodName MUST be same with className
     -  No return-type, No specifier
     - Every class MUST have, if we don't create one, compiler will creates the no-arg constructor
     - execution always depends on the object
     - To able to create object of the class we have to have contractor. When we dont have it compiler creates default
        constructor for us.
     - No args constructor = Default constructor
     - Names must be same as class name
        classname      object       constructor
     - ConstructorIntro obj2 = new ConstructorIntro(); ==> ConstructorIntro() -> default constructor that compiler creates for us
     - Constructor execution depends on the object creation. It will get executed when we create the object.
     - If we have object, constructor will be executed once if we have object it will be executed twice
     - We can use static variable inside the constructor. It is a class member
     - Static variables are global variable and we cant use it everywhere
     - When we have static variable we assign it to the value inside the constructor not in the parameter. Because it has only one copy
        Access-modifier  MethodName(String name, ing age){
          schoolName ="Cybertek School"  ==> Static variable that we created inside the class and initialized it in the constructor
                                             It will be printed with each object we create
                                             - we dont have to initialize static variable in the constructor.
                                                We can do it in the class as well.
        }
        methodName: MUST be same with class name
        No specifier, No return-Type

    class Test{

    }

creating object:
         Test   obj = new  Test();
       className  objectName =  new  ExistingConstructor


============


-> this: refers to object instances
        this.: we can instances of the object
        this(): used for calling constructors within current class


-> constructor calls:
            1. only constructor can call other constructor
            2. constructor cannot be called by its name,  this() is used for calling
            3. constructor call needs to be at the first step. Means it have to come first in the method
            4. One constructor can only call one constructor
            5. Constructor cannot call itself or contain itself

-> we can static method everywhere
-> we can call instance, static methods in constructor
-> overloading: same method name, different parameters
            - reusable, easy to maintain, readable
-> we can overload constructor using different parameters.
   - There will be one constructor works for the one object. Whatever constructor we used when we created the specific object
     only that constructor will apply to that specific object






 */