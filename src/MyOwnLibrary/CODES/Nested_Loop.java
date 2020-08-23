package MyOwnLibrary.CODES;

import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args) {

        /*
         TASK 1.  Calculate

         Calculate user given 2 numbers
         While Loop

("===================================================================================================================");
          Task 2. Nested Loop Practices

          Drawing, General understanding how nested loop works
          Print the 1 to 5 numbers 5 times
          Print the asterisks 7 times

          1 2 3 4 5    ******
          1 2 3 4 5    ******
          1 2 3 4 5    ******
          1 2 3 4 5    ******
          1 2 3 4 5    ******

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *

("===================================================================================================================");

             Task 3. Nested For Each Loop

             With MultiDimensional Array. Print Chars and Numbers

("===================================================================================================================");

            Task 4. Nested For Each Loop

            - Sum of Odd, Even numbers
            - Count of Odd Numbers

("===================================================================================================================");

            Task 5. Nested For Loop

            Print Char MultiDimensional Array

("===================================================================================================================");

               Task 6. Nested Loop

               Find index j and index k
("===================================================================================================================");





         */

    }
}
class Calculate{
    public static void main(String[] args) {

       // TASK 1.  Calculate

        Scanner input = new Scanner(System.in);

        while(true) { //it will execute first calculation ==> and move to second loop.
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();
            while(  ! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no"))  ){
                // if answer is not equal yes or no it will keep asking till it is yes or no...
                System.out.println("Invalid Entry, please enter yes or no");
                answer = input.next();
            }

            if(answer.equalsIgnoreCase("No")){ //if answer equal no it will exit the loop.
                System.out.println("Thank you for using the calculator");
                break;
            }
        }

//System.out.println("===============================================================================================");

    }
}

class NestedLoop_Works{
    public static void main(String[] args) {

       // Task 2. Nested Loop Practices

        // Here my first loop will print the numbers from 1 to 5. To repeat the same steps over and over again
        // I will create another loop and will add my first loop inside the that loop

        for(int j=1; j<=3; j++) {// 1, 2, 3, // It will repeat inside loop 3 times
            for (int i = 1; i <= 5; i++) { // it will print the numbers from 1 to 5
                System.out.print(i + " ");
            }
            System.out.println();// new line. if you not add print statement all the  number will print in same line
        }

System.out.println("*******************************************************");

            for(int i=0; i<7; i++){// repeating inner loop over and over again // 7 times
                int a=1;
                while(a<=10){
                    System.out.print("* "); // it will print asterisk 10 times ==> * * * * * * * * * *
                    a++;
                }
                System.out.println();
            }

System.out.println("*******************************************************");

        for(int j= 1; j <= 9; j++){ // 1,2,3,4,5,6,7,8,9  //  (j) 1 <= 9
           // it will increment asterisk every time that loop runs from 1 ==>  to end of length of the loop

            for(int i =1; i <= j; i++){ // condition is true ==>  (i) 1 <= 1 (j)...( This loop provide us only one asterisk
                System.out.print("* ");
            }
            System.out.println();
        }
       // if you wanna do reversed asterisk the outer loop ==> for(int j= 9; j >= 0; j-- ){}

System.out.println("*******************************************************");

        // repeating inner loop over and over again.
        for(char z = 'a'; z <= 'd'; z++){ //Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
            // 1. ==>a
            //2. ==> ab
            // 3. ==> abc

            for(char ch ='a'; ch <= z ; ch++ ){  // ( z) 'a' >= (ch) 'a' ==> true
                System.out.print(ch+" ");
            }
            System.out.println();

            // if you wanna do reversed ==> (char z = 'z'; z >= 'a'; z--){
        }

//System.out.println("===============================================================================================");
    }
}
class Nested_ForEach_Loop{
    public static void main(String[] args) {

      //  Task 3. Nested For Each Loop

        int[] arr = {1,2,3,4,5};
        //   0 1 2 3 4
        for(int each   : arr){
            System.out.print(each);
        }
        System.out.println();
        System.out.println("======================================");


        int[][] arr2D = { {1,2,3}, {4,5,6}  };
        //                   0        1
        for(int[]  each1Darray: arr2D ){
            for( int eachElement  : each1Darray ){
                System.out.print(eachElement);
            }
        }
        System.out.println();
        System.out.println("======================================");


        char[][] ch2D = {  {'A', 'B'} , {'C', 'D', 'E'} , {'F', 'J', 'H'}  };
        //                      0            1
        for(char[] each1DArray   :  ch2D ){  //2
            for( char eachElement  : each1DArray ){
                System.out.print(eachElement);

            }

        }


    }
}
//System.out.println("===============================================================================================");

class Sum_Count_ofEvenOdd{
    public static void main(String[] args) {

        //Task 4. Nested For Each Loop

        int[][] numbers = { {1,2,3}, {4,5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19,20,21} };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number

        int countOdd = 0;
        int sumofOdd = 0;
        int sumofEven = 0;

        for( int[] each1DArray  : numbers){ // each1 index of [][] numbers ==> each index of [] each1
            for(int eachElement  : each1DArray ){
                if(eachElement %2 == 0){ // even nums
                    System.out.print(eachElement +" ");
                    sumofEven += eachElement;// sum of even numbers 2+4+6...
                }else{  // odd numbers
                    sumofOdd += eachElement; //sum of odd numbers 1+3+5...
                    countOdd++;
                }
            }
        }

        System.out.println();

        System.out.println("Count of odd: "+countOdd);
        System.out.println("sum of odd: "+sumofOdd);
        System.out.println("sum of even: "+sumofEven);

        /*

        int countOdd = 0;
        for(int j = 0; j < numbers.length; j++){ // j: index num of 1D arrays

            for(int i = 0; i < numbers[j].length; i++ ){ // i: index num of elements in 1Darray
                int num =   numbers[j][i];
                if(num % 2 ==0){
                    System.out.print(num +" ");
                }else{
                    countOdd++;
                }
            }
        }
        System.out.println();

        System.out.println(countOdd);

         */

    }
}
//System.out.println("===============================================================================================");

class Char_MultiDimensional_Array{
    public static void main(String[] args) {

       // Task 5. Nested For Loop
                         //   0   1        0    1    2        0    1    2    3
        char[][] arr2D = {  {'A','B' } , {'C', 'D', 'E' } , {'F', 'J', 'H', 'I' }  };
                           //    0               1                     2
        // arr2D[0] ==> {'A','B' }
        for(int i=0; i < arr2D[0].length; i++ ){
            System.out.print( arr2D[0][i]  );
        }
        System.out.println();

        //arr2D[1]  ==> {'C', 'D', 'E' }
        for(int i=0; i < arr2D[1].length; i++){
            System.out.print(  arr2D[1][i]  );
        }
        System.out.println(

        );
        //arr2D[2] ===>    {'F', 'J', 'H', 'I' }
        for(int i=0; i < arr2D[2].length ;  i++){
            System.out.print( arr2D[2][i]   );
        }
        System.out.println();

        System.out.println("==========================================================================");

        for(int j=0; j<arr2D.length; j++ ){  // j: index numbers of 1D array     i:index number of elements in 1D array
            for(int i=0; i < arr2D[j].length; i++ ){ //arr2D[0], arr2D[1],  arr2D[2]
                System.out.print( arr2D[j][i]  );
            }
        }


    }
}
//System.out.println("===============================================================================================");

class Find_J_K_Index{
    public static void main(String[] args) {

        //Task 6. Nested Loop

        for (int j = 0; j < 2; j++) { // This loop will run two time
            //System.out.print(j);
            for (int k = 0; k < 10; k++) { // This loop will run 3 time for each time
                System.out.print(j+"j"+" "+k+"k ");  // 0j 0k, 0j 1k, 0j 2k, 0j 3k  -//-  1j 0k, 1j 1k ,1j 2k ,1j 3k
                if (k == 3) {    // j only will == 0 and one. Because j loop runs only 2 times
                    break ;
                }
            }
        }


    }

}

//System.out.println("===============================================================================================");