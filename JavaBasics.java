import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class JavaBasics {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        //int a = 10;
        // System.out.println(a);
    //         System.out.println(b);
    //     }
    // }
    // public static int factorial (int n){
    //     int f = 1;

    //     for(int i=1; i<=n; i++){
    //         f = f *i;
    //     }
    //     return f;  //factorial of n
    // }


        // public static int binCoeff(int n, int r) {
        //     int fact_n = factorial(n);
        //     int fact_r = factorial(r);
        //     int fact_nmr = factorial(n-r);

        //     int binCoeff = fact_n / (fact_r * fact_nmr);
        //     return binCoeff;
        // }
        //     public static void main ( String args[]) {
        //      System.out.println(binCoeff (5,2));
        //     }

        // }


        // System.out.print("Input value for a: ");
        // int a = sc.nextInt();
        // System.out.print("Input value for b: ");
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println("Product = " +product);

        // System.out.print("Input radius of a circle: ");
        // float rad = sc.nextFloat();
        // float area = 3.14F * rad * rad;
        // System.out.print("Area of a circle ="+ area);

            // float number = sc.nextInt();
            // System.out.println(number);

            // float a = 25.12f;
            // int b = (int) a;
            // System.out.println(b);

//Arithmetic Operators - Binary Operators

            // int A = 10; 
            // int B = 5;
            // System.out.println("Add = "+(A+B));
            // System.out.println("Subtract = "+(A-B));
            // System.out.println("Multiply = "+(A*B));
            // System.out.println("Divide = "+(A/B));
            // System.out.println("Remainder = "+(A%B));

//Arithmetic Operators - Unary Operators

            // int a = 10; 
            // int b = ++a; 
            // System.out.println(a);
            // System.out.println(b);

            // int a = 10;
            // int b = a++;
            // System.out.println(a);
            // System.out.println(b);

            // int a = 10;
            // int b = a--;
            // System.out.println(a);
            // System.out.println(b);

            // int a = 10;
            // int b = --a;
            // System.out.println(a);
            // System.out.println(b);

//Relational Operators
//Equal Operator
        //     int A = 10; 
        //    // int B = 5;
        //     int B = 10;
        //     System.out.println((A == B));

// Not EqualTo (inequality) 
            // int A = 10; 
            // int B = 1;
            // System.out.println((A != B));

// Greaterthan
            // int A = 10; 
            // int B = 1;
            // System.out.println((A > B));

            //Conditional Operators ----------
// if...else...
            // int age = 16;
        // if(age <= 18) {
        //     System.out.println("adult : drive, vote");
        // } else {
        //     System.out.println("not adult");
        // }
            // int A = 10; 
            // int B = 5; 

            // if(A >= B) {
            //     System.out.println("A is largest of 2");
            // } else {
            //     System.out.println("B is largest of 2");
            // }

        
            // int number = sc.nextInt();

        // if(number % 2 ==0) {
        //     System.out.println("EVEN");
        // } else {
        //     System.out.println("ODD");
        // }
        
// if...else if... else

            // int age = 19;

            // if (age >= 18){
            //     System.out.println("Adult");
            // } else if(age >= 13 && age < 18) { 
            //     System.out.println("Teenager");
            // } else {
            //     System.out.println("Child");
            // }

                // int income = sc.nextInt();
                // int tax;

                // if(income < 500000) {
                //     tax = 0;
                // } else if (income >= 500000 && income < 1000000) {
                //     tax = (int ) (income * 0.2);
                // } else {
                //     tax = (int) (income * 0.3);
                // }

                // System.out.println("Your tax is: " + tax);
// Largest of 3....
                    // int A = 1, B = 5, C = 8;

                    // if((A>=B) && (A>=C)) {
                    //     System.out.println("A is the largest");
                    // } else if (B >= C){
                    //     System.out.println("B is the largest");
                    // } else {
                    //     System.out.println("C is the largest");
                    // }
// Ternary Operator....
                    // int number = 43;

                    // //ternary operator
                    // String type = ((number % 2) == 0) ? "even" : "odd";
                    // System.out.println(type);
                        // int marks = 78;

                        // String reportCard = marks >= 33 ? "PASS" : "FAIL";
                        // System.out.println(reportCard);

                        // int number = 2;
                        // switch(number) {
                        //     case 1: System.out.println("samosa");
                        //             break;
                        //     case 2: System.out.println("burger");
                        //             break;
                        //     case 3: System.out.println("Mango shake");
                        //             break;
                        //     default: System.out.println("We wake up");
                            
                            // System.out.print("Enter a : ");
                            // int a = sc.nextInt();
                            // System.out.print("Enter b :");
                            // int b = sc.nextInt();
                            // System.out.print("Enter Operator : ");
                            // char operator = sc.next().charAt(0);

                            // switch(operator) {
                            //     case '+' : System.out.println(a+b);
                            //                 break;
                            //     case '-' : System.out.println(a-b);
                            //                 break;
                            //     case '*' : System.out.println(a*b);
                            //                 break;
                            //     case '/' : System.out.println(a/b);
                            //                 break;
                            //     case '%' : System.out.println(a%b);
                            //                 break;
                            //     default : System.out.println("wrong operator");
                            // }


    //Conditional Statements Questions...........

// Print whether a number is positive or negative...................
                            // System.out.print("Enter a number: ");
                            // int a = sc.nextInt();
                             
                            // if( a > 0)
                            //     System.out.println(a+ " is positive.");
                            // else if( a < 0) 
                            //     System.out.println(a+ " is negative.");
            
//Finish code and print "You have a fever" if temp > 100 else "You don't have a fever.".............
                            // double temp = 103.5;
                           
                            // if (temp > 100) 
                            //     System.out.println("You have a fever.");
                            // else 
                            //     System.out.println("You don't have a fever.");

//Write a java program to input week number (1-7) and print day of week name using switch case..............................

                            // System.out.print("Enter a number of week: ");
                            // int number = sc.nextInt();

                            // switch(number) {
                            //     case 1 : System.out.print("Sunday");
                            //             break;
                            //     case 2 : System.out.print("Monday");
                            //             break;
                            //     case 3 : System.out.print("Tuesday");
                            //             break;
                            //     case 4 : System.out.print("Wednesday");
                            //             break;
                            //     case 5 : System.out.print("Thursday");
                            //             break;
                            //     case 6 : System.out.print("Friday");
                            //             break;
                            //     case 7 : System.out.print("Saturday");
                            //             break;
                            //     default : System.out.print("Invalid Week number. Please enter valid week number between (1-7).");
                            // }

// What will be the value of x & y in the following program...........
                                //  int a = 63, b = 36;

                                //  boolean x = ( a < b ) ? true : false;
                                // System.out.println("Value of x = " +x);
                                //  int y = (a > b) ? a : b;
                                //  System.out.print("Value of y = " +y);
                                 
// Write a Java program that takes a year from the user and print whether that year is a leap year or not...................
                                // System.out.print("Enter a year : ");
                                // int year = sc.nextInt();

                                // if ( (year%4 == 0 && year % 100!=0) || year % 400 == 0)
                                //     System.out.println(year + " is a leap year.");
                                //     else
                                //     System.out.print(year + " is not a leap year.");
                                
// While Loop...............................
// print "Hello World" 10 times...........
                                // int counter = 0;

                                // while(counter <= 10) {
                                //     System.out.println("Hello World");
                                //     counter++;
                                // }

// Print number from 1 to 10................
                                // int counter = 1;

                                // while(counter <= 100) {
                                //     System.out.print(counter+ " ");
                                //     counter++;
                                // }
                                // System.out.println();

// Print number from 1 to (range)n................
                                // System.out.print("Input n terms: ");
                                // int counter = 1;
                                // int range = sc.nextInt();


                                // while(counter <= range) {
                                //     System.out.print(counter+ " ");
                                //     counter++;
                                // }
                                // System.out.println();

// Print SUM of first n natural numbers...............
                                    // System.out.print("Input n natural numbes: ");
                                    // int n = sc.nextInt();
                                    // int sum = 0;
                                    // for ( int i = 1; i<=n; i++) {
                                    //     sum = sum + i;
                                    // }
                                    // System.out.println(sum);

// Print Hello World using for loop...........

                                    // for(int i = 1; i <= 10; i++){
                                    //     System.out.println("Hello World");
                                    // }

// Print SQUARE patterns..............
                                    // for(int i = 1; i <= 4; i++) {
                                    //     System.out.println("* * * *");
                                    // }

                                    // int i = 1;
                                    // while ( i <= 4) {
                                    //     System.out.println("* * * *");
                                    //     i++;
                                    // }

// Print REVERSE of a number............
                                //  int n = 10899;
                                 
                                //  while( n > 0) {
                                //     int lastDigit = n % 10;
                                //     System.out.print(lastDigit+ " ");
                                //     n = n / 10;
                                //  }
                                //  System.out.println();

// Reverse the given number...........
                                // int rev = 0;
                                // int n = 10899;

                                // while (n > 0) {
                                //     int lastDigit = n%10;
                                //     rev = (rev * 10) + lastDigit;
                                //     n = n / 10;
                                // }
                                // System.out.println(rev);

//do...while loop..............
                                // int counter = 1;

                                // do {
                                //     System.out.println("Hello World");
                                //     counter++;
                                // } while(counter <= 10);

//break statement........
                                // for(int i = 1; i <= 5; i++) {
                                //     if(i == 3) {
                                //         break;
                                //     }
                                //     System.out.println(i);
                                // }

                                // System.out.println("I am out of the loop");
                                
//break(keyword) statement.........
                            // do{
                            //     System.out.print("Enter your number: ");
                            //     int n = sc.nextInt();

                            //     if(n % 10 == 0){
                            //         break;
                            //     }
                            //     System.out.println(n);
                            // }while(true);

//Continue(keyword) statement.......
                            // for(int i = 1; i <=10; i++) {
                            //     if(i ==3){
                            //         continue;
                            //     } else if (i == 7) {
                            //         continue;
                            //     }else 
                            //     System.out.println(i);

//Continue keyword 2........
                            // do{
                            //     System.out.print("Enter Your Number: ");
                            //     int n = sc.nextInt();

                            //     if(n % 10 == 0) {
                            //         continue;
                            //     }
                            //     System.out.println("number was : "  + n);
                            // }while(true);

//Check a number is prime or not?..
                            // System.out.print("Enter any number: ");
                            // int n = sc.nextInt();

                            // if(n ==2){
                            //     System.out.println(n + " is prime");
                            // } else {
                            //     boolean isPrime = true;
                            //     for(int i = 2; i <= n-2; i++) { // for (int i = 2; i <= Math.sqrt(n); i++) OR for (int i = 2; i <= n/2; i++) 
                            //         if(n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
                            //             isPrime = false; // Means n is a composite number
                            //         } 
                            //     }

                            //     if(isPrime == true) {
                            //         System.out.println(n + " is prime");
                            //     }else {
                            //         System.out.println(n + " is not prime");
                            //     }
                            // }
// Loop Questions of Assignment.......

// How many times "Hello" is printed?

                            // for(int i = 0; i < 5; i++) {
                            //     System.out.println("Hello");
                            //     i +=2;
                            // }

// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

                            // int number;
                            // int choice;
                            // int evenSum = 0;
                            // int oddSum = 0;

                            // do {
                            //     System.out.print("Enter the number: ");
                            //     number = sc.nextInt();

                            //     if(number % 2 ==0){
                            //         evenSum += number;
                            //     }else {
                            //         oddSum += number;
                            //     }

                            //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no ");
                            //      choice = sc.nextInt();               
                            // } while (choice == 1);

                            // System.out.println("Sum of even numbers: " +evenSum);
                            // System.out.println("Sum of odd numbers: " +oddSum);


//Write a program to find the factorial of any number entered by the user..

                            
                            int fact = 1;
                            
                            System.out.print("Enter a number: ");
                            int n = sc.nextInt();

                            // for ( int i = 1; i <= n; i++) {
                            //     fact = fact * i;
                            // }

                            while(n>1) {
                                fact = fact * n;
                                n--;
                            }

                            System.out.println("Factorial: " + fact);

// Write a program to print the multiplication table of a number N, entered by the user...

                            // System.out.print("Enter a number: ");
                            // int n = sc.nextInt();

                            // for ( int i = 1; i <= 10; i++) {
                            //     System.out.println(n + " X " + i + " = " +n*i);
                                
                            // }
                            // System.out.println();

    //Second method by usind method of java...
                            
                // class MultiplicationTable {
                //     public static void printMultiplicationTable(){
                //         Scanner sc = new Scanner(System.in);
                        

                //         int n = sc.nextInt();
                //         for (int i = 1; i <= 10; i++){
                //             System.out.println(n+ " X " +i+ " = " +n*i);
                //         }
                //     }

                //     public static void main(String s[]) {
                //         System.out.print("Enter a number: ");
                //         printMultiplicationTable();

// What is the errors in this code?
                // public class Solution{
                    
                //     public static void main(String args[]) {

                //     for(int i=0;i<=5;i++ ) {
                //         System.out.println("i = "+i); 

                //         System.out.println("i after the loop = "+ i );
                // }
            }

                    }
                
                       
                    

