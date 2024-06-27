package comp210.L01.Equality;

public class Point {
  int x;
  int y;

  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point();
    System.out.println(p1.equals(p2));
  }

  // Try commenting out this method
  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }

    if (other.getClass() != this.getClass()) {
      return false;
    }

    final Point otherPoint = (Point) other;
    return this.x == otherPoint.x && this.y == otherPoint.y;
  }
}
