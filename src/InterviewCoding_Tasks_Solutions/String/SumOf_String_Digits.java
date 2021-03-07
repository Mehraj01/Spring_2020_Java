package InterviewCoding_Tasks_Solutions.String;

public class SumOf_String_Digits {
    public static void main(String[] args) {

        int a=sumOdDigit("55htkhkhet35356");

        System.out.println(a);


    }


    public static int sumOdDigit(String num){


        char[]arr=num.toCharArray();
        int result=0;


        for(char each: arr){
            if(Character.isDigit(each)){
                result+=Integer.parseInt(""+each);
                //result+=Integer.valueOf(""+each); //Integer.valueOf(each);
            }
        }



        /*
         int sum=0;
        for(int i=0; i<str.length(); i++){
          if(Character.isDigit(str.charAt(i))){
              sum+=Integer.valueOf(""+str.charAt(i));

          }


        }

         */





        return result;

    }
}
