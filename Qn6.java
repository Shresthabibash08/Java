//Take a number from the user and print whether it is even or odd.

import java.util.Scanner;
public class Qn6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente a number: ");
        int number=sc.nextInt();
        sc.close();
        if(number%2==0){
            System.out.println("Given number is even.");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
    
}
