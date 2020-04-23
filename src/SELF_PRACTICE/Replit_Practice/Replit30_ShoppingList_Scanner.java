package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

public class Replit30_ShoppingList_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1=input.nextLine();
        int count1=input.nextInt();
        double price1=input.nextDouble();

        input.nextLine();

        System.out.println("Enter Item2, count and its price:");
        String item2=input.nextLine();
        int count2=input.nextInt();
        double price2=input.nextDouble();

        input.nextLine();

        System.out.println("Enter Item3, count and its price:");
        String item3=input.nextLine();
        int count3=input.nextInt();
        double price3=input.nextDouble();

        int count=count1+count2+count3;

     String report=" ";
        if(count1==0){
           report="Item2: "+item2+" Price: "+price2*count2+", Item3: "+item3+" Price: "+price3*count3;
        }else if(count2==0){
            report="Item1: "+item1+" Price: "+price1*count1+", Item3: "+item3+" Price: "+price3*count3;
        }else if(count3==0){
            report="Item1: "+item1+" Price: "+price1*count1+", Item2: "+item2+" Price: "+price2*count2;
        }
        System.out.println(report);


        double totalPrice=price1*count1+price2*count2+price3*count3;
        if(count>0){
            System.out.println("Total price: "+totalPrice);
        }

    }
}
