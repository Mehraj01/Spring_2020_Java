package SELF_PRACTICE.Replit_Practice;
import java.util.Scanner;
public class Replit074_SMSmessage_StringMethods {
          /*
        We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
Sender:<Kuzzat Altay>. From Number:[703-333-2222]. Message:{Hello Everyone!}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();


        int sbegin=message.indexOf("<")+1;
        int send=message.indexOf(">");
        String sender=message.substring(sbegin,send);
        System.out.println("Sender: "+sender);

        int pbegin=message.indexOf("[")+1;
        int pend=message.indexOf("]");
        String phoneNumber=message.substring(pbegin,pend);
        System.out.println("Phone Number: "+phoneNumber);

        int mbegin=message.indexOf("{")+1;
        int mend=message.indexOf("}");
        String messageBody=message.substring(mbegin,mend);
        System.out.println("Message body: "+messageBody);




    }
}
