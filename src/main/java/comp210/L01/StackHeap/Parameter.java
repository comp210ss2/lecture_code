package comp210.L01.StackHeap;

public class Parameter {
  public static void main(String[] args) {
    // When ex is called and its call frame created,
    // stack space for "a" is allocated
    // and 10 is put there
    // 10 does not take up space in main's stack frame
    // Put a breakpoint here and check main's local variables
    ex(10);

    // Now a is in main's stack frame
    int a = 11;
    ex(a);
  }

  private static void ex(int a) {
    a++;
  }
}
