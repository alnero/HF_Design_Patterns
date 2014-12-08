package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu, it can hold other menus and menu items.
 */
public class Menu extends MenuComponent{
    String name, description;
    ArrayList<MenuComponent> menuComponents;

    public Menu(String name, String description) {
        menuComponents = new ArrayList<MenuComponent>();
        this.name = name;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void remove(MenuComponent node) {
        menuComponents.remove(node);
    }

    @Override
    public void add(MenuComponent node) {
        menuComponents.add(node);
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------------------");

        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent component = (MenuComponent)iterator.next();
            component.print();
        }
    }
}
