import java.util.*;

public class MyFactRecursive {
    // Definition of Method
    public static long findfact(int n) {
        
        if(n == 0 || n == 1) 
        return(1);
        
        else 
        return(n * findfact(n - 1));

        }


        public static void main(String arg[]) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Input a no:");
            int n = sc.nextInt();
            long r = findfact(n); // Calling Method

            System.out.println("Factorial =" +r);
            System.out.print("Input another no:");
            n = sc.nextInt();
            r = findfact(n); //Calling Method
            System.out.println("Factorial = " +r);

    }
}
