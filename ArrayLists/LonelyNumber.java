import java.util.*;

public class LonelyNumber {
    public static List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        // 10, 5, 6, 8
        //5, 6, 8, 10
        // Arraylist to store lonely elements
        List<Integer> list = new ArrayList<>();

        // LOOP is traversing from position second to last and 
        // For each element, it checks if the previous element plus one is less than the current element AND the current element plus one is less than the next element  
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i-1] + 1 < nums[i]  && nums[i] + 1 < nums[i+1]) { //If both conditions are true, 
            // then   the current element is considered a lonely integer and is added to the list using the 
            // list.add(nums[i]) method.
                list.add(nums[i]);
            }
        }

        // if the input array has only one element, simply add it into the list
        if (nums.length == 1) {
            list.add(nums[0]);
        }

        if(nums.length > 1) {
            if(nums[0] + 1 < nums[1]) {
                list.add(nums[0]);
            }

            if(nums[nums.length-2] + 1 < nums[nums.length-1]) {
                list.add(nums[nums.length-1]);
            }
        }

        return list;
    }

    public static void main(String args[]) {
        int nums[] = { 10, 5, 6, 8};

        List<Integer> lonelyList = findLonely(nums);
        System.out.println("Lonely integers: " + lonelyList);
    }
}
