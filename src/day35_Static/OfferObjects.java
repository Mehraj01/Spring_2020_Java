package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("VA", "BOFA", 100000, true);
       // System.out.println(offer1);

        Offer offer2=new Offer();
        offer2.setInfo("KY","CapitalOne", 120000, false);
        //System.out.println(offer2);

        Offer offer3=new Offer();
        offer3.setInfo("MD", "Chase", 95000, true);

        Offer offer4 =new Offer();
        offer4.setInfo("BayArea", "Google", 115000, false);

        String myLocation="VA";

        Offer[]offers={offer1, offer2, offer3, offer4};
        ArrayList<Offer> Accept=new ArrayList<>(Arrays.asList(offers));
        System.out.println(Accept.size());// gives Us size of ArrayList: 4


        Accept.removeIf((R->R.salary<100000 || !R.isFulltime || !R.location.equals(myLocation) )); // if salary greater than 100K
        //R.isFulltime ==> default its true it will be print true if condition is false it will print false
        //R.isFulltime ==false, !R.isFulltime
        System.out.println(Accept.size());



        for(Offer each: Accept){
            System.out.println(each);
        }






    }
}
