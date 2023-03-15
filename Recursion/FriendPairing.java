public class FriendPairing {
    public static void main(String args[]) {
        System.out.println(friendPairing(3));
    }

    static int friendPairing(int n) {
        //base case
        if(n==1 || n==2) {
            return n;
        }

        //WE have two choices- 1. Single  2. Pair
        //1. Single
        int fnm1 = friendPairing(n-1);
        
        //2. Pair
        int fnm2 = friendPairing(n-2);
        int pairWays = (n-1) * fnm2;

        // total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }
}
