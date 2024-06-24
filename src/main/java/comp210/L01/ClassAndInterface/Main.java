package comp210.L01.ClassAndInterface;

public class Main {
  private int exampleField;

  public static void main(String[] args) {
    System.out.println("Hello, world");
    Animal dog = new Dog(15);
    Animal gorilla = new Gorilla();

    System.out.println("Dog makes the sound: ");
    dog.makeSound();

    System.out.println("Gorilla makes the sound: ");
    gorilla.makeSound();

    System.out.println("Dog lives " + dog.getLifespan() + "years");
    System.out.println("Gorilla lives " + gorilla.getLifespan() + "years");

    System.out.println("Dog eats " + dog.getFood());
    System.out.println("Gorilla eats " + gorilla.getFood());
  }
}
