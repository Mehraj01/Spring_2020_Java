package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        // skip printing B, J, H, H

        for(char ch='Z'; ch>='A';ch--){
            if(ch=='Y'|| ch=='H'|| ch=='J'|| ch=='D')
                continue;
            System.out.print(ch+" ");
        }


        System.out.println();

        for(int i=1; i<=100; i++){
            if(i%3==0 || i%5==0){ //
                continue; // skip
            }
            System.out.print(i+" ");
        }








    }
}
