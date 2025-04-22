//Take a number and check whether it is a palindrome or not using if-else and loop.
import java.util.Scanner;
public class Qn23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                // Input from user
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                int originalNumber = number;
                int reversedNumber = 0;
        
                // Reversing the number using a loop
                while (number != 0) {
                    int digit = number % 10; // Get the last digit
                    reversedNumber = reversedNumber * 10 + digit; // Build reversed number
                    number = number / 10; // Remove the last digit
                }
        
                // Check if the original number is equal to the reversed number
                if (originalNumber == reversedNumber) {
                    System.out.println(originalNumber + " is a palindrome.");
                } else {
                    System.out.println(originalNumber + " is not a palindrome.");
                }
        
                sc.close();
        
        }
    }

