public class FiboN {
    //Function to return list containing first n fibonacci numbers where numbers starts from 1. (i.e., 1 1 2 3 5 8....)
    
    public static long[] printFibb(int n) {
        long[] fibonacciNumbers = new long[n];
        if (n >= 1) {
            fibonacciNumbers[0] = 1;
        }
        if (n >= 2) {
            fibonacciNumbers[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        int n = 10; // number of Fibonacci numbers to print
        long[] fibonacciNumbers = printFibb(n);
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }

}
