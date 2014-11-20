package TemplateMethod.CaffeineBeverage;

/**
 * This time the user will decide to add condiment or not
 */
public class CaffeineBeverageWithHookTest {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();

        TeaWithHook tea = new TeaWithHook();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

    }
}
