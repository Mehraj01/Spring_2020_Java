package day42_Inheritance;

class test{// Super, parent Class

    public test(){

        System.out.println("super class' default constructor");
    }
}
//********************************************************************************************************************
 //--   CONSTRUCTOR CANNOT BE INHERITED
public class Constructor extends test{ //sub, child class
           // sub class       super class

    // * when u create object constructed get executed
    public Constructor(){
        // * there is invisible default constructor call that will be printed to the console automatically.
       //when we have constructor in the parent class. It is a MUST.
      // It means with this constructor Parent class constructor will be printed to the console as well.
        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {

        Constructor obj=new Constructor();

    }
}
//********************************************************************************************************************


