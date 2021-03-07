package PracticeTasks;

import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {

       //Days of the week
        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();


        int attempts=1;
        for (int i = 0; i <days.length ; i++) {
            if(num>7 || num<1){
                System.out.println("Invalid Entry. Please reenter the number again");
                num=input.nextInt();
            }
            attempts++;
            if(attempts==3 && (num>7 ||num<1)){
                System.exit(0);
            }
        }
        System.out.println(days[num-1]);

    }


}
class monthOfYear{
    public static void main(String[] args) {

        String[] months ={"Jan" , "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"};

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month");
        int num=input.nextInt();

        for (int i = 0; i <months.length ; i++) {
            if(num>12 || num<1){
                System.out.println("Invalid number. Please reenter number again");
                num=input.nextInt();
            }

        }
        System.out.println(months[num-1]);





    }



}

