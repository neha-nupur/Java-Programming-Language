public class ReverseAA {
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length-1;

        while(first<last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++; 
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 5, 6, 2, 7};
        
        reverse(numbers);

        for(int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
