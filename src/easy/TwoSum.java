package easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] + nums[i + 1] == target) {
                return new int[]{i, i + 1};
            }
            i++;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{1, 2, 3, 4}, 7)));
    }
}

