package OfficeHours.Practice_05_20_2020;
/*
task:
    custom class: Cat, Dog, Bunny
    Dog:
        variables:  name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, bark
    Cat:
        variables:  name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, scratch
    Bunny:
        variables:  name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, Dig
    custom class: pet
            variables:  name, age, color, size, breed, isPet, numberOfEyes
            methods:    eat, sleep, drink, toString

 */
public class Pet {// Parent, Super Class
    /*
     custom class: pet
            variables:  name, age, color, size, breed, isPet, numberOfEyes
            methods:    eat, sleep, drink, toString
     */

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;

    protected static boolean isPet= true;
    protected static int numberOfEyes= 2;

    public void setInfo(String name,int age,String color,String size,String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;

    }


    public void eat(String food){// Eating meat, cheese, etc...
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){// drinking water, milk etc..
        System.out.println(name+" is drinking water "+drink);
    }

    public void sleep(String place){// We passed String place parameter where the pet sleeping
        System.out.println(name+" is sleeping "+place);
    }

    public String toString(){
        return "name "+name+", age "+age+", color "+color+", size "+size+", breed "+breed;
    }

}
//********************************************************************************************************************

class Dog extends Pet{ // Sub class of Pet class. Inherited from Pet class
    /*
    Dog:
        variables:  name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, bark

        not Inherited:  ==> we will create BARK method only. Rest of the class inherited from PET class
     */

    public Dog(String name, int age, String color, String size, String breed){ // --constructor cant be inherited by
                                                                  //sub classes but we can call it from other sub classes
        setInfo(name, age, color, size, breed);// constrictor call
        // we call it with this.key word too but its long so we use SetInfo method from Super class

    }

    public void bark(){
        System.out.println(name+" is barking ");

    }
}
//********************************************************************************************************************

class Cat extends Pet{// Sub class of Pet class. Inherited from Pet class
    /*
      Cat:
        variables:  name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, scratch

        not Inherited:  ==> we will create SCRATCH method only. Rest of the class inherited from PET class
     */

    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);// constructor call
        // we call it with this.key word too but its long so we use SetInfo method from Super class

    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
//********************************************************************************************************************

class Bunny extends Pet{// Sub class of Pet class. Inherited from Pet class
    /*
    Bunny:
        variables:  name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, Dig

        not Inherited:  ==> we will create DIG method only. Rest of the class inherited from PET class
     */

    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);// constructor call
        // we call it with this.key word too but its long so we use SetInfo method from Super class

    }

    public void dig(){
        System.out.println(name+" is digging");
    }
}

//********************************************************************************************************************

class PetObjects{
    public static void main(String[] args) {

        // Has a relation between PetObjects and Dog, Cat and Bunny class

        // Dog

        Dog dog1=new Dog("Karabas",5,"black","large","Husky");
        System.out.println(dog1);
       // dog1.setInfo("Karabas",5,"black","large","Husky");
        Dog dog2=new Dog("Koki",6,"brown","medium","Husky");
        System.out.println(dog2);
        dog1.bark();

        // Cat

        Cat cat1=new Cat("Muffin",7,"white","medium","Ragdoll");
        System.out.println(cat1);
       // cat1.setInfo("Muffin",7,"white","medium","Ragdoll");
        cat1.scratch();


         // Bunny

        Bunny bunny1=new Bunny("Pamuk",1,"white","small","Holland lop");
        System.out.println(bunny1);
        bunny1.dig();



    }
}