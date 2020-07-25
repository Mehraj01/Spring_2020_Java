package MyOwnLibrary;

public class WrapperClass {

    /*

        Task 1: find max and min numbers of the String

        Given:
	    String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	    find the maximum and minimum numbers
		NOTE: Do not use sort method

("===================================================================================================================");

       Task 2: String to primitive

       Convert String Array To Primitive double

("===================================================================================================================");

       Task 3 String To Array Sum Of Digit

     1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits


("===================================================================================================================");
     */








}

//System.out.println("===============================================================================================");

class ConvertString_WrapperClass_MaxMin{
    public static void main(String[] args) {


        // Task 1: find max and min numbers of the String

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max=Double.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            double number=Double.valueOf(arr[i]); // - Converting String to wrapper class  ==> X.valueOf(str);
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);


    }
}
//System.out.println("===============================================================================================");

class ConvertString_toPrimitive{
    public static void main(String[] args) {

        //Task 2: String to primitive

        String[] arr2 = {"100", "1","2.5", "3", "3.5", "4.5", "55"};
        double[] nums = new double[arr2.length]; //[0.0 , 0.0, 0.0, 0.0, 0.0]

        for(int i=0; i<arr2.length; i++){
            nums[i]=Double.parseDouble(arr2[i]);
        }

        java.util.Arrays.sort(nums);
        System.out.println(java.util.Arrays.toString(nums) );
        System.out.println( nums[nums.length-1] );


    }
}

class StringToArray_SumOfDigit{
    public static void main(String[] args) {

        //Task 3 String To Array Sum Of Digit

        String str="a1b2c3d4";
        char [] Array=str.toCharArray();

        int sum=0;
        for(int i=0; i<Array.length; i++){
            if(Array[i]>=48 && Array[i]<=57){ //on ascii table, the characters between #48 ~ #57 are digits
                sum+=Integer.parseInt(""+Array[i]);                // Ascii table:  48 => 0, 57 => 9
            }
        }
        System.out.println(sum);


        System.out.println("========================================================");

        Character.isAlphabetic('A');// note: identifies if the character is alphabetic
        // second way to to it

        int sum2=0;
        for(int i=0; i<Array.length; i++){
            if(Character.isDigit(Array[i])){ // identifies if the given character is digit
                sum2+=Integer.parseInt(""+Array[i]);
            }
        }
        System.out.println(sum2);

    }
}
//System.out.println("===============================================================================================");

class extractDigit_andLetters_fromString_Copy{
    public static void main(String[] args) {


        //Task 4
        // assignment task:
        //            extract the digits and letters form a string

        String str="a1b2c3d4";
        char [] Array=str.toCharArray();

        // extracting digits
        String digits="";
        for(int i=0; i<Array.length; i++){
            if(Character.isDigit(Array[i])){
                digits+=Array[i];
            }
        }
        System.out.println(digits);// will print digit as a String "1234"

        char []digitsArray=digits.toCharArray();//Converting digits String to Array
        System.out.println(java.util.Arrays.toString(digitsArray)); // will print digits as an char Array


        // extracting letters
        String letters="";
        for(int i=0; i<Array.length; i++){
            if(Character.isLetter(Array[i])){
                letters+=Array[i];
            }
        }
        System.out.println(letters);//will print letters as a String "abcd"

        char []lettersArray=letters.toCharArray();// Converting letters String to Array
        System.out.println(java.util.Arrays.toString(lettersArray)); // will print letters as an char Array


        System.out.println("========================================================");

        //Combined digit and letter Arrays
        // After separating digits and letters Will placed  digits and letters order ==> [1, 2, 3, 4, a, b, c, d]
        char[]digitsLetters=new char[digitsArray.length+lettersArray.length];
        for(int i=0; i<digitsArray.length; i++){
            digitsLetters[i]+=digitsArray[i];
        }
        System.out.println(java.util.Arrays.toString(digitsLetters));
        for(int i=0; i<lettersArray.length; i++){
            digitsLetters[digitsArray.length+i]+=lettersArray[i];
        }
        System.out.println(java.util.Arrays.toString(digitsLetters));

    }
}