package MyOwnLibrary.CODES;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
    /*
          TASK 1. User username & password

       Write a program that asks user to enter his/her username and password until user enters correctly.

("===================================================================================================================");

             TASK 2. Frequency

             How many times "Java" occurred int the Sting.

("===================================================================================================================");

           TASK 3. Palindrome

               Reverse and Palindrome
("===================================================================================================================");

          TASK 4. User yes or no

            ask the user to enter yes or no.
            if the user enters other than yes or no, repeat the previous step

("===================================================================================================================");

            // TASK  5.  Even Numbers

("===================================================================================================================");

          // TASK 6. Factorial Numbers

          2. write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
("===================================================================================================================");
     */

    }
}
class Credentials{
    public static void main(String[] args) {

      //  TASK 1. User username & password

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = input.next();
        System.out.println("Enter your password");
        String pass = input.next();

        String username="Hello";
        String password="World13";

        boolean result=user.equals(username) && pass.equals(password);
        //

        int count=1;// how many attempt i have

        while(!result){ // if result is false repeat following steps...
            System.out.println("Incorrect username or password");
            System.out.println("Enter your username");
            user = input.next();
            System.out.println("Enter your password");
            pass = input.next();

            result=user.equals(username) && pass.equals(password); // it will helps us check if username or password is correct or not
            // validating new username and password                //is correct or not  while loop running

            count++; // if user provide  wrong password or username 3 times account will be locked.. Count 1, 2, 3
            if(count==3 && !result){// already have three attempts and credentials are still incorrect
                System.out.println("Your account is locked");
                break;
            }
        }


        if(result) { // if result is true logged in
            System.out.println("You logged in");
        }

//System.out.println("===============================================================================================");
        }
}
class Frequency{
    public static void main(String[] args) {

       // TASK 2. Frequency

        String str = "JavaJavaJava".toLowerCase();
        int count = 0 ;
        String word = "java"; //.toLowerCase();  // ignoring the case sensitivity by converting both string to lowercase

        while(str.contains(word)){
            count++; // it will count the word we passed inside the while loop condition
            str = str.replaceFirst(word, ""); // after counting the first "Java", we need to remove it from the str
        }
        System.out.println(count);

//System.out.println("===============================================================================================");
    }
}

class Palindrome{
    public static void main(String[] args) {

        //TASK 3. Palindrome

        String str="Java";
        String reverseStr=""; // store the reversed version of str

        int i=str.length()-1;
        while(i>=0){// it will start from last index of the String
            reverseStr+=str.charAt(i);
            i--;
        }
        System.out.println(reverseStr);

        boolean palindrome=reverseStr.equals(str);

//System.out.println("===============================================================================================");
    }
}

class YesOrNo{
    public static void main(String[] args) {

        //TASK 4. User yes or no

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");

        while( !valid ){  // while the input is not yes or not, rpeats the question
            System.out.println("please re-enter");
            word = input.next();

            if(word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break; // when after wrong input user adds correct input it will break the loop and exit
            }
        }
        if(word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }
        if(word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }
//System.out.println("===============================================================================================");
    }
}

class EvenNumbers{
    public static void main(String[] args) {

        // TASK  5.  Even Numbers

        int sum= 0;

        int i = 0;
        while(i <= 10){
            if(i %2 ==0){
                // System.out.println(i);
                sum += i;
            }

            i++;
        }

        System.out.println(sum);

//System.out.println("===============================================================================================");
    }
}
class FactorialNumbers{
    public static void main(String[] args) {

        // TASK 6. Factorial Numbers

        //In mathematics, the factorial of a positive integer n, denoted by n!,
        // is the product of all positive integers less than or equal to n:
        //The value of 0! is 1
        //5!=5*4*3*2*1=120


        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        long num  =  scan.nextLong();  // 0
        long result = 1; // 120, 6, 24

        while(num >= 1){ // if num>=1  then execute following
            // result *= num;
            result = result * num;  // 5! = 5*4*3*2*1=120  // 3! = 3*2*1=6  // 4! = 4*3*2*2*1=24

            num--; // 5,4,3,2,1
        }
        System.out.println(result);

//System.out.println("===============================================================================================");
    }
}





