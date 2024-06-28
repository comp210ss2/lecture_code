package comp210.L04.PerimeterWithInterface;

public class Triangle {
  private Point a;
  private Point b;
  private Point c;

  public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
    this.a = new CartesianPoint(ax, ay);
    this.b = new CartesianPoint(bx, by);
    this.c = new CartesianPoint(cx, cy);
  }

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
