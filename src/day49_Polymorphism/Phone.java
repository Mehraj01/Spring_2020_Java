package day49_Polymorphism;

interface downloadable{ // interface is pure abstraction so u dont need to give abstract keyword to your abstract method

    // We can only have constant variables in interface. Such as Static variable
    // constant means we cant reinitialize it
    // we cant instance variable in interface
    // we can use only public access modifier in INTERFACE
    // if dont give access modifier it is still will be public by default

    // you can create abstract method in interface by two ways. WIth using abstract keyword or without it
    // By default interface will create an abstract method
    // abstract method can not be final because it meant to be overriding

    boolean downloadable=true;// public static final // by default it is final and we have to initialize it
    void download(); // public abstract


}
//********************************************************************************************************

interface  AndroidApps extends downloadable{ // 2 variable, 1 abstract method
    // Interface can not implement interface
    // only class can implement interface


    String AppStoreName="Android";// by default it is public static final

}
//********************************************************************************************************

 interface AppleApps extends downloadable{ // 2 variable, 1 abstract method

    String AppStoreName="Apple";//by default it is public static final


 }
//********************************************************************************************************

public abstract class Phone {// 2 abstract method



    public static String brand;
    public String model;
    public double price;
    public String size;

    // to create abstract method in abstract class we have to give abstract keyword to the method
    // in abstract method we can give public, protected, default access modifier to our method.
    // We cant give private access modifier to our abstract method because it meant to be overriding
    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    // to print all information we need toString method
    // ToString method an be inherited as well
    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: "+price;
    }


}

/*
1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
    5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
 */
