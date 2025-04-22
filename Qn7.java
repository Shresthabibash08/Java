//Input the age of a person and check if they are eligible to vote (18 or older).

import java.util.Scanner;
public class Qn7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        sc.close();
        if(age>=18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("You are not eligible for voting.");
        }
    }
    
}
