package MyOwnLibrary.Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

/*
TASK  01 :
		create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
		create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
		create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
		create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
		create a class called company:
					create 3 objects of employee and set their info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
//********************************************************************************************************************
public class Person {
    public String name;
    public int age;
    public char gender;

    public void setPersonInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    public void eat(){
        System.out.println(name+" is eating meal");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void walk(){
        System.out.println(name+" walking");
    }
}

//********************************************************************************************************************
// IS A Relation between Person class
class Employeee extends Person {

    public double salary;
    public long employeeID;
    public String jobTitle;

    public void setEmployeeInfo(String name,int age,char gender,double salary, long employeeID, String jobTitle){
        setPersonInfo(name, age, gender);// calling the setInfo method from the Person class
        this.salary=salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }

    public void work(){
        System.out.println(name+" is working");
    }
    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+employeeID+", Salary: "+salary+", age: "+age+", gender: "+gender;
    }

}

//********************************************************************************************************************
// IS A Relation between Person class but NO relation with between employee class
class Student extends Person {

    public long studentID;
    public String clazz;
    public static String schoolName="Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz) {
        setPersonInfo(name, age, gender);
        this.studentID=studentID;
        this.clazz=clazz;
    }
    public void attendClass(){
        System.out.println(name+" is attending int the "+ clazz);
    }
    public void code(){
        System.out.println(name+" is coding");
    }
    public String toString(){
        return "Name: "+name+", ID: "+studentID+",  age: "+age+", gender: "+gender+", class: "+clazz;
    }

}
//********************************************************************************************************************

class School{
    public static void main(String[] args) {
        /*
        create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
         */


        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();

     // To get the info about the students on the console we have set the information about the students otherwise we will get zero
        student1.setStudentInfo( "bahtiyar", 35,'M',2345,"testing");
        student2.setStudentInfo( "abide", 32,'F',2378,"art" );
        student3.setStudentInfo( "byakl", 10,'M',2309,"soccer");

        ArrayList<Student>studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(student1, student2, student3));

        for(Student each:studentList ){
           // System.out.println(each);// if we created toString method it will print it to the console
            System.out.println("name "+each.name+", ID: "+each.studentID);
        }

    }
}
//********************************************************************************************************************

class Company{

    public static Employeee employee1; // static because it belong for each employee
    public static Employeee employee2;
    public static Employeee employee3;

    static{
        employee1=new Employeee();
        employee1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"FullTime");

        employee2=new Employeee();
        employee2.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"FullTime");

        employee3=new Employeee();
        employee3.setEmployeeInfo("Safar", 25, 'M', 128_000, 6599,"FullTime");
    }

    public static void main(String[] args) {
        Employeee[]employees={employee1, employee2, employee3};

        for(int i=0; i<employees.length; i++){
           // System.out.println(employees[i]);// when we need all the info from toSting method
            System.out.println("Name "+employees[i].name+", ID"+employees[i].employeeID);// when just nee name and ID
        }


    }
}
//********************************************************************************************************************