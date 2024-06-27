package comp210.L01.Tracing;

public class Array4 {
  public static void main(String[] args) {
    int[] a = new int[]{3, 5, 10};
    int[] b = a;

    int c = swapAndSum(a, 0, 1);
    int d = swapAndSum(b, 1, 2);

    b = a.clone();

    b[2] = c + d + a.length;
    a[0] = swapAndSum(b, 1, 2);
  }

  static int swapAndSum(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;

    return arr[i] + arr[j];
  }
}
