package day23_Methods;

public class Methods {
    public static void main(String[]args){
        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Barch18");
        printHello5();
        System.out.println("=======================================");
        evenNum1_100();
        oddNum1_100();

    }

    public static void printHello5(){
        for(int i=0; i<2; i++){
            System.out.println("Hello World");
        }

    }

    public static void evenNum1_100(){

        for(int i =0; i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void oddNum1_100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }




    }
