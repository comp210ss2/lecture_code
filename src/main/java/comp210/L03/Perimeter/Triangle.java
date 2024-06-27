package comp210.L03.Perimeter;

public class Triangle {
  private CartesianPoint a;
  private CartesianPoint b;
  private CartesianPoint c;

  public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
    this.a = new CartesianPoint(ax, ay);
    this.b = new CartesianPoint(bx, by);
    this.c = new CartesianPoint(cx, cy);
  }

  public Triangle(CartesianPoint a, CartesianPoint b, CartesianPoint c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double computePerimeter() {
    return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
  }
}
