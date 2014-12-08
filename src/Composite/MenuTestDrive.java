package Composite;

/**
 * Testing composite with menus and menu items. Printing them all.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        MenuComponent pancakeHouseMenu = new Menu("Pancake-House-Menu", "Breakfast");
        MenuComponent dinnerHouseMenu = new Menu ("Dinner-House-Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe-Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert-Menu", "Dessert");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerHouseMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("K&Bs Pancake breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries and blueberry syrup", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles with your choice of blueberries of strawberries", true, 3.59));

        dinnerHouseMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinnerHouseMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinnerHouseMenu.add(new MenuItem("Soup of the day", "Soup with a side of potato salad", false, 3.29));
        dinnerHouseMenu.add(new MenuItem("Hot Dog", "Hot Dog with saurkraut, relish, onions, topped with cheese", false, 3.05));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side of the salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 4.29));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust, topped with vanilla ice-cream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake with a chocolate graham crust", true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        Waitress lucy = new Waitress(allMenus);
        lucy.printMenu();
        lucy.printVegetarianMenu();

    }





}
