package comp210.L09;

import java.util.Map;
import java.util.TreeMap;

public class TreeIteratorTraversal {
  public static void main(String[] args) {
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    treeMap.put(10, "Value10");
    treeMap.put(20, "Value20");
    treeMap.put(30, "Value30");
    treeMap.put(40, "Value40");
    treeMap.put(50, "Value50");
    treeMap.put(60, "Value60");
    treeMap.put(70, "Value70");
    treeMap.put(80, "Value80");
    treeMap.put(90, "Value90");
    treeMap.put(100, "Value100");

    // traverse using iterator (the traversal code is inside the iterator logic)
    for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
  }
}
