package day21_MultiDimensional_Arrays;

public class Emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}; // 10

        for(String EachEmail : emails) {  // 10
            if(EachEmail.endsWith("@gmail.com")){
                continue;
            }
            //System.out.println(EachEmail);


           if (!EachEmail.endsWith("@gmail.com")) {
               System.out.println(EachEmail);
           }
        }




    }
}
