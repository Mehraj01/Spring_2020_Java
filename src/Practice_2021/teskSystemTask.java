package Practice_2021;

public class teskSystemTask {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }



    }
}