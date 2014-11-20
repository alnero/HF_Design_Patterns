package TemplateMethod.CaffeineBeverage;

/**
 * Some common behavior for Tea and Coffee recipes
 */
public abstract class CaffeineBeverage {
    // this is a template method
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    public void boilWater() {
        System.out.println("Boil some water.");
    }

    public void pourInCup() {
        System.out.println("Pour into the cup.");
    }

    public abstract void brew();

    public abstract void addCondiment();

}
