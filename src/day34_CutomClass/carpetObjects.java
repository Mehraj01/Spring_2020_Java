package day34_CutomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {


        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        carpets[0].CustomOrder(7,8.5,20,true);
        carpets[1].CustomOrder(10,15,30,false);
        carpets[2].CustomOrder(9,20,15,true);
        carpets[3].CustomOrder(20,18,25,false);
        carpets[4].CustomOrder(20,4.5,35,true);

       // System.out.println(carpets[0]);

        ArrayList<Carpet>persianCarpets=new ArrayList<>();

        for(Carpet each: carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }
        }
        System.out.println("there are "+persianCarpets.size()+" persian carpets");
        System.out.println(persianCarpets.get(0));

        System.out.println(persianCarpets.get(0).calcCost());// calculate total price
        System.out.println(persianCarpets.get(1).calcCost());



        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
        regularCarpets.removeAll(persianCarpets);

        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for(int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calcCost());
        }







    }
}
