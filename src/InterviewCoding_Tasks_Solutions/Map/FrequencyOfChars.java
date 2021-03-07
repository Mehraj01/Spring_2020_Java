package InterviewCoding_Tasks_Solutions.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {

        FrequencyTest("AAABBCCD");
    }



    public static void FrequencyTest(String  str ) {

        Map<Character,Integer> map=new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){// - containsKey(key): checks if the key is contained in the map. boolean
                map.put(str.charAt(i), map.get(str.charAt(i))+1); // - get(key): returns the value of the given key

            }else{
                map.put(str.charAt(i),1);// - put(key, value): inserts key and value to map
            }
        }

        System.out.println(map);


    }

}
