public class Power {
    public static void main(String args[]) {
        System.out.println(power(2, 5));
        System.out.println(optimizedPower(2, 10));
    }

    static int power(int x, int n) { // O(n)
        if(n==0) { //base case
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    static int optimizedPower(int a, int n){ // O(logn)
        if(n==0) {
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        if(n%2 != 0) {
            halfPowerSq = a * halfPowerSq;
            
        }
        return halfPowerSq;
    }
    
}
