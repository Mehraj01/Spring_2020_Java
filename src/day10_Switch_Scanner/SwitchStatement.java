package day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        /*
        this variable cannot be accepted by switch statement
         float a1=4.5f;
        long a2=10l;
        double a3=3.5d;
        boolean a4=(true);
         */

        byte a=3;

        switch(a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("GGG");
                break;
            case 4:
                System.out.println("oooo");
                break;
            default:
                System.out.println("Invalid case");
                break;

        }


    }
}
