package comp210.L06.LinkedList;

public interface LinkedList<T> {
  /**
   * Return true if this linked list is equal to the list argument, false otherwise. Two lists are
   * equal if they have the same size and the same elements in the same order.
   *
   * <p>ex: list: 1 -> 4 -> 2, other: 1 -> 4 -> 2, return true
   *
   * <p>list: 1 -> 5, other: 2 -> 5, return false
   *
   * @param other other LinkedList
   * @return true if the lists have the same size and elements in the same order, false otherwise
   */
  boolean isEqual(LinkedList other);

  int size();

  boolean isEmpty();

  void clear();

  boolean contains(Object element);

  T[] toArray();

  void add(Object element);

  boolean remove(Object element);

  T get(int index);

  T set(int index, Object element);

  void add(int index, Object element);

  int indexOf(Object element);

  int lastIndexOf(Object element);

  void validIndex(int i);

  Node<T> getHead();
}
