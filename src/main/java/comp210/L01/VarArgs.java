package comp210.L01;

import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    ex();
    ex(1);
    ex(2, 3);
    ex(4, 5, 6);
  }

  private static void ex(int... args) {
    Arrays.stream(args).forEach(System.out::println);
  }
}
