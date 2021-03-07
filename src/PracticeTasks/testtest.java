package PracticeTasks;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class testtest {
    public static void main(String[] args) {



        Integer arr[]={1,2,3,1,5,6,8};

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(arr));



        Collections.sort(list);
        System.out.println(list);



    }
}