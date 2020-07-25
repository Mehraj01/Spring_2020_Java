package day54_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {


    public static void main(String[] args) {
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);

        System.out.println("======================================");

        for( String  eachKey   :  fb.keySet() ){ // keySet(): returns all the keys from the map as Set
            //  System.out.println(eachKey +"  " +fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("=======================================");

        for(String eachValue : fb.values()){//values(): returns all the values from the map as Collection
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);

        System.out.println("=======================================");


    }
}
