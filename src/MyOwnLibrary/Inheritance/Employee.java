package MyOwnLibrary.Inheritance;
/*
creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString()
	create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */

public class Employee {

    public double salary;
    public String name;
    public int id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Salary: "+salary+", Person Name is: "+name+", ID Number: "+id+", Job Title: "+jobTitle+", Geder is: "+gender;
    }

}

//********************************************************************************************************************

class Tester extends Employee {

    /*
    salary-inherited
    name- inherited
    id -inherited
    jobtitle-inherited
    char-inherited
    toString()

    reportingBug()
    testing()

     */

    public void reportingBug(){
        System.out.println(name+" Reporting the bugs");
    }
    public void testing(){
        System.out.println(name+" Testing the software");
    }


    // Contractor cant call from parent class because each constructor name is different
    public Tester(String name, String jobtitle, int id, char gender,double salary ){
        this.name=name;
        this.jobTitle=jobtitle;
        this.id=id;
        this.gender=gender;
        this.salary=salary;
    }

}

//********************************************************************************************************************
class Developer extends Employee {

     /*
    salary-inherited
    name- inherited
    id -inherited
    jobtitle-inherited
    char-inherited
    toString()

    fixingbug()
    coding()
     */


    public void fixingBug(){
        System.out.println(jobTitle+" Fixing the bugs");
    }
    public void coding(){
        System.out.println(jobTitle+" Building the software");
    }

    public Developer(String name, String jobtitle, int id, char gender, double salary){
        this.name=name;
        this.jobTitle=jobtitle;
        this.id=id;
        this.gender=gender;
        this.salary=salary;
    }

}

//********************************************************************************************************************
class BusinessAnalyst extends Employee {

     /*
    salary-inherited
    name- inherited
    id -inherited
    jobtitle-inherited
    char-inherited
    toString()

    writingRequirements()()
    gathering()
     */

    public void writingRequirements(){
        System.out.println(jobTitle+" Writing the requirements");
    }
    public void gathering(){
        System.out.println(jobTitle+" Gathering the information");
    }

    public BusinessAnalyst(String name, String jobtitle, int id, char gender, double salary ){
        this.name=name;
        this.jobTitle=jobtitle;
        this.id=id;
        this.gender=gender;
        this.salary=salary;


    }
}

//********************************************************************************************************************
class EmployeeObjects{

    public static void main(String[] args) {

        Developer dev1=new Developer("Muhtar", "Software Developer", 123,'M', 150000 );
        System.out.println(dev1);
        dev1.fixingBug();
        dev1.coding();

        Tester tester1=new Tester("Sada", "SDET", 12345, 'F', 150000);
        System.out.println(tester1);
        tester1.reportingBug();
        tester1.testing();



    }
}

