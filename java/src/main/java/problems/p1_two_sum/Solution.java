package problems.p1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer targetNumber = target - nums[i];

            if (map.containsKey(targetNumber)) {
                return new int[] { map.get(targetNumber), i };
            }
            map.put(nums[i], i);
        }

        return new int[]{0, 1};
    }
}
