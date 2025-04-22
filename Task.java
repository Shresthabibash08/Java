

//Write a program to check whether a given number is positive, negative, or zero using if-else.

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number=sc.nextDouble();
        sc.close();
        if (number>0){
            System.out.println("Given number is positive");
        }
        else if(number<0){
            System.out.println("Given number is negative");
        }
        else{
            System.out.println("Given numbe is zero");
        }
    }
}