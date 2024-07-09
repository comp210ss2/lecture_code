package comp210.L09.Traversal;

public class Traversal {
  public static void main(String[] args) {
    Node<String> root = createTree();

    preOrder(root);
  }

  private static void preOrder(Node<String> root) {
    if (!(root == null)) {
      System.out.println(root.getValue());
      preOrder(root.getLeft());
      preOrder(root.getMiddle());
      preOrder(root.getRight());
    }
  }

  private static Node<String> createTree() {
    Node<String> root = new Node("lo");

    root.setLeft(new Node("ok"));
    root.getLeft().setLeft(new Node("ya"));
    root.getLeft().setRight(new Node("re"));

    Node<String> re = root.getLeft().getRight();
    Node<String> fa = new Node("fa", new Node("go"), new Node("zz"), new Node("k2"));
    re.setLeft(fa);
    re.setMiddle(new Node("mi"));

    root.setMiddle(new Node("mu"));

    Node<String> hi = new Node("hi");
    root.setRight(hi);

    hi.setLeft(new Node("ad", new Node("tu"), null, new Node("no")));
    hi.setRight(new Node("so"));

    return root;
  }
}
