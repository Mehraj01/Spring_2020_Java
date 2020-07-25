package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(10.0);//C
        System.out.println('A');
    }

    public ConstructorPractice(int a){
        this(); // C A
       // this(10.5); we cant call double parametr cons. because default contains it and we already called default cons.
        System.out.println('B');// B
    }

    public ConstructorPractice(double a){
       // this(); we cant call default constructor because its contain contractor with double argument
        // Constructor can call itself or contain itself
       // this(); we cant call it because int cons. contain const default const.
        System.out.println('C');

    }

    public static void main(String[] args) {
        new ConstructorPractice(10);
    }
}
