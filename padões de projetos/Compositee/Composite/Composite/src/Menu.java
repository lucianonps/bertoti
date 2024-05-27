import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComp{
    private String nome;
    private List<MenuComp> menuCompo = new ArrayList<>();

    public Menu(String nome) {
        this.nome = nome;
    }

    public void add(MenuComp menuCompot) {
        menuCompo.add(menuCompot);
    }

    public void remove(MenuComp menuCompot) {
        menuCompo.remove(menuCompot);
    }

    @Override
    public void print() {
        System.out.println("Menu: " + nome);
        for (MenuComp menuCompone : menuCompo) {
            menuCompone.print();
        }
    }
    
}
