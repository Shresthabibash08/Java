package Inheritance;

class Vehicle{
    //Methods 
    public void drive(){
        System.out.println("Drive the vehicle");
    }
}
class Car extends Vehicle{
    private String carName;
    private String carNumber;
    private String carModel;
    private String carColor;

    //Constructor
    public Car(String carName,String carNumber,String carModel,String carColor){
        this.carName=carName;
        this.carNumber=carNumber;
        this.carModel=carModel;
        this.carColor=carColor;
    }
    //Methods
    public void display(){
        System.out.println("Car Name:"+carName+" Car Model: "+carModel+" Car Number: "+carNumber+" Car Color: "+carColor);
    }
}
public class Vehicles {
    public static void main(String[] args){
        Car car1=new Car("Lambo","1244H","124745A","Black");
        car1.display();
        car1.drive();
    }
}
