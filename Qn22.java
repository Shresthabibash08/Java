//Input a number and reverse it using a for loop.

import java.util.Scanner;
public class Qn22 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    String number=sc.next();
    String reversed_number="";
    sc.close();
    for(int i=number.length()-1;i>=0;i--){
        reversed_number+=number.charAt(i);
    }
    System.out.println("The reversed number of given input is: "+reversed_number);
  }  
}
