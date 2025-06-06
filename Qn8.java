//Write a program to input a character and check if it is a vowel or a consonant using if-else.

import java.util.Scanner;
public class Qn8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input=sc.next().charAt(0);
        sc.close();
        if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u'){
            System.out.println("Given character is vowel.");
        }
        else{
            System.out.println("Given character is consonant.");
        }
    }
}
