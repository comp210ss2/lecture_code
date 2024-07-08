package comp210.L08;

public class Sort {
  /**
   * Insertion sort arr
   *
   * <p>CLRS pg. 19
   *
   * @param arr
   */
  public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];

      // insert A[i] into the sorted subarray A[1:i-1]
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
    }
  }

  /**
   * Mergesort A[p:r]
   *
   * <p>CLRS pg. 35-40
   *
   * @param A array to sort
   * @param p start index (should be 0 to sort whole array)
   * @param r end index (inclusive, should be size-1 to sort whole array)
   */
  public static void mergeSort(int[] A, int p, int r) {
    if (p >= r) {
      return;
    }
    int q = (p + r) / 2;
    mergeSort(A, p, q);
    mergeSort(A, q + 1, r);
    merge(A, p, q, r);
  }

  /**
   * Copies two subarrays A[p:q] and A[q+1:r] into L and R, then merges the values back into A[p:r]
   *
   * @param A
   * @param p
   * @param q
   * @param r
   */
  public static void merge(int[] A, int p, int q, int r) {
    // length of A[p:q]
    int leftLen = q - p + 1;
    // length of A[q+1:r]
    int rightLen = r - q;

    int[] left = new int[leftLen];
    int[] right = new int[rightLen];

    // copy A[p:q] into left
    System.arraycopy(A, p + 0, left, 0, leftLen);
    // copy A[q+1:r] into right
    for (int i = 0; i < rightLen; i++) {
      right[i] = A[q + i + 1];
    }

    // i and j are the indices of the smallest elements in L and R
    // k indexes the location in A to fill
    int i = 0, j = 0, k = p;

    // as long as each of L and R contains an unmerged element, copy the smallest unmerged element
    // back into A[p:r]
    while (i < leftLen && j < rightLen) {
      if (left[i] <= right[j]) {
        A[k] = left[i];
        i++;
      } else {
        A[k] = right[j];
        j++;
      }
      k++;
    }

    // went through one of L and R entirely, copy the remainder of the other to the end of A[p:r]
    while (i < leftLen) {
      A[k] = left[i];
      i++;
      k++;
    }
    while (j < rightLen) {
      A[k] = right[j];
      j++;
      k++;
    }
  }

  /**
   * Quicksort A[p:r]
   *
   * <p>CLRS pg. 183 - 184
   *
   * @param A array to sort
   * @param p start index, inclusive (should be 0 to sort whole array)
   * @param r end index, inclusive (should be size-1 to sort whole array)
   */
  public static void quickSort(int[] A, int p, int r) {
    if (p < r) {
      // partition the subarray around the pivot, which ends up in A[q]
      int q = partition(A, p, r);
      quickSort(A, p, q - 1);
      quickSort(A, q + 1, r);
    }
  }

  public static int partition(int[] A, int p, int r) {
    // pivot
    int x = A[r];
    // highest index into low side
    int i = p - 1;

    // process each element other than the pivot
    for (int j = p; j < r; j++) {
      // does element belong on low side
      if (A[j] <= x) {
        // if so, put element there by swapping A[i] and A[j]
        i++;
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
      }
    }

    // pivot goes just to the right of the low side
    // swap A[i+1] and A[r]
    int temp = A[i + 1];
    A[i + 1] = A[r];
    A[r] = temp;

    return i + 1;
  }
}
