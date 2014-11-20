package TemplateMethod.CaffeineBeverage;

import java.util.Scanner;

/**
 * Prepare tea with user prompt on condiment
 */
public class TeaWithHook extends CaffeineBeverageWithHook{

    @Override
    public void addCondiment() {
        System.out.println("Add lemon.");
    }

    @Override
    public void brew() {
        System.out.println("Steep tea in boiling water.");
    }

    @Override
    boolean userWantsCondiment() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.println("Do you want to add lemon? (y/n)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
