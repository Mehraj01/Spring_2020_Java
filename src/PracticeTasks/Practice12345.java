package PracticeTasks;

import day20_ArraysContiniue.Days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice12345 {
    public static void main(String[] args) {

        String[] nonDigits = {"1","2.5", "3", "3.5", "4.5"};

        double []digits=new double[nonDigits.length];
        for (int i = 0; i <nonDigits.length ; i++) {
            // double convert=
            digits[i]=Double.parseDouble(nonDigits[i]) ;
        }

        System.out.println(Arrays.toString(digits));
    }
}
