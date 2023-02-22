import java.util.*;

public class LD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int n = sc.nextInt();
        n = n%10;
        System.out.println("Last Digit : " +n);
    }
}
