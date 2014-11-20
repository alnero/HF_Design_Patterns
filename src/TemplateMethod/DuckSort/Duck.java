package TemplateMethod.DuckSort;

/**
 * Duck class with compareTo method to enable proper work of template Arrays.sort() method.
 */
public class Duck implements Comparable{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if(this.weight > otherDuck.weight) {
            return 1;
        } else if (this.weight < otherDuck.weight){
            return -1;
        } else {
            return 0;
        }
    }
}
