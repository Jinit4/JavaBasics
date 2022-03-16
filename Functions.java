import java.util.Scanner;

//     System.out.println(calculateMultiply(a, b));
    //     sc.close();
    // }
    // }   
// // Find the Factorial of a Number 
//     public class Functions{
//         public static void findFactorial(int n ){ // in void functions we can avoid typing retun in the end 
//             int factorial = 1;
//             if (n<0){
//                 System.out.println("Invalid Number");
//                 return; 
//             }
// /*  Suppose in the case above if n <0 then it will enter only the loop above and will return
// to the main function instead of going into all the loops 
// Functions and method are both a block of code which takes the i/p and gives o/p
// Methods we call by using class ke objects 
// Functions we call directly
// */
//             if (n==0){
//                 System.out.println("1");
//                 return;
//             }
//             for(int j=n ; j>= 1; j--){
//                 factorial = factorial * j;}
//                 System.out.println(factorial);
//                 return;    
//             }
//         public static void main (String args[]) {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             findFactorial(n); // we are calling the function
//             sc.close();
//         }
//      }
// Lecture 7 Homework Questions 
//Q1 To  check if a number is Prime or not (UNSOLVED)
    // public class Functions{
    //     public static void isPrime(int x){
    //         int m,i =0;
    //         m=x/2; 
    //         if (x==0|| x==1){
    //             System.out.println("This is not a Prime number");}
    //         else {
    //         for (i=2;i<=m;i++){
    //         if (x%i==0){
    //             System.out.println(x);
    //             //break;
    //         }
    //         else{
    //             System.out.println(x);
    //         }
    //         return;
    //             }
    //         }
    //     }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         int x = sc.nextInt();
    //         isPrime(x);
    //         sc.close();
    //     }
    // }


//Q2 To check whether the given number n is even or odd
    // public class Functions {
    //     public static void isEven(int n) {
    //         if (n%2==0)
    //         System.out.println("It is an Even Number");
    //         else{
    //             System.out.println("It is an Odd Number");
    //         }
    //         return;
    //     }
    //     public static void main (String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         int n = sc.nextInt();
    //         isEven(n);
    //         sc.close();
    //     }
    // }
//Q3 Make a function to print the table of a given number n.
    // public class Functions {
    //     public static void printTable (int n ){
    //         for (int i = 1 ; i<=10; i++){
    //         int k = n*i;
    //         System.out.println(n+"x"+i+"="+k);
    //         }
    //         }
    //     public static void main (String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printTable(n);
    //     sc.close();    
    //       }
    //     }
// Java Exercise 1 
//Q2 A function to Print the sum of all the odd numbers from 1 to n 
    // public class Functions {
    //     public static void printSumOdd(int n ){
    //         int sum = 0;
    //         for (int i = 1 ; i<=n; i++ )
    //         if (i%2 != 0)
    //         sum = sum + i;     
    //         System.out.println(sum);
    //     }
    //     public static void main (String args[]){
    //         Scanner sc= new Scanner(System.in);
    //         int n = sc.nextInt();
    //         printSumOdd(n);
    //         sc.close();
    //     }
    // }
//Q3 To take input 2 numbers and returns the greater of those two.
    // public class Functions{
    //     public static void greatnum(int a, int b){
    //         if (a>=b){
    //         System.out.println(a+ " is Greater");}
    //         else 
    //         {System.out.println(b+ " is Greater");}
    //     }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();
    //         greatnum(a, b);
    //         sc.close();
    //     }
    // }
//Q4 To take input the radius as input and returns the circumference of a circle.
    // public class Functions{
    //     public static void calCircum(int r){
    //         double c = 2*3.14*r;
    //         System.out.println(c);
    //     }
    //     public static void main (String args[]){
    //         Scanner sc = new Scanner (System.in);
    //         int r = sc.nextInt();
    //         calCircum(r);
    //         sc.close();
    //     }
    // }
//Q5 To take input age as input and returns if that person is eligible to vote or not
    // public class Functions{
    //     public static void calAge (int age){
    //         if (age>= 18){
    //             System.out.println("Person is eligible to Vote as their age is " +age);
    //         }
    //         else{
    //             System.out.println("Person is not eligible to Vote as their age is " +age);
    //         }
    //     }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         int age = sc.nextInt();
    //         calAge(age);
    //         sc.close();
    //     }
    // }    
// Q8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n
    // public class Functions{
    //     public static void calpow(double x, double n){
    //         double p = Math.pow(x,n); // Math.pow is a function used to calculate the power of the given base
    //         System.out.println(p); //We can also calculate the power of a negative number using same pow function
    //     }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner (System.in);
    //         int x =sc.nextInt();
    //         int n =sc.nextInt();
    //         calpow(x, n);
    //         sc.close();
    //     }
    // }
//Q9 Write a function that calculates the Greatest Common Divisor of 2 numbers. 
//IMP SUM easy Logic
    // public class Functions{
    //     public static void main(String args[]) {
    //         Scanner sc = new Scanner(System.in);
    //         int n1 = sc.nextInt();
    //         int n2 = sc.nextInt();
      
    //         while(n1 != n2) { 
    //             if(n1>n2) {
    //                 n1 = n1 - n2;
    //             } else {
    //                 n2 = n2 - n1;
    //             }
    //         }
    //         System.out.println("GCD is : "+ n2);
    //     }   
    //  }
     
    

     