public class TilingProblem {
    public static void main(String args[]) {
        System.out.println(tilingProblem(4));
    }

    static int tilingProblem(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //vertically placed
        int fnm1 = tilingProblem(n-1);

        //horizontally placed
        int fnm2 = tilingProblem(n-2);

        //totalways
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
}
