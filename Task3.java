// import java.util.Scanner;
// public class Task3{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value of a: ");
//     int a=sc.nextInt();
//     System.out.println("Enter the value of b: ");
//     int b=sc.nextInt();
//     System.out.println("Enter the value of c: ");
//     int c=sc.nextInt();
//     sc.close();
//     if(a>b){
//         if(a>c){
//             System.out.println(a+" is the highest number");
//         }
//     else if(b>c){
//         System.out.println(b+" is the highest number");
//     }
//     else{
//         System.out.println(c+" is the highest number");
//     }
//     }
// }
// }


// import java.util.Scanner;
// public class Task3{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number=sc.nextInt();
//         sc.close();
//     if(number==0){
//         System.out.println("Given number is zero");
//     }
//     else if(number>0){
//         System.out.println("Given number  is positive ");
//     }
//     else{
//         System.out.println("Given number is negative");
//     }
// }
// }


// import java.util.Scanner;
// public class Task3 {

//     public static void main(String []args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number=sc.nextInt();
//         sc.close();
//         if(number%5==0){
//             if(number%11==0){
//                 System.out.println("Given number "+number+" is divisible by both 5 and 11");
//             }
//             else{
//                 System.out.println("Given number "+number+" is divisible by 5");
//             }
//         }
//         else if(number%11==0){
//             System.out.println("Given number "+number+" is divisible by 11");
//         }
//         else{
//             System.out.println("Given number "+number+" is not divisible by 5 and 11");
//         }
//     }
// }


// import java.util.Scanner;

// public class Task3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year: ");
//         int year = sc.nextInt();
//         sc.close();

//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             System.out.println(year + " is a leap year");
//         } else {
//             System.out.println(year + " is not a leap year");
//         }
//     }
// }


// import java.util.Scanner;
// public class Task3 {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a character: ");
//         char c = sc.next().charAt(0);
//         sc.close();
//         if( c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
//             System.out.println(c+" is vowel");
//         }
//         else{
//             System.out.println(c+" is consonant");
//         }
//     }
// }


// import java.util.Scanner;
// public class Task3 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number=sc.nextInt();
//         sc.close();
//         if(number%2==0){
//             System.out.println("Given number"+number+ " is even.");
//         }
//         else{
//             System.out.println("Given number"+number+ " is odd.");
//         }
//     }
// }


// import java.util.Scanner;
// public class Task3 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the your grade like A,B etc. : ");
//         char c=sc.next().charAt(0);
//         sc.close();
//         switch (c) {
//             case 'A':
//             System.out.println("4.0");
//                 break;
//             case 'B':
//                 System.out.println("3.6");
//                     break;
//             case 'C':
//                 System.out.println("3.2");
//                     break;
//             case 'D':
//                 System.out.println("4.0");
//                     break;
//             default:
//             System.out.println("Invalid grade!!");
//             break;
//     }
// }
// }


// import java.util.Scanner;
// public class Task3 {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         double num1=sc.nextDouble();
//         System.out.println("Enter second number: ");
//         double num2=sc.nextDouble();
//         System.out.println("Enter operator lkike +,-,*,/: ");
//         char operator=sc.next().charAt(0);
//         sc.close();
//         switch (operator){
//             case '+':
//             double addition=num1+num2;
//             System.out.println(addition);
//             break;

//             case '-':
//             double subtraction=num1-num2;
//             System.out.println(subtraction);
//             break;

//             case '*':
//             double multiplication=num1*num2;
//             System.out.println(multiplication);
//             break;

//             case '/':
//             double division=num1/num2;
//             System.out.println(division);
//             break;

//             default:
//             System.out.println("Invalid operator!!");
//             break;
//         }
//     }
// }


// import java.util.Scanner;
// public class Task3 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter number from (1-12) for month: ");
//         int c=sc.nextInt();
//         sc.close();
//         switch (c) {
//             case 1:
//             System.out.println("Winter");
//                 break;
//             case 2:
//                 System.out.println("Winter");
//                     break;
//             case 3:
//                 System.out.println("Winter");
//                     break;
//             case 4:
//                 System.out.println("Spring");
//                     break;
//             case 5:
//                 System.out.println("Spring");
//                     break;
//             case 6:
//                 System.out.println("Spring");
//                     break;
//             case 7:
//                 System.out.println("Summer");
//                     break;
//             case 8:
//                 System.out.println("Summer");
//                     break;
//             case 9:
//                 System.out.println("Summer");
//                     break;
//             case 10:
//                 System.out.println("Fall");
//                     break;
//             case 11:
//                 System.out.println("Fall");
//                     break;
//             case 12:
//                 System.out.println("Fall");
//                     break;
//             default:
//             System.out.println("Invalid input!!");
//             break;
//     }
// }
// }


import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  one shape between triangle,rectangle,square, and circle: ");
        String shape=sc.nextLine();
        switch (shape){
            case "triangle":
            System.out.println("Enter the length of triangle: ");
            int lenght= sc.nextInt();
            System.out.println("Enter the breadth of triangle: ");
            int breadth=sc.nextInt();
            double area= 0.5*lenght*breadth;
            System.out.println("Area of triangle is: "+area);
            break;

            case "rectangle":
            System.out.println("Enter the length of rectangle: ");
            int lenght_rectangle= sc.nextInt();
            System.out.println("Enter the breadth of rectangle: ");
            int breadth_rectangle=sc.nextInt();
            double area_rectangle= lenght_rectangle*breadth_rectangle;
            System.out.println("Area of rectangle is: "+area_rectangle);
            break;

            case "square":
            System.out.println("Enter the length of square: ");
            double len=sc.nextInt();
            double area_of_square=len*len;
            System.out.println("Area of square is: "+area_of_square);
            break;

            case "circle":
            System.out.println("Enter the radius of circle: ");
            double radius=sc.nextDouble();
            double area_of_circle=3.14*radius*radius;
            System.out.println("Area of circle is: "+area_of_circle);
            break;

            default:
            System.out.println("Invalid shape!!");
            break;

        }
        sc.close();
    }
}