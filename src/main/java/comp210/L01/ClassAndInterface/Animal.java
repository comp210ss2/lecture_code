package comp210.L01.ClassAndInterface;

public interface Animal {
  /** Prints animal sound */
  void makeSound();

  /**
   * @return average lifespan in years
   */
  int getLifespan();

  /**
   * @return example food eaten
   */
  String getFood();
}
