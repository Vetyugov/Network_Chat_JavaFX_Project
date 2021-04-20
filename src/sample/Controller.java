package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField printTextArea;


    public void clickSend(ActionEvent actionEvent) {
        mainTextArea.appendText(printTextArea.getText());
        printTextArea.clear();
    }




    public void keyPress(javafx.scene.input.KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER && !printTextArea.getText().equals("")) {
            textImport();
        }
    }

    private void textImport() {
        mainTextArea.appendText(printTextArea.getText() + "\n");
        printTextArea.clear();
        printTextArea.requestFocus();
    }
}
