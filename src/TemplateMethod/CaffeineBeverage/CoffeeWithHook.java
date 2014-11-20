package TemplateMethod.CaffeineBeverage;

import java.util.Scanner;

/**
 * Prepare coffee with template recipe but ask whether to add condiment
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{

    @Override
    public void addCondiment() {
        System.out.println("Add milk and sugar.");
    }

    @Override
    public void brew() {
        System.out.println("Brew coffee in boiling water.");
    }

    @Override
    boolean userWantsCondiment() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.println("Do you want to add milk and sugar? (y/n)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
