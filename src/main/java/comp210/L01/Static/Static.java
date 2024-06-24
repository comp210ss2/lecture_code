package comp210.L01.Static;

public class Static {

  private static int x = 7;
  private int y;

  // Why is x not a parameter in the constructor?
  // Why is y a parameter in the constructor?
  Static(int y) {
    this.y = y;
  }

  public static void printX() {
    System.out.println(x);
  }

  public void printY() {
    System.out.println(this.y);
  }

  public static void setX(int xParam) {
    x = xParam;
  }

  public void setY(int y) {
    this.y = y;
  }

  public static int getX() {
    return x;
  }

  int getY() {
    return this.y;
  }
}
