package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit084_ZombieAttack_Loop {
    public static void main(String[] args) {
        /*
        A variable inhabitants represents a city and its respective populations.
        City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
        After each day, a city will lose half of its population.
        write a program to loop the city population and make it lose half of its population until no humans left.
        Print the each day like below for each day:

example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
         */
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();


        String days="";
        int result=0;
        int num=0;

        for(int i=inhabitants; i>=0;i--){
            result=inhabitants;
            inhabitants=inhabitants/2;
            days="Day "+num;
            num++;
            if(result==0){
                break;
            }
            System.out.println(days+" ["+result+"]");
        }
        System.out.println("---- EXTINCT ----");









    }
}
