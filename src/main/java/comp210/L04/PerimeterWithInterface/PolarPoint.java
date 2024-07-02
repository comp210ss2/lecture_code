package comp210.L04.PerimeterWithInterface;

public class PolarPoint implements Point {
  private double r;
  private double theta;

  public PolarPoint(double r, double theta) {
    this.r = r;
    this.theta = theta;
  }

  @Override
  public double getX() {
    return r * Math.cos(theta);
  }

  @Override
  public double getY() {
    return r * Math.sin(theta);
  }

  @Override
  public double distanceTo(Point other) {
    return Math.sqrt(
        Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
  }
}
