package Iterator;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Iterator to provide different meals on different days
 */
public class AlternatingMealIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public AlternatingMealIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.DAY_OF_WEEK % 2;
    }


    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem item = menuItems[position];
        position += 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Meal Iterator does not support remove()");
    }
}
