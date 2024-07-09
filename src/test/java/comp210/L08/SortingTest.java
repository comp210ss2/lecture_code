package comp210.L08;
import static comp210.L08.Sort.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class SortingTest {
  static Random random = new Random();
  static int minArraySize = 1;
  static int maxArraySize = 100;
  static int minValue = 1;
  static int maxValue = 100;
  static int numTrials = 1000;

  @Test
  public void testBubblesort() {
    for (int i = 0 ; i < numTrials; i++) {
      int[] arr = genRandArray();
      int[] arrClone = arr.clone();

      int[] sortedArr = Arrays.stream(arr).sorted().toArray();
      bubbleSort(arrClone);
      assertArrayEquals(sortedArr, arrClone);
    }
  }

  @Test
  public void testInsertionSort() {
    for (int i = 0 ; i < numTrials; i++) {
      int[] arr = genRandArray();
      int[] arrClone = arr.clone();

      int[] sortedArr = Arrays.stream(arr).sorted().toArray();
      insertionSort(arrClone);
      assertArrayEquals(sortedArr, arrClone);
    }
  }

  @Test
  public void testMergeSort() {
    for (int i = 0 ; i < numTrials; i++) {
      int[] arr = genRandArray();
      int[] arrClone = arr.clone();

      int[] sortedArr = Arrays.stream(arr).sorted().toArray();
      mergeSort(arrClone, 0, arrClone.length-1);
      assertArrayEquals(sortedArr, arrClone);
    }
  }

  @Test
  public void testQuicksort() {
    for (int i = 0 ; i < numTrials; i++) {
      int[] arr = genRandArray();
      int[] arrClone = arr.clone();

      int[] sortedArr = Arrays.stream(arr).sorted().toArray();
      quickSort(arrClone, 0, arrClone.length-1);
      assertArrayEquals(sortedArr, arrClone);
    }
  }

  public static int[] genRandArray() {
    int[] arr = new int[random.nextInt(maxArraySize - minArraySize + 1) + minArraySize];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
    }
    return arr;
  }


}
