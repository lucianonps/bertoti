import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nome;
    private List<Menu> subMenus;
    private List<MenuItem> menuItems;

    public Menu(String nome) {
        this.nome = nome;
        this.subMenus = new ArrayList<>();
        this.menuItems = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        subMenus.add(menu);
    }

    public void removeMenu(Menu menu) {
        subMenus.remove(menu);
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public void print() {
        System.out.println("Menu: " + nome);
        for (MenuItem item : menuItems) {
            item.print();
        }
        for (Menu menu : subMenus) {
            menu.print();
        }
    }
}
