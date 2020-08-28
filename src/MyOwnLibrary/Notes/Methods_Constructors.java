package MyOwnLibrary.Notes;

/*

--> METHOD -> let you group a series of statement together to perform a specific tasks.
       - ADVANTAGES -> reusable, easy maintain and fix
       - Method cannot be declared IN ANOTHER METHOD
       - Sometimes a method needs specific information to perform its task. In such cases, when you
          declare the method you give it parameters. Inside the method, the parameters act like variables.
       - Returning value MUST match with the return Type of the method
       - If the return type of the method is void, the method cannot return any value
       - Closing statement MUST be ended with a return statement.
       - Return statement exits the current method. Can return value from a method if return type is not void.
       - Declaration of the Methods: -> public static void main (Str [] args )
               - access modifier: -> Access modifiers:  public, protected, default, private
               - specifier: -> static, final, abstract, synchronized (STATIC can be called trough class name)
               - void Return-type: -> void, any dataType ( all primitives & objects)
                          - void dose'nt return any value from the method. DataType returns a value (mandatory)
                           -  When return-type is not void it's mandatory to return value from the method
               - main: ->  Method Name
               - (Str[]args); Parameter, Argument: ->  It allows the method receive the argument. It can be ANY DATA TYPE.



-->  METHOD OVERLOADING -> Multiple Methods sharing the same name
        - same method different parameter
		- return-type can be same or different
		- any method can be overloaded
		- access modifier can be same or different
		- Benefits: ->  Easy to read, reusable, easy to remember, very flexible.



>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


--> Constructors: -> is a special method that matches the name of the CLASS and has NO RETURN TYPE NO a SPECIFIER.
      - A special method that every class MUST have
      - It’s used when we create the objects of a class
      - We can use constructors to initialize the object’s instance variables.
      - Execution of a constructor ALWAYS depends on the object. It will get executed when we create the object.
      - If we have object, constructor will be executed once if we have two object it will be executed twice
      - Constructors Overloading -> we can have multiple constructors in a class by implementing method overloading
      - MethodName MUST be same with className
      - No return-type, No specifier
      - execution always depends on the object
      - To able to create object of the class we have to have constructor
      - Every class MUST have, if we don't create one, compiler will creates the no-arg constructor
      - No args constructor = Default constructor
      - We can use static variable inside the constructor. It is a class member.
      - Static variables are global variable and we can use it everywhere
      - we can static method everywhere
      - we can call instance, static methods in constructor
      - we can overload constructor using different parameters.
      - we can call instance, static methods in constructor

--> Regular methods:                   MUST          MUST
        - Access-modifier specifier return-type  methodName(Parameter){  statements;  }
        - Access modifiers: public, protected, default, private
        - specifiers: static, abstract, final, synchronized
        - return-type: void, any primitive and none primitives
        - methodName: any name
        - parameter: any dataType

--> Types of Constructors
- No-argument Constructor: A constructor that has no parameter is known as default constructor.
If we do not define a constructor in a class, then compiler creates default constructor(with no argument) for the class.
- Parameterized Constructor: A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with our own values, then we pass parameters to the constructor.


--> this: refers to object instances
        this.: we can instances of the object
        this(): used for calling constructors within current class
--> super: refers to the object instance of the super class
               super(); ==> used for calling the constructors from super class
               super. ==> used for calling the instance variables and instance methods of super class

--> constructor calls:
            1. only constructor can call other constructor
            2. constructor cannot be called by its name,  this() is used for calling
            3. constructor call needs to be at the first step. Means it have to come first in the method
            4. One constructor can only call one constructor
            5. Constructor cannot call itself or contain itself


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

-->  Access Modifiers:
     - public: accessible at everywhere, visible to the world
     - protected: visible in same package, visible in sub class outside package
     - default: only visible in same package
     - private: only visible within the same class


-> Visibility:
     public > protected > default > private




>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<







 */