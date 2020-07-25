package MyOwnLibrary.Inheritance;

public class Animal {

    public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void move(){
        System.out.println(name+" is moving");
    }

}
//********************************************************************************************************************

// Dog class inherited Animal class
class Dog extends Animal { // extends of animal class

    public void bark(){// bark class only belongs to dog class
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {

       Dog dog1=new Dog();
        dog1.name="Lucy";
        System.out.println(dog1.name);

        dog1.move();
        dog1.eat();
        dog1.bark();

    }
}
//********************************************************************************************************************

// Fish class inherited Animal class
class Fish extends Animal {// Fish is child class Animal is super class

    public void swim(){// this class only for fish class
        System.out.println(name+" swimming");
    }

    public static void main(String[] args) {

         Fish fish1=new Fish();
         fish1.name="Nemo";
         fish1.weight=5;
         fish1.size="Small";
         fish1.eat();
         fish1.move();
         System.out.println(fish1.name);

         fish1.swim();



    }
}
