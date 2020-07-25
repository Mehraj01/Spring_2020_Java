package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str="Cybertek";
        try{
            System.out.println(str.charAt(100));
        }catch(RuntimeException e){
            String description=e.getMessage();
            System.out.println(description); //String index out of range: 100
        }

        System.out.println("===================================");

        //String result="";
        try{
            System.out.println(100/0);
            System.out.println("try block");
        }catch(ArithmeticException e){
            String description=e.getMessage(); // optional. If you wanna get the description use e.getMessage(); method
            System.out.println("Catch block");
            //result=description;
            System.out.println(description);
// description is a local variable and we cant use it outside of the block
        }
       // System.out.println(result);
        System.out.println("Completed");


    }
}
