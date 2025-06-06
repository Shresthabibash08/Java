//Write a Java program to input your full name and print a greeting message.

import java.util.Scanner;
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name=sc.nextLine();
        sc.close();
        System.out.println("Hello "+full_name);
    }
}
