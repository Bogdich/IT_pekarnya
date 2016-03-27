package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.web.WebView;

/**
 * Created by KirillBudevich on 25.03.16.
 */
public class MapController {

    @FXML
    private Button reloadButton;

    @FXML
    private Button exitButton;

    @FXML
    private CheckBox needHelp;

    @FXML
    private CheckBox canGiveHelp;

    @FXML
    private CheckBox eelse;

    @FXML
    private WebView map;
    /**
     * The constructor (is called before the initialize()-method).
     */
    public MapController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        exitButton.setOnAction((event) -> {
            System.out.print("exitButton Action!\n");
            /**
             *  Выход из уч записи, переход на "Главное" окно.
             */
        });

        reloadButton.setOnAction((event) -> {
            System.out.print("reloadButton Action!\n");
            /**
             * Обновление данных на карте.
             */
        });

        needHelp.setOnAction((event) -> {
            System.out.print("needHelp check!\n");

        });

        canGiveHelp.setOnAction((event) -> {
            System.out.print("canGiveHelp check!\n");

        });

        eelse.setOnAction((event) -> {
            System.out.print("else check!\n");

        });
    }


}
