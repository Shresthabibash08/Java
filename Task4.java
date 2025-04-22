import java.util.Scanner;
public class Task4{
    public static void Main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        sc.close();
        for(int i=1;i<=5;i++){
             System.out.println("Hello "+name);
        }
    }
}
