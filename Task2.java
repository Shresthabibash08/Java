// public class Task2 { 
//     public static void main(String[] args){
//         int age =20;
//         String result = (age>=18) ? "You are elligble for voting"
//                                   : " You are not ellgible for voting";
//        System.out.println(result);
//     }
// }


// public class Task2 {

//     public static void main(String[] args){
//         double principle=1500,time=3,rate=15;
//         double si;
//         si=principle*time*rate/100;
//         System.out.println(si);
        
//     }
// }


// public class Task2 {

//     public static void main(String[] args){
//         double l=10, b=5,h=5;
//         double area_of_triangle;
//         area_of_triangle= 0.5*l*b;
//         double area_of_cube=l*l*l;
//         double area_of_cuboid=l*b*h;
//         System.out.println(area_of_triangle);
//         System.out.println(area_of_cube);
//         System.out.println(area_of_cuboid);
//     }
// }

// import java.util.Scanner;
// public class Task2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a and b: ");
//         int a= sc.nextInt();
//         int b=sc.nextInt();
//         sc.close();
//         int sum=a+b;
//         int product=a*b;
//         System.out.println("The sum of a and b is: "+sum);
//         System.out.println("The product of a and b is: "+product);
//         int result=product/sum;
//         System.out.println("The division of product and sum of a and b is: "+result);
//     }
    
// }


// import java.util.Scanner;
// public class Task2{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter your roll number: ");
//         int roll_number=sc.nextInt();
//         System.out.print("Enter your field of interest: ");
//         String interest=sc.next();
//         sc.close();
//         System.out.println("Hey, my name is "+name+ "and my roll number is "+roll_number+". My field of interest are "+interest);
//     }
// }


// import java.util.Scanner;
// public class Task2 {

//     public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the length of square: ");
        // double len=sc.nextInt();
        // double area_of_square=len*len;
        // double perimeter_of_square=4*len;
        // System.out.println("Area of square is: "+area_of_square);
        // System.out.println("Perimeter of square is: "+perimeter_of_square);

//         System.out.println("Enter principal: ");
//         double principal=sc.nextInt();
//         System.out.println("Enter time: ");
//         double time=sc.nextInt();
//         System.out.println("Enter rate: ");
//         double rate=sc.nextInt();
//         double SI=(principal*time*rate)/100;
//         System.out.println("Simple interest of given input is "+SI);

//         System.out.println("Enter the length of triangle: ");
//         int lenght= sc.nextInt();
//         System.out.println("Enter the length of breadth: ");
//         int breadth=sc.nextInt();
//         double area= 0.5*lenght*breadth;
//         System.out.println("Area of triangle is: "+area);
        
//         System.out.println("Enter the length of cube: ");
//         double length_cube=sc.nextInt();
//         double volume_of_cube=length_cube*length_cube*length_cube;
//         System.out.println("Volume of cuboid of length "+length_cube+" is "+volume_of_cube);

//         System.out.println("Enter the length of cuboid: ");
//         double length_cuboid=sc.nextInt();
//         System.out.println("Enter the breadth of cuboid: ");
//         double breadth_cuboid=sc.nextInt();
//         System.out.println("Enter the height of cuboid: ");
//         double height_cuboid=sc.nextInt();
//         double volume_of_cuboid=length_cuboid*breadth_cuboid*height_cuboid;
//         System.out.println("Volume of cuboid is "+volume_of_cuboid);
//         sc.close();
        
//     }
// }


// import java.util.Scanner;
// public class Task2 {

//     public static void main(String[] args) {
        
//     }
// }


// import java.util.Scanner;
// public class Task2 {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of rectangle in double: ");
//         double length=sc.nextDouble();
//         System.out.println("Enter the breadth of rectangle in double: ");
//         double breath=sc.nextDouble();
//         sc.close();
//         double area=(int)(length*breath);
//         System.out.println("Area of rectangle is "+area);

//     }
// }


import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark of first subject: ");
        double mark1=sc.nextDouble();
        System.out.println("Enter the mark of second subject: ");
        double mark2=sc.nextDouble();
        System.out.println("Enter the mark of third subject: ");
        double mark3=sc.nextDouble();
        System.out.println("Enter the mark of four subject: ");
        double mark4=sc.nextDouble();
        double total=mark1+mark2+mark3+mark4;
        double percentage=total/400*100;
        if(percentage>=70){
            
        }
        sc.close();

    }
}