package comp210.L02.Recursion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountPathsTest {
  @Test
  public void testCountPathsBaseCase() {
    assertEquals(1, CountPaths.countPaths(1, 1));
  }

  @Test
  public void testCountPaths() {
    assertEquals(2, CountPaths.countPaths(2, 2));
    assertEquals(6, CountPaths.countPaths(3, 3));
  }
}
