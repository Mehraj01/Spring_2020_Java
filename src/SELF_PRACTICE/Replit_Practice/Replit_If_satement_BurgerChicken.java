package SELF_PRACTICE.Replit_Practice;
import java.util.Scanner;
public class Replit_If_satement_BurgerChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String in = s.next();
        double price=0;
        if(in.equalsIgnoreCase("burger")||in.equalsIgnoreCase("chicken") ){
            price=10.0;
        }

        if(in.equalsIgnoreCase("soda")){
            price=2.0;
        }
        System.out.println(price);

    }
}
