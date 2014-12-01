package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu created in Pancake house
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();

        addItem("K&Bs Pancake breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries and blueberry syrup", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries of strawberries", true, 3.59);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

    @Override
    public String toString() {
        return "Pancake-House-Menu (Breakfast)";
    }
}
