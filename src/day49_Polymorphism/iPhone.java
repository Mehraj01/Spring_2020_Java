package day49_Polymorphism;

public final class iPhone extends Phone implements AppleApps {
    // we add final keyword to our iPhone method so it will not be extended
    //All methods has to be overriding to this class from phone class and AppleApps interface
    // Because class is not abstract
    // If subclass is abstract we dont have to override all those methods.

    static{
        brand = "Apple";
    }
// Every class mjst have a constructor. If you wil not create one compiler will give us default constructor
    public iPhone(String model, double price, String size) {// constructor
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void download() {
        System.out.println("iPhone is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming to "+phoneNumber);
    }



}


/*
    5. create a class named iPhone that can inherit from AppleApps and Phone
            actions that every iphone can do: texting(), calling(), faceTiming()
 */
