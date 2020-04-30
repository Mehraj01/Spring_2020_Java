package WarmupTasks;
import java.util.ArrayList;
public class ArrayList_Integer_in_Reverse {
    public static void main(String[] args) {
        /*
        	2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
         */

        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        ArrayList<Integer>Length=new ArrayList<>(nums.size());

         int reverse=0;
        for(int i=nums.size()-1;i>=0;i--){
           reverse=nums.get(i);
            System.out.print(reverse+" ");
        }

    }
}
