package Inheritance;

class Employee {
    //Private Attributes
    protected String empName;
    protected String empEmail;
    protected String address;
    protected String position;
    protected double salary;
    //Constructor
    public Employee(){

    }
    public Employee(String empName,String empEmail,String address,String position,double salary){
        this.empName=empName;
        this.empEmail=empEmail;
        this.address=address;
        this.position=position;
        this.salary=salary;
    }
    //Methods
    public void work(){
        System.out.println("You should work hard.");
    }
    public void getSalary(){
        System.out.println("Your salary is "+salary);
    }
}
class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is managing recruitment and employee relations...");
    }
}
class Implentation{
    public static void main(String[]args){
        Employee emp=new Employee("Bibash","bibash@gmail.com","Budhanilkantha","CEO",10000);
        HRManager hrManager=new HRManager();
        emp.getSalary();
        hrManager.work();

    }
}