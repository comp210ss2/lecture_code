package comp210.L09;

public class BinarySearch {
  public static int binarySearch(int[] sortedArr, int k) {
    int lo = 0;
    int hi = sortedArr.length - 1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      // found k
      if (sortedArr[mid] == k) {
        return mid;

        // k is greater than middle element, ignore left half
      } else if (sortedArr[mid] < k) {
        lo = mid + 1;

        // ignore right half
      } else {
        hi = mid - 1;
      }
    }

    // not found
    return -1;
  }

  public static <T extends Comparable<T>> int binarySearch(T[] sortedArr, T k) {
    int lo = 0;
    int hi = sortedArr.length - 1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      int comparison = sortedArr[mid].compareTo(k);
      if (comparison == 0) {
        return mid;
      } else if (comparison < 0) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }

    return -1;
  }
}
