package MyOwnLibrary.Notes;
/*
--> OOP (Object Oriented Program)
• Inheritance is an OOP concept in Java which allows one class to inherit the features(fields and methods) of
an another class.
• The keyword used for inheritance is extends
• Syntax: -> public class Dog extends Animal{       ==> Dog => Child - Sub Class, Animal => Parent - Parent Class
        }


-> ADVANTAGES of Inheritance:
• improves re-usability, easy to maintain


-> SUPER - PARENT Class:
• The class whose features are inherited is known as super class(or a base class or a parent class)
• Cannot inherit anything from Subclass
• Can be extended by multiple classes

-> SUB - CHILD Class:
• The class that inherits the other class is known as sub class(derived class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.
• Can only EXTEND one class
• Can INHERIT visible variables and visible methods from super class
                - private: can never be inherited in sub class
                - default: can be inherited as long as sub class is in the same package
                - public & protected: can always be inherited to any sub class

                - in same package: public, protected, default can be inherited
                - different package: public & protected can be inherited


-> Inheritance and the “IS-A” Relationship
• In OOP, inheritance is used to create an “is-a” relationship among classes.
• Inheritance is an OOP concept in Java which allows one class to inherit the features(fields and methods)
of an another class.


-> Types of Inheritance
• Single Inheritance : Subclasses inherit the features of one superclass.
• Multi Level Inheritance : Subclass will be inheriting a SuperClass and as well as the subclass also act as the
SuperClass to the other class.
• Hierarchical Inheritance : Once class serves as superclass for more than one sub class.
• Multiple Inheritance : Java DOES NOT support multiple inheritance with classes.
One class can not have more than one superclass and inherit features from all parent class.



-> IS A relation: inherited relationships between classes
	    class Animal{...}  ---> Super Class
		class Dog extends Animal{...}   ---> Sub Class
        - Dog IS An Animal
		class Fish extends Animal{...}  ---> Sub Class
        - Fish IS An animal

-> Has A relation:
	   class Engine{...}
	   class Car{
	   Engine obj = new Engine();
	   }
	   Car Has An Engine
	  - When I create one class object in another class which does not have a IS-A relationship it calls Has-A relationship
	  - In above example we created a HAS-A Relationship
	  - In that way we can invoke methods of the Engine class to our car class.




-> Inheritance: easiest way to get reach, build relationship between classes
 - super (parent) & sub (child) relationships
 - what can be inherited: visible variables and methods
	  - Constructor cannot be inherited
	  - But we can call Super class Constructor to Sub classes constructor
	  - Constructor has a same name as class name because of that it cant be inherit
	  - Contractor cant call from parent class because each constructor name is different

 - ONE class can only EXTEND one class
 - one class can be extended by multiple classes



>>>>>>>  Constructor Calls:

        1. At least one parent class' constructor MUST be called in sub class
        2. If the constructor in parent class is default, it's called automatically in child class
        3. If the parent class' constructor is not default, MUST be called manually in sub class by using super keyword

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

 -> Calling the  setInfo from Sub class

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


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


>>>>>>>>  this: refers to the object instances of the current class

                this(); ==>  used for calling the constructors from current class
                this.  ==> used for calling instance variable and instance methods


>>>>>     Super: refers to the object instance of the super class

               super(); ==> used for calling the constructors from super class
               super. ==> used for calling the instance variables and instance methods of super class




>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

             >>>>>  METHOD OVERLOADING
                    - same method different parameter
					- return-type can be same or different
					- any method can be overloaded
					- access modifier can be same or different

            >>>>>  METHOD OVERRIDING
                   - same method name, same parameter, same return-type  (MUST)
				   - MUST happen in the sub class
				   - access modifier MUST be same or more visible
				   - ONLY the INSTANCE methods can be overridden
				   - @Override annotation MUST be applicable  ==> It identifies if the method is overridden method


>>>>>>>>>  Why we need overriding: to implement different functions to the same method
				- reusable
				- flexible
				- less memory
				- easy to memorize




 */