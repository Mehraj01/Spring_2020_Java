package MyOwnLibrary;
/*
        Task 1:  Find Max Number

        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list

("===================================================================================================================");

         Task 2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1

("===================================================================================================================");

	     Task 3 write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}

("===================================================================================================================");

            Task 4. Find unique elements from ArrayList
         write a program that can find the unique elements from an ArrayList of integers and stores
          into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}

    		==============================
    			Task 4.2

    			    - Finding unique chars
    		==================================

    			Task 4.3 // Unique Numbers using Predicate

    			 write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList


("===================================================================================================================");
        Task 5.

           Sort ArrayList


("===================================================================================================================");

           Task 6. Remove Duplicates

            write a program that can remove duplicates from an arraylist

("===================================================================================================================");


            Task 7. Print Lowercase Characters

("===================================================================================================================");

            Task 8. move all the zeros

             Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare  any extra lists

("===================================================================================================================");

            Task 9. Print Duplicate Chars

             write a program that can return the duplicated values from an ArrayList of String

		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]

			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]


("===================================================================================================================");

            Tasks 10. Predicate

            Lambda expressions Tasks

("===================================================================================================================");

          Task 11. Extract Chars with and without loop

          write a program that can extract the special characters, digits and alphabets
          from a string and stores them into separate ArrayLists of Character:

("===================================================================================================================");

          Task 12.

           write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList

("===================================================================================================================");
 */

import Resources.Library;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.function.Predicate;

//import java.util.ArrayList;
public class ArrayList {

}
//System.out.println("===============================================================================================");

class FinMax{
    public static void main(String[] args) {

        //Task 1:  Find Max Number

        java.util.ArrayList<Integer> scores = new java.util.ArrayList<>(); // size : 0
        scores.addAll(Arrays.asList(10, 20, 15, 70, 17));

        //int max=scores.get(0);
        Integer max=scores.get(0);
        for(int i=0; i<scores.size(); i++){
            if(scores.get(i)>max){
                max=scores.get(i);
            }
        }
        System.out.println(max);


        System.out.println("======================================================");
        // with Integer.MIN_VALUE;

        int maximum2 = Integer.MIN_VALUE;
        for(Integer each  : scores){
            if(each > maximum2 ){
                maximum2 = each;
            }
        }

        System.out.println(maximum2);


        System.out.println("======================================================");
        // another way

        int maximum3 = Library.max(scores); //==> Library.max(); method will get the max number from the ArrayList
        System.out.println("Library.max(); method "+maximum3);
       // System.out.println(Library.max(scores));


        /*
        // When you do with method
    public static int max(ArrayList<Integer> list){

        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > maximum ){
                maximum = list.get(i);
            }
        }
        return maximum;
    }
         */

        System.out.println("======================================================");

        java.util.ArrayList<Integer> nums=new java.util.ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));

        Integer maxNum=Collections.max(nums);// it will always return max number from given list
        System.out.println(maxNum);
        nums.removeAll(Arrays.asList(maxNum));// we will remove all max same numbers
        int max2=Collections.max(nums);// we will assign second max number to max2
        System.out.println(max2);

        java.util.ArrayList<Integer> list2=new java.util.ArrayList<>( Arrays.asList(1,3,2,4,5,10,6,9,8));

        Integer minNum=Collections.min(list2);
        System.out.println(minNum);
        list2.removeAll(Arrays.asList(minNum));
        int min2=Collections.min(list2);
        System.out.println(min2);




    }
}
//System.out.println("===============================================================================================");

class ArrayList_ReverseInteger{
    public static void main(String[] args) {

        //Task 2. Reverse Integer list


        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        // Adding the numbers to the list
        for(int i=0; i<10; i++){
            list.add(i); // instead adding one by one create a loop and add numbers to the list in this way
        }
        System.out.println(list);


        java.util. ArrayList<Integer>reverseIntegers=new java.util.ArrayList<>();
        for(int i=list.size()-1; i>=0; i--){
           // int eachNumber=list.get(i); // unboxing ==> converting Integer (Wrapper class) to int primitive
            //reverseIntegers.add(eachNumber);
            reverseIntegers.add(list.get(i));
        }
        System.out.println(reverseIntegers);

    }
}
//System.out.println("===============================================================================================");
class combineTwo_StringArray_toArrayList{
    public static void main(String[] args) {

        //Task 3. Combine two String arrays into one ArrayList

        String[] arr1 = {"A", "B", "C"};
        String[]  arr2 = {"D", "E", "F", "G", "H", "I"};

        java.util.ArrayList<String> list = new java.util.ArrayList<>();  //  {"A", "B", "C", "D", "E", "F", "G"}

        for(int i=0; i<arr1.length; i++){
            //String eachElement = arr1[i]; // we can store each array element into and pass eachElement inside list,get()
            list.add(arr1[i]);

        }
       // System.out.println(list);

        for(int i=0; i<arr2.length; i++){
            list.add(arr2[i]);

        }
        System.out.println(list);


    }
}
//System.out.println("===============================================================================================");

class UniqueElements{
    public static void main(String[] args) {

        // Task 4. Find unique elements from ArrayList

        java.util.ArrayList<Integer> list =  new java.util.ArrayList<>(Arrays.asList(10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        System.out.println(list);

        java.util.ArrayList<Integer> unique =  new java.util.ArrayList<>();

        for (int k=0; k<list.size(); k++){
            int count=0;
            for (int i=0; i<list.size(); i++){
                if(list.get(i)==list.get(k)){ // if list index i == list index k then count. Means it will count all the
                    count++;                  // the elements in the list
                }
            }

            if(count==1){
                unique.add(list.get(k));
            }
        }

        System.out.println(unique);

        System.out.println("===================================================================");

        // Finding Unique Chars

        Character []chars={'A','A', 'B', 'C', 'D', 'D'};
        java.util.ArrayList<Character> charList =  new java.util.ArrayList<>(Arrays.asList(chars));

        java.util.ArrayList<Character> result =  new java.util.ArrayList<>();// we will store unique object inside it

        for(int i=0; i<charList.size(); i++){
            int count2=Collections.frequency(charList,charList.get(i));
            if(count2==1){
               result.add(charList.get(i));
            }
        }
        System.out.println(result);

        System.out.println("===================================================================");

        // Unique Numbers using Predicate

        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();
        list2.addAll( Arrays.asList(1,1,2,3,4,5,5) );

        // if the frequency of object is greater than one, we remove them
        list2.removeIf( p -> Collections.frequency(list2, p) > 1 );

        System.out.println(list2);



    }
}
//System.out.println("===============================================================================================");

class sort_ArrayList{
    public static void main(String[] args) {

        //Task 5. Sort ArrayList

        java.util.ArrayList<Integer> list =  new java.util.ArrayList<>(Arrays.asList(10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("========================================");
        java.util.ArrayList<Integer> list4 =  new java.util.ArrayList<>(Arrays.asList(10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        for (int i = 0; i < list4.size(); i++) {
            for (int j = 0; j < list4.size(); j++) {
                if (list4.get(i) < list4.get(j)) {
                    Integer temp = list4.get(i);
                    list4.set(i, list4.get(j));
                    list4.set(j, temp);
                }
            }
        }

        System.out.println(list4);


        System.out.println("========================================");

        java.util.ArrayList<Integer> list2 =  new java.util.ArrayList<>(Arrays.asList(10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        list2= new java.util.ArrayList<>(new LinkedHashSet<>(list2)); //  LinkedHashSet will remove duplicates
        System.out.println(list2);                                   // but will keep insertion order



        java.util.ArrayList<Integer> list3 =  new java.util.ArrayList<>(Arrays.asList(10, 50, 2, 4, 50, 10, 3, 2,5, 4));
       list3= new java.util.ArrayList<>(new TreeSet<>(list3)); // will sort and remove all the duplicates
        System.out.println(list3);




    }
}
//System.out.println("===============================================================================================");

class removeDuplicates{
    public static void main(String[] args) {

        //Task 6. Remove Duplicates

        java.util.ArrayList<String> list=new java.util.ArrayList<>();
        list.addAll(Arrays.asList("Mars", "Neptune", "Earth", "Venus", "Mars", "Venus", "Neptune"));

        java.util.ArrayList<String> nonDuplicate=new java.util.ArrayList<>();

        for (int i=0; i< list.size(); i++){
            if(!nonDuplicate.contains(list.get(i))){
                nonDuplicate.add(list.get(i));
            }
        }
        System.out.println(nonDuplicate);
    }

}
//System.out.println("===============================================================================================");

class print_lowercaseCharacters{
    public static void main(String[] args) {


        //Task 7. Print Lowercase Characters

        java.util.ArrayList<Character> list=new java.util.ArrayList<>();
        for(char i='a';i<='z';i++){// it will add all the lowercase chars with help of the loop to the ArrayList.
            list.add(i);
        }
        System.out.println(list);

        boolean result=list.containsAll(Arrays.asList('a','c', 'D')); // it returns false because for
        // loop only has lower case chars
        System.out.println(result);

    }
}
//System.out.println("===============================================================================================");

class moveZeros{
    public static void main(String[] args) {

        //Task 8. move all the zeros

        java.util.ArrayList<Integer> list=new java.util.ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        // removing the Zeros
       int count=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==0){
                count++; // It will count all the zeros inside the list
            }
        }
        list.removeAll(Arrays.asList(0));// will remove all the zeros
        System.out.println(list);


        //Adding the Zeros
        for(int i=0; i<count; i++){// Count counted all Zeros. Loop will help us to add zeros end of the ArrayList
            list.add(0);
            //list.add(0,0); // ==> It will add zeros to the beginning of the List.
                                 // It replace zeros with start from 1st indexes

        }
        //list.addAll(Arrays.asList());
        System.out.println(list);

        System.out.println("==============================================================");

        // Second way

        java.util.ArrayList<Integer> list3=new java.util.ArrayList<>();
        list3.addAll(Arrays.asList(1,0,2,0,3,0,4,0));


        int count2=Collections.frequency(list3,0);//This collection method will find frequency of the number given in list
        System.out.println(count2);// 4 zeros

        list3.removeAll(Arrays.asList(0));//removes zeros from the list
        System.out.println(list3); // it will remove all zeros ==> [1, 2, 3, 4]

        for(int i=0; i<count2;i++){//add zeros as size of count==> means numbers of zeros we had in the list
            list3.add(0);
        }
        System.out.println(list3);


    }
}
//System.out.println("===============================================================================================");

class print_DuplicateCharacters{
    public static void main(String[] args) {

        //Task 9. Print Duplicate Chars

        java.util.ArrayList<String> list=new java.util.ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        java.util.ArrayList<String> Duplicate=new java.util.ArrayList<>();

        for(int k=0; k<list.size(); k++){
            int count=0;
            for(int i=0; i<list.size(); i++){
                if(list.get(i).equals(list.get(k))){
                    count++;
                }
            }
            if(count!=1 && !Duplicate.contains(list.get(k))){
                Duplicate.add(list.get(k));
            }
        }
        System.out.println(Duplicate);



        System.out.println("==================================================================================");

        // second way

        java.util.ArrayList<String> Duplicate2=new java.util.ArrayList<>();

        for(int i=0; i<list.size();i++){
            int count2=Collections.frequency(list, list.get(i));
            if(count2 > 1 && !Duplicate2.contains(list.get(i))){
                Duplicate2.add(list.get(i));
            }

        }
        System.out.println(Duplicate2);

        System.out.println("==================================================================================");

        //third way

        java.util.ArrayList<String> Duplicate3=new java.util.ArrayList<>();

        for(int i=0; i<list.size(); i++){
            int count3=Collections.frequency(list,list.get(i));
            if(count3>1){
                if(Duplicate3.contains(list.get(i))){
                    continue;
                }
                Duplicate3.add(list.get(i));
            }
        }
        System.out.println(Duplicate3);

    }
}
//System.out.println("===============================================================================================");

class ExtractChars{
    public static void main(String[] args) {


       // Task 11. Extract Chars with and without loop

        String  str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        java.util.ArrayList<Character> letters = new java.util.ArrayList<>();  // isLetter()
        java.util.ArrayList<Character> digits = new java.util.ArrayList<>();
        java.util.ArrayList<Character> specialChars = new java.util.ArrayList<>();

        for(char each : arr ){
            if( Character.isLetter(each) ){ // we can give isAlphabetic(each); method as well
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }

        }

        /*
         for(int i= 0; i < str.length(); i++){
            char each =  str.charAt(i);

            if( Character.isLetter(each) ){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }

        }
         */

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

        System.out.println("=====================================");

        //Second way with predicate

        String  str2 = "ABCD123$%#@&456EFG!";
        char[] arr2 = str.toCharArray();

        Character[] ch = new Character[arr2.length];// for storing String chars in it

        for(int i=0; i < arr2.length; i++){
            ch[i] = arr2[i];
        }

        // System.out.println( Arrays.toString(ch) );

        //Char Array will be stored inside this array. We will just remove digits and special chars
        java.util.ArrayList<Character> letters2 = new java.util.ArrayList<>(Arrays.asList(ch));
        letters2.removeIf( p -> !Character.isLetter(p) );
        System.out.println(letters2);


        java.util.ArrayList<Character> digits2 = new java.util.ArrayList<>( Arrays.asList(ch) );
        digits2.removeIf( p -> !Character.isDigit(p) );
        System.out.println(digits2);


        java.util.ArrayList<Character> specialChars2 = new java.util.ArrayList<>( Arrays.asList(ch) );
        specialChars2.removeAll(letters2);
        specialChars2.removeAll(digits2);
        //  specialChars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(specialChars2);

    }

}
//System.out.println("===============================================================================================");

class Duplicate_Digits{
    public static void main(String[] args) {

       // Task 12. Duplicate digits

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.addAll( Arrays.asList(1,1,2,3,4,5,5) );

        list.removeIf( p -> Collections.frequency(list,p ) == 1  ); // if the object is unique, then we remove it

        System.out.println(list); //[1,1,5,5]


        // another way
          System.out.println( new LinkedHashSet<>(list )); //[1,5]
    }
}
//System.out.println("===============================================================================================");