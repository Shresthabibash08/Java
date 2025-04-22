//Input three numbers and print the largest using if-else.

import java.util.Scanner;
public class Qn5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c=sc.nextInt();
        sc.close();
        if(a>b){
            if(a>c){
                System.out.println(a+" is the highest number");
        }
        else if(b>c){
            System.out.println(b+" is the highest number");
        }
        else{
            System.out.println(c+" is the highest number");
        }
    }  
}
}
