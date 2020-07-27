import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class Practice {

    public static void main(String[] args) {



        // Write a program that will take five Strings and save them into an array called arr.
        //2. use for each loop to print out the first three letter of each element of arr, one per line.
        //You can assume that every element of arr is at least 3 letters long.
        //            Example:
        //                arr -> ["apple", "banana"]
        //                prints: app
        //                        ban

        Scanner scan=new Scanner(System.in);
        String t[]=new String[3];
        for(int a=0;a<3;a++){
            t[a]=scan.next();
        }
        for(int i=0;i<t.length;i++){
            System.out.println(t[i].substring(0,3));
        }


/*

        //Given 2 arrays of ints, a and b, return true if
        //they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.

        int[]a={1,2,3,4};
        int[]b={4,5,3,5};

        boolean result=true;


        for(int i=0; i<a.length; i++){
            if(a.length>=1 && b.length>=1) {
                if(a[0]==b[0] && a[a.length-1]==b[b.length-1]) {
                    result = a[i] == b[i];
                }
            }
        }
        System.out.println(result);


 */
        int [] arr1= {1,3,6};
        int [] arr2= {3,6};
        boolean result= false;
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j< arr2.length; j++) {
                if(arr1.length>=1 && arr2.length>=1) {
                    if(arr1[0]== arr2[0] || arr1[arr1.length-1]== arr2[arr2.length-1]){
                        result=true;
                    }
                }
            }
        }





        System.out.println(result);

        int [] arr3= {1,3,6};
        int [] arr4= {3,6};
        if(arr3.length>=1 && arr4.length>=1) {
            if(arr3[0]== arr4[0] || arr3[arr3.length-1]== arr4[arr4.length-1]){
                System.out.println(true);
            }
        }








    }
}
class practice2{
    public static void main(String[] args) {


        //Create a function that counts the number of syllables a word has. Each syllable is separated with a dash "-"
        //Examples
        //numberSyllables("buf-fet") ➞ 2


        String word="buffet";

        word=word.substring(0,3).concat("-")+word.substring(3);
        System.out.println(word);


        String str = "buf-fet";
        int count=0;
        while(str.contains("-")){
            str=str.replaceFirst("-","");
            count++;
        }
        System.out.println(count+1);


    }
}

class practice3{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String result="";
        for (int i=0; i<2; i++){
            System.out.println("Enter word ");
            String word=input.next();
            result+=word.substring(1);
        }
        System.out.println(result);


    }
}