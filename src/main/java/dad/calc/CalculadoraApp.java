package dad.calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML de la interfaz de la calculadora
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootController.fxml"));
        BorderPane root = loader.load();

        // Configurar la escena con el root layout
        Scene scene = new Scene(root);
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(200);
        primaryStage.setMinHeight(350);
        primaryStage.show();
    }
}
