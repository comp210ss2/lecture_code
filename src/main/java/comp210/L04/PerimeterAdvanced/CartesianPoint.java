package comp210.L04.PerimeterAdvanced;

public class CartesianPoint implements Point {
  private double x;
  private double y;

  public CartesianPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public double distanceTo(Point other) {
    return Math.sqrt(
        Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
  }

  @Override
  public boolean equals(Point other) {
    boolean x_close_enough = Math.abs(getX() - other.getX()) < EPSILON;
    boolean y_close_enough = Math.abs(getY() - other.getY()) < EPSILON;
    return x_close_enough && y_close_enough;
  }

  @Override
  public double getX() {
    return x;
  }

  @Override
  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }
}
