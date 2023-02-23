public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0; 
        int end = numbers.length-1;

        while(start<=end) {
            int mid = (start+end)/2;
            //Comparison
            if(numbers[mid] == key) {
                return mid;
            } 

            if(numbers[mid]> key) {
                return mid - 1;
            } else {
                return mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 8,2,7,3,5,9,1,6};
        int key = 5;

        System.out.println(binarySearch(numbers, key));
    }
}
