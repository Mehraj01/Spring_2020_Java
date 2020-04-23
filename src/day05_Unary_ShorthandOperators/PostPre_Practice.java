package day05_Unary_ShorthandOperators;

public class PostPre_Practice {

    public static void main(String[] args) {

         int a = 50;
                a = --a +  a++  +  a--  + a++;
                // a =  49  +  49   +  50  + 49  = 197

                System.out.println(a);  // 197

                System.out.println( ++a );  // 198

                System.out.println( a++ );  // 198
                System.out.println( a ); // 199


            int b =1;
              b  =  -b--  + b++  / -b--  * --b;
              //  -1   +  0  / - 1   *  -1
                // -1 + 0 * -1
                //  -1 + 0 = -1
         /* -a--; => -1 ; because a=1 and "-" negates it. but post "--" means next a = 1-1=0
         a++; => 0 ; "++" means next a increases by 1.
         -a--; => -1; a=0+1=1 and "-" negates it. But post "--" means next a is going to be reduced by 1, making a=0 for the next step        System.out.println(b);
         --a; => -1; because pre "--" means reducing by 1 immediately. thus a=0-1=-1

          */













































    }
}
