package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Move_Zeros {
    public static void main(String[] args) {
        /*
        Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare  any extra lists
         */

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int count=0;
        for(Integer each:list){
            if(each==0){// finding frequency (counts) of zeros
                count++;
            }
        }
        System.out.println(count);

        list.removeAll(Arrays.asList(0));// We removed all the zeros from the list
        System.out.println(list);


        for(int i=0;i<count;i++){// Here we added zeros to the list length of count
            list.add(0);
           //list.add(0,0);// when you wanna move zeros to the begining of the list
        }                    //replace zeros with start from 1st indexes
        System.out.println(list);


        System.out.println("==============================================================");

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(nums);


        int count2=Collections.frequency(nums,0);//This collection method will find frequency of the number given in list
        System.out.println(count2);

        nums.removeAll(Arrays.asList(0));//removes zeros from the list
        System.out.println(nums);

        for(int i=0; i<count;i++){//add zeros as size of count==> means number sof zeros we had in the list
            nums.add(0);
        }
        System.out.println(nums);

    }
}
