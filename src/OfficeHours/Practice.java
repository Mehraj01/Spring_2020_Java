package OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

       ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(10, 50, 2, 4, 50, 10, 3, 2,5, 4));
       // Collections.sort(list);
     //   System.out.println(list.set(0, 2));
        //System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);// 10
                    list.set(i, list.get(j));// 10 <-50
                    list.set(j, temp);//
                }
            }
        }

        System.out.println(list);



    }
}
