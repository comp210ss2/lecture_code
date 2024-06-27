package comp210.L03.Perimeter;

public class TrianglePerimeterBad {
  public static void main(String[] args) {
    double p1X = 0.0;
    double p1Y = 0.0;

    double p2X = 4.0;
    double p2Y = 0.0;

    double p3X = 0.0;
    double p3Y = 4.0;

    double perimeter = distanceBetween(p1X, p1Y, p2X, p2Y) + distanceBetween(p2X, p2Y, p3X, p3Y) + distanceBetween(p3X, p3Y, p1X, p1Y);
    System.out.println("Perimeter: " + perimeter);
  }

  private static double distanceBetween(double p1X, double p1Y, double p2X, double p2Y) {
    return Math.sqrt(Math.pow(p1X - p2X, 2) + Math.pow(p1Y - p2Y, 2));
  }
}
