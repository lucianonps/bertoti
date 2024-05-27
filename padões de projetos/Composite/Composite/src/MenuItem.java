public class MenuItem implements MenuComp {
    private String nome;
    private double preco;

    public MenuItem(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void print() {
        System.out.println("Item: " + nome + ", Price: $" + preco);
    }
    
}
