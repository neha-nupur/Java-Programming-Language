public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length; i++) {
            if(largest<numbers[i]) {
                largest = numbers[i];
            }

            if(smallest>numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number : " +smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[]= {6,2,78,23,9,1,4};
        System.out.println("Largest number : " +getLargest(numbers));
    }
}
