public class KadanesHW {
    public static void kadanes(int numbers[]) {
        int ms = numbers[0];
        int cs = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is: " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-7, -2, -3, -4};
        kadanes(numbers);
    }
}