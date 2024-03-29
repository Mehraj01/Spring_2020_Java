package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;


    public Dog(){ // sets the dfeualt value for all instances
        name = "unkown";
        breed = "unknown";
        age = 0;
    }

    public Dog(String breed){
        this.breed = breed;
        name = "unkown";
        age = 0;
    }

    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name = "Unknow";
    }



    public String toString(){
        return "Name: "+name +", breed: "+breed+", age: "+age;
    }


/*
    public void method1(){
    }
    public void method1(int a){
    }
 */


}

 class dogJobjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println( dog1.name ); // unknow
        System.out.println( dog1.breed ); // unknow
        System.out.println( dog1.age ); //0

        System.out.println("=============================");

        Dog dog2 = new Dog("Husky");
        System.out.println( dog2.name ); // unkown
        System.out.println( dog2.breed ); // Husy
        System.out.println( dog2.age ); //0

        System.out.println("=============================");

        Dog dog3 = new Dog("Poodle", 4);

        System.out.println( dog3.name );
        System.out.println( dog3.breed ); // poodle
        System.out.println( dog3.age ); // 4

        System.out.println("==========================================");

        System.out.println(dog3);
        System.out.println( dog2 );
        System.out.println(dog1);

        System.out.println("============================");

        //  Dog dog4 = new Dog(5 , "Husky");

    }
}
