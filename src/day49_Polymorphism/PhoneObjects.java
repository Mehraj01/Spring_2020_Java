package day49_Polymorphism;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iPhone1=new iPhone("iPhone 10 pro", 1000, "10 inch");
        System.out.println(iPhone1);// because we have toSting method in Phone class we can print the info to screen
        iPhone1.calling(234783);
        iPhone1.texting(453);
        iPhone1.faceTiming(809);
        iPhone1.download();

        Nokia nokia1=new Nokia("version 7", 500, "4 inch");
        System.out.println(nokia1);
        nokia1.freezing();
        nokia1.texting(49573095);
        nokia1.breakTheFloor();

    }


}
