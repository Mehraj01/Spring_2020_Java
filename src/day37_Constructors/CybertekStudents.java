package day37_Constructors;

public class CybertekStudents {

    static String schoolName="Cybertek";
    String studentName;
    int groubNumber;
    String batch;


    public CybertekStudents(String studentName, int groupName, String batch){

      // schoolName="Cybertek"; // static variable
       this. studentName=studentName;
       this.groubNumber=groupName;
       this.batch=batch;

    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groubNumber+", School Name: "+schoolName;
    }

}


class CybertekObjects{
    public static void main(String[] args) {
        CybertekStudents student1=new CybertekStudents("Seda", 10,"B18" );
        student1.schoolName="Harvard"; // we can reassign he school name
        System.out.println(student1);

        CybertekStudents student2=new CybertekStudents("Judy",5, "B18");
    }



}
