package SELF_PRACTICE.Replit_Practice;

public class Replit164_MethodWithReturn {
    public static void main(String[] args) {

        boolean book=simpleRoomBook(true,7,2,2018);
        System.out.println(book);

    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        if (isAvailable ==true) {
            if(year==2018 ){
                if(month==7 && day>=1 && day<=8 ){
                    return false;
                }else{
                    return true;
                }
            }else{
                return false;
            }

        }else {
            return false;

        }

    }

}
