package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        /*
          4.	write a program that can find the unique elements from an ArrayList of integers and stores
          into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */
        ArrayList<Integer> list =  new ArrayList<>(); // {1,2,1,3,4}
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques =  new ArrayList<>();


        for(int i =0; i < list.size(); i++){

            int count = 0;
            for(Integer each  : list ){
                if(each == list.get(i) ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1){
                uniques.add(list.get(i)); // 0 1 2
            }


        }


        /*
        for(Integer each2 : list){
            int count = 0;
            for(Integer each  : list ){
                if(each == each2 ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1){
                uniques.add(each2); // 0 1 2
            }
        }
         */

        System.out.println(list);
        System.out.println(uniques);



        // list.get(0) ==> 1











        /*


        //Reems notes
        // This loop will repeat as many times as the size of ArrayList. It will repeat the below steps for each element in the ArrayList
      for (int i =0 ; i < list.size(); i ++) {
    int count = 0;
    // if using for each loop: my collection of data is list, and each element is an Integer
    // This loop will check how many times each element is repeated in the ArrayList
    for (Integer each : list) {
        // how can I create the condition to compare each with every element? by if statement:
        if (each == list.get(i)) {
            count++;
        }
    }
    if (count == 1) {
        uniques.add(list.get(i));
    }
}
         */

    }
}
