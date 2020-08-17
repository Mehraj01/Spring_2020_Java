package day54_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    // pub(key, valu)

    public static void main(String[] args) {
        // Map cannot be primitive
        // map size is dynamic. Means we add or remove the object. We use key to remove. remove(key)
        // map key must be unique. It dosent accept duplicates. But We can have duplicate of value
        // if key is duplicated then we will get the last key value on the screen
        // map dosent have index numbers
        // map ==> key and value. ==> employeeInfo.get("Zarina") -> we will get 120000.0 because it is the value of Zarina
        // in map every single value must have key
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put( "Zarina", 120000.0 );// with put method we cant do auto or unboxing
        employeeInfo.put("Bakhodir", 110000.50);

        System.out.println(employeeInfo);
        System.out.println( employeeInfo.size() );

        System.out.println( employeeInfo.get("Zarina") );
        System.out.println( employeeInfo.get("Bakhodir") );

        employeeInfo.remove("Bakhodir");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Zarina", 130000.0);// duplicate key and this will be print to the screen

        System.out.println(employeeInfo);


        System.out.println("====================================");

        String s="Seda, Ismail, Leyla, Seba";
        String arr[]=s.split(" ");
        Map<String, String>hello=new HashMap<>();
        for(String each: arr){
            hello.put(each,"");
        }
        System.out.println(hello);

















    }

}
