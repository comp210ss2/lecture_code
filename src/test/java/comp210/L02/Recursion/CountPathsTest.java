package comp210.L02.Recursion;

import static org.junit.Assert.assertEquals;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.junit.Test;

public class CountPathsTest {
  private static final int maxMN = 10;

  @Test
  public void testCountPathsBaseCase() {
    assertEquals(1, CountPaths.countPaths(1, 1));
  }

  @Test
  public void testCountPathsHardcoded() {
    assertEquals(2, CountPaths.countPaths(2, 2));
    assertEquals(6, CountPaths.countPaths(3, 3));
  }

  @Test
  public void testCountPaths() {
    for (int m = 1; m <= maxMN; m++) {
      for (int n = 1; n <= maxMN; n++) {
        // in m x n grid (as defined in class), we need m + n - 2 steps to get from top-right (m-1,
        // n-1) to bottom-left (0, 0), only moving left or down
        // we are forced to take m-1 left steps. from m + n - 2 steps, choose m-1 of them to be left
        // steps
        // this fixes the number of down steps, so alternatively k can be n-1
        assertEquals(
            CombinatoricsUtils.binomialCoefficient(m + n - 2, m - 1), CountPaths.countPaths(m, n));
      }
    }
  }
}
