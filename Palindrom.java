import java.util.*;

public class Palindrom {
    public static void main(String arg[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        s = sc.nextLine();
        String rev = "";
        
        for( int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev)) {
            System.out.println("String is Palindrom");
        } else 
        System.out.println("String is not a Palindrom");
    }
}
