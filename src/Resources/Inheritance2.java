package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {
            // sub class            super class

    public static void main(String[] args) {

        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        //System.out.println(Inheritance2.defaultVariable); //not accessible outside of the class

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
        //Inheritance2.defaultMethod(); //not accessible outside of the class


    }

}
