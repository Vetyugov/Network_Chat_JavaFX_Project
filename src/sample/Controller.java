package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.*;

//import java.awt.event.KeyEvent;

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
