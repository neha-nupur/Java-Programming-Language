import java.util.*;

public class LastDigit {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Input any number: ");
        n = sc.nextDouble();
        n%=10;
        System.out.println("LastDigit = " + n);
    }
}
