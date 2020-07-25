package day36_StaticBlock;

import day34_CutomClass.Tester;

public class StaticBlock2 {

    static int a;
    static int b;

    static Tester tester1=new Tester();// static variable

    public static void main(String[] args) {



    }



    static{// static only accepts static

        tester1.setTesterInfo("Jean", 123, "SDET", 120000);
        //System.out.println(tester1);

        a=100;
        b=200;
        if(100>200){
            a=100;
        }else{
            b=200;
        }



    }
}
