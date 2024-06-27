package comp210.L02.Recursion;

public class Fibonacci {
  public static int fib(int n) {
    // Irrelevant to lecture, but the Fibonacci sequence can be extended for negative n
    // https://en.wikipedia.org/wiki/Generalizations_of_Fibonacci_numbers#Extension_to_negative_integers
    if (n < 0) {
      return fib(-n) * ((-n % 2 == 0) ? -1 : 1);
    }

    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fib(n - 1) + fib(n - 2);
  }
}
