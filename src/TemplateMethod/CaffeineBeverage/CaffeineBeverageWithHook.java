package TemplateMethod.CaffeineBeverage;

/**
 * Hook method added to Caffeine Beverage
 */
public abstract class CaffeineBeverageWithHook {
    // this is a template method
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(userWantsCondiment()){
            addCondiment();
        }
    }

    // hook method, subclasses can override it and change the default flow of the algorithm
    boolean userWantsCondiment() {
        return true;
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
