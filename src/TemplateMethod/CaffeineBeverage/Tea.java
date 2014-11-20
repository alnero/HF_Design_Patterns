package TemplateMethod.CaffeineBeverage;

/**
 * One more strict recipe now for Tea.
 */
public class Tea extends CaffeineBeverage{

    public void addCondiment() {
        System.out.println("Add lemon.");
    }

    public void brew() {
        System.out.println("Steep tea in boiling water.");
    }

}
