package comp210.L04.PerimeterAdvanced;

public class Main {
    public static void main(String[] args) {
        Point p1 = new CartesianPoint(5, 5);
        Point p2 = new CartesianPoint(10, 15);
        Point p3 = new PolarPoint(8.2, 2.45);

        Triangle t = new PointTriangle(p1, p2, p3);
        System.out.println("Perimeter: " + t.computePerimeter());
    }
}
