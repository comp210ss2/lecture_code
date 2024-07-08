package comp210.L08;

public class LogComplexity {
  public static void main(String[] args) {
    int n = args.length;
    for (int i = 1; i < n; i *= 2) {
      System.out.println(i);
    }
  }
}
