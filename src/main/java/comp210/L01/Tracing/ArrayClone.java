package comp210.L01.Tracing;

public class ArrayClone {
  public static void main(String[] args) {
    int[] arr1 = new int[10];
    int[] arr2 = arr1.clone();
    System.out.println(arr1 == arr2);

    arr1[0] = 1;
    System.out.println(arr1[0] == arr2[0]);
  }
}
