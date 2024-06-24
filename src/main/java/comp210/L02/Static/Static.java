package comp210.L02.Static;

public class Static {
  public static int staticVar = 7;
  public int instanceVar;

  public Static(int instanceVar) {
    this.instanceVar = instanceVar;
  }

  public static void staticMethod() {
    staticVar = 8;
    // Can't use `this` keyword in static context. Why?
    // this.instanceVar = 9;
  }

  public void instanceMethod() {
    // Can access static field. Why?
    staticVar = 9;
    this.instanceVar = 10;
  }
}
