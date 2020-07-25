package day35_Static;

public class staticPractice2 {

    String brand;
    String model;
    static boolean haveWheels=true; // it will apply every single car. because its static. Result will be the same

    public void printBrand(){// instance method
      System.out.println(brand);

    }

    public void printModel(){//instance method
        System.out.println(model);

    }

    public static void main(String[] args) {
        System.out.println(haveWheels);// static variable
    }

}
