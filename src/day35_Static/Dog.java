package day35_Static;

public class Dog {
    String breed;
    String age;

    static boolean isPet;

    public static void main(String[] args) {
         Dog dog1=new Dog();
         dog1.breed="Husky";
         dog1.isPet=true;

         Dog dog2=new Dog();
         dog2.breed="Poddle";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);



       // both dog1 and dog 2 will give us true because static is share the same copy
        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);




    }
}
