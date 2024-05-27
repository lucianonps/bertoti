public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cliente cliente1 = new Cliente(true);
        Cliente cliente2 = new Cliente(false);

        cliente1.realizarAluguel(); 
        cliente2.realizarAluguel(); 


        cliente2.setPodeAlugar(true);
        cliente2.realizarAluguel(); 
    }
    }

