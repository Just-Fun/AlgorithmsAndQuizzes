package ua.com.juja.quizzes.leetcode.A_283_Move_Zeroes;

/**
 * Created by serzh on 3/14/16.
 */
public class SolutionExample1 {
    public void moveZeroes(int[] nums) {
        int movings = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                movings++;
                continue;
            }

            int temp = nums[i - movings];
            nums[i - movings] = nums[i];
            nums[i] = temp;
        }
    }
}
