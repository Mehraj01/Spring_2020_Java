package day05_Unary_ShorthandOperators;

public class IfStatmentPractice {
    public static void main(String[] args) {

        int a =100;
        int b = 200;

        if(a > b){ // false
            System.out.println(a+" is greater than "+b);
        }

        boolean bGreater = b > a;
        if(bGreater){
            System.out.println(b+" is greater than " + a );
        }


        if(a ==  b){
            System.out.println(a +" is equal to " + b );
        }

        System.out.println("==================================================");
        int x = 300;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;

       /* if(xGreater){
            System.out.println(x+" is gereater than "+y);
        }

        if(yGreater){
            System.out.println(y+" is greater than "+x);
        }

        */


        if(xGreater == false && yGreater == false){
            System.out.println(x+" is equal to "+y);
        }



        if(!xGreater  && !yGreater){
            System.out.println(x+" is equal to "+y);
        }


        //if(xGreater == yGreater){
           // System.out.println(x+" is equal to "+y);
        //}

        System.out.println("\n\nMy \nName \nIs \nMuhtar ");
        System.out.println("player = 7 \nhouse=10");












    }
}
