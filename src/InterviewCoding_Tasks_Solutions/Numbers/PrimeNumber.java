package InterviewCoding_Tasks_Solutions.Numbers;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeNumber(4));

    }
    public static boolean primeNumber(int num) {

        //Write a method that can check if a number is prime or not
//A prime number can be divided, without a remainder, only by itself and by 1.
// For example, 17 can be divided only by 17 and by 1.

        // Muhtars solution
        boolean result = false;
        if(num <= 1) {
            return result;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0 ) {
                return true;
            }
        }
        return result;


    }

}
