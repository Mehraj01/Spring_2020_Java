package InterviewCoding_Tasks_Solutions.Numbers;

public class Swap_Numbers {
    public static void main(String[] args) {

       // Swap two variable' values without using a third variable

        int  a = 10;
        int  b  = 20;

        a = a +b; // 10= 10+20=30 // a=30
        b = a - b;// 20= 30-20=10   // b=10
        a = a - b;// 30= 30-10=20 // a=20


        System.out.println("a = "+a+" b = "+ b);


        System.out.println("===============================");
        // Solution 2:
        int  a2 = 10;      int  b2  = 20;
        a2 = a2^b2;
        b2 = a2^b2;
        a2 = a2^b2;





    }
}
