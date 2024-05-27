public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        OrdemFacade orderFacade = new OrdemFacade();
        orderFacade.placeOrder("Laptop");
    }
}
