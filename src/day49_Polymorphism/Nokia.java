package day49_Polymorphism;

public final class Nokia extends Phone implements AndroidApps{


    static{
        brand="Nokia";
    }

    public Nokia(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;

    }

    @Override
    public void download() {

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Nokia is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Nokia is calling to "+phoneNumber);
    }


    public void freezing(){
        System.out.println("Nokia is freezing");

    }

    public void breakTheFloor(){
        System.out.println("Nokia is breaking the floor");

    }
}
