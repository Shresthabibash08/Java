//Write a program to count how many digits are in a given number using a loop.

import java.util.Scanner;

public class Qn25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        // Special case for 0
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }
        System.out.println("Total digits: " + count);
        sc.close();
    }
}

