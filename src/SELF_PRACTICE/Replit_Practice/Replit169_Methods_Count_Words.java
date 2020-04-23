package SELF_PRACTICE.Replit_Practice;

public class Replit169_Methods_Count_Words {
    public static void main(String[] args) {

        int a= wordCount("You got this");
        System.out.println(a);

    }

    public static int wordCount(String words) {

        String[] word=words.split(" ");
        // System.out.println(Arrays.toString(word));
        String result="";

        int count=0;
        for(int i=0; i< word.length; i++){
            result+=word[i];
            count++;
        }
        return count;


    }
}
