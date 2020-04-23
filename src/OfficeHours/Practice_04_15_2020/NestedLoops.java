package OfficeHours.Practice_04_15_2020;

public class NestedLoops {
    public static void main(String[] args) {

        //                    0    1
        char[][] arr2D = { { 'A', 'B'}   ,  {'C', 'D', 'E'} , {'F', 'J', 'H'}    };
        //         0                 1                  2

        for(int j = 0; j < arr2D.length; j++){  // j: index nums of 1D arrays

            for(int i=0; i < arr2D[j].length; i++ ){  // i: index num of elements in 1D
                System.out.println( arr2D[j][i]   );
            }

        }

        System.out.println("=============================================================");
        // arr2D = { { 'A', 'B'}   ,  {'C', 'D', 'E'} , {'F', 'J', 'H'}    };
        //         0                 1                  2

        for( char[] each1DArray    : arr2D  ){

            for( char eachElement  :  each1DArray ){
                System.out.println(eachElement);
            }

        }


    }
}
