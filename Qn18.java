//Input a month number (1–12) and print the number of days in that month using switch.
import java.util.Scanner;
public class Qn18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number from (1-12) for month: ");
        int c=sc.nextInt();
        sc.close();
        switch (c) {
            case 1:
            System.out.println("There are 31 days in January.");
                break;
            case 2:
            System.out.println("There are 28 days in February.");
                    break;
            case 3:
            System.out.println("There are 31 days in March.");
                    break;
            case 4:
            System.out.println("There are 30 days in April.");
                    break;
            case 5:
            System.out.println("There are 31 days in May.");
                    break;
            case 6:
            System.out.println("There are 30 days in June.");
                    break;
            case 7:
            System.out.println("There are 31 days in July.");
                    break;
            case 8:
            System.out.println("There are 31 days in August.");
                    break;
            case 9:
            System.out.println("There are 30 days in September.");
                    break;
            case 10:
            System.out.println("There are 31 days in October.");
                    break;
            case 11:
            System.out.println("There are 30 days in November.");
                    break;
            case 12:
            System.out.println("There are 31 days in December.");
                    break;
            default:
            System.out.println("Invalid input!!");
            break;
    }
}
}
