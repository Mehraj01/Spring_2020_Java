package day10_Switch_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {

        int number=6;

        switch(number){
            case 1:
                System.out.println("Monday");
                break;//case closed
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;

        }



    }
}
