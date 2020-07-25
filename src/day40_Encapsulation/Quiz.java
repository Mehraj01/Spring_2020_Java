package day40_Encapsulation;

public class Quiz {

    public Quiz(){
        System.out.print("A ");
    }

    public Quiz(int a){ // A C B
        this(2.5); // A C
        System.out.print("B "); // B
    }

    public Quiz(double a){  // A C
        this(); //A
        System.out.print("C "); //C
    }


    public static void main(String[] args) {
        Quiz obj = new Quiz(100);
    }
}
