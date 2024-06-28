package comp210.L04.PerimeterWithInterface;

public class TriangleMain {
  public static void main(String[] args) {
    Point[] cartesianPoints =
        new Point[] {new CartesianPoint(0, 0), new CartesianPoint(4, 0), new CartesianPoint(0, 4)};
    Point[] polarPoints =
        new Point[] {new PolarPoint(0, 0), new PolarPoint(4, 0), new PolarPoint(4, Math.PI / 2)};

    Triangle tCartesian = new Triangle(cartesianPoints[0], cartesianPoints[1], cartesianPoints[2]);
    Triangle tPolar = new Triangle(polarPoints[0], polarPoints[1], polarPoints[2]);
    Triangle tCartesianAndPolar = new Triangle(cartesianPoints[0], polarPoints[1], polarPoints[2]);

    System.out.println("Perimeter: " + tCartesianAndPolar.computePerimeter());
  }
}
