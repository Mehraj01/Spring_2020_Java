package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int a=100;
        /*boolean zero=a==0;
        boolean negative=a<0;
        boolean positive=a>0;
        if(zero){
            System.out.println("zero");
        }else if(negative){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }

         */
        if(a==0){
            System.out.println("zero");

        }else if(a>0){
            System.out.println("positive");

        }else{
            System.out.println("negative");

        }


    }
}
