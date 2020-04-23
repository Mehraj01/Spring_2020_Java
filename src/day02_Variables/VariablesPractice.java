package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {

        /*
        salary, Federaltax Staterate, loan, ssn.
         */

        int salary=120000;
        double federalTax=0.18;
        float stateTax=0.065f;
        //salary after tax=salary(1-sum of taxes)

        double sumTaxes=federalTax+stateTax;
        double salaryAfterTax=salary*(1-sumTaxes);
        System.out.println(salaryAfterTax);


        //area of the circle=r*r*pi

        double r=5.5;
        double area=r*r*3.14;
        System.out.println(area);


        double kg=90;
        double pound=kg*2.25;
        System.out.println(pound);


        double lira=1000;
        double liraDollar=lira*6.15;
        System.out.println(liraDollar);

        double rupi=1000;
        double rupiInDollar=rupi*0.014;
        System.out.println(rupiInDollar);


        double liter=10000;
        double galons=liter/3.7;
        System.out.println(galons);

        double manat=100;
        double dollar=manat*0.59;
        System.out.println(dollar);








    }
}
