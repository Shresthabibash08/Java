package Polymorphism;

class Employee{
    //Private attributes
    protected double salary;
    protected String name;

    //Controller
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    //Setter
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    //Getter
    public String getName(String name){
        return name;
    }
    public double getSalary(double salary){
        return salary;
    }

    //method
    public void calculateSalary(){
        System.out.println("Name="+name+" and salary="+salary);
    }
}

class Manager extends Employee{
    private double bonusPerformance;
    public Manager( String name,double salary,double bonusPerformance) {
        super(name,salary);
        this.bonusPerformance=bonusPerformance;
    }
    
    @Override
    public void calculateSalary(){
        System.out.println("Your salary after calculating perfomance is "+(salary+bonusPerformance));
    }


}

public class PayrollSystem {
    public static void main(String[]args){
        Employee emp=new Employee("Bibash",100000);
        emp.calculateSalary();
        Manager manager=new Manager("Bibash",100000,10000);
        manager.calculateSalary();

    }
}
