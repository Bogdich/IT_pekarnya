package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GreetingsController {

    @FXML
    private Button loginButton;

    @FXML
    private Button registrationButton;

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    /**
     * The constructor (is called before the initialize()-method).
     */
    public GreetingsController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Handle Button event.
        loginButton.setOnAction((event) -> {
            System.out.print("loginButton Action!\n");
            /**
             *  Проверка данных с базой, переход на "Главное" окно.
             */
        });

        registrationButton.setOnAction((event) -> {
            System.out.print("registrationButton Action!\n");
            /**
             * Переход на окно "Регистрации".
             */
        });
    }






}

