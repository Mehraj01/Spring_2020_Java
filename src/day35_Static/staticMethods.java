package day35_Static;

public class staticMethods {
    int a=100;/// instance variable and it belongs to object
    static  int b=200;

    public static void main(String[] args) {

       // System.out.println(a); instance variable and it will give an error. static variable only accepts static

        staticMethods obj=new staticMethods();
        System.out.println(obj.a); // we can call instance variable only from object name. obj ==> static, a ==> instance

        System.out.println("************************************************");

        System.out.println(b);// static variable
        System.out.println(staticMethods.b);// we can call static variable via class name as well. (preferred)
        System.out.println(obj.b);// this calling method dosent preferred

    }




    public void method(){
        System.out.println(a);// we can  call instance variable through instance method
        System.out.println(b); // if it is static we can use it anywhere (global variables)
    }
}
