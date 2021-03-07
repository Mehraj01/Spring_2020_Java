package InterviewCoding_Tasks_Solutions.Numbers;

public class PasswordValidation {
    public static void main(String[] args) {

        String password="Hello1*";
        System.out.println(PasswordValidation(password));

    }


    public static boolean PasswordValidation(String password) {


        boolean hasLower=password.matches(".*[a-z].*");
        boolean hasUpper=password.matches(".*[A-Z].*");
        boolean hasDigits=password.matches(".*[0-9].*");
        boolean hasSpecialChars=password.matches(".*[-/,*:-@].*");

        boolean valid =false;
        if(password.length()>=6 && !password.contains(" ")){
            if(hasLower && hasUpper && hasDigits && hasSpecialChars){
                valid=true;
            }
        }


        return valid;
    }


}
