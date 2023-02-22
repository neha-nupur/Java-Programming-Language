// import java.util.Scanner;

// public class SumRecursive {
//     // Recursive function to find sum of digits

//     static int sdigit(long n) {
//         if(n > 0)
//         return(n % 10 + sdigit(n / 10));
//         else
//         return(0);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         long int n;
//         int s = sdigit(n);
//         System.out.print("Input a number:");
//         n = sc.nextLong();
//         s = sdigit(n);
//         System.out.print("Sum of all digit = " +s);

//     }
// }


// Recursive java program to
// find sum of digits of a number

import java.util.*;
 
class SumRecursive {

    // Function to check sum
    // of digit using recursion
    static int sum_of_digit(int n) {
    
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }
 
    // Driven Program to check above
    public static void main(String args[]) {
        int num = 12345;
        int result = sum_of_digit(num);
        System.out.println("Sum of digits in " + num + " is " + result);
    }
}


 