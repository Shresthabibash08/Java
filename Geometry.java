package Inheritance;

class Shape{
    protected double length;
    protected double breadth;
    protected double radius;
    public Shape(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Shape(double radius){
        this.radius=radius;
    }
}
class Rectangle extends Shape{
    Rectangle(double length,double breadth){
        super(length,breadth);
    }
    public void areaRectangle(){
        double area=super.length *super.breadth;
        System.out.println("The area of rectangle is "+area);
    }
}
class Circles extends Shape{
    Circles(double radius){
        super(radius);
    }
    public void areaCircle(){
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("The area of circle is "+area);
    }

}
public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,14);
        rectangle.areaRectangle();
        Circles circle=new Circles(10);
        circle.areaCircle();
    } 
}
