package day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for(int i=1; i<=5;i++){ // 1,2,3,4,5
//            if(i==3){ // if first condition is true ==> it will check condition and print the statement
//                break;
//            }
            System.out.println("Hello World");
            //break;
            if(i==3){// if first condition is true ==> it will 1st check print statement and
                    // after execute the if statement
                break;
            }
        }


        for(char i='a'; i<='z'; i++){
            if(i=='e'){// execute a, b, d when we use if before the print statement
                break;
            }
            System.out.println(i);
//            if(i=='e'){// execute a, b, d, e when we use print statement before the if statement
//                break;
//            }



        }







    }
}
