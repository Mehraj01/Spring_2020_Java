package MyOwnLibrary.CODES;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
/*
       // Tasks 1.  Odd & Even Numbers


        even number between 1~100 in a single line separated by space
        odd number between 1~100 in a single line separated by space


("===================================================================================================================");

     //   TASK 2.   Reverse String & Palindrome


        write a program that can reverse the following string:
        String str = "Azerbaijan";
        output: najiabrezA
        Use For loop.
        Check the word is palindrome or not?


("===================================================================================================================");

        //   TASK 3.   Alphabets

        Print the Upper Case Letters
        Print the Lower Case Letters
        Use For Loop
        Next Step  do this // Aa Bb Cc Dd ....



("===================================================================================================================");

        //   TASK 4.   Calculate Sum


           write a program that can calculate the sum of all numbers between 1 to any given number
		    ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100


("===================================================================================================================");

       //  TASK 5    Sum of The Even & Odd Numbers between 1~100


          write a program that can calculate the sum of all the even numbers between 1 ~ 100
          write a program that can calculate the sum of all the odd numbers between 1 ~ 100;


("===================================================================================================================");

        //TASK 6.    Skip Printing Numbers Divisible 3 and 5.
                    // Skip printing the chars

       Between 1 to 100
       Skip Printing 1,2,4,7,8....100
       Use continue statement to print the numbers exclude  followings i%3==0 || i%5==0


("===================================================================================================================");

        // Task 7   Divisible 3 & 5


           write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
           write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5


("===================================================================================================================");

        // Task 8. English Alphabet Ascending and descending order


          Write a program that will print out all letters in English alphabet in ascending order
	      Write a program that will print out all letters in English alphabet in descedning order


("===================================================================================================================");

       // TASK 9   Break Statement with chars and ints


       If number equal 3 break the statement
       if char equal 'e' break the loop


("===================================================================================================================");

        //TASK 10  Remove Duplicate Chars

          write a program that can remove duplicated characters from a string


("===================================================================================================================");

         // TASK 11  Calculate The Numbers

           write a program that can calculate the two numbers based on the user provided operators, the program will ask:
                        1. enter first number
                        2. enter the second number
                        3. enter the math operators
                                (assume that only the +, -, *, /, and % will be entered)
      then the system will give the result based on the operator
      at the end it will ask if the user want's to calculate another numbers, if user entered "NO" or "no",
      the program will stop execution, otherwise it repeats all the previous steps
      (you will need a lop that has true condition without the iterator)


("===================================================================================================================");

       //  TASK 12 FINDRA

       3. write a program which prints out the numbers from 1 to 30:
            1. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
			2. for numbers which are divisible by 3, print "FIN" instead of the number.
			3. for numbers which are divisible by 5, print "RA" instead of the number

		Ex:
			1 2 FIN 4 RA FIND .... FINDRA

("===================================================================================================================");

          TASK 13.  Find MAx and Min

          Find maximum number and The Minimum number

("===================================================================================================================");

          TASK 14. Frequency of String

        write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"

("===================================================================================================================");

         TASK 15. Uniques

          write a program that can return the unique characters from a string
		  Ex:  "AABCC" ==> "B"
("===================================================================================================================");

       TASK 16 delete first letters

       2. Ask user to enter two words. Print first word without its first character then print the
        second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana


("===================================================================================================================");




    */

    }
}






class print_OddEven {
    public static void main(String[] args) {

        // Task 1.   Odd & Even Numbers

        // this loop will print for us even numbers from  1 to 100; It has to be started from 0 to get even numbers.
        //We use String to hold numbers with order. String result ==> 1 2 3 4 ...
        // int numbers=0; // when we use int to hold numbers we automatically will get sum of numbers. int numbers ==> 2550

        String Evens=" ";
        //even number between 1~100 in a single line separated by space
        for(int i=0; i<=100; i+=2){  // we increment it by 2
            Evens+=i+" "; // 0+2+4+6+8.....
        }
        System.out.println(Evens);


        String Odds=" ";
        //odd number between 1~100 in a single line separated by space
        for(int i=1; i<=100; i+=2){  // we increment it by 2
            Odds+=i+" "; // 1+3+5+7....
        }
        System.out.println(Odds);

    }

}
//System.out.println("===============================================================================================");
class Revers_Palindrome_String {
    public static void main(String[] args) {

        //  TASK 2.   Reverse String & Palindrome

        String str="Azerbaijan";
        int lastIndex=str.length()-1;

        String reverse="";// reverse will hold all single chars in a reverse order.
        for(int i=lastIndex; i>=0; i--){ // Loop will start from last index till to index 0
            reverse+=str.charAt(i); // charAt();  each single characters
        }
        System.out.println(reverse);

        boolean palindrome=str.equals(reverse);// check its palindrome or not
        System.out.println(palindrome);


        System.out.println("========================================================");

        // Reverse String
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
}
//System.out.println("===============================================================================================");
class Alphabets {
    public static void main(String[] args) {

        //   TASK 3.   Alphabets

        String upperCase=""; // A~Z
        String lowerCase=""; // a~z

        for(char i='A'; i<='Z'; i++){  // Ascii Table order numbers of Uppercase Chars ==> A=65,  Z=90
            upperCase+=i+" "; // A B C ...
        }
        System.out.println(upperCase);

        for(char a='a'; a<='z'; a++){ //Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
            lowerCase+=a+" "; // a b c ...
        }
        System.out.println(lowerCase);


        // Aa Bb Cc Dd ....

        String result="";

        for(int i=0; i<upperCase.length(); i++){
            result+=""+upperCase.charAt(i)+lowerCase.charAt(i); //Evey time loop runs it will add each upper and lower case chars
        }
        System.out.println(result);

        System.out.println('a'+""+'b'); // ab

//System.out.println("===============================================================================================");
    }
}

class Calculate_Sum{
    public static void main(String[] args) {

        //   TASK 4.   Calculate Sum

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=input.nextInt();
        int result=0;

        // Each time loop run till given number and it will count till that number
        // for exp: if i<=num(4)==> 1+2+3+4 = 10 ,  i<=num(6) ==> 1+2+3+4+5+6 = 21
        for (int i=0; i<=num; i++){
            result+=i; // i ==> 1,2,3,4.... till given number. It is the numbers that how many times loop will run.
                                                                                             // Depends on condition
            // Result+=i ==> means it will add each number(i) to each other
        }
        System.out.println(result);

//System.out.println("===============================================================================================");

    }
}

class SumOf_EvenAndOdd{
    public static void main(String[] args) {

        //  TASK 5   Sum of The Even & Odd Numbers between 1~100

        int sum1=0;
        int sum2=0;

        for(int i=0; i<=100; i++){
            if(i%2==0){
                sum1+=i;// Even Numbers ==> 0+2+4+6+8... = 2550
            }else{
                sum2+=i;// Odd Numbers ==> 1+3+5+7+9... = 2500
            }
        }

        System.out.println();

        System.out.println("Sum of All Even Numbers: "+ sum1); //2550
        System.out.println("Sum of All Odd Numbers: "+sum2);  //2500

//System.out.println("===============================================================================================");
    }
}

class SkipPrinting_Followings {
    public static void main(String[] args) {

        //TASK 6. Skip Printing some Numbers between 1 - 100

        //  Skip Printing 1,2,4,7,8....100
        for (int i=0; i<=100; i++){
            if(i%3==0 || i%5==0){ // 3%3=0, 5%5=0, 6%3=0, 9%3=0, 10%5=0, 12%3=0... etc
                continue; // means skip the given condition
            }
            System.out.print(i+" "); // 1,2,4,7,8....
        }

        System.out.println();


        // skip printing Y, H, J, D
        for(char ch='A'; ch<='Z'; ch ++){ // Ascii Table order numbers of Uppercase Chars ==> A=65,  Z=90
           // for(char ch='Z'; ch>='Z'; ch --){ // we can Also use from Z to A. And in this case we will decrement the ch--
            if(ch=='Y' || ch=='H' ||ch=='J' ||ch=='D')
                continue; // skip the chars inside the if condition
            System.out.print(ch+" ");
        }


        // More examples with for loop and continue statement
/*
        for(int i=1; i<=5; i++){// i: 1 2 3 4 5
            if(i==3){
                continue;// skip the number
            }
            System.out.println(i);

        }

        for(int i=0; i<=20; i++){
            if(i%2!=0){
                continue; // skip all the odd numbers
            }
          //  if(i%2==0){ // skips all the even numbers
               // continue;
            //}
            System.out.print(i+" ");



            for(int i=1; i<=5; i++){// i: 1 2 3 4 5
            if(i==3){
                continue;// skip the number
            }
            System.out.println(i);
        }

        for(int i=0; i<=20; i++){
            if(i%2!=0){
                continue; // skip all the odd numbers
            }
           // if(i%2==0){ // skips all the even numbers
               // continue;
           // }
            System.out.print(i+" ");
        }

 */

//System.out.println("===============================================================================================");
    }
}

class Divisible_ThreeAndFive{
    public static void main(String[] args) {

        // Task 7   Divisible 3 & 5

        for (int i=1; i<=100; i++){
            //if(i%2!=0){
            if(i%2==0){ //
                if(i%3==0 && i%5==0)
                    System.out.print(i+" ");
            }
        }
//System.out.println("===============================================================================================");
    }
}
 class Alphabet_AscenAndDescen {
     public static void main(String[] args) {

         // Task 8. English Alphabet Ascending and descending order

         for(char ch='A'; ch<='Z';ch++){ // Ascii Table order numbers of Uppercase Chars ==> A=65,  Z=90
             System.out.print(ch+" ");
         }
         System.out.println();

         for (char ch='Z'; ch>='A'; ch--){
             System.out.print(ch+" ");
         }
         System.out.println();

         for(char ch='a'; ch<='z';ch++){ //Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
             System.out.print(ch+" ");
         }
         System.out.println();

         for (char ch='z'; ch>='a'; ch--){
             System.out.print(ch+" ");
         }
//System.out.println("===============================================================================================");
     }
 }
class breakStatement_IntsAndChars{
    public static void main(String[] args) {

        // TASK 9   Break Statement with chars and ints

        for(int i=1; i<=5;i++){ // 1,2,3,4,5
//            if(i==3){ // if first condition is true ==> it will check condition and print the statement
//                break;
//            }
            System.out.println("Hello World");
            //break;
            if(i==3){// if first condition is true ==> and skip the loop based on the if statement
                break;
            }
        }

        for(char i='a'; i<='z'; i++){//Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
            if(i=='e'){// execute a, b, d when we use if before the print statement
                break;
            }
            System.out.println(i);
//            if(i=='e'){// execute a, b, d,  when we use print statement before the if statement
//                break;
//            }
        }
//System.out.println("===============================================================================================");
    }
}
 class RemoveDuplicates_Chars{
     public static void main(String[] args) {

         //TASK 10  Remove Duplicate Chars

         String str= "ABACBB";
         //index number:123

         String result="";

         for(int i=0; i<str.length();i++) { // 0,1,2,3
             if(result.contains(""+str.charAt(i))){
                 continue; //if the result contains same chars then skip. If it does contain the same char
                            // it will not concat it to the result
             }
             result+=str.charAt(i);
         }
         System.out.println(result);


         /*
         // Without continue statement

         for(int i=0; i<str.length();i++) {
          if( !result.contains( ""+str.charAt(i)) ) { // in this case we don't need to use continue statement
                      result += str.charAt(i);
            }
          }
           System.out.println(result);
          */

//System.out.println("===============================================================================================");
     }
 }

 class Calculater{
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         // TASK 11  Calculate The Numbers

         for(int i= 0; true ; ) {  // infinite loop  ,  opening curly brace of loop

             System.out.println("Enter first number");
             int num1 = input.nextInt();

             System.out.println("Enter second number");
             int num2 = input.nextInt();

             System.out.println("Math operator: ");
             String operator = input.next();  // +, -, *, /, %

             if (operator.equals("+")) {
                 System.out.println("Addition is: " + (num1 + num2));
             } else if (operator.equals("-")) {
                 System.out.println("Subtraction is: " + (num1 - num2));
             } else if (operator.equals("*")) {
                 System.out.println("Multiplication is: " + (num1 * num2));
             } else if (operator.equals("/")) {
                 System.out.println("Division is: " + (num1 / num2));
             } else if (operator.equals("%")) {
                 System.out.println("remainder is: " + (num1 % num2));
             } else {
                 System.out.println("Invalid Operator");
             }

             System.out.println("Do you wanna continue");
             String answer = input.next();

             if(answer.equalsIgnoreCase("no")){  // only exits the loop if the answer is NO
                 break;
             }

         } // closing curly brace of loop

//System.out.println("===============================================================================================");
     }
 }

class Findra{
    public static void main(String[] args) {

        //  TASK 12 FINDRA
       // Ex:
       // 1 2 FIN 4 RA FIND .... FINDRA

        String result = "";

        for(int i = 1; i <= 30; i++){
            if( i % 3 ==0 && i % 5 ==0){  // prints the numbers that are divisible by both 3 & 5
                // System.out.print("FINRA"+" ");
                result += "FINRA "; // concatenation
            }else if( i % 3 == 0 ){  // prints the numbers that are ONLY divisible by 3
                //  System.out.print("FIN"+" ");
                result += "FIN "; // concatenation
            }else if(i % 5 == 0 ){  // prints the numbers that are ONLY divisible by 5
                // System.out.print("RA"+" ");
                result += "RA "; // concatenation
            }else{  // prints the numbers that are not divisible by either 3 or 5
                //  System.out.print(i+" ");
                result += i+" ";   // concatenation
            }
        }
        System.out.println(result);
//System.out.println("===============================================================================================");
    }
}

class Max_Min{
    public static void main(String[] args) {

        // TASK 13.  Find MAx and Min

        Scanner input = new Scanner(System.in);
        int MaxNumber = -2147483647;  // any number the user provided will be greater than this number
        // first user entered variable will be initialized to MaxNumber
        //MaxNumber = 5;
        int MinNumber = 2147483647; // any number the user provided will be lesser than this number
        // MinNumber = 0;

        for(int i =1; i <= 10; i++) { // i: 1, 2, 3,4,5
            System.out.println("Enter a number");
            int num = input.nextInt();  // 0, 5, 1, 3, 0

            if(num > MaxNumber){  // to compare each user inputs , and assign the maximum number to MaxNumber
                MaxNumber = num;
            }

            if(num < MinNumber){ // to compare each user inputs , and assign the minimum number to MinNumber
                MinNumber = num;
            }
        }
        System.out.println("Maximum Number: "+MaxNumber);
        System.out.println("Minimum Number: "+MinNumber);
//System.out.println("===============================================================================================");
    }
}
class Frequency_String{
    public static void main(String[] args) {

        // TASK 14. Frequency==> "AABCBCA" ==> "A3B2C2"


        String str = "AABCC";     //"A2B1C2"


        String nonDup =""; //ABC
        for(int i=0; i <= str.length()-1; i++){
            if(!nonDup.contains( ""+str.charAt(i)) ){  // if the character at index i is not contained in nonDup,
                nonDup += str.charAt(i); // then it will be concat to nonDup
            }
        }
       // System.out.println(nonDup);


        String result = "";   //"A2B1C2"
        // nonDup ="ABC";     str = "AABCC";   ==> result= "A2B1C2"
        for(int j = 0 ; j <= nonDup.length()-1; j++ ){
            char ch = nonDup.charAt(j);//"ABC"

            int count = 0;  // count the total number of occurence of each charcter from str
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){// str = "AABCC" each index equal ch which id == nonDup...
                    // "AABCC"=="ABC"
                    count++;// A1, A2, B1, C1, C2...==> "A2B1C2"
                }
            }
            result +=   ""+ ch  + count;
            // result will hold ch ==> "ABC", and count ==> "A2B1C2"
            // every time loop will run each count of the index will be added
        }

        System.out.println(result);

        System.out.println("========================================================");


        String str1 = "javajavajavajavajava"; //AA
        String str2 = "java";
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        System.out.println(count);


    }
}
//System.out.println("===============================================================================================");
class Uniques{
    public static void main(String[] args) {

       // TASK 15. Uniques

        //String str="AABCCUR";
        //String result=""; // "B"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();// input

        String result = ""; //"C", to store the unique characters

        for(int j=0; j <= str.length()-1; j++ ){// we this loop to compare with the second loop
            char ch2 = str.charAt(j);// this will hold all the char that have int the string

            int count = 0 ;  // to count the occurrence of the character
            for(int i = 0; i <= str.length()-1; i++){
                char ch = str.charAt(i);// this will hold all the char that have int the string
                if(ch == ch2){  // it will compare two same chars.
                    count++;// if it is equal it will count every single chars
                }}
            if(count == 1){  // if count == 1 then result concat ch2
                result+=ch2;
            } }

        System.out.println(result);


        System.out.println("=============================================================");


        /*
          String unq="";
        for(int k=0; k<str.length(); k++ ){
            int count=0;
            for(int i=0; i<str.length(); i++ ){
                if(str.charAt(i)==(str.charAt(k)))
                    count++;
            }
            if(count==1){
                unq+=str.charAt(k);
            }
        }
        System.out.println(unq);

         */


//System.out.println("===============================================================================================");
    }
}

class removeFirstLetter_Scanner{
    public static void main(String[] args) {

        //TASK 16 delete first letters
        //Input: apple, banana
        //Output: ppleanana


        // my version with for loop
        Scanner scan=new Scanner(System.in);
        String result1="";
        for (int i=0; i<2; i++){
            System.out.println("Enter word ");
            String word=scan.next();
            result1+=word.substring(1);
        }
        System.out.println(result1);

    }
}





