package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {

        int number=100;
        char ch1=' ';

        if(number>0){
           ch1= '+';
        }else if(number<0){
            ch1='-';
        }else{
            ch1='0';
        }

        char ch2=(number>0)? '+':(number<0)?'-':'0';

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch1+ch2);

        System.out.println("===============================================================================");

        byte score=-10;
        String grade="";

        if(score>=90 && score <=100){
            grade ="A";
        }else if (score>=70 && score<80){
            grade="Great";
        } else if (score >= 70 && score < 80) {
            grade="Good";
        }else if(score>=60 && score<70){
            grade="pass";
        }else if(score>=60 && score>0){
            grade="failed";
        }else{
            grade="invalid";
        }
        System.out.println(grade);


        String grade2=(score>=90 && score <=100)?"A":(score>=70 && score<80)?"Great":(score>=60 && score<70)?
                      "Good":(score>=60 && score>0)?"failed":"invalid";

        System.out.println(grade2);

        System.out.println("=================================================================================");

        int num=1000;

        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        //   (num %2 ==0) ? System.out.println("Even number") : System.out.println("Odd number");

        // we can only apply ternary: if the if statement' body is only returning value and assigning it to variable then we can apply ternary




    }
}
