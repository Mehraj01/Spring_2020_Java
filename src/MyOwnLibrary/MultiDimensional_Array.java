package MyOwnLibrary;
/*
//System.out.println("===============================================================================================");

//System.out.println("===============================================================================================");
 */

import java.util.Arrays;
public class MultiDimensional_Array {
    public static void main(String[] args) {


        int[][] arr2D = { {1,2,3} ,  {4,5,6} };
        //               0          1

        for(int eachElement : arr2D[0] ){
            System.out.print(eachElement);
        }
        System.out.println();
        for(int i=0; i < arr2D[0].length; i++){
            int num =  arr2D[0][i];
            System.out.print(num);
        }




    }
}
//System.out.println("===============================================================================================");

class team{
    public static void main(String[] args) {

        String[] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};
        String[] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};
        String[] PO = {"Barzy", "Donald"};
        String[] TestersTeam2  ={"Ilham", "Zarina", "Aizhan", "Asiman"} ;

        String[][] ScrumTeam = { DevTeam, TestersTeam,  PO };

        for( String eachEmployee  : ScrumTeam[1] ){
            System.out.println(eachEmployee);
        }
    }
}
//System.out.println("===============================================================================================");

class Array_Zoo{
    public static void main(String[] args) {


        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock","Chicken"};
        //   0        1          2         3
        String[][] zoo = { wildAnimals, birds  };//  Multidimensional ==> Array 1, Array 2


        for( String eachBirds  : zoo[1] ){  // zoo index 1 ==> birds
            if(eachBirds.equals("Chicken")){
                continue;// will skip chicken on Array list
            }
            System.out.println(eachBirds);
        }


    }
}