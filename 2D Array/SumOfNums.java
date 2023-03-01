public class SumOfNums {
    public static void main(String args[]) {
        int arr[][] = {{1, 4, 9}, 
                        {11, 4, 3},
                        {2, 2, 3}};
        int sum = 0;

        //Sum of 2nd row elements
            for(int j=0; j<arr[0].length; j++) {
                sum+=arr[1][j];
            }
        

        System.out.println("Sum is : " +sum);
    }
}
