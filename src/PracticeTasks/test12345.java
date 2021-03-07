package PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test12345 {

    public static void main(String[] args) {


        Integer []arr={1,3,5,7,1,9,10};
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        int count=0;
        for (int i = 0; i <list.size() ; i++) {
           count=Collections.frequency(list,list.get(i));
            System.out.println(count);
        }

        int count2=0;
        for (int i = 0; i <list.size() ; i++) {
            count2=Collections.frequency(list,list.get(i));
            System.out.println(count2);
        }

    }
}
