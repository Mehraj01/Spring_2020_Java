package WarmupTasks.Class_Objects;
/*
Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers
create a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
 */

public class Offer {
    String company;
    String location;
    double salary;
    boolean isFullTime;


    public void setOfferInfo( String company,String location, double salary, boolean isFullTime){
        this.company=company;
        this.location=location;
        this.salary=salary;
        this.isFullTime=isFullTime;
    }

    public String toString(){
        return "Name of the company: "+company+", Location: "+location+", Salary "+salary+", FullTime: "+isFullTime;
    }


}
