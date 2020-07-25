package day36_StaticBlock;

import day34_CutomClass.Tester;

public class StaticBlock4 {

    static String name;
    //static String name="Cybertek School";
    // if we initialize the static variable inside the class then we can print Cybertek school without using it inside the static block
    static Tester tester1=new Tester();

   // tester1.setInfo("Muhtar", 123, "SDET", 120000);// we cant do this in there


    int insVariable;




    static{
        // static block get executed as soon as the class is loaded
        // static block designed to initialize static variables

        name="Cybertek School";

        // if we comment out static block in result we will get null


        tester1.setTesterInfo("Muhtar", 123, "SDET", 120000);


       //insVariable=200;// static only accepts static... this is instance variable


        StaticBlock4 obj=new StaticBlock4();
        obj.insVariable=300;
       // important  *********   do not use static block to initialize instance variable



    }





    public static void main(String[] args) {
        System.out.println(name); // to get the result we have to initialize static variable in static block

        StaticBlock4 obj2=new StaticBlock4();
        System.out.println(obj2.insVariable);// it will print 0
    }
}
