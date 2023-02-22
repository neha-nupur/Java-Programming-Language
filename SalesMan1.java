import java.util.*;

public class SalesMan1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Salary : ");
        double sal = sc.nextDouble();
        System.out.print("Input Sales Amount : ");
        double sa = sc.nextDouble(); 
        double pc = (sa >= 500000)?15:5;
        double comm = sa*pc/100;
        double tot = sal + comm;
        System.out.println(pc+"% Commission = Rs."+comm);
        System.out.println("Net Salary = Rs."+tot);
    }
}
