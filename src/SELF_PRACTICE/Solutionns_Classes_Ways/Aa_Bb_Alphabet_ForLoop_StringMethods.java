package SELF_PRACTICE.Solutionns_Classes_Ways;

public class Aa_Bb_Alphabet_ForLoop_StringMethods {

    public static void main(String[] args) {

        String upperCase="";//A~Z
        String lowerCase="";//a~z

        for(char ch='A'; ch<='Z'; ch++){
            upperCase+=ch;
        }
        System.out.println(upperCase);

        for(char ch='a'; ch<='z'; ch++){
            lowerCase+=ch;
        }
        System.out.println(lowerCase);

        //Aa Bb Cc Dd....

        String result="";

        for(int i=0; i<=upperCase.length()-1; i++ ){// dosent matter we can choose uppercase or lowercase length
                                                     // because they have the same length...
            result+=upperCase.charAt(i)+""+lowerCase.charAt(i)+" ";
        }
        System.out.println(result);

        System.out.println("=============================================================");


        //second solution
        int a=97;//in ascii table char lowercase starts with 97
        int A=65;//in ascii table char Uppercase starts with 65

        String result2="";
        for(int i=0; i<26; i++){
            char ch1=(char)(A+i); // uppercase characters
            //              65
            char ch2=(char)(a+i);
            //               97+0
            result2+=ch1+""+ch2+" ";

        }
        System.out.println(result2);



    }
}
