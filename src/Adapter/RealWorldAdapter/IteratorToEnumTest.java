package Adapter.RealWorldAdapter;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Testing an Enumeration adapter on ArrayList
 */
public class IteratorToEnumTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        IteratorToEnumerationAdapter iteratorToEnumAdapter = new IteratorToEnumerationAdapter(list.iterator());
        testEnumeration(iteratorToEnumAdapter);
    }

    static void testEnumeration(Enumeration enumeration){
        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());
        System.out.println(enumeration.nextElement());
    }


}
