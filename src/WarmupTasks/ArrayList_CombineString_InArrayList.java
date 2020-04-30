package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_CombineString_InArrayList {
    public static void main(String[] args) {
        /*
         5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */

        String []arr1={"A", "B", "C"};
        String []arr2={"D", "E", "F", "G"};
        String []merge=new String[arr1.length+arr2.length];


        for(int i=0; i<arr1.length; i++){
            merge[i]=arr1[i];
        }
        for(int k=0; k<arr2.length; k++){
            merge[arr1.length+k]=arr2[k];
        }
        System.out.println(Arrays.toString(merge));

    }
}
