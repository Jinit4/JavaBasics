import java.util.Scanner;

public class Strings{
     public static void main(String args[]) {
        //  String Declaration
        //  String name = "Jinit";
        //  String fullName = "Jinit Desai";
        //  String sentence = "My Name is Jinit Desai.";
        // Input from a user 
         Scanner sc = new Scanner(System.in);
        //  String name = sc.next();
        //  System.out.println("Your Name is :"+name);
        //  String Fullname = sc.nextLine();
        //  System.out.println("Your Name is :"+Fullname);
        // We will perform various functions in a String. This functions are already defined in Java. 
        //The first function is "concatenation"
        //Here we have used "+" to join two strings 
        // String firstName = "Jinit";
        // String lastName = "Desai";
        // String fullName = firstName + "@"+lastName; //This space or @ will get deleted from the memory once the line is executed as we have not stored it in any variable
        // System.out.println(fullName);
        //The second function is "length"
        // String firstName = "Jinit";
        // String lastName = "Desai";
        // String fullName = firstName + "@"+lastName; 
        // System.out.println(fullName.length());
        //The third function is "charAt"
        //it is used to print characters seperately
      //   String firstName = "Jinit";
      //   String lastName = "Desai";
      //   String fullName = firstName + "@"+lastName; 
      //   System.out.println(fullName.length());
      //   for(int i =0;i<fullName.length();i++){
      //       System.out.println(fullName.charAt(i));
      //   }
        //The fourth function is "compare"
        // String name1 = "Jinit"; // Usually we wrote small s for string but always write String
        // String name2 = "Jinit2";
        // //compareTo checks three conditions
        // //1 s1 > s2 Positive value is returned // How is it compared in Strings 
        // //2 s1 = s2 zero is returned // if char A is there than it has less value than that of char B
        // //Eg hello wello wello string is greated in this case
        // //Eg aahello > aacello
        // //3 s1 < s3 negative value is returned 
        // if(name1.compareTo(name2)== 0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // In the case below we will get correct output but in many of other cases we might get wrong output therefore use compareTo Function
        // if(name1== name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // The below eg will give incorrect output
        // if (new String("Jinit")==new String("Jinit")){ //This is a new way of creating a new String
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are Not equal");
        // }
        //The fifth function is "substring"
     //    String sentence = "My name is Jinit";
     //    //substring(beg index, end index)
     //    String name = sentence.substring(11, sentence.length()); // Starting index is 11 ending function will be considered by default
     //    System.out.println(name); // in this the ending index is not included while printing
        //For eg if the index is passed from 0 to 4 it will print from 0 to 3 
     //    String sentence ="TonyStark";
     //    String name = sentence.substring(0,4); //0,1,2,3 TONY
     //    System.out.println(name);
        //String sentence ="TonyStark";
        //String name = sentence.substring(4); //Last index is considered by default
        //System.out.println(name);
        // Strings are immutable 
        //Once a string is created inside a memory it cannot be changed , no modifications can be done. we need to create a new string 
        //Homework
        //Q1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
     //    int size = sc.nextInt();
     //    String  array[] = new String [size];
     //    int totLength = 0;
     //    for(int i = 0 ; i<size ; i++){
     //         array[i]=sc.next();
     //         totLength += array[i].length(); //totLength = totLength+array[i].length
     //    }
     //    System.out.println(totLength);
   //   Q2 Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
   //   String user = sc.next();
   //   String result ="";
   //   for(int i=0;i<user.length();i++){
   //     if( user.charAt(i) == 'e')
   //     {
   //       result += 'i' ;
   //     }
   //     else {
   //       result += user.charAt(i);
   //     } 
   //   } 
   //   System.out.println(result);
   //   Q3 Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
      // String email = sc.nextLine();
      // String username = "";
      // for (int i=0; i<email.length();i++){
      //    if (email.charAt(i)=='@'){
      //       break ;
      //    } username += email.charAt(i);
      // }
      // System.out.println(username);
      // String str = "123";
      //  int number = Integer.parseInt(str);
      //  System.out.println(number);
      // int number = 123;
      // String str = Integer.toString(number);
      // System.out.println(str.length());
      //String Builder 
      // Strings in Java are Immutable as discussed 
      /* Thus once a string is created it cannot be modified 
      Data is stored in either of the two forms 
      1) It is stored in the form of Stack 
      2) It is stored in the form of Heap
      Consider a example 
      String str = "h"
      here h will be store din the heap 
      str will be stored in stak form such that str in stack will point towards h in heap memory
      If we want to make the h as hello than we can use the following code 
      str + "e" == he  // here the memory will not point to h but he in the heap memory it will delete the previous value in the memory in this case h
      str + "l" == hel //here the memory will not point to he but hel in the heap memory similarly it will delete he
      str + "l" == hell //here the memory will not point to hel but hell in the heap memory
      str + "o" == hello //here the memory will not point to hell but hello in the heap memory
      This type of code takes a lot of time it is still in milliseconds but if the code is too long the time will be of few seconds which will degrade the user experience
      Therefore String Builder comes into picture
      IN string builder it keeps on pointing at the same location in the heap memory and it keeps on adding the next letter without deleting the previous and creating a new one 
      it will point to h first so it will add e to the same location instead of ading he and deleting h which will save time   
      */

      StringBuilder sb = new StringBuilder("Jinit"); //sb is the name of String Builder Sb is the class whose type is String Builder
      System.out.println(sb);
      //character at Index 0
      System.out.println(sb.charAt(0));
         sc.close();
      // String builder has a new type of function called as Set Character at Index
      sb.setCharAt(0,'V');
      System.out.println(sb);
      // String Builder has also a function called as Insert
      //For eg we have a string name init we can make it as Jinit by adding J 
      sb.insert(0,'T');
      System.out.println(sb);
      sb.insert(2,'J');
      System.out.println(sb);
      //We can also delete the characters in a string by mentioning the starting index and ending index of the string
      sb.delete(0, 2); // it will delete 0,1 it is always exclusive of the ending index
      System.out.println(sb);
      // We can also append by using sb Append means to add at the end 
      sb.append(" "); // This does not create any changes in the memory the append statement
      sb.append("i"); // we could also do this by using string i.e str = str + 'i' and so on but this will take more time also everytime a new string is created
      sb.append("s"); // But in the append case in the same string builder the changes are taking place which helps to reduce time as lesser operations are performed
      sb.append(" ");
      sb.append("B");
      sb.append("usy");
      System.out.println(sb);
      //Length function also works in String Builder (sb)
      System.out.println(sb.length());
      //Q Palindrome of a string 
      //For this question consider string as an array 
      for(int i = 0; i<sb.length()/2;i++){
         int front =i;
         int back = sb.length() -1 -i; //13 - 0 - 1= 12
         char frontChar = sb.charAt(front);
         char backChar = sb.charAt(back);
         sb.setCharAt(front, backChar);
         sb.setCharAt(back, frontChar);
      }
      System.out.println(sb);

   
        
        
       
   }
} 