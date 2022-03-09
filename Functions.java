import java.util.*;
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