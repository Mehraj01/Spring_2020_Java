package day14_StringClass;

import java.util.Scanner;

/*
        valid credentials are:
            username: cybertek
            password: cybertekschool

 precondition:      username and password cannot be empy
                    if they are empty ==> please enter the credentials

        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */
public class Credentials2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.nextLine();

        System.out.println("Enter your password");
        String inputPassWord = input.nextLine();

        boolean login=inputUsername.equals("Cybertek")&&inputPassWord.equals("School");
                       //user  entered both valid username and password
        boolean invaliduser=!inputUsername.equals("Cybertek")&&inputPassWord.equals("School");
                           // user enetered invalid user and valid password
        boolean invalidpassword=inputUsername.equals("Cybertek")&& !inputPassWord.equals("School");
                            //user name is valid and password is invalid


        if(!inputUsername.isEmpty() && !inputPassWord.isEmpty()){// username and password are not empty
            if(login){
                System.out.println("Logged In");
            }else if(invaliduser){
                System.out.println("Password is correct and username is incorrect");
            }else if(invalidpassword){
                System.out.println("Username is correct and password is incorrect");
            }else{
                System.out.println("Both username and password is incorrect");
            }
        }else{// username and password are empty
            System.out.println("Please enter the credentials");
        }





    }
}
