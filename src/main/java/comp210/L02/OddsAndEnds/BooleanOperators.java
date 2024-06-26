package comp210.L02.OddsAndEnds;

public class BooleanOperators {
  public static void main(String[] args) {
    ex();
  }

  private static void ex() {
    int a = 0;
    boolean b = !(true || false);
    System.out.println(b);

    if (b && ++a > 0) {
      System.out.println(a);
    }
  }
}
