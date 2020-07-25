package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task04:
	create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){

        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }

    public double calCost(){

        return unitPrice*quantity;
    }

    public String toString(){
        return "Item name: "+name+", Item Quantity: "+quantity+", Item Price: "+unitPrice+", Total Coats: $"+calCost();
    }
}



class ShoppingList{
    public static void main(String[] args) {

        Item item1=new Item("Tomatoes ", 2.50, 3);
        Item item2=new Item("Blueberry", 4.00, 2);
        Item item3=new Item("Cabbage ", 2.00, 1);
        Item item4=new Item("Watermelon", 3.50, 1);
        Item item5=new Item("Salomon  ", 15.00, 1);

        ArrayList<Item>shoppingList=new ArrayList<>(Arrays.asList(item1,item2,item3,item4, item5));
       // shoppingList.addAll(Arrays.asList(item1,item2,item3,item4, item5)); // Bulk operation accepts only collection type
        double sum=0;
        for (Item each: shoppingList){
            System.out.println(each.calCost());// cost each item.
            sum+=each.calCost(); // total cost of the total items
        }
        System.out.println(sum);
    }
}
