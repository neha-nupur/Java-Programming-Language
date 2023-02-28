import java.util.*;

public class SearchMinElement {
    public static int searchMax(int matrix[][]){
        int key = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] < key) {
                    key = matrix[i][j];
                }
            }
        }
        return key;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(searchMax(matrix));
    }
}
