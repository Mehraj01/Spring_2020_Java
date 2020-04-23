package day11_Scanner;
/*
3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */
public class Browsers {
    public static void main(String[] args) {


        String browser="Chrome";

        switch(browser){
            case "chrome":
            case "Chrome":
                System.out.println("Chrome opening");
                break;
            case "firefax":
            case "Firefax":
                System.out.println("Firefax is opening");
                break;
            case "Opera":
                System.out.println("Opera is opening");
                break;
            case "Safari":
                System.out.println("Opera opening");
                break;
            default:
                System.out.println("Invalid browser");


        }



    }
}
