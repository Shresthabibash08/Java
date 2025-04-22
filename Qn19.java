//Take a character input and use switch to display if it is a vowel (a, e, i, o, u).

import java.util.Scanner;
public class Qn19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char character=sc.next().charAt(0);
        sc.close();
        switch(character){
            case 1:
            if(character=='a'){
                System.out.println("Given character is vowel.        ");
                break;
            }
            case 2:
            if(character=='e'){
                System.out.println("Given character is vowel.");
                break;
            }
            case 3:
            if(character=='e'){
                System.out.println("Given character is vowel.");
                break;
            }
            case 4:
            if(character=='i'){
                System.out.println("Given character is vowel.");
                break;
            }
            case 5:
            if(character=='o'){
                System.out.println("Given character is vowel.");
                break;
            }
            case 6:
            if(character=='u'){
                System.out.println("Given character is vowel.");
                break;
            }
            default:
            System.out.println("Given character is consonant.");
        }
    }
}
