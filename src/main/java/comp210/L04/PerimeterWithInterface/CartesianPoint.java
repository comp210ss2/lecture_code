package comp210.L04.PerimeterWithInterface;

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
