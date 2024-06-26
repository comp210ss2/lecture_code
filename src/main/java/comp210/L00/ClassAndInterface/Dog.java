package comp210.L00.ClassAndInterface;

public class Dog implements Animal {
  private final int lifespan;

  public Dog(int lifespan) {
    this.lifespan = lifespan;
  }

  public void makeSound() {
    System.out.println("Woof");
  }

  public int getLifespan() {
    return lifespan;
  }

  public String getFood() {
    return "meat";
  }
}
