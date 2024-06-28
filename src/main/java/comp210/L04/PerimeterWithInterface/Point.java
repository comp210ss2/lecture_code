package comp210.L04.PerimeterWithInterface;

public interface Point {
  // getX and getY must be defined because distanceTo uses a Point as its param
  double getX();

  double getY();

  // Could be made a default implementation since CartesianPoint and PolarPoint have the same code
  double distanceTo(Point other);
}
