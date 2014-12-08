package Composite;

import java.util.Iterator;

/**
 * Iterator for the menu item.
 */
public class NullIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
