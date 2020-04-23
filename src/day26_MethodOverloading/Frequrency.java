package day26_MethodOverloading;

public class Frequrency {
 /*
     1. write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
     */

    public static void main(String[] args) {
        String str = "ABBAAAAAAAAAAAAAAAA";
        char ch = 'A';

        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }


        System.out.println(count);

        String str2 = "ABCDEFGABABABABA";
        char ch2 = 'B';
        int num2 = frequency(str2, ch2);
        System.out.println(num2);


    }

    public static int frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }

        return count;
    }





}
