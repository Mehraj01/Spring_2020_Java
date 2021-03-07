package Practice_2021;

import Resources.Library;

import java.text.DecimalFormat;
import java.util.*;

public class Array {
    public static void main(String[] args) {


        int n=670;
        //int num=5;

        String str=String.valueOf(n);
        String []arr=str.split("");

        String number="";
        for (int i = 0; i <arr.length; i++) {
            int temp=Integer.parseInt(arr[i]);
            if (temp<5 ){
                number+=""+5+Integer.valueOf(temp);
            }else{
                number+=""+Integer.valueOf(temp);
            }


        }
        //System.out.println(number);
        int result=Integer.valueOf(number);

        System.out.println(result);

    }

    public int solution(int N) {

        String str=String.valueOf(N);
        String []arr=str.split("");

        String number="";
        for (int i = 0; i <arr.length; i++) {
            int temp=Integer.parseInt(arr[i]);
            if (temp<5){
                number+=""+5+Integer.valueOf(temp);
            }else{
                number+=""+Integer.valueOf(temp);
            }
        }

        int result=Integer.valueOf(number);

        return result;

    }




}
