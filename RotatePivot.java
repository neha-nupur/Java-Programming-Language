public class RotatePivot {
    public static int find(int arr[], int target) {

        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] == target) {
                return mid;
            }

            else if(arr[low] <= arr[mid]) {
                //1st part is sorted
                if(arr[low] <= target && arr[mid] > target){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if(arr[mid] <= arr[high]) {
                if(arr[mid] < target && arr[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(find(arr, 5));
    }
}
