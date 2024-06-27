package comp210.L02.Recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
  @Test
  public void testFibonacciBaseCases() {
    assertEquals(0, Fibonacci.fib(0));
    assertEquals(1, Fibonacci.fib(1));
  }

  @Test
  public void testFibonacci() {
    assertEquals(1, Fibonacci.fib(2));
    assertEquals(2, Fibonacci.fib(3));
    assertEquals(3, Fibonacci.fib(4));
    assertEquals(5, Fibonacci.fib(5));
  }

  @Test
  public void testFibonacciDPBaseCases() {
    assertEquals(0, FibonacciDP.fib(0));
    assertEquals(1, FibonacciDP.fib(1));
  }

  @Test
  public void testFibonacciDP() {
    assertEquals(1, FibonacciDP.fib(2));
    assertEquals(2, FibonacciDP.fib(3));
    assertEquals(3, FibonacciDP.fib(4));
    assertEquals(5, FibonacciDP.fib(5));
  }
}
