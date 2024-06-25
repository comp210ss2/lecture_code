package comp210.L01.StaticMethod;

public class StaticRunner {
  public static void main(String[] args) {
    // Call static method without constructing an instance
    StaticMethod.staticMethod();

    // Must construct instance to call an instance method on
    StaticMethod s1 = new StaticMethod();
    StaticMethod s2 = new StaticMethod();
    s1.instanceMethod();
    s2.instanceMethod();
  }
}
