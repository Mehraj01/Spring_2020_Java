package day51_Recap;
/*
1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
    4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
    5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
    6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
    Note:   Volume of Cylinder = PI * radius * radius * height
            Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
            Perimeter of Cylinder = 2 * (PI * diameter + height)
            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI

 */

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape {

    public String name;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();



}
//**********************************************************************************************************************
/*
 2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double

 */
interface Volume{

    boolean hasVolume=true;
    public double calculateVolume();

}
//**********************************************************************************************************************
/*
3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
 */
interface PI{

    double PI=3.14;
}

//**********************************************************************************************************************
/*
4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
 */
final class Circle extends Shape implements PI {

    public double radius;

    public Circle(double radius){ // constructor
        this.radius=radius;
        name="Circle";
    }




    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*PI;
    }
}

final class Cylinder extends Shape implements Volume, PI{
// 5 variables

    public double radius;
    public double height;


    public Cylinder(double radius, double height){// constructor
        this.radius=radius;
        this.height=height;
        name="Cylinder";

    }

    @Override
    public double calculateArea() {
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (PI * 2 * radius + height);
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }
}

class ShapesObjects{

    public static void main(String[] args) {

        Circle circle1=new Circle(3);
        Circle circle2=new Circle(5);

        Cylinder cylinder1=new Cylinder(3,5);
        Cylinder cylinder2=new Cylinder(3,5);

        // Polymorphism
        ArrayList<Shape>list=new ArrayList<>();// we can add circle and cylinder object to the list we use Shape as reference
        list.addAll(Arrays.asList(circle1,circle2, cylinder1, cylinder2));

        Shape shape1=circle1;// UpCasting, automatically done
        Shape shape2=new Cylinder(3,6);
        //shape2.calculateVolume();
        ((Cylinder)shape2).calculateVolume(); // down casting. Done manually


        for(Shape eachShape: list){
            System.out.println(eachShape.name+" : "+eachShape.calculateArea());
        }


        System.out.println("=========================================================================");


        // THERE HAS TO BE IS A RELATION BEFORE CASTING!!!!!

        //list.get(2).calculateVolume();// reference type is Shape, shape dose not have the

        double d=( (Cylinder)list.get(2)).calculateVolume();
        System.out.println(d);

        //((Cylinder)list.get(1)).calculateVolume();// XXXX should not be cats!!!! is A relation is a precondition of reference casting
        // circle cannot be reference by cylinder ==> gives ClassCastException

        Shape s1 = new Circle(6);
        //  System.out.println( s1.radius );
        System.out.println( ( (Circle) s1 ).radius ) ;


/*
       // Shape shape1 = circle1; // upcasting
        Shape shape2 = new Cylinder(3,6);
       // shape2.calculateVolume();
        (  (Cylinder)shape2 ).calculateVolume();  // down casting
 */


    }
}

