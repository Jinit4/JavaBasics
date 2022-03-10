import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        int n =5;
        //Upper Half
        for(int i = 1; i<= n; i++){
            //1st Part
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int Spaces = 2*(n-i);
            for (int j = 1;j<= Spaces;j++){
                System.out.print(" ");
            }
            //2nd Part
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half 
        for(int i = n; i>= 1; i--){
            //1st Part
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int Spaces = 2*(n-i);
            for (int j = 1;j<= Spaces;j++){
                System.out.print(" ");
            }
            //2nd Part
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Solid Rhombus 
        // int n = 5;
        // for (int i =1 ; i<=n;i++){
        //     for (int j=1; j<=n-i; j++){
        //         //spaces
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<= n ;j++){
        //         //stars
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //Number Pyramid 
        // int n =5;
        // for(int i=1;i<=5;i++){
        //     for (int j= 1; j<=n-i;j++){
                    //Spaces
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
                    //  numbers >- Print row nos, row no times 
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        //Palindromic Pattern
        // int n =5;
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         //Spaces
        //         System.out.print(" ");
        //     }
        //     for (int j=i;j>=1;j--){
        //         // 1 st Half Numbers 
        //         /*
        //         Spaces is already printed now we will go back from i = 5 so from 1 in the center to 4 spaces in left for 1 st row
        //         or i = 4 so 4,3,2,1 so 4 spaces from center its going in reverse for 4 th row 
        //         */
        //         System.out.print(j);
        //     }
        //     for(int j =2;j<=i;j++){
        //         //remaining back numbers
        //         /* in this we are starting from j=2 and will print till i
        //         */
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // Diamond Pattern 
        // int n = 5;
        // //Upper Half
        // for (int i=1;i<=n;i++){
        //     for(int j = 1; j<=n-i;j++){
        //         //Spaces
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j <= 2*i-1; j++){
        //         //Stars
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //Lower Half
        // for (int i=n;i>=1;i--){
        //     for(int j = 1; j<=n-i;j++){
        //         //Spaces
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j <= 2*i-1; j++){
        //         //Stars
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //Print Half Pyramid
        // int n = 5;
        // for (int i =1;i<=n;i++){ // Rows
        //     for (int j = 1;j<= n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i;j++){ //Print the numbers
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //Inverted Half Pyramid
        // int n = 4;
        // int k = 1;
        // for (int i = n ; i>=1;i--){ 
        //     for(int j = 1 ; j<=i;j++){
        //         System.out.print(k); // Number on Pyamid
        //     } k++;
        //     System.out.println(" "); //Next Line
        // }
        //Hollow Rohmbus 
        // int n = 5;
        // for(int i = 1; i<=n;i++){
        //     for (int j =1; j<=n-i;j++){  
        //         System.out.print(" ");
        //     }
        //     for (int j =1 ; j<=n;j++){
        //         if(i==1|| j==1 || i ==5 || j == 5){
        //         System.out.print("*");
        //     } else {
        //         System.out.print(" ");
        //     }
        // }
        //     System.out.println();
        // }
        //Hollow Butterfly
        // int n = 5;
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j<=i;j++){ // 1 st part
        //         if ( j == 1|| i==j  ){//|| i==2 || j==2){
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }  
        //      }int spaces = 2*(n-i);
        //      for (int j =1;j<= spaces; j++) {
        //          System.out.print(" ");
        //      }
        //      for (int j = 1; j<=i;j++){
        //          if (j == 1|| i==j){
        //              System.out.print("*");
        //          }
        //          else{
        //              System.out.print(" ");
        //          }
        //      }
        //      System.out.println();
            
        // }
        // for(int i = n;i>=1;i--){
        //     for (int j = 1; j<=i;j++){ // 2nd part
        //         if ( j == 1 || i==j  ){//|| i==2 || j==2){
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //      } int spaces = 2*(n-i);
        //      for (int j =1;j<= spaces; j++) {
        //         System.out.print(" ");
        //      }
        //      for (int j = 1; j<=i;j++){
        //         if (j == 1|| i==j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //      System.out.println(); 
        // }
        // int n = 5; //UNSOLVED
        // for (int i= 1; i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1 ; j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
    }
}