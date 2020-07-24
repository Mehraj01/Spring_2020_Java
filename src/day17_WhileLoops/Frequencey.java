package day17_WhileLoops;

public class Frequencey {
    public static void main(String[] args) {

        String str = "JavaJavaJavaJava".toLowerCase();  //  is fun is cool

        int count = 0 ;

        String word = "java";//.toLowerCase();  // ignoring the case sensitiveity by converting both string to lowercase

        while(str.contains(word)){

            count++;
            str = str.replaceFirst(word, ""); // after counting the first "Java",w e need to rmeove it from the str

        }


        System.out.println(count);


    }
}
