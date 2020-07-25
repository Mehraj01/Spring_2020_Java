package day34_CutomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {

    int i = 1000; // instance variable

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = list1;

        list1.remove(2);
        System.out.println(list1);  // 10, 20, 40

        System.out.println(list2);

        System.out.println("===================================================");

        String str1 = new String("cybertek");
        String str2 = str1;

        str1 = str1.toUpperCase(); //"Cybertek"

        System.out.println(str1);
        System.out.println(str2);

        int a = 300;


    }
}
