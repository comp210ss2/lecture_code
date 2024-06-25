package comp210.L01.Static;

public class StaticRunner {
  public static void main(String[] args) {
    // Call static method without constructing an instance
    Static.staticMethod();

    // Must construct instance to call an instance method on
    Static s1 = new Static(1);
    Static s2 = new Static(2);
    s1.instanceMethod();
    s2.instanceMethod();
  }
}
