import java.util.*;
public class  {
    public static int sum(int n ){
        //Base case 
        if (n == 0){
            return 0;
        }
        //Smaller Problem 
        int ans = n + sum(n-1) ;
        // Return
        return ans;
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}