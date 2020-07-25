package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);


       System.out.println("Grade: "+PersonalInfo.grade);
      //  System.out.println("SSN: "+PersonalInfo.SSN);//because Private. Not accessible
        //System.out.println("SSN: "+PersonalInfo.ID);
        System.out.println("SSN: "+PersonalInfo.age);

        PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);// Default can accessible only inside the same package
        System.out.println(obj.age);

        //System.out.println(obj.SSN);// it is only accessible only inside the same class
        //System.out.println(obj.ID);

    }
}
