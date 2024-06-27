package comp210.L01.Tracing;

import java.util.Arrays;

public class Array3 {
  public static void main(String[] args) {
    int[] a = {1, 1, 2, 3, 5, 8};
    int[] b = a;

    a[0] = 10;
    b[1] = 20;

    add_one_to_all(a);

    b = a.clone();

    add_one_to_all(a);

    add_one_to_all(a.clone());

    Arrays.stream(a).forEach(System.out::println);
    Arrays.stream(b).forEach(System.out::println);
  }

  public static void add_one_to_all(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
  }
}
