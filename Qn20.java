//Input a number and check if it is a perfect square using for loop.

import java.util.Scanner;
public class Qn20 {
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number: ");
   int number=sc.nextInt();
   sc.close();
   boolean isperfect=false;
   for(int i=1;i<=number;i++){
    if(i*i==number){
        isperfect=true;
        break;
    }
   }
   if(isperfect==true){
    System.out.println("Given number "+number+" is a perfect square number. ");
   }
   else{
    System.out.println("Given number "+number+" is not a perfect square number. ");
   }
}
}
