package day37_Constructors;
class dog{

    String name;  // only belong to the objects of dog class
    int age;  // only belong to the objects of dog class

    public void setInfo(String name, int age){
        name = name;
        age = age;
    }

}


class Test{
    public static void main(String[] args) {
        // Test obj = new Test();
        dog obj = new dog();
        System.out.println(obj.name);
        System.out.println(obj.age);

        dog obj2 = new dog();
        obj2.setInfo("Lucy", 4);

        System.out.println(obj2.name ); // null
        System.out.println(obj2.age); //0


    }
}

public class StaticsReveiw {
    static int a;  //1 copy
    int b; // 2, each object has its own copy of instance variable

    static String name = "John";
    String id = "123";

    public static void main(String[] args) {
        StaticsReveiw obj1 = new StaticsReveiw();
        obj1.a = 20;
        obj1.b = 10;

        StaticsReveiw obj2 = new StaticsReveiw();
        obj2.a = 30;
        obj2.b = 40;

        System.out.println(obj1.a);  // 30
        System.out.println( obj2.a );  // 30

        System.out.println(obj1.b); // 10
        System.out.println( obj2.b ); // 40

        System.out.println("==========================================");

        System.out.println(name);
        // System.out.println( id );  // static only accept static,

    }
}
