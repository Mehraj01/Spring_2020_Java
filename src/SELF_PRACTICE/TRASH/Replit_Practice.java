package SELF_PRACTICE.TRASH;


public class Replit_Practice {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {
        String unique = "";

        for(int j=0; j <str.length(); j++ ){
            char ch1 = str.charAt(j);
            int count = 0 ;

            for(int i = 0; i <str.length(); i++){
                char ch2 = str.charAt(i);
                if(ch2 == ch1){
                    count++;
                }
            }

            if(count == 1){
                unique+=ch1;
            }

        }
        return unique;


    }
}

































