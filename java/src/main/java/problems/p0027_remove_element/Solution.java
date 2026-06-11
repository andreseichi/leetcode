package problems.p0027_remove_element;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k;
    }
}