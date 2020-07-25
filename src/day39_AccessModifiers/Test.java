package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {


        AccessModifiers obj = new AccessModifiers();

        System.out.println( obj.defaultAccess );
        System.out.println( obj.publicAccess );
        //    System.out.println( obj.SSN ); // private: only accessible within the same class

    }
}
