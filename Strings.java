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
     //    String firstName = "Jinit";
     //    String lastName = "Desai";
     //    String fullName = firstName + "@"+lastName; 
     //    System.out.println(fullName.length());
     //    for(int i =0;i<fullName.length();i++){
     //        System.out.println(fullName.charAt(i));
     //    }
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
     //Q2 Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
     String array[] = new String[size];
     
     String result 

         sc.close();
    }
}