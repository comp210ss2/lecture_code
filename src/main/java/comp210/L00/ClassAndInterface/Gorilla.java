package comp210.L00.ClassAndInterface;

public class Gorilla implements Animal {
  public void makeSound() {
    System.out.println("???");
  }

  public int getLifespan() {
    return 40;
  }

  public String getFood() {
    return "banana";
  }
}
