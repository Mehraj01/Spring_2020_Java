package Practice_2021;

public class teskSystemTask2 {
    public static void main(String[] args) {

     String a="7777555511111111";
      String b="3332222221111";


        System.out.println(addStrings(b,a));



    }



    public static String addStrings(String string1, String string2) {
        // Write your code here

        double sum=0;
        for (int i = 0; i < 1; i++) {
            sum+=Double.valueOf(string1)+Double.valueOf(string2);
        }
        String result=String.valueOf(sum);

        return result;

    }


}
