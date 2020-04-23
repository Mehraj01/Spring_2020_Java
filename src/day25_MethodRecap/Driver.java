package day25_MethodRecap;

public class Driver {
    public static void main(String[] args) {
        String str=getDriver1("chrome");// argument is amndatory
        System.out.println(str);
        String str2=getDriver2("firefox");
        System.out.println(str2);
        String str3=getDriver3("safari");
        System.out.println(str);
    }

    public static String getDriver1(String browserName){
        String result="";

        switch(browserName.toLowerCase()){
            case "chrome": result="Chrome Driver";
                break;
            case "firefox": result="FireFox Driver";
                break;
            case "safari": result="Safari Driver";
                break;
            case "opera": result="Opera Driver";
                break;
            case "edge": result="Edge Driver";
                break;
            default: result="Invalid Driver";
        }

        return result;
    }


    public static String getDriver2(String browserName ){
        browserName=browserName.toLowerCase();
        String result="";

        if(browserName.equals("chrome")){
            result="Chrome Driver";

        }else if(browserName.equals("firefox")){
            result="FireFox Driver";
        }else if(browserName.equals("safari")){
            result="Safari Driver";
        }else if(browserName.equals("opera")) {
            result = "Opera Driver";
        }else if(browserName.equals("edge")){
            result="Edge Driver";
        }else{
            result="Invalid Driver";
        }

        return result;
    }

    public static String getDriver3(String browserName){
        // :()? ==> else if, : ==> else, ()? ==> if
        browserName=browserName.toLowerCase();

        String result=(browserName.equals("chrome"))?"Chrome Driver":(browserName.equals("firefox"))?"FireFox Driver"
                :(browserName.equals("opera"))?"Opera Driver":(browserName.equals("safari"))?"Safari Driver"
                :(browserName.equals("edge"))?"Edge Driver":"Invalid";

        return result;
    }




}
