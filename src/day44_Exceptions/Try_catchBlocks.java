package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Try_catchBlocks {
    public static void main(String[] args) {
        System.out.println("test started");

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));


        //System.out.println("test completed");

        try{
            System.out.println(list.get(10)); // index out of bound
        }catch(Exception e){ // grandfather:  Exception ==> parent:  Runtime ==>
            System.out.println("Something went wrong");

        }
        System.out.println("test completed");


    }
}
