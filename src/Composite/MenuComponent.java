package Composite;

import java.util.Iterator;

/**
 * Common interface for MenuItems(leafs) and Menus(composites)
 */
public abstract class MenuComponent {

    // methods for composites
    public void add(MenuComponent node) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent node) { throw new UnsupportedOperationException(); }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }


    // methods mainly for leaves
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }


    // methods for all components
    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() { throw new UnsupportedOperationException(); }
}
