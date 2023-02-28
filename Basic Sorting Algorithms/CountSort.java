public class CountSort {
    public static void countSort(int arr[]) {

        //For finding the largest value from an array 
        // to create count accounding to it
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        

        //Count - for counting the frequency of an 
        // occurred elements
       int count[] = new int[largest+1];
       for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
       }

       //Sorting into ascending order
       int j = 0;
       for(int i=0; i<count.length; i++) {
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
       }

    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countSort(arr);
        print(arr);
    }
}

