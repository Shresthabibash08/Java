//Take two numbers and an operator (+, -, *, /) and perform the operation using switch.

import java.util.Scanner;
public class Qn16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2=sc.nextDouble();
        System.out.println("Enter operator lkike +,-,*,/: ");
        char operator=sc.next().charAt(0);
        sc.close();
        switch (operator){
            case '+':
            double addition=num1+num2;
            System.out.println(addition);
            break;

            case '-':
            double subtraction=num1-num2;
            System.out.println(subtraction);
            break;

            case '*':
            double multiplication=num1*num2;
            System.out.println(multiplication);
            break;

            case '/':
            double division=num1/num2;
            System.out.println(division);
            break;

            default:
            System.out.println("Invalid operator!!");
            break;
        }
    }
}
