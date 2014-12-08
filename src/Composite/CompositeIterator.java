package Composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Iterator for the composite tree structure
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){ // if stack is empty there are no next elements
            return false;
        } else {
            Iterator iterator = stack.peek(); // take iterator of the stack
            if(!iterator.hasNext()){ // if current iterator is empty
                stack.pop(); // remove the empty iterator
                return hasNext(); // recursively check is there more iterators on the stack
            } else {
                return true; // otherwise there is next element so true is returned
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if(component instanceof Menu){
                // push all new coming composite iterators on the top of the stack
                stack.push(component.createIterator());
            }
            return component; // return any component which is coming next in iterator (menu or menu item)
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
