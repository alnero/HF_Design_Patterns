package TemplateMethod.CaffeineBeverage;

/**
 * Precise recipe for Coffee
 */
public class Coffee extends CaffeineBeverage{

    public void addCondiment() {
        System.out.println("Add milk and sugar.");
    }

    public void brew() {
        System.out.println("Brew coffee in boiling water.");
    }

}
