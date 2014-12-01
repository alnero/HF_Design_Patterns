package Iterator;

import java.util.Iterator;

/**
 * Concrete iterator implementation for DinnerHouseMenu.
 * It also takes responsibility for traversal over aggregate to another class
 */
public class DinnerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public void remove() {
        menuItems[position] = null;
        int length = menuItems.length;

        for(int i = position + 1; i < length; i++){
            menuItems[i-1] = menuItems[i];
            if(i == length - 1){
                menuItems[i] = null;
            }
        }
    }
}
