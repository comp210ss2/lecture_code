package comp210.L01;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int[] arr = new int[3];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1;
      arr[i] += 1;
      System.out.println(arr[i]);
    }

    int[] arr2 = new int[] {2, 4, 4};
    for (int i : arr2) {
      System.out.println(i);
    }

    Arrays.stream(arr2).distinct().map((num) -> num * 3).forEach(System.out::println);
  }
}
