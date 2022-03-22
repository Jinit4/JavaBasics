import java.util.Scanner;
//import java.util.*;
public class Main{
    public static void main (String[] args){
      //   System.out.print("Hello World with Java\n");// \n is used for next line
      //   System.out.println("Hello World with JavaREM"); // println is used so after a sentence it comes to a new line
      //   System.out.println("Hello World with JavaSDK");
      //   System.out.println("Hello World with Java\nJinit here");
      //  // print is used to print the sentences in the same line 
      //  //  println or /n is used to print a sentence and then move to next line 
      //  System.out.println("*");
      //  System.out.println("**"); // type sout or syso and press tab for sys.out.println
      //  System.out.println("***");
      //  System.out.println("****");   
      //  System.out.println("*\n**");
      //  //
      //  //String name = "Jinit Desai";
      //  //int age = 22;
      //  int a = 25;
      //  int b = 10; // The advantage of using a variable is that we can change the value of variable the next time we define that variable
      //  //double price = 18;
      //  int sum = a + b;
      //  System.out.println(sum);
      //       //b=20;
      //       //System.out.println(sum);
      //  int diff = b - a;
      //  System.out.println(diff);
      //  int mul = a*b;
      //  System.out.println(mul);
      // Scanner sc = new Scanner (System.in); // System.in is Input window Sys.out is output. Scanner ka object hai sc
      //     //String name = sc.next(); // next is a function to take the input from user 
      //     //System.out.println("Your name is "+name); // next function only considers one token (word) or only first word from input 
      //  String Fullname = sc.nextLine();
      //  System.out.println("Your Full Name is "+Fullname );
      // //
      //     //nextInt() Integer as input
      //   //nextFLoat() Float as input
      //   int c = sc.nextInt();
      //   int d = sc.nextInt();
      //   sum = c + d;
      //   System.out.println("Hello "+Fullname +"\n"+"The sum of the vaues entered is "+sum); //if you want spacing between hello and name give a space after hello inside the double quotes
      //  int age = sc.nextInt();
      //  if (age >= 18){ // Conditional Statements : (If,ELse) (Else if) (Switch) (Break)
      //    System.out.println("You are an Adult "+Fullname);
      //  }
      //  else{
      //    System.out.println("You are not an Adult "+Fullname);   
      //  }
      //  int e = sc.nextInt();
      //  int num = e;
      //  if (e%2 == 0)
      //  {
      //   System.out.println("The Number " +num +" is Even ");
      //  }
      //  else{
      //    System.out.println("The Number " +num +" is ODD ");
      //  }
      //  int f = sc.nextInt();
      //  int g = sc.nextInt();
      //  if (f == g){ // if statement can be used even without curly braces but the only the next line condition would be implemented eg below 
      //    System.out.println( "The number f and g is Equal" +"The value of both the numbers is : "+f );
      //  }
      //  else if(f>g){
      //      System.out.println("The number " +f +" is greater than "+g);
      //    }
      //  else {
      //     System.out.println("The number " +g +" is greater than " +f); // imp else if ke bracket mein else should bhi there if outside the bracket it will give an error
      //    }
         //
       // Quiz Question 
       // If 3 is an even number print Bazinga
       //if (3%2 == 0){
         //System.out.println("Bazinga");
       //}
       //if (3%2 == 0) // in both the above condition the if statements will print the output and we will get correct answer but when curly braces are not used only the very next line ka condition will be checked
        //System.out.println("Bazinga");
       //if (3%2 == 0); // This is a special case in which as we have put; that line will be terminated and the next line will be executed even if the if condition is not satisfied 
       //System.out.println("Bazinga");
       // To comment out multiple line use control and / 
       //
       //int button = sc.nextInt();
      // if(button == 1) // in this case multiple cases are there so here we will use the concept of switch instead of if else statements
      // {
      //   System.out.println("Hello");
      // }
      // else if(button == 2)
      // {
      //   System.out.println("Namate");
      // }
      // else if(button == 3)
      // {
      //   System.out.println("Bonjour");
      // }
      // else 
      // {
      //   System.out.println("Invalid Button");
      // }
      //
      // Switch Concept 
      // Break is a Keyword of Java which helps us to get out of the switch case
      //
      //switch(button)
      // {
      //   case 1: System.out.println("Hello");
      //   break ;
      //   case 2: System.out.println("Namaste");
      //   break;
      //   case 3: System.out.println("Bonjour");
      //   break;
      //   default:System.out.println("Invalid Button"); // In default condition no break is needed as it will automatically come out of the switch case as it is last line
      // }
      //
       // JAVA Lecture 3 Homework 6/3/2022 
       // Q1
       //  int su = h + i;
      //  int diffe = h - i;
      //  int multi = h*i;
      //  int div = h/i;
      //  int mod = h%i;
      //
      //Scanner sc = new Scanner(System.in); 
      //  int h = sc.nextInt();
      //  int i = sc.nextInt();
      //  int operator =sc.nextInt();
      //  switch(operator)
      //  {
      //    case 1 : System.out.println(h + i);
      //    break ;
      //    case 2 : System.out.println(h - i);
      //    break;
      //    case 3 : System.out.println(h*i);
      //    break;
      //    case 4 : if (i == 0)
      //    {
      //     System.out.println("Invalid Dvision");
      //    } else
      //              System.out.println(h/i);
      //    break;
      //    case 5 : if (i == 0)
      //    {
      //     System.out.println("Invalid Dvision");
      //    } else
      //    System.out.println(h%i);
      //    break;
      //    default : System.out.println(" Invalid Operation ");
      //  }
      // //Q2
      // int button = sc.nextInt(); 
      // switch(button)
      // {
      //   case 1 : System.out.println("January");
      //   break;
      //   case 2 : System.out.println("February");
      //   break;
      //   case 3 : System.out.println("March");
      //   break;
      //   case 4 :System.out.println("April");
      //   break;
      //   case 5 : System.out.println("May");
      //   break;
      //   case 6 : System.out.println("June");
      //   break;
      //   case 7 : System.out.println("July");
      //   break ;
      //   case 8 : System.out.println("August");
      //   break;
      //   case 9 : System.out.println("September");
      //   break;
      //   case 10 : System.out.println("October");
      //   break;
      //   case 11 : System.out.println("November");
      //   break;
      //   case 12 : System.out.println("December");
      // }
       //
       // Hackerrank sum 
      //  int n = sc.nextInt();
      //  if (n%2 != 0 )
      //  System.out.println("Weird");
      //  else if (n % 2 == 0 && 2<=n && n<=5)
      //  System.out.println("Not Weird");
      //  else if (n % 2 == 0 && 6<=n && n<=20)
      //  System.out.println("Weird");
      //  else if (n % 2 == 0 && n>20)
      //  System.out.println("Not Weird");
      //sc.close(); //Scanner objects need to be closed after one is done using them. So, after you're done with it you should call the following before the end of your main method
      //
      // Loops 
      // For loop While loop do while loop
      // Condition
      // For (initalization; condition; updation) { }
      //  i++ =(i = i+1) i is the counter 
      // for (int i = 1; i <24; i++)
      // {
      //   System.out.println(i +" Hello World ");
      // }

      // int i = 12;
      // while (i<11)
      // {
      //   System.out.println(i);
      //   i++;
      // }
      //   int i = 12;
      // do 
      // {
      //   System.out.println(i);
      //   i++;
      // }
      // while(i<11);
          // In do while even if the condition is false the execution will be done atleast once whereas in if and while the condition is checked first
      // Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();
      // int i = 1;
      // while(i<=n);
      // int sum = i+ n ;
      // System.out.println(sum);  
      //sc.close();

      // Scanner sc = new Scanner (System.in);
      // int c = sc.nextInt();
      // double b = sc.nextDouble();
      // String a = sc.nextLine();
      // System.out.println ("String: "+a);
      // System.out.println ("Double: "+b);
      // System.out.println ("Int: "+c);
      // sc.close();

      Scanner sc = new Scanner(System.in);
      // int sum = 0;
      // int n = sc.nextInt();
      
      // for (int i=1; i<=n; i++)
      // {
      //   sum= sum+i;
        
      // }
      // System.out.println(sum);
      // int multiply = 1;
      // int n = 2;
      // for (int i = 1; i<=10; i++)
      // {
      //   multiply = n * i;
      //   System.out.println(n +" x "+ i +" = "+multiply);
      // } 
      // Lecture 4 Homework 
      //Q1
        // int n = sc.nextInt();
        // for (int i=1; i <= n; i++)
        // {
        //   if (i % 2 == 0)
        //   System.out.println(i);
        // }
      //Q2
      // for(;;)
      // {
      //   System.out.println("Apna College");
      // }
      // Q3
      // int button = sc.nextInt();
      // switch (button)
      // {
      // case 0 : System.out.println("Stop");
      // break;
      // case 1 : int x = sc.nextInt();
      // if (x >= 90)
      // {
      //   System.out.println("This is Good");
      // }
      // else if ( x<= 89 && x>=60)
      // {
      //   System.out.println("This is also Good");
      // }
      // else if (x<=59 && x>=0)
      // {
      //   System.out.println("This is good as well. Because Marks does not matter our efforts does");
      // }
      // }
      // Q4 bonus prime number two conditions number is divisible y 1 and by itself 
      //  
      // int n = sc.nextInt();
      // boolean isPrime = true;
      // for (int i =2 ; i<=n/2;i++){
      //   if (n%i==0){
      //     isPrime = false;
      //     break;
      //   }
      // }
      // if(isPrime){
      //   if(n==1){
      //     System.out.println("This is neither Prime nor Composite");
      //   }
      //   else {
      //     System.out.println("This is a Prime Number");
      //   }
      // }else {
      //   System.out.println("This is not a Prime Number");;
      // }
     // Print the Pattern Solid Rectangle
     // Here we have used the conept of nested loops 
     // We have used two For Loops
     //outer loop 
     
    //  for (int i=1;i<=4;i++)
    //  { //inner loop
    //   for (int j=1; j<= 5; j++)
    //    {
    //      System.out.print("*");
    //    }
    //    System.out.println(" ");
    // }
    // Print the Pattern Hollow Rectangle 
    // for(int i =1; i<=4;i++)
    // {
    //   for(int j =1; j<=5;j++)
    //   {
    //     // cell (i,j) we want to print star only if the value of i =1 or j= 1 
    //     if (i ==1 || j==1 || i == 4 || j==5)
    //     {
    //       System.out.print("*");
    //     }
    //     else{
    //       System.out.print(" "); // this is used so that we can have space in cells which are empty 
    //     }

    //   }
    //   System.out.println();
    // }
    // Print the Pattern Half Pyramid 
    // int n = 1;
    // n++;
    
    // for (int i=1;i<=5;i++)
    // {
    //   for (int j=1;j<=i;j++){
    //   System.out.print("*");
    // }
    
    //  System.out.println(" ");
    // }
    // Print the Pattern Inverted Half Pyramid 
    // int n = 1;
    // n++;
    
    // for (int i=5;i>=1;i--)
    // {
    //   for (int j=1;j<=i;j++){
    //   System.out.print("*");
    // }
    
    //  System.out.println(" ");
    // }
    //   int n = 5;
    //  for (int i = 1; i <= n ; i++)
    //  { // inner loop >- Space print
    //    for(int j = 1; j<= n-i; j++)
    //    {
    //      System.out.print(" ");
    //    }
    //    for (int k= 1 ;k<=i;k++ )
    //    {
    //      System.out.print("*");
    //    }
    //    System.out.println();
    //  }

    // Half Pyramid with Numbers 
  //   int n = sc.nextInt();
  //   for (int i = 1; i<=n;i++){
  //     for (int j = 1; j<=i;j++){
  //     System.out.print(j);
  //   } System.out.println();
  // }
  // Inverted Half Pyramid with Numbers
  // int n = 5;
  //   for (int i = n; i>=1;i--){
  //     for (int j = 1; j<=i;j++){
  //     System.out.print(j+" ");
  //   } System.out.println();
  // }
  //Floyds Triangle 
  // int n = 5;
  // int k = 1;
  // for (int i =1; i<=n;i++){
  //   for (int j =1 ; j<=i;j++){
  //     System.out.print(k+" ");
  //     k++;
  //   }
  //   System.out.println();
  // }
  //0 1 Triangle
  // int n = 5;
  // for (int i =1; i<=n;i++){
  //   for (int j =1 ; j<=i;j++){
  //     int sum = i+j;
  //     if (sum % 2 ==0){
  //     System.out.print("1 ");}
  //     else 
  //     {System.out.print("0 ");}
  //   }
  //   System.out.println();
  // }
  // Homework Lecture 5 
  // Q1 A solid Rohmbus 
  // int n = 5;
  // for (int i = 1; i<=n;i++){
  //   for(int j = n-i; j >= 1 ; j--) // initialization condition i.e j = n-i only happens once for second time j-- = 3 then it will directly check if j is greater than equal to 1
  //   {
  //     System.out.print(" ");
  //   }
  //   for (int k = 1; k <= n;k++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  // }
   // Q2 A number Pyramid
  //  int n = 5;
  //  for (int i = 1; i<= n;i++){
  //    for (int j = n-i;j>=1;j--){
  //      System.out.print(" ");
  //    }
  //    for(int k = 1; k<=i;k++){
  //      System.out.print(i+" ");
  //    }
  //    System.out.println();
  //  }
  // JAVA Exercise 1
    // Q1 Input 3 no from user and Print Avg
    //Scanner sc = new Scanner(System.in);
    // float x = sc.nextFloat();
    // float y = sc.nextFloat();
    // float z = sc.nextFloat();
    // float Average = (x+y+z)/3;
    // System.out.println(Average);
    //Q2 - Q5 ,Q8-9 in Functions file
    //Q6 Do while Infinite Loop
    // int i = sc.nextInt(); 
    // do {
    //    System.out.println("*");
    //  }
    //  while (i >=1);
    //Q7 Write a program to enter the numbers till the user wants and at the end it 
    //should display the count of positive, negative and zeros entered.
    // int z = 0;
    // int p = 0;
    // int g = 0;
    // int n = sc.nextInt();
    // for (int i = 1 ; i<=n;i++){
    //   int k = sc.nextInt();
    //   if (k == 0)
    //   {z = z+1;}
    //   else if (k>= 1)
    //   {p = p+1;} 
    //   else 
    //   {g = g+1;}
    // }
    // System.out.println("The number of zeros is "+z);
    // System.out.println("The number of Positive value is "+p);
    // System.out.println("The number of Negative values is "+g);
    //Q10 Write a program to print Fibonacci series of n terms where n is input by user
    //IMP SUM easy Logic
    // int n =sc.nextInt();
    // int a = 0, b = 1;   
    // System.out.print(a+" ");
    // if(n > 1) {
    //     //find nth term
    //     for(int i=2; i<=n; i++) {
    //         System.out.print(b+" ");
    //         //the concept below is called swapping
    //         int temp = b;
    //         b = a + b;
    //         a = temp;
    //     }
    //     System.out.println();
    //     sc.close(); 
    //     }
    //Hackerrank Question Important Concept
    //Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        /*Note: If you use the nextLine() method immediately following the nextInt() method, 
        recall that nextInt() reads integer tokens; because of this, the last newline character
        for that line of integer input is still queued in the input buffer and the next nextLine() 
        will be reading the remainder of the integer line (which is empty).
        */
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("String: "+str);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);

    }
  }