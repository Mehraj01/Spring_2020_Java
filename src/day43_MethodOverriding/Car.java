package day43_MethodOverriding;

public class Car {

    void start(){
        System.out.println("Insert the key");
        System.out.println("twist ignition key to start");
    }

}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
class Tesla extends Car{

    public void start(){
        System.out.println("Push the start button");
    }


}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class CarShop{

    public static void main(String[] args) {

        Tesla tesla=new Tesla();
        tesla.start();

        System.out.println("********************************************");

        Honda honda= new Honda();
        honda.start();


        System.out.println("********************************************");


        Jeep jeep=new Jeep();
        jeep.start();


        System.out.println("********************************************");


        BMW bmw=new BMW();
        bmw.start();




    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
class Honda extends Car{


}

class Jeep extends Car{

    public void start(){ // protected or default
        System.out.println("Call Mechanic");
        System.out.println("Oil change");
        System.out.println("jump Start");
    }


}

class BMW extends Car{

    void start(){
        System.out.println("call some friends");
        System.out.println("tell them to push");
        System.out.println("remove ");
    }


}
