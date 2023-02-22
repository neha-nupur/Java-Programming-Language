import java.util.*;

public class ASCII {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any one character: ");
        char ch = sc.next().charAt(0);
        System.out.print("ASCII value = " + (int)ch);
    }
}
