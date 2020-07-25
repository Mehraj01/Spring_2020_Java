package day36_StaticBlock;

public class StaticBlock {


    public static void main(String[] args) {
        System.out.println("Main method executed");

        method1();// custom method has to be called from main method for to be executed
    }


    public static void method1(){///Custom Method. it has to be called bye main method
        System.out.println("Custom method executed");
    }


    static{// Static block executed first always before main method. Runs only one time
        System.out.println("Static block executed");
    }



}
