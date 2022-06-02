package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.EventHandler;

public class Controller {
    @FXML
    private Button button1;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private TextField textF;
    @FXML
    private PasswordField passF;

    @FXML
    private void SendButton(ActionEvent event){
        String message = textF.getText();
        String message2 = passF.getText();
        if (message.equals("admin") && message2.equals("admin")) {
            label3.setText("Hello Admin!");
            textF.setText("");
            passF.setText("");
            textF.requestFocus();
        }
        else {
            label3.setText("Ошибка авторизации!");
            textF.setText("");
            passF.setText("");
            textF.requestFocus();
        }
    }
}
