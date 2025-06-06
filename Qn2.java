//Take two numbers as input and print their sum, difference, product, and quotient.

import java.util.Scanner;
public class Qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        sc.close();
        int sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
        int difference=num1-num2;
        System.out.println("The difference of "+num1+" and "+num2+" is "+difference);
        double quotient=num1/num2;
        System.out.println("The quotient of "+num1+" and "+num2+" is "+quotient);
    }
}