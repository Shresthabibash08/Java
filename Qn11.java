//Input a number from the user and display whether it is a prime number using a for loop.

import java.util.Scanner;
public class Qn11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        sc.close();
        int count=0;
        for( int i=1;i<=number;i++){
            if(number%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }
    }
}
