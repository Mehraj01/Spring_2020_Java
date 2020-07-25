package InterviewCoding_Tasks_Solutions.Numbers;

public class odd_even {

    public static void main(String[] args) {

        String num=oddEven(3);
        System.out.println(num);

    }

    //Write  a method which can identifies given number is even or odd
    public static String oddEven(int n){
    // Returning String as an "Even" or "Odd"
        return n%2==0?"Even":"Odd";
    }


}


