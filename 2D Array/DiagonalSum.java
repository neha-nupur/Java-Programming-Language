public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // O(n^2) - Not optimized due to two loops 
        // for(int i = 0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(i == j) {
        //             sum+= matrix[i][j];
        //         } else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;


        // More Optimized - O(n)
        for(int i=0; i<matrix.length; i++) {
            //pd- Primary Diagonal
            sum+= matrix[i][i];
    
            //sd - Secondary Diagonal
            if(i != matrix.length-1-i) {
                sum+=matrix[i] [matrix.length-1-i];
            }

            
    }

    return sum;

    }

    public static void main(String args[]) {
        int matrix[][]= {{1, 2, 3, 4}, 
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
    
        System.out.println(diagonalSum(matrix));
    }

}

