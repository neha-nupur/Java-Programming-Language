import java.util.*;

public class DecimalToBinary {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int rem, place = 1;
        long bin = 0;
        System.out.print("Input a decimal number:");
        int n = sc.nextInt();

        while( n > 0) {
            rem = n % 2;
            bin = bin + rem * place;
            n = n/2;
            place = place * 10;
        }
        System.out.println("Binary = " +bin);
    }
}
