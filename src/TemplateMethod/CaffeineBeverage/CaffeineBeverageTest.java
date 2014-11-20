package TemplateMethod.CaffeineBeverage;

/**
 * Test drive template tea and coffee
 */
public class CaffeineBeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println("--------------------------");
        coffee.prepareRecipe();

    }
}
