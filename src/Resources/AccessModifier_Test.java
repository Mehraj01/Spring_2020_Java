package Resources;
import day39_AccessModifiers.AccessModifiers;
public class AccessModifier_Test {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        // System.out.println( obj.defaultAccess  ); // default: only accessible in same package
        System.out.println( obj.publicAccess ); // open to the world

        //    System.out.println( obj.SSN ); // private: only accessible within the same class




    }
}
