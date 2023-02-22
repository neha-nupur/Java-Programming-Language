import java.util.*;
public class ArraysCC{
    public static int linearSearch(String menu[], String key){
        for(int i = 1; i<=menu.length; i++) {
            if(menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String menu[] = {"Dosa", "Sandwich", "Momos", "Samosa", "Pastry"};
        String key = "Momos";

        int index = linearSearch(menu, key);
        if(index == -1) {
            System.out.print("Key not found");
        } else {
            System.out.print("key is at index : "+index);
        }
    }
}




// public class ArraysCC {

//     public static int trappedRainwater(int height[]) {
//         int n = height.length;
//         //calculate leftMax Boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }
//         //calculate rightMax Boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         //loop 
//         for(int i=0; i<n; i++) {
//             //waterLevel = min(leftmax bound, rightmax bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             //trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }
     
//         return trappedWater;
//     }
         
        
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedRainwater(height));
//     }
// }
// // Max Subarrays-------------------------------------------------------
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         //calculate prefix array
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
//         }
        
        
//         for(int i=0; i<numbers.length; i++) { // O(n^2)
//             for(int j=i; j<numbers.length; j++) {
//                 currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
                
                 
//             }
//         }
//         System.out.println("Maximum Sum = " +maxSum);
       
//     }

// // Kadanes Algorithm----------------------

//     public static void kadanes(int numbers[]) { // O(n)
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++) {
//             cs = cs + numbers[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("Our max subarrays sum is : " +ms);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
//         kadanes(numbers);
//     }
// }
// // Pairs in Arrays---------------------------------------------
//     public static void printPairs(int numbers[]) {
//         int tp = 0;
//         for(int i=0; i<numbers.length ; i++) {
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length ; j++) {
//                 System.out.print( "(" + curr + "," + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " +tp);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};

//         printPairs(numbers);
//     }

// }
// // Reverse in Arrays--------------------------------------------
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length-1;

//         while(first < last) {
//             //swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};

//         reverse(numbers);

//         //print
//         for(int i=0; i<numbers.length; i++) {
//             System.out.print(numbers[i]+ " ");
//         }

//         System.out.println();
//     }
// }
// //Binary Search Code---------------------------------------------------
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length-1;

//         while(start <= end) {
//             int mid = (start + end)/2;

//             //comparison
//             if(numbers[mid] == key) { //found
//                 return mid;
//             }
//             if(numbers[mid] < key) { //right
//                 start = mid+1;
//             } else { //left
//                 end = mid-1;
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 90;

//         System.out.println("key found at index: " +binarySearch(numbers, key));
//     }
// }
// // Largest and Smallest in Arrays----------------------------------------
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE; // -infinity
//         int smallest = Integer.MAX_VALUE; // +infinity

//         for(int i=0; i<numbers.length; i++) {
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             } 
//             if(smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("smallest value is : " + smallest);
//         return largest;

//     }

//     public static void main(String agrs[]) {
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("largest numbers = " +getLargest(numbers));
//     }
// }


//     // Linear Search-----------+++++++++++++++++++------------------------------
//     public static int linearSearch(String menu[], int key) {

//         for(int i=0; i<menu.length; i++) {
//             if(menu[i] == key) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         String menu[] = { "dosa", "samosa", "chole bhatura", " we were dreaming"};
//         int key = "samosa";

//         int index = linearSearch(menu, key);
//         if(index == -1) {
//             System.out.println("Not Found");
//         } else {
//             System.out.println("key found at index = " + index);
//         }
//     }

// }
// // Array as Function argument-------------------------------------------

//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             System.out.print(marks[i]+ " ");
            
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         update(marks);

//         // print our marks
//         for(int i=0; i<marks.length; i++) {
//             System.out.print(marks[i]+ " ");
//         }
//         System.out.println();

//     }

// }

    // // Operations in Java------------------------------------------------------
    // public static void main(String args[]){
        
        
    //     int marks[] = new int[50];

    //     Scanner sc = new Scanner(System.in);
    //     // int phy;
    //     // phy = sc.nextInt();

    //     System.out.println("length of array = " + marks.length);

    //     // marks[0] = sc.nextInt(); // phy
    //     // marks[1] = sc.nextInt(); //chem
    //     // marks[2] = sc.nextInt(); //math

    //     // System.out.println("phy : " + marks[0]);
    //     // System.out.println("chem : " + marks[1]);
    //     // System.out.println("math : " + marks[2]);

    //     // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    //     // System.out.println("percentage = " + percentage + "%");
        
    // }

