package day12_JavaRecap;

public class QuizReview {

    public static void main(String[] args) {
        boolean result = true;
        int N = 100;

        if(result){
            N /= 10;   // N = 10
            result = !result;  // result = false

        }

        if(result){
            N *= 2;
        }else{
            N -= 5;  // N = 5
        }


        System.out.println( true ==  true!=false );
        //  true == true  ==> true


    }
}
