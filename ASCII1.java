import java.util.*;

public class ASCII1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII Value : " +(int)ch);
    }
}
