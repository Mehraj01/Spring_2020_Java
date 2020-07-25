package day50_Polymorphism;

/*
> Type Castings: converting one type to another ==> byte < short < int < long < float < double
    - Primitive Type Casting: implicit & explicit
            * implicit casting: smaller type to larger type. automatically done
                        int a = 100;
                        double b = a;
            * explicit casting: larger type to smaller type. MUST be done manually
                        int a = 200;
                        short s = (short) a ;

> Reference Type Casting: UpCasting & DownCasting
    - pre condition: there MUST IS A relationship
               *  upCasting: casting from subclass type to superclass type (done by compiler implicitly)
               *  downCasting: casting from a superclass type to subclass type (MUST be done explicitly)

 */

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        int a=100;
        double b= (double)a; // implicitly done // It is done automatically

        // UpCasting ==> cast smaller to larger ==>  It is done automatically

        Dog dog=new Dog("a", 1, "f");
        Animal animal1=(Animal)dog; // upcasting, done implicitly // It is done automatically by compiler

        Cat cat=new Cat("r", "female", 4);
        //Dog dos2=(Dog)cat; // there is no is a relation because of that we cant cast dog to cat
        Animal animal2=(Animal)cat;// upcasting, done implicitly // It is done automatically by compiler

        System.out.println("=================================================================================");


        double c=10;
        int d=(int)c; // explicit casting


        // DownCasting ==> cast bigger to smaller ==> Must be done manually

        Animal animal3=new Dog("d", 12, "g");
        Dog dog3=(Dog)animal3; // DownCasting casting // animal reference to Animal class which is larger than dog class
                               // we have to do DownCasting casting not to get compiler error

        Animal animal4=new Cat("C", "female", 7);
        Cat cat2=(Cat)animal4;// DownCasting casting, Must be done manually
        // Pre condition ==> There has to be IS A relation to do casting

        System.out.println("=================================================================================");


        Animal animal5=new Dog("Lucy",3, "female") ;
        //animal5.bark();// without casting we cant use bark method with animal5 because it refer to Animal class
        Dog dog2=(Dog)animal5; // casting
        dog2.bark();

        //second way to do
        ((Dog)animal5).bark();










    }
}
