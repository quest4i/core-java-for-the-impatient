package ch03.sec03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created on 2016. 9. 16. 오전 3:01.
 *
 * @author quest4i
 */
public class ButtonDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button cancelButton = new Button("Cancel");
//        cancelButton.setOnAction(new CancelAction());
        cancelButton.setOnAction(event -> System.out.println("thanks"));

        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(cancelButton, message);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class CancelAction implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Oh noes!");
    }
}
