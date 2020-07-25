package WarmupTasks.Class_Objects;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setOfferInfo("SpaceX","Hawthorne HQ 1 Rocket Rd",100.000,true);

        Offer offer2=new Offer();
        offer2.setOfferInfo("Nasa","Houston, TX",130.000,true);

        Offer offer3=new Offer();
        offer3.setOfferInfo("SpaceX","Hawthorne HQ 1 Rocket Rd",89.000,true);

        Offer offer4=new Offer();
        offer4.setOfferInfo("BOFA","Brooklyn, NY",110.000,false);

        Offer offer5=new Offer();
        offer5.setOfferInfo("CapitalOne","Dallas, TX",100.000,false);


        ArrayList<Offer>list=new ArrayList<>(Arrays.asList(offer1,offer2,offer3, offer4,offer5));


        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("***********************************************************************************");

        for(int k=0; k<list.size(); k++){
            if(list.get(k).isFullTime && list.get(k).salary>=100.000 && list.get(k).location.contains("TX")){
                System.out.println(list.get(k));
            }

        }

    }
}
