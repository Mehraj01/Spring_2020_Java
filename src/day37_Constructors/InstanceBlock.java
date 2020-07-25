package day37_Constructors;

public class InstanceBlock {


    {
        System.out.println("Instance block1");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();

    }

    static{
        System.out.println("static block");
    }


}
