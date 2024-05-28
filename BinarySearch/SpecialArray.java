//You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

//Notice that x does not have to be an element in nums.
import java.util.Arrays;

public class SpecialArray {
    public static int specialArray(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Binary search on the range [0, nums.length]
        int left = 0;
        int right = nums.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Find the count of elements greater than or equal to mid
            int count = countGreaterOrEqual(nums, mid);
            System.out.println(count+" "+mid);
            if (count == mid) {
                return mid;
            } else if (count > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If no such x is found, return -1
        return -1;
    }
    
    // Helper method to count elements greater than or equal to x
    private static int countGreaterOrEqual(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return nums.length - left;
    }

    public static void main(String[] args) {
        // Test the implementation with the provided example
        int[] nums = {3,5};
        System.out.println(specialArray(nums));  // Output should be 2
    }
}
