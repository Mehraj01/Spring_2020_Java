package day05_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {

        //pre: It changes the value immediately

        int a=100;
        System.out.println(++a);// a=101
        System.out.println(a);// 101

        int b=100;
        System.out.println(--b);// b=99
        System.out.println(b);


        //Post: first passes current value,then eventually changes the variable' value

        int A=100;
        System.out.println(A++);// 100
        System.out.println(A);//101


        int B=100;
        System.out.println(B--);// it will print current value 100
        System.out.println(B);// It will decrase the value in the second line 99

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");


        //post & pro examples:
        int z=10;
        int x=++z;// at line 28, x is increased by 1
        System.out.println(x);
        System.out.println(z);

        int s=10;
        int f=s++;// 10, after line 34 the value if s will be increased bye 1
        System.out.println(f);//10'
        System.out.println(s);//11

        double t1=3.5;
        double t2=t1--;//3.5, after line 41, t1 will be decreased by 1

        System.out.println(t2);//3.5
        System.out.println(t1);//2.5














    }
}
