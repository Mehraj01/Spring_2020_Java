package day48_Abstraction;
/*
Warmup tasks:
	1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
	2. create the following subclasses of phone:
						1. iPhone
						2. Samsung
			create constructors in each sub class that can initialize the instance variables
 */

public abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNUmber);

    public abstract void texting(long phoneNUmber);

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Price: $"+price+", Size: "+size;
    }


}
//*****************************************************************************************************************

class iPhone extends Phone{
    static{
        brand="iPhone";
    }

    public iPhone(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;

    }

    public void FaceTiming(long phoneNumber){
        System.out.println("Iphone is face timing with "+phoneNumber);
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println("Iphone is calling "+phoneNUmber);
    }

    @Override
    public void texting(long phoneNUmber) {
        System.out.println("Iphone is texting "+phoneNUmber);

    }
}
//*****************************************************************************************************************

class PhoneObjects{
    public static void main(String[] args) {

        iPhone iphone1=new iPhone("X", 1000, "10 inches");
        System.out.println(iphone1);

        iPhone iphone2=new iPhone("8", 900, "8 inches");
        System.out.println(iphone2);


        iphone1.FaceTiming(123456);
        iphone1.calling(567586);
        iphone1.texting(24356489);

        System.out.println("=========================================");


        Samsung samsung1 = new Samsung("Note10 Plus", 1200, "Large");

        System.out.println(samsung1);

        samsung1.calling(123456);
        // samsung1.faceTiming(123456);
        samsung1.freezing();

        samsung1.texting(123456);



    }
}
//*****************************************************************************************************************

class Samsung extends Phone{
    static{
        brand = "Samsung";// we wanna execute it one time
    }

    public Samsung(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing  when using ");
    }


}

