package Polymorphism;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    } 
}




public class CalculatorApplication {
    public static void main(String[]args){
        Calculator calculator=new Calculator();
        System.out.println("The sum of given number is "+calculator.add(5,6));
    }
}
