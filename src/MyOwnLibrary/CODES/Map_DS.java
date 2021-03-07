package MyOwnLibrary.CODES;

import java.time.LocalDate;
import java.util.*;

public class Map_DS {
    public static void main(String[] args) {

        /**
         * - Map cannot be primitive
         * - Map dose not have index numbers
         * - Map size is dynamic. Means we add or remove the object. We use key to remove. remove(key)
         * - Map key must be unique. If KEY is duplicated then we will get the last key value on the screen
         * - Value can be a duplicate. Every single value must have key
         *
         * - keySet(): returns all the keys from the map as Set
         * - get(key); method returns the value of the given key
         */

        Map<String,Double> employeeInfo=new LinkedHashMap<>();
        employeeInfo.put("Sada", 120000.0);
        employeeInfo.put("Sevda", 130000.0);
        employeeInfo.put("Seba", 101000.0);
        employeeInfo.put("HelloWorld",100000.0);


        System.out.println(employeeInfo); // - {Sada=120000.0, Sevda=130000.0}
        System.out.println(employeeInfo.size()); // - 2
        System.out.println(employeeInfo.keySet()); // - [Sada, Sevda]
        System.out.println(employeeInfo.values()); // - [120000.0, 130000.0]
        System.out.println(employeeInfo.get("Sevda")); // - 130000.0
        System.out.println(employeeInfo.remove("HelloWorld")); // - 100000.0
        System.out.println(employeeInfo); // - {Sada=120000.0, Sevda=130000.0, Seba=101000.0}
        System.out.println(employeeInfo.containsKey("Sada"));// - true
        employeeInfo.clear();
        System.out.println(employeeInfo);

        System.out.println("=========================================================================================");

        /**
         * create a map that contains student names and Score. String, Integer
         * Put 5 students names and their scores
         * Write a program that can print out the names of the students who scored less than 90
         */
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer>badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();
        

        for (String eachKey: students.keySet()) {
            int eachValue=students.get(eachKey);
            if(eachValue<90){
                badStudents.put(eachKey, eachValue);
            }else {
                goodStudents.put(eachKey,eachValue);
            }
        }
        System.out.println(badStudents);
        System.out.println(goodStudents);


        System.out.println("=========================================================================================");



        LinkedHashMap<String, LocalDate>  classMates = new LinkedHashMap<>();
        classMates.put("Taha" , LocalDate.of(1998, 07, 16) );
        classMates.put("Anil", LocalDate.of(1453,01,01));
        classMates.put("Saban", LocalDate.of(1900, 01, 30));
        classMates.put("Anil", LocalDate.now());

        System.out.println(classMates);


    }

}
class StringToMap{
    public static void main(String[] args) {

        String names="Seda, Ismail, Leyla, Seba";
        String []arr=names.split(" ");
        Map<String, Integer>map=new TreeMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i);
        }
        System.out.println(map);

    }
}

class EntrySet{
    public static void main(String[] args) {


        Map<String,Double> employeeInfo=new LinkedHashMap<>();
        employeeInfo.put("Sada", 120000.0);
        employeeInfo.put("Sevda", 130000.0);
        employeeInfo.put("Seba", 101000.0);
        //employeeInfo.put("HelloWorld",100000.0);

        String input="Sevda";
        for (Map.Entry<String,Double> each: employeeInfo.entrySet()){
            String name=each.getKey();
            Double salary=each.getValue();
            if (input.equalsIgnoreCase(name)){
                System.out.println(salary);
            }

        }






    }
}