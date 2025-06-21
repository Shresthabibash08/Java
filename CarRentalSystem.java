package Polymorphism;

abstract class Vehicle{
    public abstract double TotalRentalCost(int days);
}

class Car extends Vehicle{

    @Override
    public double TotalRentalCost(int days) {
        return 2000*days;
    }

}

class Motorcycles extends Vehicle{

    @Override
    public double TotalRentalCost(int days) {
        return 1000*days;
    }

}

class Bicycles extends Vehicle{

    @Override
    public double TotalRentalCost(int days) {
        return 500*days;
    }

}


public class CarRentalSystem {
    public static void main(String[]args){
        Car car=new Car();
        System.out.println("The total cost for car is Rs"+car.TotalRentalCost(5));
        Motorcycles motorcycles=new Motorcycles();
        System.out.println("The total cost for motorcycle is Rs"+motorcycles.TotalRentalCost(4));
        Bicycles bicycles=new Bicycles();
        System.out.println("The total cost for bicycles is Rs"+bicycles.TotalRentalCost(3));
    }
}
