public class RatInMaze {
    // Helper function to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Helper function to check if the current position (x, y) is safe to move
    /*   public static boolean isSafe(int maze[][], int x, int y) {
        // If the current position is outside of the maze or is blocked, return false
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }   */


        public static boolean isSafe(int maze[][], int x, int y) {
        // If the current position is outside of the maze or is blocked, return false
            if (x < 0 || x >= maze.length || y < 0 || y >= maze.length || maze[x][y] != 1) {
                return false;
            } else {
                return true;
            }
        }

    // function backtracking
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N]; // Initialize the solution matrix
        if (solveMazeUtil(maze, 0, 0, sol) == false) { // Start the recursive backtracking algorithm from the starting position (0, 0)
            System.out.print("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    // Recursive helper function using backtracking
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // If we have reached the destination (bottom-right corner of the maze)
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1; // Mark the current position as part of the solution path
            return true;
        }

        // Check if the current position is valid and not already part of the solution path
        if (isSafe(maze, x, y) == true) {
            if (sol[x][y] == 1) // If the current position is already part of the solution path, return false
                return false;
            sol[x][y] = 1; // Mark the current position as part of the solution path
            // Move down and check if a solution can be found
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
            // If a solution cannot be found by moving down, move right and check if a solution can be found
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            sol[x][y] = 0; // If no solution can be found by moving either down or right, backtrack by unmarking the current position as part of the solution path
            return false;
        }
        return false;
    }


    public static void main(String args[]) {
        int maze[][] = { {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};
        solveMaze(maze);
    }
}
