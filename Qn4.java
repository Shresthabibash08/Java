//Write a program that takes a number and checks if it is divisible by both 5 and 11.

import java.util.Scanner;
public class Qn4{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        sc.close();
        if(number%5==0){
            if(number%11==0){
                System.out.println("Given number "+number+" is divisible by both 5 and 11.");
            }
            else{
                System.out.println("Given number "+number+" is divisible by 5."); 
            }
        }
        else if(number%11==0){
            System.out.println("Given number "+number+" is divisible by 11.");
        }
        else{
            System.out.println("Given number "+number+" is neither divisible by 5 nor divisible by 11.");
        }
    }
}