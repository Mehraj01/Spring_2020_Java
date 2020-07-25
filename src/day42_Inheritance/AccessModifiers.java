package day42_Inheritance;

public class AccessModifiers {

    public static String publicVariable="public";
    protected static String protectedVariable="protected";
    static String defaultVariable="default";
    private static String privateVariable="private";

    public static void publicMethod(){

    }
    protected static void protectedMethod(){

    }
    static void defaultMethod(){
    }
    private static void privateMethods(){

    }
}
//********************************************************************************************************************
/*
>>>> Access Modifiers:
     public: accessible at everywhere, visible to the world
     protected: visible in same package, visible in sub class outside package
     default: only visible in same package
     private: only visible within the same class
 */

// Test Methods And Variables
class TestData2 extends AccessModifiers{

    public static void main(String[] args) {

        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable); // it is in the same package because we access to this variable
        //System.out.println(TestData2.privateVariables);// private cannot be accessible in different classes


        TestData2.publicMethod();// We can call it from everywhere
        TestData2.protectedMethod();// We can call it from everywhere . It can be inherited any subclass
        TestData2.defaultMethod();// it is in the same package
    }
}
//********************************************************************************************************************
