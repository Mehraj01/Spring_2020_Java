package day47_Abstraction;
//abstraction: hiding implementation details
//abstract method: a method without the body
//				 a method that's meant to be override (cannot private, static, final)

import java.io.FileReader;

//THERE ARE ONLY TOW WAYS TO ACHIEVE ABSTRACTION:
       // 1. ABSTRACT CLASS
        //2. INTERFACE
public abstract class RemoteWebDriver {

    protected abstract void get(String URL);// we dont need body of the method// Method body hidden
    public abstract void quit();
}

class ChromeDriver extends RemoteWebDriver{
    @Override
    public void get (String URL){
        System.out.println("Opening "+URL+" in Chrome Browser");

    }

    @Override
    public void quit(){// abstract method has to be overridden
        System.out.println("Closing the Chrome browser");

    }

}

class FirefoxDriver extends  RemoteWebDriver{
     @Override
    public void  get(String URL){
        System.out.println("Opening "+URL+" in Firefox Browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing the Firefox browser");

    }
}

class OperaDriver extends RemoteWebDriver{ // Shortcut of abstract method option hit enter ==> implementation method hit enter


    @Override
    protected void get(String URL) {
        System.out.println("Opening "+URL+" in opera Browser");

    }

    @Override
    public void quit() {
        System.out.println("Closing the Opera browser");
    }
}
class DiverObjects{

    public static void main(String[] args) {

       // String URL="https://www.google.com";
        ChromeDriver driver =new ChromeDriver();
        //driver.get(URL);
        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("========================");

        FirefoxDriver driver2=new FirefoxDriver();
        driver2.equals("https://www.google.com");
        driver2.quit();

        System.out.println("=============================");

        OperaDriver driver3=new OperaDriver();
        driver3.get("http://www.google.com");
        driver3.quit();



    }
}
