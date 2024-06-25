package comp210.L00;

import java.util.ArrayList;
import java.util.List;

public class ValueAndReferenceTypes {
  public static void main(String[] args) {
//    valueTypes();
    referenceTypes();
  }

  private static void valueTypes() {
    int a = 10;
    int b = a;
    a += 1;
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }

  private static void referenceTypes() {
    // ArrayList is very similar to Python's list
    List<Integer> l1 = new ArrayList<>();
    l1.add(1);
    List<Integer> l2 = l1;
    l1.add(2);
    System.out.println("l1: " + l1);
    System.out.println("l2: " + l2);
  }
}
