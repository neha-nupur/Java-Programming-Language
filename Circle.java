import java.util.*;

public class Circle {
    public static void main(String arg[]){
        float r, a, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius of a circle in cm: ");
        r = sc.nextFloat();
        a = 3.14F * r * r;
        c = 2 * 3.14F * r;
        System.out.println("Area of a circle: " +a+ " sq cm");
        System.out.println("Circumference of a circle:" +c+ " cm");
    }
}
