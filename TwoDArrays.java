//2D ARRAYS 
/* type[][] arrayName = new type [rows][coloumns];
   int[][] numbers = new int [3][5];
*/
import java.util.*;
    public class TwoDArrays {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            // int rows = sc.nextInt();
            // int cols = sc.nextInt();
            // int [][] numbers = new int[rows][cols];
            // //input
            // //rows
            // for(int i = 0;i <rows;i++){ // Common mistake i<= rows it will give an error as it starts from 0 to row-1 and not row
            //     //coloumns 
            //     for(int j =0;j<cols;j++){
            //         numbers[i][j]=sc.nextInt();
            //     }
            // }
            // //output
            // for(int i = 0;i <rows;i++){ 
            //     //coloumns 
            //     for(int j =0;j<cols;j++){
                    
            //         System.out.print(numbers[i][j]+ " ");
            //     }
            //     System.out.println();
            // }
            //Homework
            // Q2 Take a matrix as input and find number and print its indices
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            
            int [][] numbers = new int[rows][cols];
            //input
            //rows
            for(int i = 0;i <rows;i++){ // Common mistake i<= rows it will give an error as it starts from 0 to row-1 and not row
                //coloumns 
                for(int j =0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
            //output
            for(int i = 0;i <rows;i++){ 
                //coloumns 
                for(int j =0;j<cols;j++){
                       System.out.print(numbers[j][i]+ " ");
                }
                System.out.println();
            }
            sc.close();
        }
    }