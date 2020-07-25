package OfficeHours.Practice_05_20_2020;


//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Data{
    int a = 100;

    public void method(){
        System.out.println("Hello World");
    }
}

public class SuperKeyword extends Data {
    int a = 200;

    public void method(){
        System.out.println("hello Cybertek");
    }

    public SuperKeyword(){
        method();
        System.out.println(a);
    }

    public static void main(String[] args) {
        SuperKeyword  obj = new  SuperKeyword();

    }

}