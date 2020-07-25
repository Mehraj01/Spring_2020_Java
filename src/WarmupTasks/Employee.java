package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    int salary;
    char gender;

    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle, int salary,char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }

    public String toString(){
        return "Name is: "+name+", ID number is: "+id+", SSN is: "+ssn+", Position: "+jobTitle+", Salary with manat: "+salary+", Gender: "+gender;
    }

}

class HumanResources{

    static Employee worker1=new Employee();
    static Employee worker2=new Employee();
    static Employee worker3=new Employee();
    static Employee worker4=new Employee();
    static Employee worker5=new Employee();


    static{

        worker1.setEmployeeInfo("Aygun", 1234, 1234567, "Accounter", 50000,'F');
        worker2.setEmployeeInfo("Leyla", 5678, 4567897,"Audit Manager",70000, 'F');
        worker3.setEmployeeInfo("Selcan", 2344, 4544865, "Collector", 40000,'F' );
        worker4.setEmployeeInfo("Mete", 3345, 3928374, "Credit Analyst", 50000, 'M');
        worker5.setEmployeeInfo("Altay", 6768, 4548496, "Investment Planner", 55000, 'M' );

    }



        }

 class BankOfAzerbaijan{
     public static void main(String[] args) {

         ArrayList<Employee>workers=new ArrayList<>(Arrays.asList(HumanResources.worker2, HumanResources.worker4));


         for(Employee each:workers){
             System.out.println(each);
         }

     }

 }



