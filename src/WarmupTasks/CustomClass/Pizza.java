package WarmupTasks.CustomClass;
/*
1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						: allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping,
						and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

 */
public class Pizza {

    String size;
    int numCheese;
    int numPepperoni;

    public void customizeOrder(String dimension, int cheese, int pepperoni){

        size=dimension;
        numCheese=cheese;
        numPepperoni=pepperoni;
    }


    public double calcCost(){

        if(size.equals("Small")){
            return 10+1.50*numPepperoni+1*numCheese;
        }else if(size.equals("Medium")){
            return 12+1.50*numPepperoni+1*numCheese;
        }else{
            return 14+1.50*numPepperoni+1*numCheese;
        }


    }

    public String toString(){

        return size+" pizza, pls add "+numCheese+" cheese add "+numPepperoni+" pepperoni"+ "\nTotal price is "+calcCost();

    }





}
