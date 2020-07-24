package day18_Nested_Loop;

public class do_while_loop2 {
    public static void main(String[] args) {
        int number = 103;  // print the number between    100 ~ number

        while(number < 100){
            System.out.println(number);
            number--;
        }

        System.out.println(number);



        System.out.println("=====================================");

        int number2 = 103;

        do{
            System.out.println(number2);
            number2--;

        }while(number2 < 100);

    }
}
