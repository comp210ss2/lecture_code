package comp210.L06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
  public static void main(String[] args) {
    stack();
    queue();
  }

  private static void stack() {
    Stack<Integer> stack = new Stack<>();
    for (int i = 1; i <= 3; i++) {
      stack.push(i);
    }

    for (int i = 1; i <= 3; i++) {
      System.out.println(stack.pop());
    }
  }

  private static void queue() {
    // Must implement yourself...
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= 3; i++) {
      // Pretend this is enqueue
      queue.add(i);
    }

    for (int i = 1; i <= 3; i++) {
      // Pretend this is dequeue
      System.out.println(queue.remove());
    }
  }
}
