package WarmupTasks;

public class SalaryCalculater {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double fedralTaxRate;

    public SalaryCalculater(double hourlyRate, int weeklyHours, double stateTaxRate, double fedralTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=stateTaxRate;
        this.fedralTaxRate=fedralTaxRate;
    }

    public double salary(){

        return hourlyRate*weeklyHours;
    }

    public double salaryAftertax(){

        return salary()-(salary()*stateTaxRate+(salary()*fedralTaxRate));
    }
    public double stateTax(){
       return salary()*stateTaxRate;
    }
    public double federalTax(){

      return salary()*fedralTaxRate;

    }

    public String toString(){
        return "Hourly rate is: "+hourlyRate+", Weekly hours: "+weeklyHours+" Salary: "+salary();
    }

}

class SalaryObject{
public static void main(String[] args) {
    SalaryCalculater salary1 = new SalaryCalculater(65,40,0.4,0.22);
        System.out.println(salary1);
        System.out.println("State Tax "+salary1.stateTax());
        System.out.println("Federal Tax "+salary1.federalTax());
        System.out.println("Salary after tax "+salary1.salaryAftertax());
        }
        }

