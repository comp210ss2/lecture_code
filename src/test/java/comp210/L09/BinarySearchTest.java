package comp210.L09;

import static comp210.L08.Sort.quickSort;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

import static comp210.L08.SortingTest.genRandArray;
import static comp210.L09.BinarySearch.binarySearch;

public class BinarySearchTest {
  private static final int numTrials = 100;
  @Test
  public void testBinarySearch() {
    for (int i = 0 ; i < numTrials; i++) {
      int[] arr = genRandArray();

      // Distinct because a duplicate would have more than one index
      // But bsearch would return only one index
      int[] sortedDistinctArr = Arrays.stream(arr).distinct().sorted().toArray();

      for (int j = 0; j < sortedDistinctArr.length; j++) {
        assertEquals(j, binarySearch(sortedDistinctArr, sortedDistinctArr[j]));
      }

      assertEquals(-1, binarySearch(sortedDistinctArr, 0xDEADBEEF));
    }
  }

  @Test
  public void testGenericBinarySearch() {
    String[] arr = new String[]{"hi"};
    assertEquals(0, binarySearch(arr, "hi"));
  }
}
