package day20_ArraysContiniue;
import java.util.Arrays;
public class Array_Sorting {
    public static void main(String[] args) {


        int[] arr1 = {10, 19,5,2,3,4,5, -1, 300};
        Arrays.sort(arr1);

        System.out.println( Arrays.toString(arr1) );

        System.out.println("First min number is: " + arr1[0]);
        System.out.println("Second minnumber is: "+arr1[1]);

        System.out.println("First max number is: "+ arr1[ arr1.length -1]);
        System.out.println("Second max number is: "+arr1[arr1.length-2]);


        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E' , 'D' };
        Arrays.sort(ch);

        System.out.println( Arrays.toString(ch) );


        String[] names = {"Deniz", "Osman", "Rustem",  "Anna", "Ali", "Adil"};
        Arrays.sort(names);
        System.out.println( Arrays.toString(names) );

        System.out.println("=======================================================");

        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        int[] arrDesc = new int[arr.length];  //[0, 0, 0, 0, 0, 0, 0, 0]
        // index:0, 1, 2, 3, 4, 5, 6, 7

        Arrays.sort(arr); // [-100, -1, 1, 3, 4, 100, 155, 200]
        // index:   0    1  2  3  4  5     6    7
        int k = 0;
        for(int i = arr.length-1; i >= 0; i-- ){
            arrDesc[k] =  arr[i];
            k++;
        }

        System.out.println(  Arrays.toString(arrDesc)  );





    }
}
