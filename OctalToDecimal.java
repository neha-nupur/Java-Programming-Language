import java.util.*;

public class OctalToDecimal {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int rem, dec = 0, place = 1;
        System.out.print("Input an Octal no: ");
        float oct = sc.nextFloat();
        
        while( oct > 0){
            rem = (int) oct % 10;
            dec = dec + rem * place;
            oct = oct / 10;
            place = place * 8;
        }
        System.out.println("Decimal = " + dec);
    }
}
