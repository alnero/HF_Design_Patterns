package Adapter.RealWorldAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * To adapt the legacy code using Enumerators to new Iterator interface
 */
public class EnumerationToIteratorAdapter implements Iterator {
    Enumeration enumeration;

    public EnumerationToIteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        // Enumerators don't have remove behavior
        throw new UnsupportedOperationException();
    }
}
