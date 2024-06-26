package comp210.L02.Recursion;

public class SumArray {
  public static void main(String[] args) {
    int[] vals = {1, 7, 4, 9};
    System.out.println(sumArrayFromPos(vals, 0));
  }

  private static int sumArrayFromPos(int[] vals, int pos) {
    if (pos == vals.length - 1) {
      return vals[pos];
    } else {
      return vals[pos] + sumArrayFromPos(vals, pos + 1);
    }
  }
}
