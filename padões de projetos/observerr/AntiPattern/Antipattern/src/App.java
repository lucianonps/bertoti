public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        UTI uti = new UTI();
        Dashboard dashboard1 = new Dashboard();
        uti.addDashboard(dashboard1);
        uti.setMeasurements(120.0, 80.0, 98.0);
    }
}
