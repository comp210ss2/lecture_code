package comp210.L21;

import java.util.Arrays;

// https://neetcode.io/problems/house-robber
public class HouseRobber {
  public static void main(String[] args) {}

  /**
   * Use memo array (or skip to O(1) space below if you want)
   *
   * @param nums
   * @return
   */
  public static int robArray(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]); // !! not nums[1]
    for (int i = 2; i < nums.length; i++) {
      dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
    }
    System.out.println(Arrays.toString(dp));
    return Math.max(dp[nums.length - 2], dp[nums.length - 1]);
  }

  /**
   * O(1) space
   *
   * @param nums
   * @return
   */
  public static int rob(int[] nums) {
    int rob1 = 0, rob2 = 0;
    for (int n : nums) {
      int temp = Math.max(n + rob1, rob2);
      rob1 = rob2;
      rob2 = temp;
    }
    return rob2;
  }
}
