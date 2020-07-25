package day37_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car("Toyota", "Raw4", 2018, 31000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        Car car2=new Car("Mercedez", "C300", 2019, 45000);
        System.out.println(car2);



    }





}
