package comp210.L01.ClassAndInterface;

public class Dog implements Animal {
    private int lifespan;

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
