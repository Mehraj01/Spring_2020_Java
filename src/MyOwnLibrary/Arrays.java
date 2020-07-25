package MyOwnLibrary; /* TASKS...
("===================================================================================================================");
         TASK 1. Print @gmail

        print out all the users who registered with their @gmail
("===================================================================================================================");
       TASK 2. Print the names

      Print the names to the screen in the ArrayList
("===================================================================================================================");
       TASK 3. Descending with Numbers

         Arrays Descending order with Sorting method
("===================================================================================================================");
       //TASK 4. Combine 2 Arrays
("===================================================================================================================");
        // TASK 5. Days of the week
        with Scanner
("===================================================================================================================");
        TASK 6. MAx and Min number

          1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
          2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
("===================================================================================================================");
           TASK 7. Months of the Year
         with Scanner
("===================================================================================================================");
         TASK 8. Average Numbers

         write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
("===================================================================================================================");
           TASK 9. Count Odd and Even Numbers

             write a program that can count the even and odd number from an array of integers
          						MUST use for each loop and continue statement

("===================================================================================================================");

        TASK 10. Longest, Shortest Word

  	2. write a program that can return the longest string of text from an array
	3. write a program that can return the shortest string of text from an array
("===================================================================================================================");

        TASK 11. Reverse String Array

        CharArray(), Split methods
("===================================================================================================================");
            TASK 12. Even Numbers

        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                Must use continue statement

("===================================================================================================================");
              TASK 13. Number of Java And Python

              write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
			(it’s similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)


("===================================================================================================================");

			 Task 14:  String Array ==> Print 3 letters ==> Middle 3, first 3, First and Last

        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
             Array,Scanner, for loop, for each loop, substring
("===================================================================================================================");

          //TASk 15.

           Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop

("===================================================================================================================");

             TASK 16. frequency of single char

      write a return method called frequency that accepts two parameters: string str and char ch,
      the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop

("===================================================================================================================");


        Task 17: find max and min numbers of the String

        Given:
	    String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	    find the maximum and minimum numbers
		NOTE: Do not use sort method

("===================================================================================================================");

       Task 18: String to primitive

       Convert String Array To Primitive double

("===================================================================================================================");

       Task 19: extract the digits and letters


         assignment task:
                   extract the digits and letters form a string


("===================================================================================================================");





     */



import java.text.DecimalFormat;
import java.util.Scanner;
public class Arrays {

}
//System.out.println("===============================================================================================");

class printGmail{
    public static void main(String[] args) {

        // TASK 1. Print Gmail

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
        //  max:  4

        for (int i = 0; i <= 3; i++) {  // u can do emails.length; instead of number 3
            String email = emails[i];//  String email will holds all the array indexes one bye one...
            if (email.endsWith("@gmail.com")) {//if any indexes ends with @gmail.com it will print it to the screen
               System.out.println(email);
            }
           // System.out.println(email);
        }


System.out.println("*************************************************************************************************");


        String[] emails2 = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}; // 10

        for(String EachEmail : emails2) {  // 10
            if(EachEmail.endsWith("@gmail.com")){// it will skip this condition in the next line
                continue;// It will print all emails that not ends with @gmail.com
            }
            System.out.println(EachEmail);

            // Another way not to print gmail
            if (!EachEmail.endsWith("@gmail.com")) {
                //System.out.println(EachEmail);// It will print all emails that not ends with @gmail.com
            }
        }


    }
}
//System.out.println("===============================================================================================");

class PrintNames_{
    public static void main(String[] args) {

         // TASK 2.

        String[] friends = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
        for (int i = 0; i <= 6; i++) {
            String name = friends[i]; // it will assign each name to the string
            System.out.println(name);
        }

    }
}
//System.out.println("===============================================================================================");

class Descending_witShorting{

    public static void main(String[] args) {

       // TASK 3. Descending  Arrays.sort


        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        int[] arrDescending = new int[arr.length];  //[0, 0, 0, 0, 0, 0, 0, 0]
        // index:0, 1, 2, 3, 4, 5, 6, 7
        java.util.Arrays.sort(arr); // [-100, -1, 1, 3, 4, 100, 155, 200]  // sorting all the numbers first
                               // index:  0    1  2  3  4  5     6    7
        // For Loop by decremented
        int k = 0;
        for(int i = arr.length-1; i >= 0; i-- ){
            arrDescending[k] =  arr[i];
            k++;// increment
        }
        System.out.println(  java.util.Arrays.toString(arrDescending)  );



        System.out.println("*******************************************************************");


        int[] Arr = {10, 78, 2, -1, 500, 70};
        java.util.Arrays.sort(Arr); // sorts in ascending
        int[] RevArr = new int[Arr.length];

        //For Loop by incremented
        int j = Arr.length -1;
        for(int i =0; i <= Arr.length-1; i++ ){
            RevArr[i] = Arr[j];
            j--;// decrement
        }

        System.out.println( java.util.Arrays.toString(RevArr));


        System.out.println("*******************************************************************");

        //Reverse Int Array
        int[] num = {1,2,3,4,5,6,10,8,9};
        for(int i=num.length-1; i>=0; i--){
            int dec=num[i];

            System.out.print(dec+" ");
        }
        System.out.println();




    }
}
//System.out.println("===============================================================================================");

class combineArrays{
    public static void main(String[] args) {

        //TASK 4. Combine 2 Arrays

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};

        int[] NewArray = new int[arr1.length + arr2.length]; // can contain all the elements from array1 and array2
        //System.out.println( java.util.Arrays.toString(NewArray));

        for(int i = 0; i <arr1.length; i++ ){
            NewArray[i] =  arr1[i];
        }
       // System.out.println( java.util.Arrays.toString(NewArray));
             //when loop iterate each time a value is changing to the followings
            // a=0 1 2 3
        for(int a= 0; a < arr2.length; a++ ){
            NewArray[arr1.length+a] = arr2[a];  // arr1.length ==> last index of arr1 +1 ==> (123)+1 = arr2[a] 4,5,6, 7
        }          // 012+1=3  // +a] = arr2[a] ==> Every time loop runs index [arr1.length+a]  will assign index of arr2[a]
 // [arr1.length+a] ==> means we wanna start from not last index of arr1 we wanna start from last +1 index of arr1
// arr1.length+a ==> means 1st iteration int a=0+3, 2nd iteration int a=1+3, 3rd iteration int a=2+3, 4th iteration int a=3+3
                                             // 3+0   3+1   3+2  3+3
     //index 2 + index iteration 0
    // index 2 + index iteration 1
    // index 2 + index iteration 2
    // index 2 + index iteration 3



        System.out.println( java.util.Arrays.toString(NewArray)  );


        System.out.println("******************************************************************");

        // Another way to do it

        int[] merge = new int[arr1.length + arr2.length]; //000
        int c=0;
        for(int k = 0;  k<arr1.length; k++ ){
            merge[k] =  arr1[k];
            c++;
        }
        //System.out.println(c);

        for(int s = 0;  s<arr2.length; s++ ){
            merge[c++] =  arr2[s];

        }
        System.out.println(java.util.Arrays.toString(merge));


        for(int b = 0;  b<merge.length; b++ ){
            System.out.print(merge[b]+" ");

        }


    }
}
//System.out.println("===============================================================================================");

class Days_ofTheWeek{
    public static void main(String[] args) {

       // TASK 5. Days of the week

        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};  // size: 7,  max index: 6

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num  =  input.nextInt();  // 18

        int attepmts = 1;
        while(num >7 || num < 1){ // if user adds more than seven or less than one it will be invalid entry
            //Because there are 7 days in a week
            System.out.println("Invalid Entry, please re enter the number");
            // And it will another chance to add correct number of the day
            num = input.nextInt();  // 6
            attepmts++;
            if(attepmts == 3 && (num >7 || num < 1) ){// if user adds more than 3 wrong numbers System will exit the loop
                System.exit(0);
            }
        }
        String result =  days[num-1];// num-1 because index is starts from 0 but days of the week starts from 1
       //Array size: 7,  max index: 6   //index 0== Monday, 1=day of the week Monday
        System.out.println(result);

    }
}
//System.out.println("===============================================================================================");

class Max_Min_Array{
    public static void main(String[] args) {

       // TASK 6. MAx and Min number

        int[] arr ={10, 6, 3, 1, 200, 1000};
                  // 0, 1, 2, 3,  4,    5
        int lastindex = arr.length - 1;
        int max = arr[0]; // arr[0] ==> represent first index of Array which is 0 ==> 10 int this case
        int min = arr[0];// arr[0] ==> represent first index of Array which is 0 ==> 10 int this case


        for(int i = 0; i <= lastindex; i++ ){
            if(arr[i] >= max){// we compare arr each index with max each index. Its starts form index 0 which is ==> 10
              // 10   >= 10 true, 6 >=10 false, 3>=10 false, 1>=10 false, 200>=10 true, 1000>=200 ture
                max = arr[i]; //10 ==> 200 ==> 1000
            }
            if(arr[i] < min){ // array's index are compared with each other, and whichever is smaller will be assigned to the min
            // 10 <= 10 true , 6 < 10 true, 3<6 true, 1<3 true, 200<1 false, 1000<200 false
                min = arr[i]; // 10 ==> 6 ==> 3 ==> 1
            }
        }
        System.out.println(max);
        System.out.println(min);


        System.out.println("==============================================");

        // Find max with sorting
        System.out.println();
        java.util.Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }
}
//System.out.println("===============================================================================================");

class Moths_ofTheYear{
    public static void main(String[] args) {

      //  TASK 7. Months

        String[] months ={"Jan" , "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"}; // size: 12,  : 11
                //          0       1      2      3      4      5      6      7      8      9     10      11

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(); // 18

        int attepmts = 1;
        while(num > 12 || num < 1 ){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();  //12
            attepmts++;
            if(attepmts == 3 &&  (num > 12 || num <= 0) ){
                System.out.println("Invalid Entry, you already have 3 attepmts");
                System.exit(0);
            }
        }
        String result =  months[num-1];  // index number, index number starts from 0 ALWAYS
        //Because of user cant add number 0, it has to start from number 1. In that case we have subtract 1 from num.
        System.out.println(result);
    }
}
//System.out.println("===============================================================================================");

class Average_Numbers{
    /*
    DecimalFormat: ==> used for rounding the decimals ==>  presented in "java.text"
			DecimalFormat  DF = new DecimalFormat("0.00");  // rounds to the second decimal
			DecimalFormat  DF = new DecimalFormat("0.000"); // rounds to the Third decimal
     */
    public static void main(String[] args) {

       //  TASK 8. Average Number

        DecimalFormat DF = new DecimalFormat("0.00");

        double[] arr = {1, 2, 2};  //5, 10  ( sum=1+2+2=5)/(3=length)
        // average: sum of all numbers / length

        int length = arr.length; // total number of the elements // It gives us how many element Array has. 3 for example
        //System.out.println(length);
        double sum = 0;

        for(int i = 0; i < length; i++  ){
            double eachNum =  arr[i];
            sum +=  eachNum;
        }
        System.out.println(sum);// 5.0
        double average = sum/length;// Average Numbers ==> 1.67
        System.out.println(average);//1.6666666666666667
        System.out.println(DF.format( average ) );//1.67

/*
        int[] arr2 = {1,2,2}; // 5/3 =
        System.out.println( 5/3 );//1
        System.out.println( 5/(double)3);//1.6666666666666667
 */

    }
}
//System.out.println("===============================================================================================");

class Count_OddAndEven{

    public static void main(String[] args) {

       // TASK 9. Odd, Even Numbers

        int[]arr={1,2,3,4,5,6,7,8,9,10,11};
        int countOdd=0;
        int countEven=0;

        for(int each:arr){
            /*if(each%2!=0){
                countOdd++;
            }else{
                countEven++;
            }
             */
            if(each%2!=0){
                 countOdd++;
                continue;
            }
            countEven++;
        }

        //System.out.println(countOdd);
        System.out.println(countEven);

    }
}
//System.out.println("===============================================================================================");

class LongestShortest_Word{
    public static void main(String[] args) {

       // TASK 10. Longest and Shortest Word


        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        String longeststring=names[0];
        for (int i=0;i<names.length;i++){
            if (longeststring.length()<names[i].length()){
                longeststring=names[i];
            }
        }
        System.out.println(longeststring);

        System.out.println("================================================");

        int maxLengthString = names[0].length(); // names[0].length() ==> total length of string in each index
        int minLengthString = names[0].length();// We finding total length of string int the array index   ==> "R e e m"

        String logestword = names[0];// We will assign longest word in the Array to this string
        String shortestWord = names[0] ;

        /*
        -- For Loop Finding the Longest And Shortest String
        Reem  > Reem => False, Omer > Reem => False, Muhtar > Reem  => true, Emrah > Muhtar => False,
        Mohammad > Muhtar => True, Ana > Mohammed  => False, AAAAABBBBBBBBCCCCCC > Mohammed => True
         */
        for(int i = 0; i < names.length ; i++  ){
            if(names[i].length() > maxLengthString ){
               // System.out.println(names[i]); // Muhtar, Mohammad, AAAAABBBBBBBBCCCCCC
                maxLengthString = names[i].length();
               // System.out.println(maxLengthString); // 6, 8, 19
              // System.out.println(names[i]); //  Muhtar, Mohammad, AAAAABBBBBBBBCCCCCC
                logestword = names[i]; // It will give as Longest String in the Array
               // System.out.println(names[i]);//AAAAABBBBBBBBCCCCCC
            }
            if(names[i].length() < minLengthString){
                //System.out.println(names[i]);
                minLengthString = names[i].length();
               // System.out.println(minLengthString);
                //System.out.println(names[i]);
                shortestWord = names[i];
            }
        }

       System.out.println(logestword);
       System.out.println(shortestWord);

    }
}
//System.out.println("===============================================================================================");

class ReverseStringArray_toCharArray_Split{
    /*
     String methods related to Array:
  >> toCharArray(): ==> returns char array from the string
  >> Split(Value): ==> splits the string with given value, returns String array
     */
    public static void main(String[] args) {

        // TASK 11. Reverse String Array


        String str = "I like Java"; // Convert String to Array
        String[] arr = str.split(" ");//  " " ==> [I, like, Java]
        System.out.println( java.util.Arrays.toString(arr) ); // It will split String words and convert them to Array

        String sentence = "Hello World";

        String[] words1 = sentence.split("");// It will Split words to the single chars
        char[] ch2 = sentence.toCharArray();// It will split words to the single Chars
        System.out.println( java.util.Arrays.toString(ch2));//  [H, e, l, l, o,  , W, o, r, l, d]  <== like  that
        System.out.println(java.util.Arrays.toString(words1));// [H, e, l, l, o,  , W, o, r, l, d]  <== like  that

        //reverse sentence: Hello World
        String[] words2 = sentence.split(" ");
        String result = "";
        for(int i = words2.length-1;  i >= 0; i-- ){
            String eachWords =  words2[i];
            // System.out.print(eachWords+" ");
            result += eachWords+" ";
        }
        System.out.println(result);


    }
}
//System.out.println("===============================================================================================");

class Even_Numbers{
    public static void main(String[] args) {

       // TASK 12. Even Numbers

        int[] numbers = new int[100]; // index: 0 ~ 99,

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;  // assigning 1~ 100
        }
        System.out.println(java.util.Arrays.toString(numbers)); // 1, 2, 3, 4, 5...


        for (int each : numbers) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.print(each + " ");// 2 4 6 8 10...

        }

    }
}
//System.out.println("===============================================================================================");

class Java_Python_Numbers{
    public static void main(String[] args) {

       // TASK 13. Number of Java And Python

        String sentence = "I like java and javascript python python";
       // System.out.println(sentence);

        sentence =  sentence.toLowerCase();

        int countJava = 0 ;  // 2
        int countPython =0 ;
        String[] words = sentence.split(" ");   //[I, like, java, and, javascript ]  5
        //System.out.println(java.util.Arrays.toString(words));

        for(String each  : words){
            if(each.contains("java")){ // I ==> false, like ==> false, java ==> true, javascript ==> true,
                countJava++;
            }
            if(each.contains("python")){ // python ==> true, python ==> true
                countPython++;
            }
        }
         System.out.println(countJava);
         System.out.println(countPython);
         System.out.println(countJava == countPython);
    }
}
//System.out.println("===============================================================================================");

class String_Array_Print3_Letters{
    public static void main(String[] args) {

       // Task 14: Save String In Array And Print first 3 letters



        Scanner scan=new Scanner(System.in);
        String []arr=new String[3];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter your numbers:");
            arr[i]=scan.nextLine();
        }
        //System.out.println(Arrays.toString(arr));


        // Prints middle 3 letter          // from p ==> till e
        for(String each : arr){   // first index ==> p    last index ==> e
            String str2=each.substring(each.length()/2-1, each.length()/2+2);//middle 3 letter
            /*
         each.substring(each.length()/2-1, each.length()/2+2
         apple.length() / 2 = ple
         apple.length() / 2 - 1 = pple ==>
         apple.length() / 2 + 2 = e ==> ple + 2 = e == p+l+ e ==> this index will ot be include
         */
            System.out.print(str2+" ");
        }
        System.out.println();


        // Print first 3 letter of the word
        for(String each1 : arr){
            String str=each1.substring(0, 2+1);// or (0, 3) ==> Print first 3 letter of the word
            System.out.print(str+" ");
        }
        System.out.println();


        //print first and last letters
        for(String each2 : arr){
           String str1=each2.charAt(0)+""+each2.charAt(each2.length()-1);//print first and last chars
           System.out.print(str1+" ");
        }
        System.out.println();


    }
}
//System.out.println("===============================================================================================");

class UniqueChars{

    public static void main(String[] args) {

         //TASk 15.
         /*
        1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */


        String[]arr={ "A", "B", "A","C"};


        for(int k=0; k<arr.length; k++ ){
            int count1=0;
            for(int i=0; i<arr.length;i++){
                if(arr[i].equals(arr[k])){
                    count1++;
                }
            }
            if(count1==1){
                //System.out.print(count1);
                System.out.print(arr[k]);
            }
        }

        /*
        // Solution 2:
        for(String each2: arr){ //4 times will be executed

            int count=0;
            for(String each: arr){
                if(each.equals(each2)){
                    count++;
                }
            }

            if(count==1){// if the character is unique
                System.out.println(each2+count);
                //System.out.println(count);

            }
        }

         */


    }
}
//System.out.println("===============================================================================================");
class Frequency_SingleChar{
    public static void main(String[] args) {


       // TASK 16. frequency of single char

        String str = "ABBAAAA";
        char ch = 'A';

        char[] arr =  str.toCharArray(); // [A, B, B]
        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }
        System.out.println(count);

    }

}

//System.out.println("===============================================================================================");

class FindMaxMin_ofString_WrapperClass{
    public static void main(String[] args) {


        // Task 17: find max and min numbers of the String

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

class convertString_toPrimitive{
    public static void main(String[] args) {

        //Task 18: String to primitive

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

//System.out.println("===============================================================================================");

class extractDigit_andLetters_fromString{
    public static void main(String[] args) {

       //Task 19: extract the digits and letters

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