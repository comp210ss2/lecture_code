package comp210.L03.Perimeter;

public class TriangleMain {
  public static void main(String[] args) {
    Triangle t = new Triangle(0.0, 0.0, 4.0, 0.0, 0.0, 4.0);
    System.out.println("Perimeter: " + t.computePerimeter());

    Triangle tCartesian = new Triangle(new CartesianPoint(0, 0), new CartesianPoint(4, 0), new CartesianPoint(0, 4));
    System.out.println("Perimeter: " + tCartesian.computePerimeter());
  }
}
