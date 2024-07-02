package comp210.L04.PerimeterAdvanced;

public class PolarPoint implements Point {
  private double r;
  private double theta;

  public PolarPoint(double r, double theta) {
    this.r = r;
    this.theta = theta;
  }

  // This method would be called instead of one in Point with a Point parameter
  // when the parameter is explicitly PolarPoint and not just Point
  public boolean equals(PolarPoint other) {
    boolean r_close_enough = Math.abs(getR() - other.getR()) < EPSILON;
    boolean theta_close_enough = Math.abs(getTheta() - other.getTheta()) < EPSILON;
    return r_close_enough && theta_close_enough;
  }

  @Override
  public double getX() {
    return r * Math.cos(theta);
  }

  @Override
  public double getY() {
    return r * Math.sin(theta);
  }

  public double getR() {
    return r;
  }

  public double getTheta() {
    return theta;
  }
}
