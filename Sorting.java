/* Sorting in Java 
First we will be looking at Bubble Sort
Bubble sort mein we compare two elements and push the element which is larger to the end to get the result in ascending format
In Bubble sort we perform the operation on n-1 element as the one element left will be sorted automatically
The bubble sort has a time complexity O(n)=n^2 which is too much time for sorting 
In this lets take an example an array of elements are there  
7 8 3 1 2
*/
import java.util.*;
class Sorting {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        //Bubble Sort
        for (int i=0; i<arr.length-1; i++){ 
            /*In this first loop we will arrange all the elements suppose we start from element no 1 which is 7 in this case so we will 
            check if it is greater than 8 then we will go till n-1 th element in the last.The last element will be arranged automatically */
            for (int j=0; j<arr.length-i-1; j++){
            /* Here in this loop i represents the time it should be sorted suppose while i = 0 we want n-1 elements to be compared if i=1 then 
            in this case the last element will be sorted so n-2 elements will only be needed to be sorted (Do this on Paper) */
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
//Descending
 import java.util.*;
 class Sorting{
//     /*In this we will create a function to print the array */
    public static void printArray (int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr [] = {7,8,5,1,2,3};
        for (int i=0;i<arr.length-1;i++){ /* This for loop is used for number if times the loop in array will run suppose if array has 6 elements
            here then this loop will run 5 times  */
            for(int j=0;j<arr.length-i-1;j++){  // Try solving these loops using paper and pen for getting clear idea why two loops are needed
                /*In this loop as we sort in descending order it doesnt consider the last element as it will be sorted automatically for the 
                first loop then in second loop last two elements will not be considered  */
                if (arr[j]<arr[j+1]){ // Descending order condition 
                    //Swap
                    int temp = arr[j]; //Here arr [j] gets empty the value is stored in temp variable
                    arr[j]=arr[j+1]; // here arr[j+1] gets empty as its value is stored in arr[j]
                    arr[j+1]=temp; // here the temp value is stored in j+1
                }
            }
        }
        printArray(arr);
    }
}

// Selection Sort
/*In selection sort we run a loop firstly then we check for the smallest element. Then this smallest element is shifted to the 0 th index or 
1st postion (1 swap per iteration or 1 swap in 1 loop)
Whereas in Bubble sort we were comparing two elements simultaneously and then swapping  but here we run a loop and check for the smallest 
element */

import java.util.*;
class Sorting {
    public static void main (String args[]){
        int arr [] ={8,7,6,5,4,2,1}
        //Selection Sort
        for(int i=0; i<arr.length-1;i++){ // This loop will run for n-1 elements 
            int smallest =i;
            for (int j=1; j<arr.length;j++){ // In this loop we will be starting from i+1 element s we are comparing and we will go till length of array
                if (arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
    }
}

