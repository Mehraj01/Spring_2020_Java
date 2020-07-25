package day34_CutomClass;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create thier thier automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
 */
public class Tester {

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", employee id: "+employeeID+", salary: "+salary;
    }


}
