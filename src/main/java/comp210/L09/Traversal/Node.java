package comp210.L09.Traversal;

public class Node<T> {
  private T _value;
  private Node<T> _left;
  private Node<T> _middle;
  private Node<T> _right;

  public Node(T value) {
    _value = value;
  }

  public Node(T value, Node<T> left, Node<T> middle, Node<T> right) {
    _value = value;
    _left = left;
    _middle = middle;
    _right = right;
  }

  public boolean isChild() {
    return _left == null && _middle == null && _right == null;
  }

  public T getValue() {
    return _value;
  }

  public void setValue(T value) {
    _value = value;
  }

  public Node<T> getLeft() {
    return _left;
  }

  public void setLeft(Node<T> left) {
    _left = left;
  }

  public Node<T> getMiddle() {
    return _middle;
  }

  public void setMiddle(Node<T> middle) {
    _middle = middle;
  }

  public Node<T> getRight() {
    return _right;
  }

  public void setRight(Node<T> right) {
    _right = right;
  }
}
