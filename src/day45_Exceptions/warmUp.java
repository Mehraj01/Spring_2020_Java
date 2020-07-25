package day45_Exceptions;

public class warmUp {
    public static void main(String[] args) {


        int pushups=0;
        while(pushups<5){
            System.out.println("PushUp "+(pushups+1));

            try{
                Thread.sleep(300);
            }catch(Exception e){}
                pushups++;

            }// while loop braces





        }
    }

