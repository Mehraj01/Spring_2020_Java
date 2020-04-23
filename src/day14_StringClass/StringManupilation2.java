package day14_StringClass;

import java.util.Scanner;

public class StringManupilation2 {
    public static void main(String[] args) {

        String str = "  ";

        boolean bool1 =  str.isEmpty();  //false

        System.out.println(bool1);

        String username = "";

        if(username.isEmpty()){
            System.out.println("please provide the user name first");
        }

        System.out.println("==================================================================");

        String s1 = "Cat"; // String literal
        String s2 = new String("Cat");

        System.out.println(s1 == s2);  // false, different memory locations, different objects

        System.out.println(   s1.equals(s2)    ); // true


        String z1 = "Tiger";

        String z2 = new String("Tiger");

        String z3 = "Tiger";

        String z4 = "tiger";

        // ==
        System.out.println( z1 == z2 ); // false
        System.out.println(z2 == z3);  // false
        System.out.println( z1 == z3 ); // true, same object

        // equals():
        System.out.println( z1.equals(z2)  );   // true
        System.out.println( z2.equals(z3) );    // true
        System.out.println(z1.equals(z3));  // true
        System.out.println(z3.equals(z4)); // false

        /*
        userName: cybertek
        passWord: cybertekschool
         */


        String user="Sada";
        String password="Aghayeva";

        Scanner input=new Scanner(System.in);
        System.out.println("Enter user name:");
        String addUser=input.next();
        System.out.println("Enter password");
        String addPassword=input.next();

        boolean validEntry=addUser.equals(user)&& addPassword.equals(password);

        if(validEntry){
            System.out.println("Log in successfully");
        }else
            System.out.println("Invalid Entry");







    }
}
