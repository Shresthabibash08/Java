//Input a number and display the factorial of that number using a for loop.

import java.util.Scanner;
public class Qn15 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number whose factorial you want: ");
        int number=sc.nextInt();
        sc.close();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+number+" is "+fact);
    }
}
