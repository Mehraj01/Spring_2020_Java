package day54_Map;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Maps_Practice1 {

    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate>  classMates = new LinkedHashMap<>();  //"Muhtar"
        classMates.put("Taha" , LocalDate.of(1998, 07, 16) );
        classMates.put("Anil", LocalDate.of(1453,01,01));
        classMates.put("Saban", LocalDate.of(1900, 01, 30));
        classMates.put("Anna", LocalDate.of(1990,2,28));
        classMates.put("Namik", LocalDate.of(1453,01,01));
        classMates.put("Yucel", LocalDate.of(2005, 12, 28));

        classMates.put("Namik", LocalDate.of(1990, 4, 5));
        classMates.put("Anil", LocalDate.now());

        System.out.println(classMates);

        classMates.remove("Anil");
        System.out.println(classMates);

        System.out.println( classMates.get("Namik") );

        boolean r1 = classMates.containsKey("Anna");
        System.out.println(r1);

        boolean r2 =  classMates.containsValue( LocalDate.of(1990,4,5) );
        System.out.println(r2);


        classMates.clear();
        System.out.println(classMates);

        System.out.println("=======================================");

        /*
        create a map that conatins student names and Score
										String    Integer
									put 5 students names and thier scores
			write a program that can print out the names of the students who scored less than 90


         */
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();


        for( String eachKey   : students.keySet()  ){// keySet(): returns all the keys from the map as Set
            int eachValue = students.get(eachKey);//  get(key); method returns the value of the given key
            //System.out.println(eachValue);

            if( eachValue < 90){
                badStudents.put(eachKey, eachValue );
            }else{
                goodStudents.put(eachKey, eachValue );
            }
        }


        System.out.println(badStudents);
        System.out.println(goodStudents);






    }
}
