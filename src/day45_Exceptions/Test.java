package day45_Exceptions;

class A{
    public A(){ // A
        System.out.println("A");
    }
}

class B extends A{
    public B(){  // AB
        // super();  // A
        System.out.println("B");

    }
}


public class Test extends B{
    public Test(){ // ABC
        // super(); // Ab
        System.out.println("C"); // C
    }

    static int Inum = 10;

    public static void main(String[] args) {
        // new Test();

        Test obj1 = new Test();
        obj1.Inum = 20;

        Test obj2 = new Test();
        System.out.println(obj2.Inum); // 20



    }


}