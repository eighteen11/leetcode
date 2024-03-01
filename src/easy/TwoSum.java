package easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j <nums.length - 1; j++) {
                if(nums[i] + nums[j + 1] == target){
                    return new int[]{i, j + 1};
                }
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2,5,5,11}, 10)));
    }
}

