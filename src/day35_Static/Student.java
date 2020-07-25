package day35_Static;

public class Student {
    // instance variable===> each object has their own copy
    String name;
    int id;
    double gpa;

    static String school="Cybtertek";


    public  void setInfo(String name, int id, double gpa){// when we use any instance method cant be static.
        this.name=name;
        this.id=id;
        this.gpa=gpa;

    }

    public static void printSchoolName(){
        System.out.println("School name is "+school);
        System.out.println();

    }

    public String toString(){
        return "Name: "+name+", School Name: "+school+", ID: "+id+", GPA "+gpa;

        // we can use static variables inside the instance method but we cant use instance variable inside the static method
        // "school" ==> is a static variable in this case
    }

}
