//Input n and print the first n terms of the Fibonacci series.

import java.util.Scanner;
public class Qn24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        sc.close();
        int a=0,b=1;
        for(int i=0;i<=number;i++){
            int c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
}
