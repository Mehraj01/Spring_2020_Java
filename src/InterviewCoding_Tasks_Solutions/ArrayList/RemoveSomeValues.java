package InterviewCoding_Tasks_Solutions.ArrayList;

import java.util.*;

public class RemoveSomeValues {
    public static void main(String[] args) {

        //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.


        //Solution 1:
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int  each : list1){
            if( each < 100)
                list2.add(each);
            }
        list1=list2;
        System.out.println(list1);


       // Solution 2:
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            if(it.next()>100)
                it.remove();
        System.out.println(list);



        //Solution 3:

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        for(ListIterator<Integer> il = list5.listIterator(); il.hasNext();)
            if(il.next()>100)
                il.remove();
        System.out.println(list5);



       // Solution 4:

        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        list6.removeIf(p -> p>100);


        //delete this later
        /*
        for(int i=0; i<list6.size(); i++){
            if(list6.get(i)>100){
                list6.remove(list6.get(i));
            }
        }

        System.out.println(list6);

        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 200]

         */






    }


}
