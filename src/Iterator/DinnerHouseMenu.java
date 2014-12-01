package Iterator;

import java.util.Iterator;

/**
 * Dinner's house menu implementation
 */
public class DinnerHouseMenu implements Menu{
    static final int MAX_ITEM = 6;
    private int numberOfItem = 0;
    MenuItem[] menuItems;

    public DinnerHouseMenu() {
        this.menuItems = new MenuItem[MAX_ITEM];

        addItem("Vegetarian BLT", "(Fakin') bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup with a side of potato salad", false, 3.29);
        addItem("Hot Dog", "Hot Dog with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if(numberOfItem >= MAX_ITEM){
            System.err.println("Sorry, menu is full.");
        } else {
            menuItems[numberOfItem++] = menuItem;
        }
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

    @Override
    public String toString() {
        return "Dinner-House-Menu (Lunch)";
    }
}
