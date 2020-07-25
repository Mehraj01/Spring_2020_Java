package day41_Inhteritance;

public class Data {

    public static int a=100;
    public static void method(){

    }
}


//import day41_Interitance.Data;
class TestData extends Data{

    public static void main(String[] args) {
        /*
        System.out.println(Data.a);
        Data.method();

       // System.out.println(TestData.a);
        //TestData.method();

         */
        System.out.println(TestData.a);
        TestData.method();
    }


}
