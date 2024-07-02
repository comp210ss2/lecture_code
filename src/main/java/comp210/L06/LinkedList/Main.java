package comp210.L06.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList l1 = new LinkedListImpl<Integer>();
    l1.add(1);
    l1.add(2);
    l1.add(3);

    LinkedList l2 = new LinkedListImpl<Integer>();
    l2.add(1);
    l2.add(2);
    l2.add(3);

    LinkedList l3 = new LinkedListImpl<Integer>();

    // ternary operator
    // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_operator
    System.out.println("l1 and l2 are " + (l1.isEqual(l2) ? "equal" : "not equal"));
    System.out.println("l1 and l3 are " + (l1.isEqual(l3) ? "equal" : "not equal"));
  }
}
