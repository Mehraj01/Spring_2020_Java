package OfficeHours.Practice_05_27_2020;

public class methodOverriding {

    public void method1(){
        System.out.println("Super Class");


    }

}
class Test extends methodOverriding{
    @Override
    public void method1(){

        System.out.println("Sub class");

    }
}
