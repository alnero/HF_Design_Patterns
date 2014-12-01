package Iterator;

import java.util.Iterator;

/**
 * Client using iterators for the menus.
 * Client is decoupled from concrete aggregate implementation, it only depends on Iterators and common Menu interface.
 */
public class Waitress {
    Menu[] menus;

    // reduce dependency, make Waitress work with any menu implementation
    public Waitress(Menu... menus) {
        this.menus = menus;
    }

    public void printMenu() {
        System.out.println("MENU");
        for (Menu menu : menus) {
            System.out.println("\n" + menu);
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printBreakfastMenu() {
        System.out.println("\nBreakfast:");
        for (Menu menu : menus) {
            if (menu.toString().contains("(Breakfast)")) {
                System.out.println(menu);
                printMenu(menu.createIterator());
            }
        }
    }

    public void printLunchMenu() {
        System.out.println("\nLunch:");
        for (Menu menu : menus) {
            if (menu.toString().contains("(Lunch)")) {
                System.out.println(menu);
                printMenu(menu.createIterator());
            }
        }
    }

    public void printDinnerMenu() {
        System.out.println("\nDinner:");
        for (Menu menu : menus) {
            if (menu.toString().contains("(Dinner)")) {
                System.out.println(menu);
                printMenu(menu.createIterator());
            }
        }
    }



    public void printVegetarianMenu() {
        System.out.println("\nVegetarian: ");

        for (Menu menu : menus) {
            Iterator iterator = menu.createIterator();
            while (iterator.hasNext()) {
                MenuItem menuItem = (MenuItem) iterator.next();
                if (menuItem.isVegetarian()) {
                    System.out.println(menuItem);
                }
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        for (Menu menu : menus) {
            Iterator iterator = menu.createIterator();
            while (iterator.hasNext()) {
                MenuItem menuItem = (MenuItem) iterator.next();
                if (name.equals(menuItem.getName()) && menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
