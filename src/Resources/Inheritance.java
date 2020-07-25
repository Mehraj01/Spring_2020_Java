package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {

        // sub          // super
        public static void main(String[] args) {

            System.out.println(Resources.Inheritance.publicData);
            System.out.println(Resources.Inheritance.protectedData);
            //System.out.println(Inheritance.defaultData);// outside of the different package default is not visible
            // System.out.println(Inheritance.privateData);// outside of the different package default is not visible


        }
    }

