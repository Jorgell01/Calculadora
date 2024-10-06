package dad.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController {

    @FXML
    private Button bt00, bt01, bt02, bt03, bt10, bt11, bt12, bt13, bt20, bt21, bt22, bt23, bt30, bt31, bt32, bt33, bt40, bt41;

    @FXML
    private TextField resultados;

    private Calculadora calc;

    public RootController() {
        // Inicializar la calculadora
        calc = new Calculadora();
    }

    @FXML
    public void initialize() {
        // Inicializar el campo de texto con el contenido de la pantalla
        resultados.setText(calc.getPantalla());
    }

    @FXML
    void onDigitAction(ActionEvent event) {
        // Obtener el botón que fue presionado
        Button btn = (Button) event.getSource();
        // Insertar el dígito en la calculadora
        calc.insertar(btn.getText().charAt(0));
        // Actualizar la pantalla
        resultados.setText(calc.getPantalla());
    }

    @FXML
    void onOperationAction(ActionEvent event) {
        // Obtener el operador del botón
        Button btn = (Button) event.getSource();
        char operador = btn.getText().charAt(0);
        // Realizar la operación en la calculadora
        calc.operar(operador);
        // Actualizar la pantalla
        resultados.setText(calc.getPantalla());
    }

    @FXML
    void onClearAction(ActionEvent event) {
        // Limpiar toda la calculadora
        calc.borrar();
        // Actualizar la pantalla
        resultados.setText(calc.getPantalla());
    }

    @FXML
    void onClearEntryAction(ActionEvent event) {
        // Limpiar la pantalla actual
        calc.borrarTodo();
        // Actualizar la pantalla
        resultados.setText(calc.getPantalla());
    }

    @FXML
    void onDecimalAction(ActionEvent event) {
        // Insertar la coma
        calc.insertarComa();
        // Actualizar la pantalla
        resultados.setText(calc.getPantalla());
    }

    @FXML
    void onEqualsAction(ActionEvent event) {
        // Realizar la operación de igual
        calc.operar(Calculadora.IGUAL);
        // Actualizar la pantalla
        resultados.setText(calc.getPantalla());
    }
}
