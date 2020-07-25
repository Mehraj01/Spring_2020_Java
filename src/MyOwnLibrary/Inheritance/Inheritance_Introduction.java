package MyOwnLibrary.Inheritance;
// OOP ==> Object Oriented Program
// - Inheritance is an OOP concept in Java which allows one class to inherit
//the features(fields and methods) of an another class.

/*
- Inheritance ==> public class Dog extends Animal
// Dog ==> ( sub, child class)  || Animal ==> (Super, Parent Class)

- Super class ==> cannot inherit anything. || Sub Class ==> can inherit variables and methods from super class
- Advantage ==> Improves re-usability, easy to maintain.
- Visible variables and methods can be inherited.
- Constructors cannot be inherited.

>>>>> - IS A Relation ==> Inherited relationships between classes. When class inherited from one another it is IS A Relation
		class Animal{...}  ---> Super Class
		class Dog extends Animal{...}   ---> Sub Class
        Dog IS An Animal
		class Fish extends Animal{...}    ---> Sub Class
        Fish IS An animal

>>>>> * HAS A Relation ==>
	   class Engine{...}
	   class Car{ Engine obj = new Engine();}
	   Car Has An Engine

- One class can only can extend one class. One class can be extended by multiple classes

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


>>>>  Access Modifiers:

     public: accessible at everywhere, visible to the world
     protected: visible in same package, visible in sub class outside package
     default: only visible in same package
     private: only visible within the same class


 - Visibility:
     public > protected > default > private



>>>> Inheritance: sub class & super class

      --  Sub class: ==> can INHERIT visible variables and visible methods from SUPER CLASS

                private: can never be inherited in sub class
                default: can be inherited as long as sub class is in the same package
                public & protected: can always be inherited to any sub class

                in same package: public, protected, default can be inherited
                different package: public & protected can be inherited


      --  Super class: ==> CANNOT INHERIT anything from SUB CLASS

                ONE class can only EXTEND one class
                one class can be extended by multiple classes

     --   CONSTRUCTOR CANNOT BE INHERITED
     -- But we can call Super class Constructor to Sub classes constructor


>>>>>>>>  this: refers to the object instances of the current class

                this(); ==>  used for calling the constructors from current class
                this.  ==> used for calling instance variable and instance methods


>>>>>     Super: refers to the object instance of the super class

               super(); ==> used for calling the constructors from super class
               super. ==> used for calling the instance variables and instance methods of super class



>>>>>>>    Constructor Calls:

        1. At least one parent class' constructor MUST be called in sub class
        2. If the constructor in parent class is default, it's called automatically in child class
        3. If the parent class' constructor is not default, MUST be called manually in sub class by using super keyword


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













