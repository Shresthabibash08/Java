package Inheritance;

public class Shape {
    protected double length;
    protected double breadth;
    protected double radius;
    public Shape(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Shape(double radius){
        this.radius=radius;
    }
    public void calculateAreaRectangle(){
        double area=length*breadth;
        System.out.println("The area of rectangle is"+area);
    }
    public void calculateAreaCircle(){
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("The area of circle is"+area);
    }
    

}
class Rectangles extends Shape{
    Rectangles(double length,double breadth){
        super(length,breadth);
    }
    public void perimeter(){
        double perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is"+perimeter);
}
}
class Circless extends Shape{
    public Circless(double radius) {
        super(radius);
        
    }
    public void perimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of circle is"+perimeter);
}
}
class Calcualtion{
    public static void main(String[]args){
        Rectangles rect=new Rectangles(10,20);
        rect.calculateAreaRectangle();
        rect.perimeter();
        Circless circle=new Circless(15);
        circle.calculateAreaCircle();
        circle.perimeter();

    }
}