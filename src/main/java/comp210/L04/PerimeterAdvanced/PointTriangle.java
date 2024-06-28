package comp210.L04.PerimeterAdvanced;

public class PointTriangle implements Triangle {
  private Point a;
  private Point b;
  private Point c;

  private static final double AREA_EPSILON = 0.0000001;

  public PointTriangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;

    if (checkCollinearity()) {
      throw new RuntimeException("Triangle points are co-linear");
    }
  }

  public Point getA() {
    return a;
  }

  public void setA(Point p) {
    if (p.equals(b) || p.equals(c)) {
      throw new RuntimeException("Attempting to set point A to same value as either B or C");
    }

    a = p;

    if (checkCollinearity()) {
      throw new RuntimeException("Triangle points are co-linear");
    }
  }

  public Point getB() {
    return b;
  }

  public void setB(Point p) {
    if (p.equals(a) || p.equals(c)) {
      throw new RuntimeException("Attempting to set point B to same value as either A or C");
    }

    b = p;

    if (checkCollinearity()) {
      throw new RuntimeException("Triangle points are co-linear");
    }
  }

  public Point getC() {
    return c;
  }

  public void setC(Point p) {
    if (p.equals(a) || p.equals(b)) {
      throw new RuntimeException("Attempting to set point C to same value as either A or B");
    }

    c = p;

    if (checkCollinearity()) {
      throw new RuntimeException("Triangle points are co-linear");
    }
  }

  public Point[] getPoints() {
    Point[] point_array = {a, b, c};
    return point_array;
  }

  public void setPoints(Point[] points) {
    if (points[0].equals(points[1]) || points[0].equals(points[2]) || points[1].equals(points[2])) {
      throw new RuntimeException("At least two points have same value");
    }

    a = points[0];
    b = points[1];
    c = points[2];

    if (checkCollinearity()) {
      throw new RuntimeException("Triangle points are co-linear");
    }
  }

  public double computePerimeter() {
    return sideABLength() + sideBCLength() + sideCALength();
  }

  public double computeArea() {
    double s = computePerimeter() / 2.0;
    return Math.sqrt(s * (s - sideABLength()) * (s - sideBCLength()) * (s - sideCALength()));
  }

  /*
  These methods are private because they are not part of an interface
  implemented by the class but are instead internal methods used as
  part of this implementation
   */

  private boolean checkCollinearity() {
    return (computeArea() < AREA_EPSILON);
  }

  private double sideABLength() {
    return a.distanceTo(b);
  }

  private double sideBCLength() {
    return b.distanceTo(c);
  }

  private double sideCALength() {
    return c.distanceTo(a);
  }
}
