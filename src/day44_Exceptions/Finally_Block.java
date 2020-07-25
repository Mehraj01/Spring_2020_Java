package day44_Exceptions;

public class Finally_Block {
    public static void main(String[] args) {

      //finally block always get executed

        try{
            System.out.println(9/0);
            System.out.println("try Block");

        }catch(Exception e){
            System.out.println("Catch Block");
        }finally{
            System.out.println("Finally");
        }




    }
}
