package day50_Polymorphism;
/*
Warmup tasks:
    1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */

public abstract class Animal {// 2 variable, 2 instance methods

    public int age;
    public String gender;


    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping ");
    }

    public static void method1(){ // This method is static and cant be overridden
        System.out.println("Animal Class");
    }

}
//**********************************************************************************************************************
/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */

// Between cat class and Animal class = is a relation
final class Cat extends Animal{ //3 variable . 3 instance methods

    public String catName;

    public Cat(String catName, String gender, int age){ // constructor
        this.catName=catName;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public void eat(){ // instance method
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public  void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }

    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");

    }

}
//**********************************************************************************************************************

/*
 3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */

// Between dog class and Animal class = is a relation
final class Dog extends Animal{

    public String dogName;

    public Dog(String dogName, int age, String gender){
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;

    }

    @Override
    public void eat(){ // instance method
        System.out.println("Dog "+dogName+" is eating");
    }

    @Override
    public  void sleep(){// instance method
        System.out.println("Dog "+dogName+" is sleeping");
    }


    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }

    public static void methodA(int a){ // method is overloaded
        System.out.println("dog Class A");
    }


}

class AnimalObjects{

    public static void main(String[] args) {




        Dog obj1=new Dog("Lucy", 5, "female");
        System.out.println(obj1.dogName);
        obj1.bark();



        // Reference type decides what is accessible.
        // And in this case Animal is a reference type because of that we cant access dog class unique variable and method
        Animal obj2=new Dog("Kito", 6, "female");// polymorphism
        //System.out.println(obj2.dogName);
        //obj2.bark();
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // Without casting we cant use it
        // we can only do that using DownCasting
        // 1.way
        Dog dog1=(Dog)obj2;//downcasting
        dog1.bark();
        // 2. way
       ((Dog)obj2).bark();
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//• When we call a method, it will call overridden version from a child class, if we have overridden the method.
//• If method is not overridden, it will call parent/super class version.
//
        obj2.eat();// in polymorphism always overridden class method will be executed
                   // Because we have eat method in Animal class and dog class ==> "Dog is eating"
        // if eat method wast overridden in dog class then it would print Superclass method. ==>  "Animal is eating"



        obj2.method1();// This method is static and cant be overridden


        Animal animal1=new Cat("A", "F", 1);
        boolean isCat=animal1 instanceof Cat; // true. It referance to cat class
        System.out.println(isCat);

        Dog d1=new Dog("A", 1, "f");
       // boolean r1=d1 instanceof  Cat; // there is no is A relation between dog and cat class

        Animal animal2=new Cat("Q", "f", 2);
        boolean r2=animal2 instanceof Animal;// true. Because animal is an animal
        System.out.println(r2);




    }
}


