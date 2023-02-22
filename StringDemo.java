import java.util.*;

public class StringDemo {
    public static void main(String arg[]){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        s = sc.nextLine();
        System.out.println("In Uppercase = " +s.toUpperCase());
        System.out.println("In Lowercase = " +s.toLowerCase());
        System.out.println("Length = " +s.length());
        System.out.println("Character at 3rd position = " +s.charAt(2));
        System.out.println("Substring from 4th to end =" +s.substring(3));
        System.out.println("Substring from 4th to position 9th =" +s.substring(3,8));
    }
}
