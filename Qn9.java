//Take marks of five subjects and calculate the total, percentage, and grade using if-else.

import java.util.Scanner;
public class Qn9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a mark of first subject: ");
    double subject1=sc.nextDouble();
    System.out.println("Enter a mark of second subject: ");
    double subject2=sc.nextDouble();
    System.out.println("Enter a mark of third subject: ");
    double subject3=sc.nextDouble();
    System.out.println("Enter a mark of fourth subject: ");
    double subject4=sc.nextDouble();
    System.out.println("Enter a mark of fifth subject: ");
    double subject5=sc.nextDouble();
    sc.close();
    double total=subject1+subject2+subject3+subject4+subject5;
    System.out.println("Total mark obtained is "+total);
    double percentage=total/500*100;
    System.out.println("Your percentage is "+percentage+"%");
    if(percentage>=80){
        System.out.println("Your grade is A");
    }
    else if(percentage>=70){
        System.out.println("Your grade is B");
    }
    else if(percentage>=60){
        System.out.println("Your grade is C");
    }
    else if(percentage>=50){
        System.out.println("Your grade is D");
    }
    else{
        System.out.println("You are fail");
    }
   } 
}
