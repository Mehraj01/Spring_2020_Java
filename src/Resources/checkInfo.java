package Resources;
import day39_AccessModifiers.PersonalInfo;
public class checkInfo {
    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);// public accessible in the different package when u
                                             // import the package and class that its belong
        System.out.println(PersonalInfo.gender);

        //System.out.println(PersonalInfo.grade); // this is default. It only accessible only in the same package
       // System.out.println(PersonalInfo.age);

       // System.out.println(PersonalInfo.SSN);// private It only  accessible only in the same class
        //System.out.println(PersonalInfo.ID);

        PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name); //public
        System.out.println(obj.gender);//public

        //System.out.println(obj.grade);// Default
       // System.out.println(obj.age);

        //System.out.println(obj.SSN); Private
        //System.out.println(obj.ID);Private


    }
}
