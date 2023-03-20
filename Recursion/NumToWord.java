public class NumToWord {

    static String digit[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigit(int numbers){
        if(numbers == 0) {
            return; 
        }

        // 12345 = 12345 % 10 = 5 print 1234 
        int lastDigit = numbers % 10;
        numbers = numbers/10;
        printDigit(numbers);

        System.out.print(digit[lastDigit]+ " ");
    }

    public static void main(String args[]) {
        printDigit(53728492);
        System.out.println();
    }
    
}
