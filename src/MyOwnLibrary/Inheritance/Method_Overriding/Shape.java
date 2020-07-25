// Method overriding is has to happen in sub class !!!!!
// Method overriding same method name same parameter, and same return type
// Method Overriding method access modifier has to be same or more visible
// ( public, portered ) works with all overriding but if u use differed access modifier it has to be same
//@Override => Is method overridden or not
// has to be visible to sub class
// Only instance method can be overridden

package MyOwnLibrary.Inheritance.Method_Overriding;
/*
Task:
1. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */
public class Shape { // Super class

    public double area;
    public double perimeter;

    public void calculateArea(){ // MethodOverriding
        area=0;
        System.out.println("Area of the shape:  "+area);
    }

    public void calculatePerimeter(){// MethodOverriding.
        perimeter=0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class Circle extends Shape { // sub class of Shape class

    public double radius;
    public static double Pi=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    public void calculateArea(){ // MethodOverriding. Same Method we have in Shape Super class
        area=radius*radius*Pi;
        System.out.println("Area of the circle:  "+area);
    }

    public void calculatePerimeter(){// MethodOverriding.
        perimeter=radius*2*Pi;
        System.out.println("Perimeter of the circle: "+perimeter);
    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class ShapeObjects{

    public static void main(String[] args) {

        // calculateArea, calculatePerimeter

        Circle circle1=new Circle(3);
        System.out.println(circle1.radius);

        circle1.calculateArea();// suppose to be Pi * r * r
        circle1.calculatePerimeter();// r * 2 * Pi


        System.out.println("********************************************");


        Rectangle rec1=new Rectangle(3,2);

        System.out.println(rec1.length);// test length
        System.out.println(rec1.width);// test width

        rec1.calculateArea();// suppose to be: w * l
        rec1.calculatePerimeter();


        System.out.println("********************************************");

        Square sq1=new Square(3);

        System.out.println(sq1.side);
        sq1.calculateArea(); // supposed to be side * side
        sq1.calculatePerimeter();



    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class Rectangle extends Shape { // sub class of Shape class

    /*
      Inherited :
      - area, perimeter
      - calculateArea(), calculatePerimeter()
     */

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length=length;
        this. width=width;
    }

    public void calculateArea(){ // MethodOverriding
        area=length*width;
        System.out.println("Area of the rectangle:  "+area);
    }

    public void calculatePerimeter(){// MethodOverriding.
        perimeter=2*(length*width);
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

class Square extends Shape {
    public double side;

    public Square(double side){
        this.side=side;
    }

    public void calculateArea(){ // MethodOverriding
        area=side*side;
        System.out.println("Area of the square:  "+area);
    }

    public void calculatePerimeter(){// MethodOverriding.
        perimeter=side*4;
        System.out.println("Perimeter of the square: "+perimeter);
    }

}








