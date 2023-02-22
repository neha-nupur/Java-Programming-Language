import java.util.*;

public class Fibonacci {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c = 0;
        System.out.print("Input n- terms: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(c+" ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}
