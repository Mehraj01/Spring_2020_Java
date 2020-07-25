package day49_Polymorphism;

// Polymorphism is the ability of the object to take on many forms. Object behavior in many forms
//Polymorphism is when reference type is a parent class/interface and object type is child.
// Polymorphism accrues when parent class or parent interface reference the child class object
// Polymorphism - As long as sub class is not abstract class then we can do superclass reference a child class object
// abstract class can not create an object
// When super class is abstract it still can be reference type for child class.
// When super class is abstract: we can do -> Animal obj2=new Dog();
// When super class is abstract: we can not do -> Animal obj1=new Animal();
// When super class is abstract it can be only reference type. Can not be an object
// Super class can be reference type of child class. But can not inherit anything from child class.
// Abstract class and interface are meant to be reference type, CAN NEVER BE IN OBJECT TYPE
// SUB CLASS CAN NEVER EVER BE THE REFERENCE TYPE OF SUPER CLASS' OBJECTS
// In polymorphism Reference type decide what is accessible. If the method is not on the reference type we will not able to call it
//

// class can implement from interface
// interface can extends from class
// We can never create an object from abstract class or interface
// If interface is a super class and child class implements from interface we can use interface as a reference type
//IS A: inheritance relation
// When there is a IS A relation then polymorphism can happen



//polymorphism: object's behave in different forms
class Animal extends Robot{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

class Robot{

}

public class Polymorphism_Intro {

    public static void main(String[] args) {

        // Animal obj = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();
        // Animal is Reference type

        // Dog obj4 = new Cat();
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        Animal[] animalShow ={ obj5, obj6};


        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();

    }

}