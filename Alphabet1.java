import java.util.*;

public class Alphabet1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character : ");
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            System.out.println(ch+" is an alphabet");
        } else {
            System.out.println(ch+" is not an alphabet");
        }
    }
}
