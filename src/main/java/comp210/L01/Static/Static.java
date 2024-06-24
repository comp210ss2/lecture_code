package comp210.L01.Static;

public class Static {

  private static int s = 7;
  private int i;

  // Why is x not a parameter in the constructor?
  // Why is y a parameter in the constructor?
  Static(int i) {
    this.i = i;
  }

  public static void setS(int sParam) {
    s = sParam;
  }

  public void setI(int i) {
    this.i = i;
  }

  public static int getS() {
    return s;
  }

  int getI() {
    return this.i;
  }
}
