import java.util.*;

public class TV {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float p, pgst, gst, pdis, dis, bill;
        System.out.print("Input MRP of TV: ");
        p = sc.nextFloat();
        if(p >= 25000) {
            pgst = 18;
            pdis = 7;
        }
        else {
            pgst = 5;
            pdis = 2;
        }
        gst = p * pgst/100;
        dis = p * pdis/100;
        bill = p + gst - dis;
        System.out.println(pgst+" % GST = Rs." + gst);
        System.out.println(pdis+ " % Discount = Rs." +dis);
        System.out.println("Net Bill = Rs." + bill);
    }
    
}
