package day18_Nested_Loop;

public class Neted_Loop2 {
    public static void main(String[] args) {



        for(int j=1; j<=5; j++){// 1, 2, 3, 4, 5
            for(int i=1; i<=5; i++){
                System.out.print(i+" ");
        }
            System.out.println();// new line. if you not add print statement all the  number will print in same line

        }

        System.out.println("==============================================================");
        /*
        ******
        ******
        ******
        ******
        ******
        ******
        ******

         */

        for(int i=0; i<7; i++){// repeating inner loop over and over again
            int a=1;
            while(a<=10){
                System.out.print("* ");
                a++;
            }
            System.out.println();


        }















    }
}
