package Inheritance;

public class Vehicle {
    public void startEngine() {
        System.out.println("Engine is started");
    }

    public void stopEngine() {
        System.out.println("Engine is stopped!!"); 
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driven");
    }
}

class Bike extends Vehicle {
    public void ride() {
        System.out.println("Ride the bike");
    }
}

class Implementations {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();

        Bike bike = new Bike();
        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}
