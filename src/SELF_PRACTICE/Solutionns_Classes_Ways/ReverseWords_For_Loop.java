package SELF_PRACTICE.Solutionns_Classes_Ways;

public class ReverseWords_For_Loop {
    public static void main(String[] args) {

        String str="Aghayeva";
        //          0123

        //String rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        //System.out.println(rev);

        String rev2="";
        for(int i=str.length()-1; i>=0; i--){ // with .length() we can reverse any word or sentence.
            rev2+=str.charAt(i);
            //System.out.print(""+str.charAt(i)+" ");
        }
        System.out.println(rev2);



    }

}
