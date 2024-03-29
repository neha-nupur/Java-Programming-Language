public class GridWays {

    //Time Complexity - O(2^n+m) ---> Worst Time Complexity
    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if(i == n-1 && j == m-1) {  // Condition for last cell
            return 1;
        } else if(i == n || j == n) { // Boundary cross condition
            return 0;
        }

        int way1 = gridWays(i+1, j, n, m);  //row + 1 = downward
        int way2 = gridWays(i, j+1, n, m); //col + 1 = forward
        return way1 + way2;
    }
    public static void main(String args[]) {
        int n = 3; 
        int m = 3; 
        System.out.println(gridWays(0, 0, n, m));
    }
}
