package comp210.L01.Static;

/**
 * This class doesn't use getters and setters, which would be proper Java encapsulation practice, for explanation purposes
 * <p>We'll cover getters and setters later
 */
public class Static {

  public static int staticVar = 7;
  public int instanceVar;

  // Why is staticVar not a parameter in the constructor?
  // Why is instanceVar a parameter in the constructor?
  Static(int instanceVar) {
    this.instanceVar = instanceVar;
  }

  /**
   * toString() is automatically called when we call System.out.println on an instance of this class
   *
   * @return String representation of instance
   */
  public String toString() {
    return "staticVar: " + staticVar + "; instanceVar: " + instanceVar;
  }
}
