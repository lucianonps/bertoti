package clube.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        Clube ac = new Clube();

        Socio a = new Socio();

        ac.setId();
        ac.setNome("");
        ac.setTelefone(null);
        ac.addAluno(a);

        System.out.println("___________________________________");

        for (Socio al : ac.getSocio()) {
            System.out.println("Nome: " + al.getName());
            System.out.println("Idade: " + al.getIdade());
            System.out.println("Telefone: " + al.getTelefone());
        }

        System.out.println("___________________________________");

        for (Mensalidade ms : ac.getMensalidade()) {
            System.out.println("Vencimento: " + ms.getVencimento());
            System.out.println("Valor: " + ms.getValor());
            System.out.println("Aluno: " + ms.getSocio().getName());
        }

    }

}