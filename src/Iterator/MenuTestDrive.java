package Iterator;

/**
 * Testing the Waitress
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu dinnerHouse = new DinnerHouseMenu();
        Menu pancakeHouse = new PancakeHouseMenu();
        Menu cafe = new CafeMenu();

        Waitress lucy = new Waitress(dinnerHouse, pancakeHouse, cafe);
        lucy.printMenu();
        lucy.printBreakfastMenu();
        lucy.printLunchMenu();
        lucy.printDinnerMenu();
        lucy.printVegetarianMenu();

        System.out.print("\nVegetarian BLT is vegetarian - ");
        System.out.print(lucy.isItemVegetarian("Vegetarian BLT"));

        System.out.print("\nBLT is vegetarian - ");
        System.out.print(lucy.isItemVegetarian("BLT"));
    }

}
