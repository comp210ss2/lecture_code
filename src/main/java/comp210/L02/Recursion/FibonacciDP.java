package comp210.L02.Recursion;

public class FibonacciDP {
  public static int fib(int n) {
    // Declare "memoization" array to store fibonacci numbers
    int[] memo = new int[n + 2];
    memo[0] = 0;
    memo[1] = 1;

    for (int i = 2; i <= n; i++) {
      memo[i] = memo[i - 1] + memo[i - 2];
    }

    return memo[n];
  }
}
