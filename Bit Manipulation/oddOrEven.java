public class oddOrEven{
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("Even number");
        } else { //odd number
            System.out.println("Odd number");
        } 
    }

    public static void main(String args[]) {
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14); 
    }
}