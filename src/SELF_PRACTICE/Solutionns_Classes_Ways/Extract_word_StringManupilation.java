package SELF_PRACTICE.Solutionns_Classes_Ways;

public class Extract_word_StringManupilation {
    public static void main(String[] args) {

        //indexOf method.

        String address="7925 Jones Branch Dr, Mclean, VA 22003";
        int begin=address.indexOf(",")+2;
        int end=address.indexOf(", V");

        String cityName=address.substring(begin,end);
        System.out.println(cityName);

        System.out.println("======================================");

        String email="random.email@gmail.com";
        int begin1=email.indexOf("@")+1;
        //int end1=email.indexOf(".com");
        int end1=email.lastIndexOf("."); // we can use lastIndexOf() method for to find last index number

        String emailType=email.substring(begin1, end1);
        System.out.println(emailType);



    }
}
