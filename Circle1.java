import java.util.Scanner; 

public class Circle1 {
    public static void main(String args[]) {
        float r, a, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle : ");
        r = sc.nextInt();
        a = 3.14F * r * r;
        c = 2 * 3.14F * r;
        System.out.println("Area of a circle : "+a+" sq.cm");
        System.out.println("Circumference of a circle : "+c+" cm ");
    }
    
}
