package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MoveAllZeros_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        ArrayList<Integer>nums=new ArrayList<>();


        for(int i=0;i<list.size()-1; i++){
            if(list.get(i)!=0){
            nums.add(list.get(i));// count non-zero elements
            }

        }
       // System.out.println(nums);

        // Count Zero elements
        for(int k=0; k<list.size()-1;k++){
            if(list.get(k)==0){
                nums.add(list.get(k));
            }
        }
        System.out.println(nums);


        /*
               ArrayList<Integer> list=new ArrayList<>((Arrays.asList(0,0,2,0,3,0,4,0)));

        for (int i=0;i<list.size();i++){
            if(list.get(i).equals(0)){
                list.remove(list.get(i));
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
         */


    }
}
