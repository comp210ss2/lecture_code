package comp210.L03.Perimeter;

public class CartesianPoint {
  private double x;
  private double y;

  public CartesianPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distanceTo(CartesianPoint other) {
    return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
  }

  public double getX() {
    return x;
  }

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
