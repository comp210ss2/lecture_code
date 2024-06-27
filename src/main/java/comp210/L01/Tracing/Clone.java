package comp210.L01.Tracing;

import java.util.ArrayList;
import java.util.List;

public class Clone {
  public static void main(String[] args) {
    List<A> arr = new ArrayList<>();
    arr.add(new A(1));

    List<A> arr2 = (List<A>) ((ArrayList<A>) arr).clone();

    // Put breakpoint here
    arr2.get(0).a = 2;

    System.out.println(arr.get(0).a);
  }
}

class A {
  int a;

  A(int a) {
    this.a = a;
  }
}
