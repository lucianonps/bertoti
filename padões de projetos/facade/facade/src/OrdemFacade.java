public class OrdemFacade {
    private InventorySevice inventoryService;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public OrdemFacade() {
        this.inventoryService = new InventorySevice();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String item) {
        if (inventoryService.checkStock(item)) {
            paymentService.processPayment(item);
            notificationService.sendConfirmation(item);
            System.out.println("Order placed successfully for item: " + item);
        } else {
            System.out.println("Item " + item + " is out of stock.");
        }
    }
    
}
