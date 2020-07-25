import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class Practice {

    public static void main(String[] args) {



        // Write a program that will take five Strings and save them into an array called arr.
        //2. use for each loop to print out the first three letter of each element of arr, one per line.
        //You can assume that every element of arr is at least 3 letters long.
        //            Example:
        //                arr -> ["apple", "banana"]
        //                prints: app
        //                        ban

        Scanner scan=new Scanner(System.in);
        String t[]=new String[3];
        for(int a=0;a<3;a++){
            t[a]=scan.next();
        }
        for(int i=0;i<t.length;i++){
            System.out.println(t[i].substring(0,3));
        }








    }
}

