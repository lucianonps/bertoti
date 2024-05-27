public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Menu mainMenu = new Menu("Main Menu");
        

        MenuItem pancake = new MenuItem("Pancake", 2.99);
        MenuItem burger = new MenuItem("Burger", 5.99);

        mainMenu.print();
    }
}
