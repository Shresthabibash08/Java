//Write a program to print the multiplication table of a given number using for loop.

import java.util.Scanner;
public class Qn12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose multiplication you want: ");
        int number=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}
