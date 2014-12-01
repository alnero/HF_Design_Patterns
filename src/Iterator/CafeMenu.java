package Iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Cafe Menu is added to our banch of menus
 */
public class CafeMenu implements Menu{
    Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable<String, MenuItem>();
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side of the salad", false, 3.69);
        addItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, item);
    }


    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    @Override
    public String toString() {
        return "Cafe-Menu (Dinner)";
    }
}
