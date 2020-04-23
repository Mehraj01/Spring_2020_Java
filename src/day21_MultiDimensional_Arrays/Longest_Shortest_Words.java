package day21_MultiDimensional_Arrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        /*
        	2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
         */

        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxLengthString = names[0].length(); //4  // we use string method because we finding total length of string int the array
        int minLengthString = names[0].length();

        String logestword = names[0];
        String shortestWord = names[0] ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                logestword = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(logestword);
        System.out.println(shortestWord);




    }
}
