package comp210.L21;

// https://neetcode.io/problems/climbing-stairs
// Can paste code there to run test cases
public class ClimbStairs {
  public static void main(String[] args) {
    // Test here, if needed
  }

  // Note: should be static, but deciding to match Neetcode's method signature
  public int climbStairsNaive(int n) {
    if (n <= 1) {
      return 1;
    }
    return climbStairsNaive(n - 1) + climbStairsNaive(n - 2);
  }

  /**
   * Use memoization array
   *
   * @param n
   * @return
   */
  public int climbStairsDP(int n) {
    if (n <= 1) {
      return 1;
    }
    int[] memo = new int[n + 1];
    memo[0] = 1;
    memo[1] = 1;
    for (int i = 2; i <= n; i++) {
      memo[i] = memo[i - 1] + memo[i - 2];
    }
    return memo[n];
  }

  /**
   * Use O(1) space
   *
   * @param n
   * @return
   */
  public int climbStairsDPConstantSpace(int n) {
    if (n <= 1) {
      return 1;
    }
    int memoPrev = 1;
    int memoCurr = 1;
    for (int i = 2; i <= n; i++) {
      int temp = memoPrev;
      memoPrev = memoCurr;
      memoCurr = temp + memoCurr;
    }
    return memoCurr;
  }
}
