package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){// i: 1 2 3 4 5
            if(i==3){
                continue;// skip the number
            }

            System.out.println(i);

        }

        for(int i=0; i<=20; i++){
            if(i%2!=0){
                continue; // skip all the odd numbers
            }
            /*
            if(i%2==0){ // skips all the even numbers
                continue;
            }
             */
            System.out.print(i+" ");
        }




    }
}
