package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class RegistrationController {
    @FXML
    private Button cancelButton;

    @FXML
    private Button registrationButton;

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private TextArea newInfArea;


    /**
     * The constructor (is called before the initialize()-method).
     */
    public RegistrationController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        cancelButton.setOnAction((event) -> {
            System.out.print("cancelButton Action!\n");
            /**
             * Переход на окно "Приветствия/Входа".
             */
        });

        registrationButton.setOnAction((event) -> {
            System.out.print("registrationButton Action!\n");
            /**
             *  Занесенние данных в базу, переход на "Главное" окно.
             */
        });
    }
}
