package Composite;

import java.util.Iterator;

/**
 * Client using the composite pattern.
 */
public class Waitress {
    // the root component
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVeggie Menu");
        System.out.println("------------------------------");
        while(iterator.hasNext()){
            MenuComponent component = (MenuComponent)iterator.next();
            try{
                if(component.isVegetarian()) component.print();
            } catch (UnsupportedOperationException ignore){
                //NOP
            }
        }
    }
}
