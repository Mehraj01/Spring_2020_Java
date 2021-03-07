package InterviewCoding_Tasks_Solutions.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinValue {

    public static void main(String[] args) {
        Map<String, Integer>map=new LinkedHashMap<>();
        map.put("num", 23);
        map.put("num2", 1);
        map.put("num3", 50);
        map.put("num4", 34);
        System.out.println( minValue(map));

    }


    public static int minValue(Map<String,Integer> map){

        SortedSet<Integer>min=new TreeSet<>(map.values());
        return min.first();
    }
}
