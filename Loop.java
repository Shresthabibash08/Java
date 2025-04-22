// public class Loop {
//     public static void main(String[] args) {
//         int age=21;
//         if (age>18){
//             System.out.println("You can vote");
//         }
//         else{
//             System.out.println("You cannot vote");
//         }
//     }
    
// }


// public class Loop {

//     public static void main(String[] args) {
//         int age=15;
//         if(age>=21){
//             System.out.println("You are 21 or over");
//         }
//         else if(age>=18){
//             System.out.println("You are 18 or over");
//         }
//         else{
//             System.out.println("You are smaller than 18");
//         }
//     }
// }


// import java.util.Scanner;
// public class Loop {

//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of a: ");
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
//     }
// }


// import java.util.Scanner;
// public class Loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number between 1 to 7: ");
//         int day= sc.nextInt();
//         sc.close();
//         switch(day){
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             case 6:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Saturday");
//                 break;
//             default:
//             System.out.println("Invalid input!!");
//             break;   
//         }

//     }
// }


// public class Loop {
// public static void main(String[] args) {
//     int a=20;
//     int b=20;
//     int sum= a + ++b;
//     System.out.println(sum);
//     int d= a  + a++;
//     System.out.println(d);
// }
    
// }

// public class Loop {

//     public static void main(String[] args) {
//     String name="myname";
//     String name1= new String("Hello");
//     String name2=name+name1;
//     String name3=name.concat(name2);
//     char val= name3.charAt(1);
//     String value =name.substring(1,4);
//     System.out.println(name.length());
//     System.out.println(value);
//     System.out.println(name.equals("MYname"));
//     System.out.println(name.equalsIgnoreCase("MYname"));
//     name.contains("name");
//     name.startsWith("my");
//     name.endsWith("hello");
//     name.indexOf("1");
//     name.lastIndexOf("e");
//     name.toLowerCase();
//     System.out.println(name);
//     name.toUpperCase();
//     System.out.println(name);
//     String val1 ="Hello".trim();
//     System.out.println(val1);
//     name.replace('m','n');
//     System.out.println(name);
//     String stringToSplit="abc.def.ghi";
//     String[] seq= stringToSplit.split(".");
//     System.out.println(seq);
//     int number=1;
//     String numString=String.valueOf(number);
//     System.out.println(numString);
//     }
// }


// public class Loop {
// public static void main(String[] args) {
//     for(int i=1;i<=10;i++){
//         for (int j=1;j<=10;j++){
//             System.out.println(i+"*"+j+"="+i*j);
//         }
//         System.out.println("");
        
//     }
// }
    
// }


// import java.util.Scanner;
// public class Loop {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number=sc.nextInt();
//         sc.close();
//         int sum=0;
//         for(int i=1;i<=number;i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
// }


// public class Loop {

//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             System.out.println(i);
//         }
//     }
// }


import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter anything: ");
        String anything=sc.next();
        //String reversedString="";
        //System.out.println(anything.charAt(0));
        sc.close();
        for (int i=anything.length()-1;i>=0;i--){
            //reversedString+=anything.charAt(i);
            System.out.print(anything.charAt(i));
        }
        //System.out.println(reversedString);

    }
}