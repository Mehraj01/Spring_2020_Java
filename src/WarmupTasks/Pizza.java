package WarmupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    String size;
    int cheeseToppings;
    int pepperoniToppings;


    public Pizza(String size, int cheeseToppings, int pepperoniToppings){

       this.size=size;
       this.cheeseToppings=cheeseToppings;
       this.pepperoniToppings=pepperoniToppings;
    }


    public double calcCost(){

        if(size.equals("Small")){
            return 10+1.50*pepperoniToppings+1*cheeseToppings;
        }else if(size.equals("Medium")){
            return 12+1.50*pepperoniToppings+1*cheeseToppings;
        }else{
            return 14+1.50*pepperoniToppings+1*cheeseToppings;
        }

    }


    public String toString(){

        return "Size of Pizza: "+size+",Quantity of the cheese toppings: "+cheeseToppings+
                ", Quantity of the pepperoni toppings: "+pepperoniToppings+", Total Cost: "+calcCost();
    }

}

class Order{
    public static void main(String[] args) {

        Pizza pizza1=new Pizza("Medium", 5, 4);
        Pizza pizza2=new Pizza("Large", 4, 7);
        Pizza pizza3=new Pizza("Small", 3, 5);
        Pizza pizza4=new Pizza("Medium", 6, 4);
        Pizza pizza5=new Pizza("Small", 2, 3);


        ArrayList<Pizza> list=new ArrayList<>(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));

        double sum=0;
        for(Pizza each:list){
            System.out.println(each.calcCost()); //price of each pizza
            sum+=each.calcCost();// total price of pizzas
        }
        System.out.println(sum);//total price

    }

}
