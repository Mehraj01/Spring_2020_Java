package SELF_PRACTICE.Solutionns_Classes_Ways;

public class OddEvenNumbers_For_Loop {
    public static void main(String[] args) {

        //task2:
        /*
       --- wright a program that display even number to 1 to 33
       --- print all the add numbers 1 to 33
         */

        for (int i = 1; i <=32; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }


        System.out.println();

        for (int i = 1; i <=32; i++) {
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }


        System.out.println();


    }
}
