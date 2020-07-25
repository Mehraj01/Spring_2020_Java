package day42_Inheritance;
/*
TASK  02 :
		create a class called device:
				attributes: brand, model, price, country
				methods: toString
		create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
		create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */
//********************************************************************************************************************
// Super, Parent class
public class Device {

    public String brand;
    public String model;
    public double price;
    public static String country="Chine";
    public String type;
    public String size;

    public String toString(){// toString Method
        return "Brand: "+brand+", Model: "+model+", Type: "+type+", Size: "+size+", Price: $"+price+", Made in: "+country;
    }

    public void setDevice(String brand, String model, double price, String type, String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;
        this.size=size;

    }
}
//********************************************************************************************************************
// TV class inherited the variables and the methods from Device class
class TV extends Device{

    public TV(String brand, String model, double price,String size){ // Constructor
        setDevice(brand, model, price, "TV", size);

    }
    public void watch(){
        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );
    }
}
//********************************************************************************************************************
 // Testing
class DeviceObjects{
    public static void main(String[] args) {

        // Testing TV class
        TV tv1=new TV("Samsung", "E250", 500, "40 inch");
        tv1.country="USA";// Because "country" is a static
        System.out.println(tv1);


        //Testing phone class
        Phone phone1=new Phone("Iphone", "11", 1000, "large");
        System.out.println(phone1);
        phone1.call(4535849);
        phone1.text(45465647);



    }
}
//********************************************************************************************************************
// Phone class inherited the variables and the methods from Device class
class Phone extends Device{

    public Phone(String brand, String model, double price, String size){ // Constructor
        setDevice(brand, model, price, "Phone",size);

    }
    public void call(long number){ // parameter passed number
        System.out.println("Calling the number: "+number);
    }

    public void text(long number){
        System.out.println("texting to "+number);
    }



}