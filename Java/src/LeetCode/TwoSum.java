package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
         public static int[] twoSum(int[] nums, int target) {
             Map<Integer, Integer> map = new HashMap<Integer, Integer>();
             for (int i = 0; i < nums.length; i++) {
                 if (map.containsKey(target - nums[i])) {
                     return new int[]{map.get(target - nums[i]), i};
                 } else {
                     map.put(nums[i], i);
                 }
             }
             return new int[]{};
         }
         public static void main(String[] args) {
			int [] nums={2, 7, 11, 15};
			int target=9;
	        int[] result = twoSum(nums, target);
	        System.out.println("Indices of the two numbers that add up to target: [" + result[0] + ", " + result[1] + "]");

		}
}
