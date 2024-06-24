package comp210.L01.Static;

public class StaticRunner {
  public static void main(String[] args) {
    Static s1 = new Static(1);
    Static s2 = new Static(2);

    Static.staticVar = 1;
    s1.instanceVar = 2;
    s2.instanceVar = 3;

    printInstances(s1, s2);

    // Incorrect way to set static variable
    // But legal syntax and gets the point across

    s1.staticVar = 2;
    s2.staticVar = 3;

    printInstances(s1, s2);
  }

  static void printInstances(Static s1, Static s2) {
    System.out.println(s1);
    System.out.println(s2);
  }
}
