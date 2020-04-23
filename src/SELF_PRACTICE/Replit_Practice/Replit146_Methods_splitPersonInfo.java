package SELF_PRACTICE.Replit_Practice;
import java.util.Arrays;
import java.util.Scanner;

/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
 */
public class Replit146_Methods_splitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        String  [] words=info.split(",");
        String name="person name: "+words[0];
        String lastName=" last name: "+words[1];
        String age=" age: "+words[2];
        System.out.println(name+lastName+age);




        //your code here


    }//end person

}
