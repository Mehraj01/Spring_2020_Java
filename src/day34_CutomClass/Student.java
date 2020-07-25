package day34_CutomClass;

public class Student {

    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;


    public void setStudentInfo(String name, String nationality, int age,double gpa,char gender,boolean married ){
        this.name=name;
        this.nationality=nationality;
        this.age=age;
        this.gpa=gpa;
        this.gender=gender;
        this.married=married;
    }

    public String toString(){
        return "Name: "+name+", gender: "+gender+", nationality: "+nationality+", age:"+age+", is married: "+married;
    }


}
