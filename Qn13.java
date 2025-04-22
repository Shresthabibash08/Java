//Take a number n and print the sum of first n natural numbers using a loop.

import java.util.Scanner;
public class Qn13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("The sum of first "+number+" natural number is "+sum);
    }   
}
