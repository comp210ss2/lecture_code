package comp210.L03;

import java.util.Set;

public class Pizza {
    private double size;
    private Set<String> toppings;

    public Pizza(double size, Set<String> toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void removeTopping(String topping) {
        toppings.remove(topping);
    }
}