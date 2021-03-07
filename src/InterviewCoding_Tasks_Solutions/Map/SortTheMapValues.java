package InterviewCoding_Tasks_Solutions.Map;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortTheMapValues {

    public static void main(String[] args) {

        Map<String, Integer>map=new LinkedHashMap<>();
        map.put("num", 23);
        map.put("num2", 1);
        map.put("num3", 50);
        map.put("num4", 34);
        System.out.println( sortByValue(map));

    }

    // Write a method that can sort the Map by values
    public static Map<String,Integer>sortByValue(Map<String, Integer>map){

        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());


        map=new LinkedHashMap<>();

        for (Map.Entry<String, Integer>each: list){
            map.put(each.getKey(),each.getValue());
        }

        return map;
    }
}
