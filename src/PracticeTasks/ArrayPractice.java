package PracticeTasks;

import day50_Polymorphism.ReferenceTypeCasting;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com", "Hello@gmail.com"};
        String [] g=gmail(emails);


        String[] friends = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
        Names(friends);


        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        int[]num=Descending(arr);
        System.out.println(Arrays.toString(num));


        int array1[]={9,2};
        int array2[]={3,4};

       int [] merge=combineArrays(array1, array2);
       System.out.println(Arrays.toString(merge));


       int[] maxNumber = {3,1,4,-1,100, -100, 200, 155};
       int number= max(maxNumber);
       System.out.println(number);



        int[] number1 = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        int ava=averageNum(number1);
        System.out.println(ava);// 10


        int[] EvenOddCount = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        System.out.println(countNum(EvenOddCount));


        String[] words = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
        System.out.println(shortestWord(words));



        String[] RevArray = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
        System.out.println(Arrays.toString(reverseArray(RevArray)));


        String str = "I like Java";
        System.out.println(reverseStringArray(str));


        String sentence = "I like java and javascript python python";
        System.out.println(numberOfJava(sentence));


        int[] numbers = new int[50];
        //System.out.println(Arrays.toString(Numbers(numbers)));
        //System.out.println(Numbers(numbers));
        Numbers(numbers);

        System.out.println("==========");


        String[] FirstThree = {"Kuzzat", "As", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
        System.out.println(Arrays.toString(firstThreeLetter(FirstThree)));

        System.out.println(Arrays.toString(middleThreeLetter(FirstThree)));
        System.out.println(Arrays.toString(firstLastLetter(FirstThree)));


        String[]removeDup={ "A", "B", "A","C","C"};
        uniquesValues(removeDup);

        String[] maxxx = {"1","2.5", "3", "3.5", "4.5"};
        System.out.println(findMax(maxxx));


        System.out.println(Arrays.toString(stringToPrimitive(maxxx)));

        String strrr="a1b2c3d4";
        extractDigitsLetters(strrr);

    }
//======================================================================================================================
    //  print out all the users who registered with their @gmail
    public static String [] gmail(String []emails){

        for (int i = 0; i <emails.length ; i++) {
            if(emails[i].endsWith("gmail.com")){
                System.out.println(emails[i]);
            }
        }
        return emails;
    }

//======================================================================================================================
    //Print the names to the screen in the ArrayList
    public static String [] Names(String []names){

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }
        return names;
    }

//======================================================================================================================

    //  Arrays Descending order with Sorting method
    public static int [] Descending(int num[]){

        Arrays.sort(num);
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i <num.length ; i++) {
            list.add(num[i]);
        }
        ArrayList<Integer>Reverse=new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            Reverse.add(list.get(i));
        }
        int descending[]=new int[num.length];
        for (int i = 0; i <Reverse.size() ; i++) {
            descending[i]+=Reverse.get(i);
        }
        return descending;

        /*
         int descending[]=new int[num.length];
        int k=0;
        for (int i = num.length-1; i >=0 ; i--) {
            descending[k]=num[i];
            k++;
        }

         */

    }
//======================================================================================================================
    public static int [] combineArrays(int[]num1, int[]num2){


        int []mergeArray=new int[num1.length+num2.length];

        for (int i = 0; i <num1.length ; i++) {
            mergeArray[i]=num1[i];
        }

        for (int i = 0; i <num2.length ; i++) {
            mergeArray[num1.length+i]=num2[i];
        }

        return mergeArray;
    }
//======================================================================================================================
   //Max number
    public static int max(int [] num){

        int max=num[0];
        for (int i = 0; i <num.length ; i++) {
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }

//======================================================================================================================
    // write a program that can return the average number from an array of integers
    public static int averageNum(int[]arr){

        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }

       // System.out.println(sum/2);

        return sum/arr.length;
    }
//======================================================================================================================
    public static int countNum(int []num){

        int countEven=0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]%2!=0){
                countEven++;
            }
        }
        return countEven;

    }
//======================================================================================================================
    public static String shortestWord(String[]word){

        String shortest=word[0];
        for (int i = 0; i <word.length ; i++) {
            if(word[i].length()<shortest.length()){
                shortest=word[i];
            }
        }
        return shortest;
    }
//======================================================================================================================

    public static String []reverseArray(String[]words){

        String[] revArray=new String[words.length];
        int k=0;
        for (int i = words.length-1; i >=0; i--) {
             revArray[k]=words[i];
             k++;
        }
        return revArray;
    }
//======================================================================================================================

    public static String reverseStringArray(String words){

        String []arr=words.split(" ");
        String reverse="";
        for (int i =arr.length-1; i >=0; i--) {
            reverse+=" "+arr[i];
        }
        return reverse;
    }
//======================================================================================================================

    public static int numberOfJava(String words){

        String []arr=words.split(" ");
        int countJava=0;
        int countPython=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("java")){
                countJava++;
            }
            if (arr[i].contains("python")){
                countPython++;
            }
        }
        return countJava;

    }
//======================================================================================================================
    public static void Numbers(int arr[]){ //???????


        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i+1;
        }
       int num=0;
        for(int each: arr){
            if(each%2!=0){
                continue;
            }
           System.out.print(each+" ");
            //num=each; ///?????
        }



    }
//======================================================================================================================

    public static String []firstThreeLetter(String[]words){

        String []arr=new String[words.length];
        for (int i = 0; i <words.length ; i++) {
            if (words[i].length()>2){
                arr[i]=words[i].substring(0,3);
            }else{
                arr[i]=words[i];
            }
        }
        return arr;
    }
//======================================================================================================================



    public static String [] middleThreeLetter(String [] words){

        String []arr=new String[words.length];
        for (int i = 0; i <words.length ; i++) {
            if (words[i].length()>2){
                arr[i]=words[i].substring(words[i].length()/2-1, words[i].length()/2+2);
            }else{
                arr[i]=words[i];
            }
        }
        return arr;

    }


    public static String [] firstLastLetter(String [] words){

        String []arr=new String[words.length];
        for (int i = 0; i <words.length ; i++) {
            if (words[i].length()>2){
                arr[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
            }else{
                arr[i]=words[i];
            }
        }
        return arr;

    }
//======================================================================================================================
    public static void uniquesValues(String[]str){

        for (int k = 0; k <str.length ; k++) {
            int count=0;
            for (int i = 0; i <str.length ; i++) {
                if (str[i].equals(str[k])){
                    count++;
                }
            }
            if (count==1){
                System.out.println(str[k]);
            }
        }

    }
//======================================================================================================================

   public static String findMax(String []arr){

        double max=Double.MIN_VALUE;
       for (int i = 0; i <arr.length ; i++) {
           double num=Double.parseDouble(arr[i]);
           if(max<num){
               max=num;
           }
       }

     String word=String.valueOf(max);

        return word;
   }
//======================================================================================================================

    public static double[] stringToPrimitive(String []nonDigits){

        double []digits=new double[nonDigits.length];
        for (int i = 0; i <nonDigits.length ; i++) {
           digits[i]=Double.parseDouble(nonDigits[i]) ;
        }

       return digits;
    }
//======================================================================================================================

   public  static void extractDigitsLetters(String word){

        String digits="";
        String letters="";
       for (int i = 0; i <word.length() ; i++) {
           if(Character.isDigit(word.charAt(i))){
               digits+=word.charAt(i);
           }
           if(Character.isLetter(word.charAt(i)))
              letters+=""+ word.charAt(i);
           }


       System.out.println(digits);
       System.out.println(letters);
   }


   public static void frequencyOfArray(int arr[]){


   }

}

