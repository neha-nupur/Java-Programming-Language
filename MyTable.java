import java.util.*;

public class MyTable {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        if(args.length != 1) {
            System.out.println("Invalid no. of arguments. Plz specify a no.");
            return;
        }

        n = Integer.parseInt(args[0]);
            System.out.print("Table of " );
            int num = sc.nextInt();
            for(int i=1; i <= 10; i++){
                System.out.println(num+" * "+i+" = "+num*i);  
            }  
    }
    
}
