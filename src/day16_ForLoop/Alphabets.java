package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {
        String upperCase = ""; //A~Z
        String lowerCase = ""; // a~z

        for(char ch = 'A'; ch <= 'Z'; ch++){
            upperCase += ch;
        }

        System.out.println(upperCase);

        for(char ch = 'a'; ch <= 'z'; ch++){
            lowerCase += ch;
        }

        System.out.println(lowerCase);

        // Aa Bb Cc Dd ....
        String result = "";

        for(int i=0; i <= upperCase.length()-1; i++ ){

            result +=   upperCase.charAt(i)+"" + lowerCase.charAt(i)+" " ;

        }

        System.out.println(result);

        System.out.println('a' + ""+ 'b');






    }
}
