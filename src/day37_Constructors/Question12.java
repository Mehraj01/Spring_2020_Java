package day37_Constructors;

public class Question12 {
    static String name = "Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel");  // Daniel
    }

    public static void print(String str){
        System.out.println(str);
    }

    static{  // executed first
        print(name);  // Aaron
    }
}
