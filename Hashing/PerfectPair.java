//You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.
//A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
//Return the total number of good pairs.
//Example 1:
//Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
//Output: 5
//Explanation:
//The 5 good pairs are (0, 0), (1, 0), (1, 1), (2, 0), and (2, 2).

import java.util.HashMap;
import java.util.Map;

public class PerfectPair {
    public static int countGoodPairs(int[] nums1, int[] nums2, int k) {
        // Create a HashMap to store the frequency of each nums2[j] * k
        Map<Integer, Integer> map = new HashMap<>();
        
        // Populate the HashMap with the counts of nums2[j] * k
        for (int num : nums2) {
            int value = num * k;
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int goodPairsCount = 0;

        // Iterate over nums1 and use the HashMap to find valid pairs
        for (int num : nums1) {
            // Check if num is divisible by any key in the HashMap
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (num % entry.getKey() == 0) {
                    goodPairsCount += entry.getValue();
                }
            }
        }

        return goodPairsCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4};
        int[] nums2 = {1, 3, 4};
        int k = 1;

        int result = countGoodPairs(nums1, nums2, k);
        System.out.println(result); // Output: 5
    }
}

