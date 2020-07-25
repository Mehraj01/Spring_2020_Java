package day42_Inheritance;

public class Data {

    public static String publicData="public";
    protected static String protectedData="protected"; // visible in same package ,
    static String defaultData="default";// visible inside the same package
    private String privateData="private";// Private can never be inherited
}
//********************************************************************************************************************
class TestData extends Data {

    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
       // System.out.println(TestData.privateData);// Private can never be inherited
    }
}
//********************************************************************************************************************
class testing extends Data{
// public, default, protected

    public static void main(String[] args) {

        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.publicData);
        //System.out.println(testing.privateData); Private it will never inherited


    }
}
//********************************************************************************************************************



