import java.util.*;

public class MyFact {
    // Definition of Method
    public static long findfact(int n){
        long fact = 1;

        while(n > 1) {
            fact = fact * n;
            n --;
        }
        return(fact);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a no: ");
        int n = sc.nextInt();
        
        long r = findfact(n); // Calling Method

        System.out.println("Factorial = " +r);
        System.out.print("Input another no:");

        n = sc.nextInt();
        r = findfact(n);  //Calling Method
        System.out.println("Factorial = " +r);
    }
}
