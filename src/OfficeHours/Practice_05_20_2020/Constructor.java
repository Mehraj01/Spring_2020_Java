package OfficeHours.Practice_05_20_2020;

// to use super kew word we have to have super class
// We have to class at least on constructor from Super class. If I will not it will automatically will call default constructor

class Test{

    public Test(int a){ // Constructor call by default ==>  public Test()
        // if it has a parameter we have to call it manually
        System.out.println("A");
    }
}

//********************************************************************************************************************

public class Constructor extends Test {

    public Constructor(){ // Constructor  Output: AB
        super(10);// calling parent class constructor
        System.out.println("B");
    }


    public static void main(String[] args) {

        Constructor obj=new Constructor(); // AB ==> because Default constructor from Super class call bye default



    }
}
//********************************************************************************************************************