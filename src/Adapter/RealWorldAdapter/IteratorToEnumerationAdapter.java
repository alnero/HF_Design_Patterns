package Adapter.RealWorldAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapt Iterators to look like Enumeration
 */
public class IteratorToEnumerationAdapter implements Enumeration{
    Iterator iterator;

    public IteratorToEnumerationAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}


