import java.util.Scanner;

public class Methods {
    
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 0;
    }


    public static int calculateSum(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

// Swaping of two numbers............

    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;
    }

//Product of two numbers..........

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

// Factorial of two numbers..........

    public static int factorial(int n) {
        int f = 1; 

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f; // factorial of n
    }

// Binomial Coefficient of two numbers... (n,r)

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/ (fact_r * fact_nmr);
        return binCoeff;
    }


// Function Overloading.....(Using parameters)

    // //func to calc sum of 2 nums
    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // //func to calc sum of 3 nums
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

// Function Overloading.....(Using Datatypes)

    //func to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    //func to calc float sum
    public static float sum(float a, float b) {
        return a + b;
    }
    
// Check if a number is Prime or not....

    // //only for n<=2
    // public static boolean isPrime(int n) {
    //     // corner case
    //     //2
    //     if(n == 2) {
    //         return true;
    //     }

    //     boolean isPrime = true;
    //     for(int i = 2; i <= n-1; i++) {
    //         if(n % 2 == 0) {
    //             isPrime = false; //Completely dividing --> Composite or Non-Prime
    //         break;
    //         }
            
    //     }
    //     return isPrime;
    // }



// Check if a number is Prime or not....(For optimized loop)
        
        public static boolean isPrime(int n) {
            if(n == 2) {
                return true;
            }

            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % 2 == 0) {
                    return false;
                }
            }
            return true;
        }

// Primes in Range 

        public static void primesInRange(int n) {
            for(int i = 2; i <= n; i++) {
                if(isPrime(i)) {
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }


// Binary to Decimal.......


            public static void binToDec(int binNum) {
                int myNum = binNum;
                int pow = 0;
                int decNum = 0;

                while(binNum > 0) {
                    int lastDigit = binNum % 10;
                    decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

                    pow ++;
                    binNum = binNum / 10;
                }
        
                System.out.println("decimal of " +myNum+ " = " +decNum);

            }

// Decimal to Binary...........

            public static void decToBin(int decNum) {
                int myNum = decNum;
                int pow = 0;
                int binNum = 0;

                while(decNum > 0) {
                    int rem = decNum % 2;
                    binNum = binNum + (rem * (int) Math.pow(10, pow));

                    pow ++;
                    decNum = decNum / 2;
                }
                System.out.println("binary of " +myNum+ " = " +binNum);
            }

            // public static void main(String args[]) {
            //     binToDec(101);
            //     decToBin(7);
            // }

// Functions/Methods Questions....

// 1. Write a java method to compute the average of three numbers..

            public static double average(double x, double y, double z) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Input first number : ");
                x = sc.nextDouble();

                System.out.print("Enter Second number : ");
                y = sc.nextDouble();

                System.out.print("Enter third number : ");
                z = sc.nextDouble();
        
                return (x + y + z)/3;
            }

            // public static void main(String arg[]){
            //     System.out.println("Average of three numbers : " +average(3, 3, 3));
                
            // }

// 2. Write a method named isEven that accepts an int argument. The method should return
// true if the argument is even, or false otherwise. Also write a program to test your method.

             /*   public static void isEven(int n) {
                    Scanner sc = new Scanner(System.in);
                    

                    if(n % 2 == 0) {
                        System.out.print("Even");
                    } else {
                        System.out.print("Odd");
                    }
                    
                }
                public static void main(String arg[]) {
                    isEven(77);
                }
                */


                public static boolean isEven(int number) {
                    if(number % 2 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }

                // public static void main(String arg[]) {
                //     Scanner sc = new Scanner(System.in);
                //     int num;

                //     System.out.print("Enter an integer : ");
                //     num = sc.nextInt();

                //     if(isEven(num)) {
                //         System.out.print("Number is even");
                //     } else {
                //         System.out.print("Number is odd");
                //     }
                    
                // }

// 3. Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)

                    // public static void main(String args[]) {
                    //     System.out.print("Please Enter a number : ");
                    //     Scanner sc = new Scanner(System.in);
                    //     int palindrome = sc.nextInt();
                       

                    //     if(isPalindrome(palindrome)) {
                    //         System.out.println("Number : " + palindrome + " is a palindrome");
                    //     } else {
                    //         System.out.println("Number : " + palindrome + " is not a palindrome");
                    //     }
                    // }

                    public static boolean isPalindrome(int number) {
                        int palindrome = number; // copied number into variable
                        int reverse = 0;

                        while(palindrome != 0) {
                            int remainder = palindrome % 10;
                            reverse = reverse * 10 + remainder;
                            palindrome = palindrome / 10;

                        }
                        // if original and the reverse of number is equal means 
                        // number is palindrome in Java
                        
                        if (number == reverse) {
                            return true;
                        }
                        return false;
                    }

// 5. Write a Java method to compute the sum of the digits in an integer.

                    public static int sumDigits(int n) {
                        int sumOfDigit = 0;
                        while(n > 0) {
                            int lastDigit = n % 10;
                            sumOfDigit += lastDigit;
                            n/=10;
                        }
                        return sumOfDigit;
                    } 

                    public static void main(String args[]) {
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Input an integer: ");
                        int digits = sc.nextInt();
                        System.out.println("The sum is : " + sumDigits(digits));


                            
                    }
                }


