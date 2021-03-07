package PracticeTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice_2021 {

    public static void main(String[] args) {

        String names="Seda, Ismail, Leyla, Seba";
        String newName[]=names.split(" ");
        Map<String, String>list=new LinkedHashMap<>();

        for (int i = 0; i <newName.length ; i++) {
            list.put(newName[i],i+" Ab ");
        }
        System.out.println(list);


        String input="Seda";

        for (Map.Entry<String, String>each:list.entrySet()) {
            String name=each.getKey();
            String index=each.getValue();
            if(input.equalsIgnoreCase(name)){
                System.out.println(index);
            }

        }


        int []arr={1,3,5,7,1,9,10};

        Map<Integer, Integer>map=new LinkedHashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            map.put(i, arr[i]);

        }
        System.out.println(map);



        int max_count = 0, res = -1;
        for(Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }




    }
}
//====================================================
class practiceMapppp{
    static int mostFrequent(int arr[], int n) {

        // Insert all elements in hash
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++) {
            int key = arr[i];
            if(hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }

    // Driver code
    public static void main (String[] args) {

        int arr[] = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;


        System.out.println(mostFrequent(arr, n));
    }
}

