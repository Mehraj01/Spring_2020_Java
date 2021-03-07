package PracticeTasks;

import java.util.*;

public class wertrtertert {
    public static void main(String[] args) {

        //System.out.println("Hi"+"\n" +"Wordl");



        List<String> text=new ArrayList<>(Arrays.asList("code", "doce", "ecod", "framer","frame"));


        List<String>list=new ArrayList<>();

        for (int i = 0; i < text.size(); i++) {
            String [] arr=text.get(i).split("");
            Arrays.sort(arr);
            for (String each:text) {
                if (!each.equals(arr[i])){
                    list.add(each);
                }
            }



        }

        System.out.println(list);



    }
}
