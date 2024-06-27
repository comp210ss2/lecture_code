package comp210.L01.AccessModifiers;

public class Fields {
  // Accessible anywhere
  public int pub;

  // Only accessible in this class (Fields)
  private int priv;

  // Accessible in this class, different class in same package, or subclass (we'll look at this later)
  protected int prot;

  // Accessible in any class in same package
  int def;
}
