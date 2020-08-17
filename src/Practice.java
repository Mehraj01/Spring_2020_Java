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
class practice4{
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int sum=0;

        for(int i=1; i<3;i++){
            System.out.println("Enter the number");
            int numbers=scan.nextInt();
            sum+=numbers;
        }
        System.out.println(sum);


        int a=3;
        int b=4;



    }
}

class prcatice5{
    public static void main(String[] args) {


/*
Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string.
* For example, if you're given 3 as input, your function should return "March", because March is the 3rd month.
* monthName(3) ➞ "March"
* monthName(12) ➞ "December"
* monthName(6) ➞ "June"
 */

        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();

   String month[]={"January", "February", "March", "April", "May", "June", "July", "August", "September",
           "October", "November", "December"};


    for(int i=0; i<month.length; i++) {
        if(number==i){
            System.out.println("month[i] = " + month[i-1]);

        }


    }


        System.out.println(months(6));


    }

    public static String months(int num){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months [num-1];
    }


}



class practice5{
    public static void main(String[] args) {


        Integer arr[]={1,0,2,0,3,0};

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr));

//        for(int i=0; i<arr.length; i++){
//            list.add(arr[i]);
//        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i)==0){
                list.remove(i);
                list.add(0);
            }
        }
        System.out.println(list);


    }
}
class birObirBu{
    public static void main(String[] args) {

        int arr1[]={1,3,5};
        int arr2[]={2,4,6};


       // int Array[]=new int[arr1.length+arr2.length];
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
             list.add(arr1[i]);
            list.add(arr2[i]);


        }


       // System.out.println(Arrays.toString(Array));
        System.out.println(list);


    }
}

class commonDivisor{
    public static void main(String[] args) {


        int a=25;
        int b=15;
        ArrayList<Integer>e=new ArrayList<>();
        if(a>b){
            for(int i=a;i>0;i--){
                if(a%i==0&&b%i==0){
                    e.add(i);
                }
            }
        }
        System.out.println(e);
    }
}