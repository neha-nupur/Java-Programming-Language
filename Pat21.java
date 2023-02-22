public class Pat21 {
    public static void main(String args[]) {
        for(int i = 65; i <= 69; i++ ) { // for(int i = 'A'; i <= 'E'; i++ )
            for (int j = 64; j <= i; j++){
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
}
