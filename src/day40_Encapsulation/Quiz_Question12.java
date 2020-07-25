package day40_Encapsulation;

public class Quiz_Question12 {
    public static String name = "Osman";

    public Quiz_Question12(){ // constructor
        name = "Hilal";
    }

    { // instance block
        name = "Marionela";
    }

    static{
        name = "Madina";
    }

    public static void main(String[] args) {
        // System.out.println(name); // Madina

        // Quiz_Question12 obj  = new Quiz_Question12();
        //name = madina
        //  name = "Marionela";
        //  name = "Hilal";

        System.out.println(name);

    }

}

class Practice1{


    public Practice1(){// contractor will be printed
        System.out.println("Bye ");
    }
    public void Practice1(){// for instance method. we have to call it trough object name
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Practice1 a=new Practice1();//constructor will be printed
        a.Practice1(); // for instance method. we have to call it trough object name
    }
}
