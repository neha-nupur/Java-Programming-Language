public class LastOccur {
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurrence(arr, 5, 0));
    }
    

    static int lastOccurrence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
         
        int isFound = lastOccurrence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
}
