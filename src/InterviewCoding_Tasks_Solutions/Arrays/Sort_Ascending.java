package InterviewCoding_Tasks_Solutions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Ascending {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

      //  System.out.println(Arrays.toString(Sort(arr)));

    }


    public static int[]Sort(int []a){

        ArrayList<Integer> list=new ArrayList<>();
        for(int each: a){
            list.add(each);
        }


        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size();  j++){
                if(list.get(i)<list.get(j)){
                    Integer temp=list.get(i);//9 //
                    list.set(i, list.get(j));//10
                    list.set(j,temp);//9
                }
            }
        }

        for(int i=0; i<list.size(); i++){
            a[i]=list.get(i);
        }

    return a;

    }


    /*
    Loop Iteration:
    1:
    i=0, j=0 (10<10)==> false
    i=0,j=1 (10<9) ==> false
    i=0, j=2 (10<8)==> false
    i=0, j=3 (10<7) ==> false

    2:
    i=1, j=0 (9<10) ==> true
    i=1, j=1 (9<9)  ==> false
    i=1, j=2 (9<8)  ==> false
    i=1, j=3 (9<7)  ==> false

    3:
    i=2, j=0 (8<10)  ==> true
    i=2, j=1 (8<9)  ==> true
    i=2, j=2 (8<8)  ==> false
    i=2, j=3 (8<7)  ==> false

    4:
    i=3, j=0 (7<10)  ==> true
    i=3, j=1 (7<9)  ==> true
    i=3, j=2 (7<8)  ==> true
    i=3, j=3 (7<7)  ==> false



     */


}
