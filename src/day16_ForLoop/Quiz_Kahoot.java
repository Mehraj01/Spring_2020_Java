package day16_ForLoop;

public class Quiz_Kahoot {
    public static void main(String[] args) {

        int i =0;

        for( i = 5; i < 10; ){ //i =11
            i += 2;
        }


        System.out.println(i);

        String str = " ";

        System.out.println(str.trim().isEmpty());// true
        //   ""

        System.out.println(str.isEmpty()); // false

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true



    }
}
