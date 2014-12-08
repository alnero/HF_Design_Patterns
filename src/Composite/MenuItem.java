package Composite;

import java.util.Iterator;

/**
 * One item of the Menu
 */
public class MenuItem extends MenuComponent{
    String name, description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.print("   " + getName());
        if(isVegetarian()) System.out.print("(v)");
        System.out.print(", " + getDescription());
        System.out.println(" - " + getPrice());
    }
}
