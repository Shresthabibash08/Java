package Polymorphism;

abstract class Menu{
    public abstract void preparation();
    public abstract void serving();
}

class Appetizers extends Menu{

    @Override
    public void preparation() {
        System.out.println(" Appetizers are prepared quickly using fresh ingredients.");
    }

    @Override
    public void serving() {
        System.out.println("Appetizers are served before the main course.");
    }

}

class MainCourse extends Menu{

    @Override
    public void preparation() {
        System.out.println("Main course is cooked with rich flavor.");
    }

    @Override
    public void serving() {
        System.out.println(" It is served hot with side dishes.");
    }

}

class Beverages extends Menu{

    @Override
    public void preparation() {
        System.out.println("Beverages are mixed, brewed, or chilled.");
    }

    @Override
    public void serving() {
        System.out.println("They are served cold or hot drinks.");
    }

}

public class ResturantOrderingSystem {
    public static void main(String[]args){
        Appetizers appetizers =new Appetizers();
        appetizers.preparation();
        appetizers.serving();
    }
}
