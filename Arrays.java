/* Time Complexity
   Relation between Input Size and Running Time (Operations)
   Scanner se we take Input that input is suppose n or m 
   now we use for loopso the operation inside the foor loop is performed n times which 
   increases its time. Therefore the time that a code takes for execution is depenent
   on the input size.
   Example 
   public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<=n;i++){
           System.out.println("Hello");
       }
   }
   In this example the operation of printing will be equal to input n 
   Time Complexity is directly proportional to input n 
   There can be various other relations between time complexity and input the lesser the time 
   it takes to perform more operations the more better it is 

   Time Complexity can be of three types 
   Best case 
   Average case 
   Worst Case
   Example 
   A set of numbers is given 
   Numbers {1,2,3,4,5}
   search for '1'
   Best Case is represented by omega Ω(1) 1) 1,2,3,4,5 in this it is in 1 st position so only 1 operation was required or 1 unit of time 
   Average case is represeted by theta Θ(n+1)/2 2)2,1,3,4,5 or 2,3,4,1,5 the avg will be taken by (1+2+3+4+5)/5
   Generalizing the above case (1+2+3...n)/n = n(n=1)/2n = n+1/2
   Worst Case is represented by big O not zero O(n)  3) 2,3,4,5,1 to reach 1 we have to perform n steps in worst case here 5 
   Whenever we will be talking of Time Complexity we will aways be talking about Worst case Time Complexity i.e. O
   Example 
   public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<=n;i++){     ///  outer loop for n = 5 i will be going from 0,1...n 
           for(int j = 0; j<= i;j++){  // Inner loop for i = 0 j will be going from 0,1...n similar for i=1 and so on.. // Nested Loops 
            System.out.println("Hello"); // Number of Operations ???  // Total operations performed will be n x n times  
           } // Worst case time complexity O(n) = n x n
       }
   }
   Example
   public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       for(int i=0;i<=n;i++){     ///  outer loop for n = 5 i will be going from 0,1...n 
           for(int j = 0; j<= m;j++){  // Inner loop for i = 0 j will be going from 0,1...m similar for i=1 and so on.. // Nested Loops 
            System.out.println("Hello"); // Number of Operations ???  // Total operations performed will be n x m times  
           } // Worst case time complexity O(n) = n x m
       }
   }
   Example
   public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       for(int i=0;i<=n;i++){     //Two seperate loops not nested 
       System.out.println("Hello"); // For loop i =0 se n tak
    }
        for(int j = 0; j<= m;j++){   
            System.out.println("Hello");   // For loop j = 0 se  m tak 
           } // Worst case time complexity O(n) = n+m //as it is seperate for loops not nested so it is added
           the final time complexity will be dependent on the major input size for example if i = 10^3 and j = 3 then the time complexity will be 
           towards i  
   }
        Compare Time Complexity
        O(n)   O(n^2)   O(n^3)
n=1     1       1        1    unit of time 
n=2     2       4        8
n=3     3       9        27 
n=10^5  10^5   10^10    10^15
*/
// Space Complexity 
/* Example 
   public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<=n;i++){
           System.out.println("Hello");
       }
   } 
   Space complexity is meant by the space that a code takes in a memory (Variables stored) In this ex n and i and also Scanner object
   The space for n will not be dependent on the vale of n in this example even if n= 6 or n = 10^6
   Now we will consider a case in which the space will be dependent on the value of input size 
   Arrays
   More details on arrays in upcoming lecs 
*/
// ARRAYS 
/*
   type[]arrayName = new type[size]; // new is a keyword it is used for creating a space in the exsisting memory 
   This is used when we are defining a new variable of non primitive type which requires space in the memory 
   Size is used for creating the same amount of list
   Example
   int[] marks = new int [3]; 
   marks[0] = 97; // 0,1,2 is how the list starts in Java it is also called as Indexing 
   marks[1] = 87; // Java Arrays are called as Zero Indexed
   marks[2] = 99; 
*/
// import java.util.*;
//    public class Arrays{
//        public static void main(String args[]){
//            //int[] marks = new int[3]; //Both are valid syntax
//            int marks[] = new int[3];
//            //int marks[] ={97,99,87}; //This alone line is also will print the same output
//            marks[0]=97;
//            marks[1]=99;
//            marks[2]=87;
//            //System.out.println(marks); This prints Jargon value 
//         //    System.out.println(marks[0]); // This printing can be done as only 3 valuse are there
//         //    System.out.println(marks[1]);
//         //    System.out.println(marks[2]);
//         for (int i=0;i<=2;i++)
//         System.out.println(marks[i]);
//         } 
//    }
// Defining an array 
//Method 2 
// type[] arrayName ={1,2,3,4,5,6} This is used whne we know the variable or size from the begining
// import java.util.*;
//     public class Arrays{
//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             int size = sc.nextInt(); // the values gets auto Initialized in Java 
//             int numbers[] =new int[size]; // Whenever we create a variable in Java that in memory takes some spaces and stores a null value if it is an object
//             //input
//             for (int i=0;i<size;i++){
//                 numbers[i] = sc.nextInt();
//             }
//             //output
//             for (int i=0;i<size;i++){ // If it is an int value it will store 0 ,float 0.0 ,boolean false ,string " " 
//                 System.out.println(numbers[i]);
//             }
//             sc.close();
//         }
//     }
// This algorithm is called as Linear Search
import java.util.*;
    public class Arrays{
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            int size =sc.nextInt();
            int numbers[] = new int [size];
            //input
            for(int i=0;i<size;i++){
                numbers[i]=sc.nextInt();
            }
            //number to find
            int x = sc.nextInt();
            //output
            for(int i=0;i<numbers.length;i++){ //Length variable is associated with every array numbers.length = size
                if (numbers[i]==x) // we are finding 
                {System.out.println(x +" found at index: "+i);}
            }
            sc.close();
        }
    }
