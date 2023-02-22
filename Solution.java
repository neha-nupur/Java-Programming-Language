import java.util.*;

//Bill of Items
// public class Solution {

    class Solution {
        public static int twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }

        public static void main(String args[]) {
            int nums[] = {2, 7, 11, 15};

            twoSum();
        }
    }
//     public static void main(String arg[]) {
//        Scanner sc = new Scanner(System.in);
//     float pencil = sc.nextFloat();
//     float pen = sc.nextFloat();
//     float eraser = sc.nextFloat();

//     float total = pencil + pen + eraser;

// System.out.println("Bill is : " + total);

// //Add on - with 18% tax
 
// float newTotal = total + (0.18f * total);

// System.out.println("Bill with 18% tax : " + newTotal);

//     }
// }