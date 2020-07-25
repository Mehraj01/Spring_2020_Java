package day52_Collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/*

null: default value of all reference-type (all non-primitives).
		- does not refer to any objects
		- it's not instance of anything

		WebElement element;  ==> null
		String str;  ===> null
 */

public class Null_Keyword {


    static String str =new String("Cybertek");
    // == null
    //static ArrayList<Integer> list1 ;

    public static void main(String[] args) {

        System.out.println( str.charAt(0) );
        //   System.out.println(list1.get(1));

        // WebElement element = null;
        String str2 = null;
        Integer i1 = null;
        //  int num = null;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null);

        System.out.println(list1);
        System.out.println("==============================");

        String number = "123";
        int num1 = Integer.parseInt(number);
        System.out.println(num1);

        System.out.println("===============================");

        String[] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        name1 = null;
        // name1 =  name1.toLowerCase();

        System.out.println(name1);
        System.out.println("===============================");


        // AZE Interview codes

        String[] myArray = {"JavaFX", null, "OpenCV", null, "Hadoop", null};
        Arrays.sort(myArray, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Arrays.toString(myArray)); // result ==> [Hadoop, JavaFX, OpenCV, null, null, null]


        ArrayList<String>list=new ArrayList<>(Arrays.asList(myArray));

        Collections.sort(list,Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list);//result ==>[null, null, null, Hadoop, JavaFX, OpenCV]


        //Comparator.naturalOrder()
       // nullFirst()
        // nullLast()


    }
}
