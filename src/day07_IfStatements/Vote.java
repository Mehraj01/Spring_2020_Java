package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

        int age=18;
        boolean UScitizen=true;
        boolean likeDonald=true;

        boolean eligible= age>=18 && UScitizen==true;

        if(eligible==true){
            System.out.println("Youre eligible to vote");
        }
        if(eligible==false){
            System.out.println("Your are note eligible to vote");

        }

        int a=10;
        int b=20;
        int c=3;
        //c+=a;
       // System.out.println(c);
        a*=b;
        System.out.println(a);
        b%=c;
        System.out.println(b+"\tHello World");


    }
}
