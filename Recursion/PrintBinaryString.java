public class PrintBinaryString {
    public static void main(String args[]) {
        printBinaryString(5, 0, "");
    }

    static void printBinaryString(int n, int lastIndex, String str) {
        
        //base case 
        if(n == 0) {
            System.out.println(str);
            return; 
        }

        // Work - Check last index whether it is 0 or 1 and add it into the string
        if(lastIndex == 0) {
            printBinaryString(n-1, 0, str+"0");
            printBinaryString(n-1, 1, str+"1");
        } else {
            printBinaryString(n-1, 0, str+"0");
        }

        // printBinaryString(n-1, 0, str+"0");

        // if(lastIndex == 0) {
        //     printBinaryString(n-1, 1, str+"1");   
        // }
    }
}
