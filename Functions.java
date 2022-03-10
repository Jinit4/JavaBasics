 import java.util.*;
// // Functions & Methods 
// // Functions are a Block of Code which takes a certain Input performs some operation and producesa Output
// // returnType functionName (type arg1, type arg2..){ 
// // //operations }
// /* type can be various things like int,float,boolean,string and so on
// If we want to take age and temp from user 
// int age, float temperature
// In memory Functions are stored in the form of Stacks 
// Individual things stored in a stack is called as Stack Frame 
// */
// // Void >- No return 
// // Function name should not be any Keyword in Java  
// public class Functions {
//     public static void pritnMyName (String name , Float age){ //printMyName is called as an identifier
//         System.out.println(name + age);
//         return;
//     } // This type of writing is considered to be camelcase writing which includes starting with lower case and then upper case
//     public static void main(String args[]) { // In Java it is better to use camelcase writing
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        Float age = sc.nextFloat();
//        pritnMyName(name , age); //call kiya function ko 
// /* Suppose a "main" function is stored in the memory and it is stack frame of function Main
// In this stack all the variables and the main function is there 
// Whenever main function gives a call suppose to printMyName function it then creates a new FrameStack of that function
// In any function the variables and other related things are stored in its particular stack
// If printMyName returns any value to the main function then that function will be removed from the memory 
// */
//sc.close();
//    }
//    }
//Make a function to add 2 numbers and return the sum
// public class Functions {
//     public static int calculateSum(int a, int b ) {// As we are returning the sum of two numbers the return type will be int 
//     int sum = a+b;
//     return sum;
//     }
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// int a =sc.nextInt();
// int b = sc.nextInt();
// int sum = calculateSum(a, b);
// System.out.println(sum);
// sc.close();
// }
// }
// Make a function to Multiply 2 numbers and return their product 
    // public class Functions{
    //     public static int calculateMultiply(int a, int b){
    //      return  a*b; 
    // }

    
    // public static void main (String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
    //     System.out.println(calculateMultiply(a, b));
    //     sc.close();
    // }
    // }   
// Find the Factorial of a Number 
    public class Functions{
        public static void findFactorial(int n ){ // in void functions we can avoid typing retun in the end 
            int factorial = 1;
            if (n<0){
                System.out.println("Invalid Number");
                return; 
            }
/*  Suppose in the case above if n <0 then it will enter only the loop above and will return
to the main function instead of going into all the loops 
Functions and method are both a block of code which takes the i/p and gives o/p
Methods we call by using class ke objects 
Functions we call directly
*/
            if (n==0){
                System.out.println("1");
                return;
            }
            for(int j=n ; j>= 1; j--){
                factorial = factorial * j;}
                System.out.println(factorial);
                return;    
            }
        public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            findFactorial(n); // we are calling the function
            sc.close();
        }
     }
    

     