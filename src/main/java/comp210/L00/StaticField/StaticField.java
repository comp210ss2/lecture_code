package comp210.L00.StaticField;

/**
 * This class doesn't use getters and setters, which would be proper Java encapsulation practice,
 * for explanation purposes
 *
 * <p>We'll cover getters and setters later
 */
public class StaticField {

  public static int staticField = 0;
  public int instanceField;

  public StaticField() {}

  /**
   * toString() is automatically called when we call System.out.println on an instance of this class
   *
   * @return String representation of instance
   */
  public String toString() {
    return "staticVar: " + staticField + "; instanceVar: " + instanceField;
  }
}
