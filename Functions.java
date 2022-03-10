import java.util.*;
// Functions & Methods 
// Functions are a Block of Code which takes a certain Input performs some operation and producesa Output
// returnType functionName (type arg1, type arg2..){
// //operations }
// Void >- No return 
// Function name should not be any Keyword in Java  
public class Functions {
    public static void pritnMyName (String name){
        System.out.println(name);
        return;
    } // This type of writing is considered to be camelcase writing which includes starting with lower case and then upper case
    public static void main(String args[]) { // In Java it is better to use camelcase writing
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       pritnMyName(name); //call kiya function ko 

       sc.close();
    }
}