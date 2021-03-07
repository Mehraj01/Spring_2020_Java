package InterviewCoding_Tasks_Solutions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Move_Zeros {
    public static void main(String[] args) {

        int arr[]={1,0,4,0,5,0,7,0};

        System.out.println(Arrays.toString( moveZeros(arr)));

    }
//System.out.println("===============================================================================================");

    public static int[]moveZeros(int []arr){

        ArrayList<Integer>list=new ArrayList<>();

        int count=0;
        for(int each: arr){
            list.add(each);
            count= Collections.frequency(list,0);

//            if(each==0){
//                count++;
//            }
        }

        list.removeAll(Arrays.asList(0)); // result: ==> [1, 4, 5, 7]
        arr=new int[arr.length]; // result: ==> [0, 0, 0, 0, 0, 0, 0, 0]


        for(int i=0; i<arr.length-count; i++){ // arr.length-count ==> it will only affect loop run size. It will run 4 times
          // System.out.println(Arrays.toString(arr));
            arr[i]=list.get(i); // it will add all numbers that is in the array
        }
        return arr;
    }
//System.out.println("===============================================================================================");

    public static Integer[]moveZeros2(Integer []num){

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(num));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==0) {
                list.remove(i);
                list.add(0);
            }
        }
        num=new  Integer[num.length];
        for (int i = 0; i <num.length ; i++) {
            num[i]=list.get(i);
        }
        //System.out.println(list);

        return num;
    }
}


