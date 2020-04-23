package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between 1~100 in a single line separated by space
         */

        String result=" ";
        for(int num=1; num<=100; num+=2){
            result+=num+" ";
           // System.out.print(num+" ");
        }
        System.out.println(result);

        for(int num1=0; num1<=100; num1+=2){
            System.out.print(num1+" ");
        }





    }
}
