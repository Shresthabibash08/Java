package Polymorphism;

class Geometry{
    public double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public double calculateArea(double lenght,double breadth){
        return lenght*breadth;
    }

    public double calculateArea(double length,double breadth, boolean type){
        if(type){
            return 0.5*length*breadth;
        }
        else{
            return length*breadth;
        }
    }
}

public class GeometryApplication {
    public static void main(String[]args){
        Geometry geometry=new Geometry();
        System.out.println("The area of circle is "+geometry.calculateArea(5));
    }
}


