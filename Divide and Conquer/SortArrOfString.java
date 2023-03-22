public class SortArrOfString {
    public static String[] mergeSort(String arr[], int lo, int hi){
        //base condition
        if(lo == hi) {
            String[] A = {arr[lo]};
            return A; 
        }

        //find the mid
        int mid = lo +(hi-lo)/2;

        
        String arr1[] = mergeSort(arr, lo, mid); // Recursive call for arr1[] which is for left part
        String arr2[] = mergeSort(arr, mid+1, hi); // Recursive call for arr2[] which is for right part

        // String to merge both sorted array of strings
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    // helper function for merge which will do the work of traversing and checking 
    static String[] merge(String arr1[], String arr2[]){
        int m = arr1.length;
        int n = arr2.length;

        String [] arr3 = new String [m+n];

        int idx = 0;
        int i = 0; 
        int j = 0;

        while(i<m && j<n) {  // check til the index(i) is less that mid and index(j) is less than high
            if(isAlphabeticallySmaller(arr1[i], arr2[j])) { // check if the string is less in alphabetical order
                arr3[idx] = arr1[i];
                i++;
                idx++;
            } else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }


        //check for remaining left unsorted part
        while(i < m) {
            arr3[idx] = arr1[i];
            i++; 
            idx++;
        }

        //check for remaining right unsorted part
        while(j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;

    }

    //Return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if(str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }


    public static void main(String args[]) {
        String [] arr = {"sun", "earth", "mars", "mercury"};
        String [] a = mergeSort(arr, 0, arr.length-1);

        for(int i = 0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
