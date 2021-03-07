package InterviewCoding_Tasks_Solutions.Numbers;

public class ReverseNegativeNumber {

    public static void main(String[] args) {


        int num=reverseNum(-1984);
        System.out.println(num);
    }



    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) { // if num smaller than zero
            str = "-"+str.substring(0, str.length()-1);
        }


        return Integer.valueOf(str);// converting string back to int

    }

}
