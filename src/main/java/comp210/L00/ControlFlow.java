package comp210.L00;

import java.util.Random;

public class ControlFlow {
  private static Random random;
  private static final boolean boolean_expression = random.nextBoolean();

  private static void ifElseIfElse() {
    if (boolean_expression) {
      // ...
    } else if (boolean_expression) {
      // Can chain multiple else if blocks
    } else {
      // ...
    }
  }

  private static void whileEx() {
    while (boolean_expression) {
      // ...
    }
  }

  private static void forEx() {
    for (int i = 0; i < 5; i++) {
      // ...
    }
  }
}
