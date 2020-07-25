package day36_StaticBlock;

public class CapitalOne {
    public static void main(String[] args) {

        System.out.println(HumanResources.dev1);


        // we can change dev1 value by calling HumanResources class name and add my new info
        HumanResources.dev1.setInfo("Ali", "Developer", 130000, 1938);

    }
}
