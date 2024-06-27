package comp210.L01.StaticMethod;

public class StaticMethod {
  public static int staticField = 7;
  public int instanceField;

  public StaticMethod() {}

  public static void staticMethod() {
    staticField = 8;
    // Can't use `this` keyword in static context. Why?
    // this.instanceVar = 9;
  }

  public void instanceMethod() {
    // Can access static field. Why?
    staticField = 9;
    this.instanceField = 10;
  }
}
