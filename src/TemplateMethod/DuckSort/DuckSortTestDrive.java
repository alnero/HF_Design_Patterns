package TemplateMethod.DuckSort;

import java.util.Arrays;

/**
 * Test drive template method sort() on Ducks array
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Duffie", 9),
                new Duck("Donald", 11),
                new Duck("Louie", 4),
                new Duck("Dewey", 5),
                new Duck("Huey", 3)
        };

        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(ducks));

        Arrays.sort(ducks);
        System.out.println("\nAfter sort: ");
        System.out.println(Arrays.toString(ducks));

    }
}
