public class MenuItem {
    private String nome;
    private double preco;

    public MenuItem(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void print() {
        System.out.println("Item: " + nome + ", Preço: " + preco);
    }
    
}
