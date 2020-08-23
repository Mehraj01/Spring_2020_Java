package day40_Encapsulation;

public class CredintialsObject {
    public static void main(String[] args) {

        Credentials AnnaFacebook = new Credentials();

        AnnaFacebook.setUserName("A.paulura");
        AnnaFacebook.setPassWord("12345667");

        System.out.println( AnnaFacebook.getUserName() );
        System.out.println( AnnaFacebook.getPassWord() );




    }

}
