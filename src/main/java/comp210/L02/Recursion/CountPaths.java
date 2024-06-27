package comp210.L02.Recursion;

public class CountPaths {
  /**
   * @param m rows
   * @param n columns
   * @return number of paths from top-right corner to bottom-left corner, only moving down or left
   */
  public static int countPaths(int m, int n) {
    // 1 x n or m x 1 grid has only 1 path
    if (m == 1 || n == 1) {
      return 1;
    }
    // At any position, two options, go down or left
    // If you go down, you'll be at (m - 1, n). The number of paths from there is countPaths(m - 1,
    // n)
    // Otherwise, go left, so add the number of paths for countPaths(m, n - 1)
    return countPaths(m - 1, n) + countPaths(m, n - 1);
  }
}
