package InterviewCoding_Tasks_Solutions.Numbers;

import day17_WhileLoops.Findra;

public class FINDRA {


    public static void main(String[] args) {

        FINDRA();
        FINRA2();
    }


    //Write a method which prints out the numbers from 1 to 30
    // but for numbers which are a multiple of 3, print "FIN" instead of the number
    // and for numbers which are a multiple of 5, print "RA" instead of the number.
    // for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    public static void FINDRA(){

        String result = "";

        for(int i=1; i <= 30; i++) {
            if(i % 5==0 && i %3 ==0)
                result += "FINRA "+"\n";
            else if(i%5 == 0)
                result += "RA "+"\n";
            else if(i%3==0)
                result+="FIN "+"\n";
            else
                result += i+" "+"\n";
        }
        System.out.println(result);



    }
    public static void FINRA2() {
        // with Ternary
        String result = "";
        for(int i=1; i <= 30; i++) {
            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA " :(i%3 == 0) ? "FIN " : i+" ";
        }

        System.out.println(result);

    }









}
