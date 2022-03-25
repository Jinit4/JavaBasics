import java.util.*;
public class Recursion{
    // public static int sum(int n ){
    //     //Base case 
    //     if (n == 0){
    //         return 0;
    //     }
    //     //Smaller Problem 
    //     int ans = n + sum(n-1) ;
    //     // Return
    //     return ans;
    // }    
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println(sum(n));
    //     sc.close();
    // }
    // public static int pow (int x , int n ){
    //     //Base case 
    //     if (n == 0){
    //         return 1;
    //     }
    //     //Smaller problem
    //     int smallans = pow(x,n-1); // It should reach towards base case 

    //     //Return
    //     return smallans*x ;
    // }
    // public static void main (String args[]) {
    //     Scanner sc = new Scanner (System.in);
    //     int x = sc.nextInt();
    //     int n = sc.nextInt();
    //     System.out.println(pow(x, n));
    //     sc.close(); 
    // }
    public static int fibo (int x){
        //Base case
        if (x==0|| x==1){
            return x;
        }
        //Smaller Problem 
        return fibo(x-1)+fibo(x-2); 

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fibo(x));
        sc.close();
    }
}