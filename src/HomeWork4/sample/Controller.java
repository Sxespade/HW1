package HomeWork4.sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private ListView<String> users;

    @FXML
    private Button btn;

    @FXML
    private ListView<String> messages;

    @FXML
    private TextField textField;

    @FXML
    private ImageView imageView;


    ObservableList<String> list1 = FXCollections.observableArrayList();


    void text(String string1, String string2) {
        if (string1 == null) string1 = "Иван";
        if (!string2.equals("")) {
        list1.add(string1 + ":");
        list1.add(string2);
        messages.setItems(list1);}
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> list = FXCollections.observableArrayList();
        list.add("Иван");
        list.add("Анна");
        list.add("Дмитрий");
        users.setItems(list);


        textField.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.ENTER) {
                text(users.getFocusModel().getFocusedItem(), textField.getText());
            }
        });

        btn.setOnAction(event -> text(users.getFocusModel().getFocusedItem(), textField.getText()));

        Shake anim = new Shake(imageView);
        anim.playAnim();

    }


}
