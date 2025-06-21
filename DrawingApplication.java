package Polymorphism;

class Shape{
    public void area(double radius){
        System.out.println( "The area of circle is "+(Math.PI*radius*radius));
    }
    public void area(double length,double breadth){
        System.out.println("The area of rectangle is "+length*breadth);
    }
    public void area(double a,double b, double c){
        double s=a+b+c;
        System.out.println("The area of triangle is "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}


public class DrawingApplication {
    public static void main(String[]args){
        Shape shape=new Shape();
        shape.area(5);
        shape.area(10,20);
        shape.area(5,6,7);
    }
}
