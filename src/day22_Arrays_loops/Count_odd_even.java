package day22_Arrays_loops;

public class Count_odd_even {
    public static void main(String[] args) {
        /*
4. write a program that can count the even and odd number from an array of integers
						MUST use for each loop and continue statement
 */

        int[] arr = {1,2,3,4,5,6,7,8,9,10, 11};

        int countOddNumbers = 0;
        int countEvenNumber = 0;

        for(int each : arr){
            /*
            if(each % 2 !=0){
                countOddNumbers++;
            }else{
                countEvenNumber++;
            }
             */

            if(each % 2 ==0){
                countEvenNumber++;
                continue;
            }

            countOddNumbers++;


        }

        System.out.println("even numbers: "+countEvenNumber);
        System.out.println("odd numbers: "+countOddNumbers);

    }
}
