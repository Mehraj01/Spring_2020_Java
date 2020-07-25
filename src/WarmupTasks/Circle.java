package WarmupTasks;

public class Circle {
    int radius;
    double pi;
    int diameter;
    public Circle(int radius){
        this.radius=radius;
        //this.pi=pi;
        //this.diameter=diameter;
    }
    public double area(){
        return radius*radius*3.14;
    }
    public double perimeter(){
        return (radius*2)*3.14;
    }
    public String toString(){
        return "Radius of the Circle: "+radius+", Diameter is: "+radius*2 +", Area of the circle: "+ area()+", Perimeter of the circle: "+perimeter();
    }
}
class CircleObjects{
    public static void main(String[] args) {
        Circle a=new Circle(10);
        System.out.println(a);
    }
}


