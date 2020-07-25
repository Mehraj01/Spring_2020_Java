package InterviewCoding_Tasks_Solutions.ArrayList;

import java.util.Arrays;
import java.util.List;

public class descendingOrder {

    public static void main(String[] args) {


        List<Integer> list1=SortingArrayListAsc((Arrays.asList(14,17,1,70,8,6,101,200,300)));
        System.out.println(list1);


    }


    public static List<Integer> SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);//14 //17 //70 //101 //200   --//14
                    list.set(i, list.get(j));//17  //70 // 101 //200 //300 --
                    list.set(j, temp);//14 // 17 //70 //101 //200   --
                }

            }
        }


        return list;
    }
}
