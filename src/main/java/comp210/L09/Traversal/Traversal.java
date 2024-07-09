package comp210.L09.Traversal;

public class Traversal {
  public static void main(String[] args) {
    Node<String> root = createTree();

    System.out.println("pre-order:");
    preOrder(root);

    System.out.println("\npost-order:");
    postOrder(root);

    System.out.println("\nin-order:");
    inOrder(root);
  }

  private static void preOrder(Node<String> root) {
    if (!(root == null)) {
      System.out.print(root.getValue() + " ");
      preOrder(root.getLeft());
      preOrder(root.getMiddle());
      preOrder(root.getRight());
    }
  }

  private static void postOrder(Node<String> root) {
    if (!(root == null)) {
      postOrder(root.getLeft());
      postOrder(root.getMiddle());
      postOrder(root.getRight());
      System.out.print(root.getValue() + " ");
    }
  }

  private static void inOrder(Node<String> root) {
    if (!(root == null)) {
      // for arity 3, we arbitrarily decide to process L, then value, then M and R
      // could also be L, M, value, then R
      inOrder(root.getLeft());
      System.out.print(root.getValue() + " ");
      inOrder(root.getMiddle());
      inOrder(root.getRight());
    }
  }

  /**
   * @return the tree of Strings used in L9 to explain traversals
   */
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
