package comp210.L04.PerimeterAdvanced;

public interface Triangle {
  Point getA();

  void setA(Point p);

  Point getB();

  void setB(Point p);

  Point getC();

  void setC(Point p);

  Point[] getPoints();

  void setPoints(Point[] points);

  double computeArea();

  double computePerimeter();
}
