import java.util.*;

public class Arithmetic1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st no : ");
        int a = sc.nextInt();
        System.out.print("Input 2nd no : ");
        int b = sc.nextInt();
        System.out.println("Addition = " +(a+b));
        System.out.println("Subtraction = " +(a-b));
        System.out.println("Multiplication = " +(a*b));
        System.out.println("Division = " +(a/b));
        System.out.println("Remainder = " +(a%b));
    }
}
