package InterviewCoding_Tasks_Solutions.ArrayList;

import java.util.*;

public class RemoveAhmed {
    public static void main(String[] args) {

        //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //Write a java operation to remove all the names named Ahmed

        // Solution 1:
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeAll( Arrays.asList("Ahmed"));
        System.out.println(names);



        // Solution 2:
        for(ListIterator<String> it = names.listIterator(); it.hasNext();)
            if(it.next().equals("Ahmed"))
                it.remove();
        System.out.println(names);


        // Solution 3:
         List<String> names2 = new ArrayList<>();
         names.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );
         System.out.println(names);


         // Solution 4:
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names );


    }


}
