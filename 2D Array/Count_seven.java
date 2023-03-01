public class Count_seven {
    public static void main(String args[]) {
        int array[][] = {{4, 7, 8} , {8, 8, 7}};
        int CountOf7 = 0;

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                if(array[i][j] == 7) {
                    CountOf7++;
                }
            }
        }

        System.out.println("Count of 7 is : " +CountOf7);
    }
    
}
