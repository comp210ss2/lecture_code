package comp210.L00.StaticField;

public class StaticRunner {
  public static void main(String[] args) {
    StaticField s1 = new StaticField();
    StaticField s2 = new StaticField();

    // Access static field using the class name
    StaticField.staticField = 1;

    // Must access instance field using an instance
    s1.instanceField = 2;
    s2.instanceField = 3;

    printInstances(s1, s2);

    // Logically incorrect way to set static variable
    // But legal syntax and gets the point across

    s1.staticField = 2;
    s2.staticField = 3;

    printInstances(s1, s2);
  }

  static void printInstances(StaticField s1, StaticField s2) {
    System.out.println(s1);
    System.out.println(s2);
  }
}
