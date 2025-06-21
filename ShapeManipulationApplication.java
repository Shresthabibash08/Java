package Polymorphism;

abstract class Shape{
    public abstract void resizing(double factor);
    public abstract void rotation(double angle);
}

class Circles extends Shape{

    private double radius;
    private double currentAngle;
    public Circles(double radius){
        this.radius=radius;
    }
    @Override
    public void resizing(double factor) {
        radius *=factor;
        System.out.println("The new radius is :"+radius);
    }

    @Override
    public void rotation(double angle) {
        currentAngle +=angle;
        System.out.println("The current angle is :"+currentAngle);
    }

}

class Squares extends Shape{

    private double length;
    private double currentAngle=0;

    public Squares(double length){
        this.length=length;
    }

    @Override
    public void resizing(double factor) {
        length *=factor;
        System.out.println("The new lenght is :"+length);
    }

    @Override
    public void rotation(double angle) {
        currentAngle+=angle;
        System.out.println("The new current angle is :"+currentAngle);
    }

}

class Triangles extends Shape{

    private double length;
    private double breadth;
    private double currentAngle;

    public Triangles(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void resizing(double factor) {
        length *=factor;
        length *=factor;
        System.out.println("The current lenght is "+length+" and current breadth is "+breadth);
    }

    @Override
    public void rotation(double angle) {
        currentAngle +=angle;
        System.out.println("The current angle is "+currentAngle);
    }

}
public class ShapeManipulationApplication {
    public static void main(String[]args){
        Circles circle=new Circles(5);
        circle.resizing(10);
        circle.rotation(80);
    }
}
