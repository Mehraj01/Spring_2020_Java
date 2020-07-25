package day46_final_abstract;

public abstract class Shape {

    abstract void Area(); // this method access modifier is default


}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


// This is the subclass of the Superclass(which is abstract in this case)==> has to override the abstract method of superclass.
//It is mandatory to override the abstract class method in the subclass
final class  Circle extends Shape{ // We have override the abstract class method in the non-abstract class.
    public double radius;
    public final static double PI=3.14;

    public Circle(double radius){// constructor
        this.radius=radius;
    }

   @Override
    void Area(){//abstract overridden // access modifier can be public default or protected
       double area=radius*radius*PI;
       System.out.println("Area is: "+area);

    }

}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


class Square extends Shape{

   public  double side;

   public Square(Double side){//constructor
       this.side=side;
   }
    @Override
   public void Area(){ //abstract overridden // access modifier can be public default or protected
       double area=side*side;
       System.out.println("Area is: "+area);

   }


}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width){ // constructor
        this.length=length;
        this.width=width;
    }
    @Override
    public void Area(){// abstract method (overridden)
        double area=length*width;
        System.out.println("Area of rectangle: "+area);

    }

}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class ShapeObjects{
    public static void main(String[] args) {

        Circle obj1=new Circle(3.5);
        obj1.Area();


        Square obj2=new Square((double) 4);
        obj2.Area();

        Rectangle obj3=new Rectangle(2,3);
        obj3.Area();




    }
}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
