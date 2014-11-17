package Factory.Pizza;

import Factory.Ingredients.*;

import java.util.Arrays;

/**
 * Pizza itself
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;
    Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 min at 350 degrees.");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza into official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n");
        sb.append(dough == null ? "" : "   " + dough.getClass().getSimpleName() + "\n");
        sb.append(sauce == null ? "" : "   " + sauce.getClass().getSimpleName() + "\n");
        sb.append(cheese == null ? "" : "   " + cheese.getClass().getSimpleName() + "\n");
        sb.append(veggies == null ? "" : "   " + Arrays.toString(veggies) + "\n") ;
        sb.append(pepperoni == null ? "" : "   " + pepperoni.getClass().getSimpleName() + "\n");
        sb.append(clam == null ? "" : "   " + clam.getClass().getSimpleName() + "\n");
        return  sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }
}
