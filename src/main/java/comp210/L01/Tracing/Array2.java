package comp210.L01.Tracing;

public class Array2 {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[10];

    arr[0] = 42;
    arr[1] = 2;
    arr[2] = 120;
    arr[3] = 5;

    System.out.println("arr[4] = " + arr[4]);

    String[] sarr = {"one fish", "two fish", "red fish", "blue fish"};

    int sum_of_lengths = 0;
    for (int i = 0; i < sarr.length; i++) {
      sum_of_lengths += sarr[i].length();
    }

    System.out.println("The sum of string lengths is " + sum_of_lengths);
  }
}
