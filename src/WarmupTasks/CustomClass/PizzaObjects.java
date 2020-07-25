package WarmupTasks.CustomClass;

import WarmupTasks.CustomClass.Pizza;

public class PizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1=new Pizza();
        pizza1.customizeOrder("large,", 5, 4 );
        System.out.println(pizza1);

    }


}
