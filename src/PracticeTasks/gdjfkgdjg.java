package PracticeTasks;

import java.util.*;

public class gdjfkgdjg {
    public static void main(String[] args) {





       // List<String> list1 = Arrays.asList("1", "1","1","1","1","1","5","5","12","12");
        List<Integer> list1 = Arrays.asList(1,1,1,1,14,4,5,6,3,4);
        int max = 0;
        int count = 0;
        Integer currKey =  null;

        Set<Integer> unique = new HashSet<Integer>(list1);
        for (Integer key : unique) {
            count = Collections.frequency(list1, key);
            if(max < count){
                max = count;
                currKey = key;
            }
        }

        //System.out.println("The number "  + currKey + " happens " + max + " times");
        System.out.println(currKey);
        System.out.println(max);


/*

        int max = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num == max) {
                count++;
            } else if (num > max) {
                max = num;
                count = 1;
            }
        }
        
 */

    }
}
