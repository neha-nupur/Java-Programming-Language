public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // recursive call for left part-  mergeSort 
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        // call merge to merge left and right sorted part
        merge(arr, si, mid, ei);
    }

    // merge method to merge the sorted parts
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp arr

        // store sorted element into temp and copy it into original array to get the sorted array

        //check for either left part or right part
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // if right part is checked, then to check the left part
        while(i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;        
        }

        // if left part is checked, then to check the right part
        while(j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        // copy temp to original array
        for(k=0, i = si; k <temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}