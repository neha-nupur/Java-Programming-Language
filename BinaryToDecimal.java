import java.util.*;

public class BinaryToDecimal {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int rem, dec = 0, place = 1;
        System.out.print("Input binary number: ");
        long bin = sc.nextInt();
        
        while (bin > 0) {
            rem = (int)bin % 2;
            dec = dec + rem * place;
            bin = bin / 10;
            place = place * 2;
        }
        System.out.println("Decimal = " + dec);
    }
}
