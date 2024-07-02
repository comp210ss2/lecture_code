package comp210.L04.PerimeterAdvanced;

public interface Point {
  // All fields in interface must be static
  // static keyword actually redundant here
  static double EPSILON = 0.0000001;

  double getX();

  double getY();

  // Using default implementations only because the code for both implementations would be the same
  // Not always the case!
  default double distanceTo(Point other) {
    return Math.sqrt(
        Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
  }

  default boolean equals(Point other) {
    boolean x_close_enough = Math.abs(getX() - other.getX()) < EPSILON;
    boolean y_close_enough = Math.abs(getY() - other.getY()) < EPSILON;
    return x_close_enough && y_close_enough;
  }
}
