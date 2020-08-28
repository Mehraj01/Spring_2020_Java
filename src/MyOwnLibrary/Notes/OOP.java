package MyOwnLibrary.Notes;
/*

OBJECT ORIENTED PROGRAM (OOP) -> Encapsulation, Inheritance, Abstraction, Polymorphism

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

1. Encapsulation: to hide data, protect data Integrity,
   - private access modifier, keyword -> invisible outside the class
   - Use the private data though getter and setter. These methods are public so can able read data.
   - getter (reads) -> return method, read data and return it back to you
          - public instance method
          - Return type must match with instance variable's data type
          - No parameter
          - Returning the private instance variable
   - setter(modify) -> void method that passes a parameter (if it’s password that do not private setter or make your data final)
          - public instance method
          - Return type is void
          - Passes a parameter
          - Parameter must match with instance variable's dataType
          - Initializes the argument to private instance variable
   - final private: cannot have setter and cannot be changed, you only provide getter
   - Used encapsulation for hiding data in my framework for login functionality, created the user name and password as final private



>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

2. INHERITANCE allows one class to inherit the features(fields and methods) of an another class.
- Inheritance is an OOP concept in Java which allows one class to inherit the features(fields and methods) of an another class.
- The KEYWORD used for inheritance is EXTENDS
- In OOP, inheritance is used to create an “IS-A” relationship among classes.
- Syntax: -> public class Dog extends Animal{...} ==> Dog -> Child - Sub Class
                                                  ==> Animal -> Parent - Parent Class
- Inheritance: easiest way to get reach, build relationship between classes
- what can be inherited: visible variables and methods.
	       - Constructor cannot be inherited. It has a same name as class name because of that it cant be inherit
	       - But we can call Super class Constructor to Sub classes constructor.
- Constructors and blocks are not inheritable

--> ADVANTAGES of Inheritance:
- improves re-usability, easy to maintain


--> Types of Inheritance
- Single Inheritance : Subclasses inherit the features of one superclass.
- Multi Level Inheritance : Subclass will be inheriting a SuperClass and as well as the subclass also act as the
SuperClass to the other class.
- Hierarchical Inheritance : Once class serves as superclass for more than one sub class.
- Multiple Inheritance : Java DOES NOT support multiple inheritance with classes.
One class can not have more than one superclass and inherit features from all parent class.


--> SUPER - PARENT Class:
- The class whose features are inherited is known as super class(or a base class or a parent class)
- Cannot inherit anything from Subclass
- Can be extended by multiple classes

--> SUB - CHILD Class:
- The class that inherits the other class is known as sub class(derived class, or child class). The subclass can add
its own fields and methods in addition to the superclass fields and methods.
- Can only EXTEND from one class
- Can INHERIT visible variables and visible methods from super class
                - private: can never be inherited in sub class
                - default: can be inherited as long as sub class is in the same package
                - public & protected: can always be inherited to any sub class
                - in same package: public, protected, default can be inherited
                - different package: public & protected can be inherited


--> IS A relation: inherited relationships between classes
	    class Animal{...}  ---> Super Class
		class Dog extends Animal{...}   ---> Sub Class
        - Dog IS An Animal
		class Fish extends Animal{...}  ---> Sub Class
        - Fish IS An animal
        - For IS-A relationship we uses extends keyword. -> Ex : Car is a vehicle.
        - The main advantage of inheritance is reusability of code

--> Has A relation: also known as composition or aggregation.
	   class Engine{...}
	   class Car{
	   Engine obj = new Engine();
	   }
	   Car Has An Engine
	  - For Has a relationship we use new keyword -> Ex : Car has an engine. We cannot say Car is an engine
	  - When I create one class object in another class which does not have a IS-A relationship it calls Has-A relationship
	  - In above example we created a HAS-A Relationship
	  - In that way we can invoke methods of the Engine class to our car class.
	  - The main advantage of has a relationship is reusability of code.


--> Constructor Calls:
        1. At least one parent class' constructor MUST be called in sub class
        2. If the constructor in parent class is default, it's called automatically in child class
        3. If the parent class' constructor is not default, MUST be called manually in sub class by using super keyword

--> super: refers to the object instance of the super class
               super(); ==> used for calling the constructors from super class
               super. ==> used for calling the instance variables and instance methods of super class
--> this: refers to the object instances of the current class
                this(); ==>  used for calling the constructors from current class
                this.  ==> used for calling instance variable and instance methods



===============
-> Example -> Calling the  setInfo from Sub class
- Person class -> Super Class
 ==>  public void setPersonInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
- Employee class -> Sub Class
 ==>  public void setEmployeeInfo(String name,int age,char gender,double salary, long employeeID, String jobTitle){
        setPersonInfo(name, age, gender);    // calling the setInfo method from the Person class
        this.salary=salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }
===============


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

3. ABSTRACTION: - hiding the implementation details
	   - concentrating on essentials things, without worrying about the details
       - OOP Abstraction: -> Abstract method, Abstract class, interface
       - two ways of achieving abstraction: -> 1. abstract class, 2. Interface


--> abstract CLASS: -> can NOT be FINAL, can NOT create object
      - a class that's meant to be inherited, extend
	  - we cannot create objects from abstract class. Because abstract is not concrete, object has to be concrete.
	  - Abstract class and interface are meant to be reference type, CAN NEVER BE IN OBJECT TYPE
	  - when abstract class extended by regular class: - we MUST override ALL the abstract methods of super class
	  - when abstract class extended by abstract class: - no need to override any abstract methods
	  - If subclass is abstract we don't have to override all those methods
-> abstract class:
		- can: -> constructor, instance method, static method, instance block, static block, instance variable,
		static variable... AND ABSTRACT METHOD
        - can not: -> cannot create object, cannot be final
-> non-abstract class:
		- can:-> constructor, instance method, static method, instance block, static block, instance variable, static variable...
		- can not: -> abstract methods


--> abstract METHOD: -> can NOT be final, private, static
      - a method without body/implementation ==> public abstract void method();
	  - a method that's meant to be override. It is mandatory to override the abstract super class method in the subclass
	  - We have to override the abstract class method in the non-abstract class.
	  - only instance method can me abstract
	  - regular class cant have abstract method because it does not have a body.
	  - when we override abstract method, access modifier have to be same or more visible
	  - we add body and implementation when abstract method overriding in sub class
	  - we may have multiple abstract methods in the abstract class. And we have to override all of them
	  - abstract method can have parameters
	  - we can not call abstract method inside main method. Because it does not have body. After override wew call it in main method



--> Abstract Class ex:
		RemoteWebDriver: -> Abstract Class
				get(URL); -> Abstract method
				quit();  -> Abstract method

		Chrome extends RemoteWebDriver:
				get(URL): opens the chrome
				quit(): quits the chrome

		FireFox extends RemoteWebDriver:
				get(URL): opens the firefox
				quit(): quits firefox

		Opera extends RemoteWebDriver:
				get(URL): opens the Opera
				quit(): quits Opera

		Cybertek extends RemoteWebDriver:
				get(URL): opens the Cybertek Browser
				quit(): closes the cybertek Browser


===============================================

>>> INTERFACE -> Blue print of class
          - ABSTRACT and PUBLIC by default
          - blueprint of class. Specifies the behaviors a class should implement
          - public interface interfaceName{...}
          - class to inherit from interface is by using implements keyword
          - ONLY PUBLIC access modifier allowed in interface. By default everything in interface is public
          - it is pure abstraction by default because of that we don't need abstract key word
          - variables is static, final by default.
          - It CAN NOT have instance variable because instance variables belong to object and it comes from class.
          - can be SUPER TYPE to a class. NOT super class to a class
          - interface cannot be final because it meant to be inherited
          - when abstract class implement from interface it is optional override it
          - Everything in interface is inheritable. There is only methods and variables
          - we can have main method in interface. Because it is a static method
          - class can extends from class and implement from interfaces at the same time. Implements has to come after extends
          - we have to initialize the variables when we create it because it is final by default


--> why do we need interface?
        - A class can inherit from one class only (extends)
        - A class can inherit multiple interfaces (implements)

--> what we can have in interface?
        - variable: static & final by default
        - methods: abstract methods, static methods, default method
               -  public default void method6(){...} -> Default method can only be declared in Interface
                                                     -> Default method can be inherited only interface
                                                     -> It can be inherited in sub class as well
                                                     -> Default method designed for interface for Lambda expression
                                                     -> This method will be executed after when it is inherited.


--> what we cannot have in interface?
        - constructor -> because it belongs to class
        - instance variable -> it is belongs to object
        - instance methods -> because instance method has a body
        - blocks -> we cant initialize because everything is static and final


        class            interface,           interface,     interface
    RemoteWebDriver  implements WebDriver, TakeScreenShot, JavaScriptExecuter ..
    /     |      \   RemoteWebDriver implements all these behaviours from above interfaces
   /      |       \
chrome  firefox   opera     ->  WebDriver driver = new ChromeDriver();




--> Extends vs Implements: Both are used for inheriting
        - We use extend keyword both side has to be same type.
               - Class extends from class
               - Interface extend from interface
        - We use implements keyword:
               - class implements  interface1, Interface2 ...
               - interface cannot implement from class -> Interface meant to be implemented


--> abstract class vs interface: both used for achieving abstraction
                             both are meant to be inherited
                             both can not be final
                 -> abstract class: can have constructor
                             instance method
                             blocks
                             instance variables
                             All access modifiers
                 -> interface: default method
                             public is given by default
                             variables are static & final by default


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

4. POLYMORPHISM: -> is the ability of the object to take on many forms. Object behavior in many forms
          - Poly + Morphism ( Many Forms)
          - IS A: inheritance relation
          - occurs when parent class/interface reference to child class' objects. ->  Animal dog2 = new Dog();
          - SUB CLASS CAN NEVER EVER BE THE REFERENCE TYPE OF SUPER CLASS' OBJECTS
          - As long as sub class is not abstract class then we can do superclass reference a child class object
          - If the method is not on the reference type we will not able to call it
          - Reference type decides what is accessible
          - Reference type can be parent or interface , object can be any extending or implementing child class
          - WebDriver driver = new ChromeDriver();

--> Calling method in polymorphism
- When we call a method, it will call overridden version from a child class, if we have overridden the method.
- If method is not overridden, it will call parent/super class version.


--> instanceof keyword: -> can be used to check if the object is certain class.
       - Animal animal1 = new Cat("A", "F", 1);
         boolean isCat = animal1 instanceof Cat; -> true. It reference to cat class
       - Animal animal2 = new Cat("Q", "f", 2);
         boolean r2 = animal2 instanceof Animal; -> true. Because animal is an animal



-> Type Castings: converting one type to another:  ->  byte < short < int < long < float < double
       -> 1. Primitive Type Casting: implicit & explicit
            - implicit casting: smaller type to larger type. Automatically done. ->  int a = 100;   double b = a;
            - explicit casting: larger type to smaller type. MUST be done manually. ->  int a = 200;   short s = (short) a;

      -> 2. Reference Type Casting: upCasting & downCasting. Pre condition: ->  there MUST IS A relationship.
            - upCasting: casting from subclass type to superclass type (done by compiler implicitly)
                Dog dog = new Dog("a", 1, "f");
                Animal animal = dog; ->  upCasting, done implicitly.  It is done automatically by compiler
            - downCasting: casting from a superclass type to subclass type (MUST be done explicitly)
                 Animal animal = new Dog("d", 12, "g");
                 Dog dog = (Dog)animal; -> DownCasting must be done manually.
                                        -> Animal reference to Animal class which is larger than dog class

                 1. way -> dog.bark();
                 2. way -> ((Dog)animal).bark();



>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

-->  METHOD OVERLOADING
        - same method different parameter
		- return-type can be same or different
		- any method can be overloaded
		- access modifier can be same or different

-->  METHOD OVERRIDING
        - same method name, same parameter, same return-type  (MUST)
		- MUST happen in the sub class
		- access modifier MUST be same or more visible
		- ONLY the INSTANCE methods can be overridden
		- @Override annotation MUST be applicable  ==> It identifies if the method is overridden method

    ->  Why we need overriding: to implement different functions to the same method
		- reusable
		- flexible
		- less memory
		- easy to memorize


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

--> final: constant, cannot be changed. Can only be applied to:
				1. variables: cannot be reassigned
				            - Finale instance variable needs to be initialize immediately
				            - Final static variables need to be initialized immediately
				            - Cannot be reassign
				2. methods: implementation of the method can never be changed
							- final, static methods cannot be override, can be overload
							- instance , static method can be final
							- constructors cannot be final
				3. class: immutable class, cannot be inherited
				 			- final class cannot be super class
				 			- For exp: String class immutable because it is final class
				 			- Sub class can be final


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<





 */