import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n; 
        long fact = 1;
        System.out.print("Input a no:");
        
        n = sc.nextInt();

        while(n>1){
            fact = fact *n;
            n--;
        }
        System.out.println("Factorial = " +fact);
    }
}
