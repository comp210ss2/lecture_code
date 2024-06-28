package comp210.L04.PerimeterWithInterface;

public class Triangle {
  private Point a;
  private Point b;
  private Point c;

  // Now accepts general Point instead of just CartesianPoint
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double computePerimeter() {
    return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
  }
}
