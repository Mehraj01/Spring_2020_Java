package day38_Constructors;

public class ConstructorCall3 {


    public ConstructorCall3(){
        this(9);// int argument
        System.out.println("Default");
    }

    public ConstructorCall3(int a){
      //  this(); we cant call default constructor in this case because default constructor contains const. with int argument
       // default constructor contains this constructor
        // this(10); constructor cant call itself
        System.out.println("Int Argument");
    }


    public static void main(String[] args) {

        new ConstructorCall3();
    }


    public void method1(){
        //this();
        method1();
    }
}
