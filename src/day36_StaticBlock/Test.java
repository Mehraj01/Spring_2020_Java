package day36_StaticBlock;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlock2.tester1);

        System.out.println(StaticBlock3.name);// better initilazie your static variable insade the static
        // if it is initilaze StaticBlock3 inside main method. in this class we will get null


        System.out.println(StaticBlock3.num);

    }

}
