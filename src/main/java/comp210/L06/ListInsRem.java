package comp210.L06;

import java.util.ArrayList;
import java.util.List;

public class ListInsRem {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(0, 3);
    l.add(0, 4);
    l.add(1, 5);
    l.remove(0);
    System.out.println(l);
  }
}
