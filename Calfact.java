public class Calfact {

    public static void main(String args[]) {
        int n;
        long fact = 1; 
        
        if(args.length != 1) {
            System.out.println("Invalid no. of arguments. Plz specify a no.");
            return;
        }

        n = Integer.parseInt(args[0]);
            System.out.print("Factorial of " +n+ " = ");

            while(n > 1) {
                fact = fact * n;
                n--;
            }
            System.out.print(fact);
    }
    
}
