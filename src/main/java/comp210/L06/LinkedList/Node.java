package comp210.L06.LinkedList;

public interface Node<T> {
  T getValue();

  void setValue(T value);

  Node<T> getNext();

  void setNext(Node<T> next);

  default boolean hasNext() {
    return getNext() != null;
  }
}
