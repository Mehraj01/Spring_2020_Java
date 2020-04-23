package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num=100;
        String result="";

        if(num%2==0){
            result="even";
        }else {
            result = "odd";
        }
        // if statement is only returning value and assigning it to variable then we can use ternary
        // in ternary: ? means the if, :else keyword

        String result2=(num%2==0)? "Even" : "Odd";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("=====================================================================");

        int num1=100;
        int num2=200;
        int max=0;

        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }

        int max2=(num1>num2)? num1 :num2;

        System.out.println(max);
        System.out.println(max2);

        String str="";
        if(true){
            str="hello";
        }else{
            str="Hola";
        }

        System.out.println(str);

        String str2=(true)?"hello" :"hola";
        System.out.println(str2);

    }
}
