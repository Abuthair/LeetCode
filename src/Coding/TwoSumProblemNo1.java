package Coding;

/**
 * @author abuthair on 07/03/23.
 * 10:19 pm
 * @project LeetCode
 */
public class TwoSumProblemNo1 {
    //Hell0
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
