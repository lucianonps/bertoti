public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MenuItem burger = new MenuItem("Burger", 8.99);
        Menu mainMenu = new Menu("Main Menu");
        Menu drinksMenu = new Menu("Drinks");
        Menu dessertsMenu = new Menu("Desserts");
        mainMenu.add(burger);
        mainMenu.add(drinksMenu);
        mainMenu.add(dessertsMenu);
        mainMenu.print();


    }
}
