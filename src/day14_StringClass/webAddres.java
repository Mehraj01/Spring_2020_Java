package day14_StringClass;

public class webAddres {
    public static void main(String[] args) {
        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov

         */

        String web="www.amazon.com";
        web=web.toLowerCase();

        boolean validEnding=web.endsWith(".com")||web.endsWith(".edu")||web.endsWith(".gov")||web.endsWith(".net");

        if(web.startsWith("www.")&& validEnding){
            System.out.println("Valid Address");
        }else{
            System.out.println("Invalid Address");
        }





        //if(web.startsWith("www.")&&web.endsWith(".com, .edu, .net, .Gov"));
            //System.out.println("Valid");



    }
}
