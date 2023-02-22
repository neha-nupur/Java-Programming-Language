import java.util.*;

public class Pat4 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character to print pattern:");

        char ch = sc.next().charAt(0);

        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
    
}
